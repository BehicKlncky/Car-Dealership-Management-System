package main;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import static main.Owned_Cars.jLabel18;

public class SystemClass implements IDInitialiser, setColor,resetColor
{
    
    public static int total_car = 0;
    public static ArrayList <Brand> allCars = new ArrayList();
    
    public static boolean addCar(Brand br)
    {
        boolean flag = true;
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            if (allCars.get(i).ID.equals(br.getID()))
            {
                flag = false;
            }
        }
        if (flag == false)
        {
            System.out.println("There is a car within same ID.");
            return false;
        }
        else
        {
            allCars.add(br);
            total_car++;
            return true;
        }
    }
    
    public static Brand searchCarID(String ID)
    {
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            if (allCars.get(i).ID.equals(ID))
            {
                return allCars.get(i);
            }
        }
        return null;
    }
    public static ArrayList <Brand> searchCarOwner(String customernick)
    {   
        CarInfo.ReadAllObject();
        ArrayList<Brand> arr=new ArrayList();
        for (Brand b : allCars)
        {
            if (b.getCustomerNick().equals(customernick))
            {
                arr.add(b);
            }
        }
        return arr;
    }
    public static String deleteCar(String ID)
    {
        CarInfo.ReadAllObject();
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            if (allCars.get(i).ID.equals(ID))
            {
                CarInfo.ReadAllObject();
                String result = allCars.get(i).toString();
                allCars.remove(i);
                CarInfo.writeObject();
                CarInfo.ReadAllObject();
                return result;
            }
        }
        return "There is no car with ID that you enter.";
    }
    
    public static String displayCar()
    {
        String result = "";
        for (int i = 0 ; i < allCars.size() ; i++)
        {
            result += allCars.get(i).toString() + "\n--------------\n";
        }
        return result;
    }
  
    public static void setCarIcon(int k)
    {
        CarInfo.ReadAllObject();
        ArrayList<Brand> arr = searchCarOwner(Home.lblnick.getText());
        if(arr.get(k).getModelName().equals("Type R"))
        {
        ImageIcon hondacar = new ImageIcon("hondatyper.png");
        jLabel18.setVisible(true);
        Owned_Cars.lblIconCarPhoto.setIcon(hondacar);
        }
        else if(arr.get(k).getModelName().equals("Model S") && arr.get(k).getColor().equals("Black"))
        {
            ImageIcon teslacar = new ImageIcon("TeslaCar.png");
            jLabel18.setVisible(false);
            Owned_Cars.lblIconCarPhoto.setIcon(teslacar);
        }
        else if(arr.get(k).getModelName().equals("Model S")&& arr.get(k).getColor().equals("Red"))
        {
            jLabel18.setVisible(false);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("Tesla-kirmizi-resized.png"));
        } 
        else if(arr.get(k).getModelName().equals("Model X")&& arr.get(k).getColor().equals("Black"))
        {
            jLabel18.setVisible(false);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("ModelX-siyahResized.png"));
        } 
        else if(arr.get(k).getModelName().equals("Model X")&& arr.get(k).getColor().equals("Red"))
        {
            jLabel18.setVisible(false);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("modelx-kirmizi-resized.png"));
        }
        else if(arr.get(k).getModelName().equals("SF90") && arr.get(k).getColor().equals("Scuderia Rosso"))
        {
            ImageIcon ferraricar = new ImageIcon("Ferrari.png");
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(ferraricar);
        } 
        else if(arr.get(k).getModelName().equals("SF90")&& arr.get(k).getColor().equals("Yellow"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("Sf90Stradale-sari-resized.png"));
        }
        else if(arr.get(k).getModelName().equals("F458")&& arr.get(k).getColor().equals("Scuderia Rosso"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("f458-kirmizi-resized.png"));
        }
        else if(arr.get(k).getModelName().equals("F458")&& arr.get(k).getColor().equals("Yellow"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("f458-sari-resized.png"));
        }
        else if (arr.get(k).getModelName().equals("Accord"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("accord-01.png"));
        }
        else if (arr.get(k).getModelName().equals("Civic") && arr.get(k).getColor().equals("Gray"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("gri-1.png"));
        }
        else if (arr.get(k).getModelName().equals("Civic") && arr.get(k).getColor().equals("White"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("beyaz-1.png"));
        }
        else if (arr.get(k).getModelName().equals("Civic") && arr.get(k).getColor().equals("Black"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("siyah-1.png"));
        }
        else if (arr.get(k).getModelName().equals("Civic") && arr.get(k).getColor().equals("Silver"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("gumus-1.png"));
        }
        else if (arr.get(k).getModelName().equals("Civic") && arr.get(k).getColor().equals("Red"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("kirmizi-1.png"));
        }
        else if (arr.get(k).getModelName().equals("Civic") && arr.get(k).getColor().equals("Blue"))
        {
            jLabel18.setVisible(true);
            Owned_Cars.lblIconCarPhoto.setIcon(new ImageIcon("mavi-1.png"));
        }
    }  

    @Override
    public String IDInitialiser() 
    {
      int id;
        CarInfo.ReadAllObject();
        if(SystemClass.allCars.isEmpty())
        {
            return "001";
        }
        else
        {
            String ids=SystemClass.allCars.get(SystemClass.allCars.size()-1).getID();
            id=Integer.parseInt(ids);
            id++;
            if ( id< 10)
            {
                return("00" + String.valueOf(id));
            }
            else if (id >= 10 && id < 100)
            {
                return("0" + String.valueOf(id));
            }
            else if (id >= 100)
            {
                return(String.valueOf(id));
            }
            String ID1=String.valueOf(id);
            return ID1;
        }  
    }

    @Override
    public void setColor(JPanel p) {
       p.setBackground(new java.awt.Color(197, 197, 197));
    }

    @Override
    public void resetColor(JPanel p) {
       p.setBackground(new java.awt.Color(220,220,220));
    }
}
    

