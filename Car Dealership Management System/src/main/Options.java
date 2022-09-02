package main;

import java.io.Serializable;

public class Options implements toString, Serializable
{
    private String seatHeater;
    private String screenSize;
    private String wheelSize;
    private String glassRoof;

    public Options(String seatHeater, String screenSize, String wheelSize, String glassRoof) 
    {
        this.seatHeater = seatHeater;
        this.screenSize = screenSize;
        this.wheelSize = wheelSize;
        this.glassRoof = glassRoof;
    }

    public Options() 
    {
        this.seatHeater = "Default";
        this.screenSize = "Default";
        this.wheelSize = "Default";
        this.glassRoof = "Default";
    }

    @Override
    public String toString() 
    {
        return "Options\n" + "Seat Header: " + seatHeater + "\nScreen Size: " + screenSize + "\nWheel Size: " + wheelSize + "\nGlass Roof: " + glassRoof;
    }

}
