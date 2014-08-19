package com.devinrsmith.kraken.data.requests;

/**
 * Created by dsmith on 8/19/14.
 */
public class Resize {
    private Integer width;
    private Integer height;
    private String strategy; // todo enum
    private String background; // todo rgba struct

    public Resize(Integer width, Integer height, String strategy, String background) {
        this.width = width;
        this.height = height;
        this.strategy = strategy;
        this.background = background;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public String getStrategy() {
        return strategy;
    }

    public String getBackground() {
        return background;
    }
}