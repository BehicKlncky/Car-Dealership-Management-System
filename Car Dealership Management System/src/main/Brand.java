package main;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

public class Brand extends Car implements Serializable
{
    private String brandName="default";
    private String modelName;
    private String casetype;
    private Engine engine;
    private Options options;
    private String customerNick;
    
    public String getCasetype() 
    {
        return casetype;
    }

    public Engine getEngine() 
    {
        return engine;
    }

    

    public String getColor() 
    {
        return color;
    }

    public String getBrandName() 
    {
        return brandName;
    }

    public Options getOptions() 
    {
        return options;
    }

    public String getCarType() 
    {
        return carType;
    }

    public String getFuelType() 
    {
        return fuelType;
    }

    public String getProductionDate() 
    {
        return productionDate;
    }

    public String getGearbox() 
    {
        return gearbox;
    }

    public static int getSelledCarNo() 
    {
        return selledCarNo;
    }

    public String getModelName() 
    {
        return modelName;
    }
   
    public String getCustomerNick() 
    {
        return customerNick;
    }

    public void setCustomerNick(String customerNick) 
    {
        this.customerNick = customerNick;
    }
    
    
    public Brand(String modelName,String brandName,String  ID, String color, String carType, String fuelType,String productionDate, String gearbox, String casetype, Engine engine,String customerNick, Options options) 
    {
        super(ID, color, carType, fuelType, productionDate, gearbox);
        this.casetype = casetype;
        this.engine = engine;
        this.customerNick=customerNick;
        this.options = options;
        this.modelName=modelName;
        selledCarNo++;
    }


    public String  getID() 
    {
        return ID;
    }
    
    @Override
    public String isCarWorking() {
        Random rand = new Random();
        if(this.brandName.equals("Ferrari"))
        {
            int merc_fail_prob=rand.nextInt(100000);
            if(merc_fail_prob==500)
            {
               return "Engine couldn't started";
            }
            else 
            {
                return"All functions are stable";
            }
        }
        else if(this.brandName.equals("Honda"))
        {
            int honda_fail_prob=rand.nextInt(1000);
            if(honda_fail_prob==500)
            {
                 return "Engine couldn't started";
            }
            else 
            {
                 return "All functions are stable";
            }
        }
        else 
        {
            int tesla_fail_prob=rand.nextInt(100000);
            if(tesla_fail_prob==500)
            {
                 return"Engine couldn't started";
            }
            else 
            {
                 return "All functions are stable" ;
            }
        }
    }
    
}
