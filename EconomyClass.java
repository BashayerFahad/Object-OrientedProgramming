/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;

/**
 *
 * @author DELL
 */
public class EconomyClass extends Seats {
  String economyClass;
     String wiFiService;
     
    

    public EconomyClass(String wiFiService, int column, int row, String color) {
        super(column, row, color);
        this.economyClass = "economyClass";
        this.wiFiService = wiFiService;
    }
    
    public EconomyClass(int column, int row, String color) {
        super(column, row, color);
    }

    public String getEconomyClass() {
        return economyClass;
    }

    public void setEconomyClass(String economyClass) {
        this.economyClass = economyClass;
    }

    public String getWiFiService() {
        return wiFiService;
    }

    public void setWiFiService(String wiFiService) {
        this.wiFiService = wiFiService;
    }
    
    

    @Override
    public void print() {
       System.out.println("The class is Economy Class");
       System.out.println("WiFi Service is :" + wiFiService);
    }
}
