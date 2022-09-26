package oop.parcial2.neighborhood;

public class LivingRoom extends Room{
    private int windows;
    private boolean tv;
    private boolean homeTeather;

    LivingRoom(int width, int height, String color, int windows, boolean tv, boolean homeTeather) {
        super(width, height, color);
        this.windows = windows;
        this.tv = tv;
        this.homeTeather = homeTeather;
    }

    public int getWindows() {
        return windows;
    }

    public boolean getTv() {
        return tv;
    }

    public boolean getHomeTeather() {
        return homeTeather;
    }

    public static LivingRoomBuilder builder()
    {
        return new LivingRoomBuilder();
    }
}
