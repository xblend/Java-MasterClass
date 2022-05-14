package com.company;

import java.awt.geom.Area;
import java.util.zip.DeflaterInputStream;

public class Floor {
    private Tile tile;
    private Dimensions2D dimensions;

    public Floor(Tile tile, Dimensions2D dimensions) {
        this.tile = tile;
        this.dimensions = dimensions;
    }

    public Tile getTile() {
        return tile;
    }

    public Dimensions2D getDimensions() {
        return dimensions;
    }
}
