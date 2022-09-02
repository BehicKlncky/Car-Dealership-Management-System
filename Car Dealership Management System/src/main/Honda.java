/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.Serializable;

/**
 *
 * @author OEM
 */
public class Honda extends Brand implements toString,Serializable{
    private final String BRANDNAME="Honda";
   

    public Honda(String modelName,String brandName, String ID, String color, String carType, String fuelType, String productionDate, String gearbox, String casetype, Engine engine, String customerNick, Options options) 
    {
        super(modelName,"Honda", ID, color, carType, fuelType, productionDate, gearbox, casetype, engine, customerNick, options);
    }

    public String getBrandName() 
    {
        return this.BRANDNAME;
    }
    
    @Override
    public String toString()
    {
        return "Brand: " + BRANDNAME+ "\nModelname:"+ getModelName()+"\nColor: "+getColor()+"\nCase Type: " + getCasetype()+ "\n" + getEngine().toString()+"\nOwned by:" + getCustomerNick() + "\nID: "+ID + "\n" + getOptions().toString(); 
    }
    
}
