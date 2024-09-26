package com.example.titans;

public abstract class Shape {

    private Integer x;
    private Integer y;
    private String color;

    public Shape (Integer x, Integer y){
        this.x = x;
        this.y = y;
        this.color = color;
    }
    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public String getColor() {
        String color = "Blue";
        return this.color;
    }

    public void setX (Integer x){
        this.x = x;
    }
    public void setY (Integer y){
        this.y = y;
    }
}
