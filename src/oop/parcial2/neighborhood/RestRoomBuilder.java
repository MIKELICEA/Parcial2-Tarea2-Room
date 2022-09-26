package oop.parcial2.neighborhood;

public class RestRoomBuilder {
    int width;
    int height;
    String color;
    boolean showerCabin;

    public RestRoomBuilder width(int width)
    {
        this.width=width;
        return this;
    }

    public RestRoomBuilder height(int height)
    {
        this.height=height;
        return this;
    }

    public RestRoomBuilder color(String color)
    {
        this.color=color;
        return this;
    }

    public RestRoomBuilder showerCabin(boolean showerCabin)
    {
        this.showerCabin=showerCabin;
        return this;
    }

    public RestRoom build()
    {
        return new RestRoom(width,height,color,showerCabin);
    }

    public static RestRoomBuilder builder()
    {
        return new RestRoomBuilder();
    }
}
