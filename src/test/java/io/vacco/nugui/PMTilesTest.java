package io.vacco.nugui;

import com.google.gson.GsonBuilder;
import j8spec.annotation.DefinedOrder;
import j8spec.junit.J8SpecRunner;
import org.junit.runner.RunWith;
import vector_tile.MVTToGeoJSONConverter;
import vector_tile.TileOuterClass;
import vector_tile.VectorTileFeature;

import java.nio.file.Files;
import java.nio.file.Paths;

import static j8spec.J8Spec.*;

@DefinedOrder
@RunWith(J8SpecRunner.class)
public class PMTilesTest {

  public static void printTileDetails(TileOuterClass.Tile tile) {
    for (TileOuterClass.Tile.Layer layer : tile.getLayersList()) {
      System.out.println("Layer name: " + layer.getName());
      System.out.println("Number of features: " + layer.getFeaturesCount());

      for (TileOuterClass.Tile.Feature feature : layer.getFeaturesList()) {
        System.out.println("Feature ID: " + feature.getId());
        System.out.println("Geometry type: " + feature.getType());

        for (int tagIndex : feature.getTagsList()) {
          System.out.println("Tag index: " + tagIndex);
        }
      }
    }
  }

  static {
    it("Parses a reference pmtiles file", () -> {
      var f = "/Users/jjzazuet/Desktop/maps/world-map-small.pmtiles";
      var pt = new PMTiles().loadFromFile(f);
      PmTilesUtil.printMetadata(pt);
      // PmTilesUtil.printAllTileIds(pt);
    });
    it("Parses mvt data from tile blocks", () -> {
      // var f = "./src/test/resources/test_fixture_1.pmtiles";
      var f = "/Users/jjzazuet/Desktop/maps/world-map-small.pmtiles";
      var pt = new PMTiles().loadFromFile(f);
      var tile = pt.getTile(5, 10, 10);

      Files.write(Paths.get("/Users/jjzazuet/Desktop/maps/momo.pbf"), tile);
      // var mvtTile = ProtobufMetaModel.parseFrom(tile);
      var mvtTile = TileOuterClass.Tile.parseFrom(tile);

      // System.out.println(mvtTile);
      // printTileDetails(mvtTile);

      var json = new VectorTileFeature(mvtTile).convertTileToGeoJSON();

      System.out.println(new GsonBuilder().setPrettyPrinting().create().toJson(json));

      // Files.write(Paths.get("./build/momo.png"), png);
    });
  }
}
