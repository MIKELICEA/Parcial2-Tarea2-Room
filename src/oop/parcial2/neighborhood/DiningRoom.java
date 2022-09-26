package oop.parcial2.neighborhood;

public class DiningRoom extends Room{
    private int windows;
    private boolean tv;
    private int chairsCapacity;

    DiningRoom(int width, int height, String color, int windows, boolean tv, int chairsCapacity) {
        super(width, height, color);
        this.windows = windows;
        this.tv = tv;
        this.chairsCapacity = chairsCapacity;
    }

    public int getWindows() {
        return windows;
    }

    public boolean getTv() {
        return tv;
    }

    public int getChairsCapacity() {
        return chairsCapacity;
    }

    public static DiningRoomBuilder builder()
    {
        return new DiningRoomBuilder();
    }
}
