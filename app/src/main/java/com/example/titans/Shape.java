package com.example.titans;

public abstract class Shape {

    private Integer x;
    private Integer y;
    String color = "$PUT_YOUR_CHOICE_OF_COLOR";

    public Shape (Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    public Integer getX() {
        return this.x;
    }

    public Integer getY() {
        return this.y;
    }

    public void setX (Integer x){
        this.x = x;
    }
    public void setY (Integer y){
        this.y = y;
    }
}
