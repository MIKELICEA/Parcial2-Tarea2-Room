package oop.parcial2.neighborhood;

public class BedRoom extends Room{
    private BedSize bedSize;
    private boolean tv;
    BedRoom(int width, int height, String color, BedSize bedSize, boolean tv) {
        super(width, height, color);
        this.bedSize = bedSize;
        this.tv = tv;
    }

    public BedSize getBedSize() {
        return bedSize;
    }

    public boolean getTv() {
        return tv;
    }

    public static BedRoomBuilder builder()
    {
        return new BedRoomBuilder();
    }
}
