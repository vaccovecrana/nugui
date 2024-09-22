import * as React from "preact/compat";
import { useEffect, useRef, useState } from "react";
import Pbf from "pbf";
import { VectorTile, VectorTileFeature } from "@mapbox/vector-tile";

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

interface CanvasTileProps {
  tile: Tile;
  tileLoaded: () => void;
}

const CanvasTile: React.FC<CanvasTileProps> = ({ tile, tileLoaded }) => {
  const canvasRef = useRef<HTMLCanvasElement | null>(null);
  const [features, setFeatures] = useState<VectorTileFeature[]>([]);

  useEffect(() => {
    let isMounted = true;

    fetch(tile.url)
      .then((response) => response.arrayBuffer())
      .then((data) => {
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
      .catch((err) => console.error(err));

    return () => {
      isMounted = false;
    };
  }, [tile.url, tileLoaded]);

  useEffect(() => {
    const canvas = canvasRef.current;
    const ctx = canvas?.getContext("2d");

    if (!ctx || features.length === 0) return;

    // Clear the canvas before drawing new features
    ctx.clearRect(0, 0, tile.width, tile.height);
    ctx.fillStyle = "#ffffff";
    ctx.fillRect(0, 0, tile.width, tile.height); // Fill background

    features.forEach((feature) => renderFeature(ctx, feature));
  }, [features]);

  const projectPoint = (x: number, y: number): [number, number] => {
    // Project tile-local coordinates to pixel coordinates
    const scale = tile.width / 4096; // MVT tiles use a 4096 extent by default
    return [x * scale, y * scale];
  };

  const renderFeature = (ctx: CanvasRenderingContext2D, feature: VectorTileFeature) => {
    const geometry = feature.loadGeometry();

    ctx.beginPath();
    geometry.forEach((ring: Point[]) => {
      ring.forEach((point: Point, i: number) => {
        const [x, y] = projectPoint(point.x, point.y);
        if (i === 0) {
          ctx.moveTo(x, y);
        } else {
          ctx.lineTo(x, y);
        }
      });
    });

    ctx.strokeStyle = "black";
    ctx.lineWidth = 1;
    ctx.stroke();
  };

  return (
    <canvas
      ref={canvasRef}
      width={tile.width}
      height={tile.height}
      style={{
        position: "absolute",
        left: tile.left,
        top: tile.top,
        willChange: "transform",
        transformOrigin: "top left",
        opacity: 1,
      }}
    />
  );
};

export default CanvasTile;
