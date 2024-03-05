/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package airlines;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Ticket {
 public static int TicketNum =0;
   private Seats seat;
   private String Name;
   private long phoneNum;
   private String EmailAdd;
   private String passport;
   private double price;

    public Ticket() {
        TicketNum++;
    }

    public Ticket(
            Seats seat, String Name, long phoneNum, String EmailAdd, String passport, double price) {
        this.seat = seat;
        this.Name = Name;
        this.phoneNum = phoneNum;
        this.EmailAdd = EmailAdd;
        this.passport = passport;
        this.price = price;
        TicketNum++;
    }


    public Seats getSeat() {
        return seat;
    }

    public void setSeat(Seats seat) {
        this.seat = seat;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmailAdd() {
        return EmailAdd;
    }

    public void setEmailAdd(String EmailAdd) {
        this.EmailAdd = EmailAdd;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Ticket:" + TicketNum + "            "+"Seat:" + seat + "             "+"Name:" + Name +"\nphone Number:" + phoneNum +"   "+"passport:" + passport+"      "+ "Email Address:" + EmailAdd + "\nPrice:" + SeatPrice() ;
    }

   
    public double SeatPrice() {
        if(seat instanceof FirstClass){
            return price *2;
        }else if (seat instanceof ExtraSpace){
            return price- ((ExtraSpace)seat).getDiscount();
        }else  
            return price ;
    }
}
