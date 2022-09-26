package oop.parcial2.neighborhood;

public class YardBuilder {
    private int width;
    private int height;
    private String color;
    private boolean grass;

    public YardBuilder width(int width)
    {
        this.width=width;
        return this;
    }

    public YardBuilder height(int height)
    {
        this.height=height;
        return this;
    }

    public YardBuilder color(String color)
    {
        this.color=color;
        return this;
    }

    public YardBuilder grass(boolean grass)
    {
        this.grass=grass;
        return this;
    }

    public Yard build()
    {
        return new Yard(width,height,color,grass);
    }

    public static YardBuilder builder()
    {
        return new YardBuilder();
    }
}
