/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Flights {
    Scanner user = new Scanner (System.in);
protected String name;
protected String numOfID;
protected String operator;
protected String classes;
protected String from;
protected String to;
protected String numOfFlight;
protected int Price;

protected ArrayList<String>Airport;

public Flights(ArrayList Airport, String from,String to,String company){
this.Airport=Airport;
this.from=from;
this.to=to;
this.operator=operator;
}

    public Flights() {
    }

public String getDirection(){
     if (Airport.contains (from) && Airport.contains (to)) {
return(""+"Your flights direction"+"\n"+"|"+" From : "+from+" - To : "+to);
}
 else {
return ("the flight does not exist");
         }
}
public int getPrice(){
    
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getOperator() {
        return operator;
    }
}