package oop.parcial2.neighborhood;

public class Room {
    private int width;
    private int height;
    private String color;

    public Room(int width, int height, String color) {
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getColor() {
        return color;
    }
}
