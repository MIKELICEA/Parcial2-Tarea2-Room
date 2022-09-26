package oop.parcial2.neighborhood;

import java.util.TreeMap;

public class StreetBuilder {
    private String name;
    private TreeMap<Integer,House> houses = new TreeMap<Integer,House>();

    public StreetBuilder name(String name)
    {
        this.name=name;
        return this;
    }

    public StreetBuilder house(int number,House house)
    {
        houses.put(number,house);
        return this;
    }

    public Street build()
    {
        return new Street(name,houses);
    }

    public static StreetBuilder builder()
    {
        return new StreetBuilder();
    }
}
