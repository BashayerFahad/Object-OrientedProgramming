/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;

/**
 *
 * @author DELL
 */
public abstract class Seats {
  int column;
    int row;
    String color;

    public Seats() {
    }

    public Seats(int column, int row, String color) {
        this.column = column;
        this.row = row;
        this.color = color;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void print();
    
    @Override
    public String toString() {
        return row +""+column;
    }
    

}
