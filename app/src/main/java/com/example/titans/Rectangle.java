package com.example.titans;

public class Rectangle extends Shape {

    private Integer width;
    private Integer height;

    public Rectangle(Integer x, Integer y, Integer width, Integer height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    public Integer getWidth() {
        return this.width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return this.height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getArea() {
        return this.width * this.height;
    }

    public Integer getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
