package oop.parcial2.neighborhood;

public class BedRoomBuilder {
    private int width;
    private int height;
    private String color;
    private BedSize bedSize;
    private boolean tv;

    public BedRoomBuilder width(int width)
    {
        this.width=width;
        return this;
    }

    public BedRoomBuilder height(int height)
    {
        this.height=height;
        return this;
    }

    public BedRoomBuilder color(String color)
    {
        this.color=color;
        return this;
    }

    public BedRoomBuilder bedSize(BedSize bedSize)
    {
        this.bedSize=bedSize;
        return this;
    }

    public BedRoomBuilder tv(boolean tv)
    {
        this.tv=tv;
        return this;
    }

    public BedRoom build()
    {

        return new BedRoom(width,height,color,bedSize,tv);
    }

    public static BedRoomBuilder builder()
    {
        return new BedRoomBuilder();
    }
}
