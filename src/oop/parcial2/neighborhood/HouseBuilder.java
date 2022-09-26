package oop.parcial2.neighborhood;

import java.util.ArrayList;
import java.util.List;

public class HouseBuilder {
    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;
    private List<RestRoom> restRooms = new ArrayList<>();
    private List<BedRoom> bedRooms= new ArrayList<>();

    public HouseBuilder kitchen(Kitchen kitchen)
    {
        this.kitchen=kitchen;
        return this;
    }

    public HouseBuilder diningRoom(DiningRoom diningRoom)
    {
        this.diningRoom=diningRoom;
        return this;
    }

    public HouseBuilder livingRoom(LivingRoom livingRoom)
    {
        this.livingRoom=livingRoom;
        return this;
    }

    public HouseBuilder restRooms(RestRoom restRooms)
    {
        this.restRooms.add(restRooms);
        return this;
    }

    public HouseBuilder bedRooms(BedRoom bedRooms)
    {
        this.bedRooms.add(bedRooms);
        return this;
    }

    public House build()
    {
        return new House(kitchen,diningRoom,livingRoom,restRooms,bedRooms);
    }

    public static HouseBuilder builder(){
        return new HouseBuilder();
    }

}
