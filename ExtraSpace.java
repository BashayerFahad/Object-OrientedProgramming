/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;

/**
 *
 * @author DELL
 */
public class ExtraSpace extends Seats {
   String extraSpace;
    double discount;

    public ExtraSpace(int column, int row, String color) {
        super(column, row, color);
    }

    public ExtraSpace(double discount, int column, int row, String color) {
        super(column, row, color);
        this.extraSpace = "Extra Space";
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public void print() {
        System.out.println("The Class is Extra Space" );
        System.out.println("Discount is:" + discount );
        
    }
}
