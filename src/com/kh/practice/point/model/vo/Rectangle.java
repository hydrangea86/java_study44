package com.kh.practice.point.model.vo;

public class Rectangle extends Point {

    int width;
    int height;

    public Rectangle() {

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return String.format("(%d, %d, %d, %d)", getX() ,getY(), width, height);
    }
}
