/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;

/**
 *
 * @author DELL
 */
public class FirstClass extends Seats{
    String firstClass;
    String specialOffers;
    String freeSnacks;

    public FirstClass(int column, int row, String color) {
        super(column, row, color);
    }

    public FirstClass(String specialOffers, String freeSnacks, int column, int row, String color) {
        super(column, row, color);
        this.firstClass = "First Class";
        this.specialOffers = specialOffers;
        this.freeSnacks = freeSnacks;
    }

    public String getFirstClass() {
        return firstClass;
    }

    public void setFirstClass(String firstClass) {
        this.firstClass = firstClass;
    }

    public String getSpecialOffers() {
        return specialOffers;
    }

    public void setSpecialOffers(String specialOffers) {
        this.specialOffers = specialOffers;
    }

    public String getFreeSnacks() {
        return freeSnacks;
    }

    public void setFreeSnacks(String freeSnacks) {
        this.freeSnacks = freeSnacks;
    }
    
    @Override
    public void print() {
        System.out.println("The class is First Class");
        System.out.println("The Special Offers" + specialOffers);
        System.out.println("Free Snacks" + freeSnacks );
    }
}    
    
    

