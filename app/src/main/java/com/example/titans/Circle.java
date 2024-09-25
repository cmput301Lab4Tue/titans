package com.example.titans;

public class Circle extends Shape {

    private Integer x;
    private Integer y;

    public Circle(Integer x, Integer y, Integer radius){
        super(x,y);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public Integer getRadius() {
        return this.radius;
    }

    public void setX (Integer x){
        this.x = x;
    }
    public void setY (Integer y){
        this.y = y;
    }
}
