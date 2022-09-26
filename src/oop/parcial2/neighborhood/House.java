package oop.parcial2.neighborhood;

import java.util.List;

public class House {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRooms;
    private List<BedRoom> bedRooms;

    House(Kitchen kitchen, DiningRoom diningRoom, LivingRoom livingRoom, List<RestRoom> restRooms, List<BedRoom> bedRooms) {
        this.kitchen = kitchen;
        this.diningRoom = diningRoom;
        this.livingRoom = livingRoom;
        this.restRooms = restRooms;
        this.bedRooms = bedRooms;
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public List<RestRoom> getRestRooms() {
        return restRooms;
    }

    public List<BedRoom> getBedRooms() {
        return bedRooms;
    }

    public static HouseBuilder builder()
    {
        return new HouseBuilder();
    }
}
