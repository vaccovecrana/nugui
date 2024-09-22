import * as React from "preact/compat"
import { useState, useEffect } from 'react';
import Pbf from 'pbf';
import { VectorTile, VectorTileFeature } from '@mapbox/vector-tile';

interface Point {
  x: number;
  y: number;
}

interface Tile {
  url: string;
  width: number;
  height: number;
  left: number;
  top: number;
}

interface SvgTileProps {
  tile: Tile;
  tileLoaded: () => void;
}

const SvgTile: React.FC<SvgTileProps> = ({ tile, tileLoaded }) => {
  const [features, setFeatures] = useState<VectorTileFeature[]>([]);

  useEffect(() => {
    let isMounted = true; // To prevent setting state on an unmounted component

    fetch(tile.url)
      .then(response => response.arrayBuffer())
      .then(data => {
        if (!isMounted) return;

        const pbf = new Pbf(data);
        const tileData = new VectorTile(pbf);
        const layerNames = Object.keys(tileData.layers);

        if (layerNames.length === 0) {
          setFeatures([]);
          return;
        }

        const layerName = layerNames[0]; // Adjust based on your data
        const layer = tileData.layers[layerName];
        const loadedFeatures: VectorTileFeature[] = [];

        for (let i = 0; i < layer.length; i++) {
          const feature = layer.feature(i);
          loadedFeatures.push(feature);
        }

        setFeatures(loadedFeatures);
        tileLoaded(); // Signal that the tile has loaded
      })
      .catch(err => console.error(err));

    return () => {
      isMounted = false;
    };
  }, [tile.url, tileLoaded]);

  const projectPoint = (x: number, y: number): [number, number] => {
    // Project tile-local coordinates to pixel coordinates
    const scale = tile.width / 4096; // MVT tiles use a 4096 extent by default
    return [x * scale, y * scale];
  };

  const renderFeature = (feature: VectorTileFeature, idx: number) => {
    const geometry = feature.loadGeometry();

    const d = geometry
      .map((ring: Point[]) => {
        return ring
          .map((point: Point, i: number) => {
            const [x, y] = projectPoint(point.x, point.y);
            return `${i === 0 ? 'M' : 'L'}${x},${y}`;
          })
          .join(' ');
      })
      .join(' ');

    return (
      <path
        key={idx}
        d={d}
        fill="none"
        stroke="black"
      />
    );
  };

  return (
    <svg
      width={tile.width}
      height={tile.height}
      style={{
        position: 'absolute',
        left: tile.left,
        top: tile.top,
        willChange: 'transform',
        transformOrigin: 'top left',
        opacity: 1,
      }}
    >
      {features.map(renderFeature)}
    </svg>
  );
};

export default SvgTile;
