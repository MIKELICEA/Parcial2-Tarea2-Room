package oop.parcial2.neighborhood;

public class DiningRoomBuilder {
    private int width;
    private int height;
    private String color;
    private int windows;
    private boolean tv;
    private int chairsCapacity;

    public DiningRoomBuilder width(int width)
    {
        this.width=width;
        return this;
    }

    public DiningRoomBuilder height(int height)
    {
        this.height=height;
        return this;
    }

    public DiningRoomBuilder color(String color)
    {
        this.color=color;
        return this;
    }

    public DiningRoomBuilder windows(int windows)
    {
        this.windows=windows;
        return this;
    }

    public DiningRoomBuilder tv(boolean tv)
    {
        this.tv=tv;
        return this;
    }

    public DiningRoomBuilder chairsCapacity(int chairsCapacity)
    {
        this.chairsCapacity=chairsCapacity;
        return this;
    }

    public DiningRoom build()
    {
        return new DiningRoom(width,height,color,windows,tv,chairsCapacity);
    }

    public static DiningRoomBuilder builder()
    {
        return new DiningRoomBuilder();
    }
}
