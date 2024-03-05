/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;

/**
 *
 * @author DELL
 */
public class Operator {
    private String airline;
     
 
     
     
 public  Operator( String airline)  
 {
   this.airline =   airline ; 
 }  

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    @Override
    public String toString() {
        return "Operator{" + "airline=" + airline + '}';
    }
}
