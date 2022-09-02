/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;


public class Ferrari extends Brand implements toString,Serializable 
{
    private final String BRANDNAME="Ferrari";
    
    public Ferrari(String modelName,String brandName, String ID, String color, String carType, String fuelType, String productionDate, String gearbox, String casetype, Engine engine, String customerNick, Options options) 
    {
        super(modelName,"Ferrari", ID, color, carType, fuelType, productionDate, gearbox, casetype, engine, customerNick, options);
    }

    public String getBrandName() 
    {
        return BRANDNAME;
    }
    @Override
    public String toString()
    {
      return "Brand: " + BRANDNAME+ "\nModelname:"+ getModelName()+"\nColor: "+getColor()+"\nCase Type: " + getCasetype()+ "\n" + getEngine().toString()+"\nOwned by:" + getCustomerNick() + "\nID: "+ID + "\n" + getOptions().toString(); 
    }
}
