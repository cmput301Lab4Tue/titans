package com.example.titans;

public class Square extends Shape{
    public Square(Integer x) {
        super(x, x);
    }
    public String getShape(){
        return "Square";
    }
    public Integer getSize(){
        return getX();
    }
    public void setSize(Integer size){
        this.x = size;
}
