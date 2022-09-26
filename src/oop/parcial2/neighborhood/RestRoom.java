package oop.parcial2.neighborhood;

public class RestRoom extends Room{
    private boolean showerCabin;

    RestRoom(int width, int height, String color, boolean showerCabin) {
        super(width, height, color);
        this.showerCabin = showerCabin;
    }

    public boolean getShowerCabin() {
        return showerCabin;
    }

    public static RestRoomBuilder builder()
    {
        return new RestRoomBuilder();
    }
}
