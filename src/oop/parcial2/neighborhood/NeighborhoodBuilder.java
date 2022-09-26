package oop.parcial2.neighborhood;

import java.util.List;

public class NeighborhoodBuilder {
    private List<Street> streets;
    private int gardens;
    private boolean basketballCourt;
    private boolean footballCourt;
    private boolean swimmingPool;

    public NeighborhoodBuilder streets(List<Street> streets)
    {
        this.streets=streets;
        return this;
    }

    public NeighborhoodBuilder gardens(int gardens)
    {
        this.gardens=gardens;
        return this;
    }

    public NeighborhoodBuilder basketballCourt(boolean basketballCourt)
    {
        this.basketballCourt=basketballCourt;
        return this;
    }

    public NeighborhoodBuilder footballCourt(boolean footballCourt)
    {
        this.footballCourt=footballCourt;
        return this;
    }

    public NeighborhoodBuilder swimmingPool(boolean swimmingPool)
    {
        this.swimmingPool=swimmingPool;
        return this;
    }

    public Neighborhood build()
    {
        return new Neighborhood(streets,gardens,basketballCourt,footballCourt,swimmingPool);
    }

    public static NeighborhoodBuilder builder(){
        return new NeighborhoodBuilder();
    }
}
