package oop.parcial2.neighborhood;

import java.util.ArrayList;
import java.util.List;

public class Neighborhood {

    private List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    Neighborhood(List<Street> streets, int gardens, boolean basketballCourt, boolean footballCourt, boolean swimmingPool) {
        this.streets = streets;
        this.gardens = gardens;
        this.basketballCourt = basketballCourt;
        this.footballCourt = footballCourt;
        this.swimmingPool = swimmingPool;
    }

    public List<Street> getStreets()
    {
        return streets;
    }

    public int getGardens()
    {
        return gardens;
    }

    public boolean getBasketballCourt()
    {
        return basketballCourt;
    }

    public boolean getFootballCourt()
    {
        return footballCourt;
    }

    public boolean getSwimmingPool()
    {
        return swimmingPool;
    }

    public static NeighborhoodBuilder builder()
    {
        return new NeighborhoodBuilder();
    }
}
