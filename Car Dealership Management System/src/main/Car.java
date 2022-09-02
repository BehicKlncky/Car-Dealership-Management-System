package main;

import java.io.Serializable;

public abstract class Car implements Serializable
{
    protected String ID;
    protected String color;
    protected String carType;
    protected String fuelType;
    protected String productionDate;
    protected String gearbox;
    protected static int selledCarNo = 0;

    public Car(String  ID, String color, String carType, String fuelType, String productionDate, String gearbox) 
    {
        this.ID = ID;
        this.color = color;
        this.carType = carType;
        this.fuelType = fuelType;
        this.productionDate = productionDate;
        this.gearbox = gearbox;
    }

   
    public abstract String isCarWorking();
        
    
    public static void sellCar()
    {
        System.out.println("Car is selled");
        selledCarNo += 1;
    }
 
}
