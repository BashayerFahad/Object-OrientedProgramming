/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;

/**
 *
 * @author DELL
 */
public class Flight {
  private String numOfFlight;
    private String departure;
    private String destination;
    private String duration;
     Operator operator;
    
    public Flight() {
  }
    
public Flight(Operator operator) {
        this.operator = operator;
    }

    public String getNumOfFlight() {
        return numOfFlight;
    }

    public Flight(String numOfFlight, String departure, String destination, String duration, Operator operator) {
        this.numOfFlight = numOfFlight;
        this.departure = departure;
        this.destination = destination;
        this.duration = duration;
        this.operator = operator;
    }
    

    public void setNumOfFlight(String numOfFlight) {
        this.numOfFlight = numOfFlight;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return "Flight\n{\n" + "numOfFlight:" + numOfFlight +
                " \ndeparture:" + departure 
                + " \ndestination:" + destination 
                + " \nduration:" + duration
                + "\n operator:" + operator.getAirline() 
                + '}';
    }
  
}
