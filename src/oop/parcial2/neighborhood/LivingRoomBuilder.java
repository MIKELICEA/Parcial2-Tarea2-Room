package oop.parcial2.neighborhood;

public class LivingRoomBuilder {
    private int width;
    private int height;
    private String color;
    private int windows;
    private boolean tv;
    private boolean homeTeather;

    public LivingRoomBuilder width(int width)
    {
        this.width=width;
        return this;
    }

    public LivingRoomBuilder height(int height)
    {
        this.height=height;
        return this;
    }

    public LivingRoomBuilder color(String color)
    {
        this.color=color;
        return this;
    }

    public LivingRoomBuilder windows(int windows)
    {
        this.windows=windows;
        return this;
    }

    public LivingRoomBuilder tv(boolean tv)
    {
        this.tv=tv;
        return this;
    }

    public LivingRoomBuilder homeTeather(boolean homeTeather)
    {
        this.homeTeather=homeTeather;
        return this;
    }

    public LivingRoom build()
    {
        return new LivingRoom(width,height,color,windows,tv,homeTeather);
    }

    public static LivingRoomBuilder builder()
    {
        return new LivingRoomBuilder();
    }
}
