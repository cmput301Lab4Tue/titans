package com.example.titans;

public class Star extends Shape{
    private Integer width;
    private Integer length;
    private  Integer corner;

    public Star (Integer width, Integer length, Integer corner){
        super(width, length);
        this.width = width;
        this.length = length;
        this.corner = corner;
    }
    public Integer getWidth() {
        return this.width;
    }

    public Integer getLength() {
        return this.length;
    }

    public Integer getCorner() { return corner; }

    public void setCorner(Integer corner) { this.corner = corner; }

    public void setWidth (Integer width){
        this.width = width;
    }

    public void setLength (Integer length){
        this.length = length;
    }
}
