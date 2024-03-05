/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package airlines;

import java.util.*;

/**
 *
 * @author DELL
 */
public class Airlins {
static Ticket t=null;
static ArrayList<Ticket> AllTicket;
 static Ticket Tick= null;
  
    public static void main(String[] args) {
     String hotel= null;
     String R=null;
     String T=null;
     String B= null;
     String Name;
     String NumOfID;
     double tp;
     Scanner s= new Scanner(System.in);
   System.out.println("Welcom to our tour booking site wibsite");
ArrayList<String> flights = new  ArrayList<String>();
     
      System.out.println("Please choose your destination: ");
        System.out.println("1-London Heathrow(British Airways)\n 2-Riyadh(British Airways)\n 3-London Heathrow(Saudi Airways)\n 4-Riyadh(Saudi Airways)\n 5-Amman(flyadeal)\n 6-Riyadh(flyadeal)\n 7-Amman(flynas)\n 8-Riyadh(flynas)\n 9-New York John F.Kennedy(Saudi Airways)\n 10-Riyadh(Saudi Airways) ");
            int fli = s.nextInt();
     switch(fli)
     {
         case 1:
         Flight f1 = new  Flight();
     
        f1.setNumOfFlight("BA262");    
        f1.setDeparture ("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f1.setDestination ("London Heathrow(LHR), The United Kingdom(The UK)");
        f1.setDuration("RUH → LHR (7h 20m)");
        f1.setOperator(new Operator("British Airways") );
        
        System.out.println(f1);
        
        flights.add(f1.getNumOfFlight());
        
       Country c=new Country();    //عرفت اول اوبجكت عشان استخدمة لطباعة معلومات مدينه لندن
      
       c.setCurrency(0.24);
       System.out.println("1SR ="+c.getCurrency()+"euro");
       System.out.println("\n");       
       
       c.setHotel("onw of the best hotels in Londo:\n1-Hard Rock Hotel 2-London The Hulkin como 3-Dorchester Hotel London");
       System.out.println(c.getHotel());
       System.out.println("\n");       
       
       c.setTouristPlaces("One of the most famous places in Londo: \nBuckingham Palace, London Tower, The View form The Shard, London Eye");
       System.out.println(c.getTouristPlaces());
       System.out.println("\n");       
       
       c.setRestaurant("One of the most famous Restaurant: \n1-Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       System.out.println(c.getRestaurant());
       System.out.println("\n");       
      
       c.setPopularFood("The most popular food in Londo: \nFull English breakfast, Banger and Mash, Pie and puree, Fish and chips, Spaghetti Bolognese");
       System.out.println(c.getPopularFood());
       
      //لحجز الفنادق والمطاعم والاماكن الاثرية 
       System.out.println("we have a service for booking hotels, restaurant and tourist places");
       System.out.println("\n");
       
       System.out.println(" if you want to reserve a Hotel, choose 1,\nand if you want reserve a Hotel and restaurant choose, 2,\nand if you want reserve a Hotel, restaurant, and one of the tourist places, choose 3,\nif you want to book a hotel and tourist places, choose 4 ,\nif you want to book a restaurant just, choose 5, \nif you want to book a tourist places just, choose 6,\nif you want to book a restaurant and tourist places, choos7 ,\nif you do not want to book, choos 8");
       int q= s.nextInt();
       s.nextLine(); 
       System.out.println("\n");
   
   switch (q){
     case 1:
       B="Book a Hotel";
       
       System.out.println("Select the name of the hotel:\n 1-Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine();
       break;

     case 2:
       B="Book a Hotel,Restaurant ";
  
       System.out.println("Select the name of the hotel:\n1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine();
     
       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R = s.nextLine();
       break;

     case 3:
       B="Book a Hotel,Restauran and Tourist place";
       
       System.out.println("Select the name of the hotel:\n  1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine();       

       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R= s.nextLine();
      
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine();
       break;

     case 4:
       B="Book a Hotel and Tourist place";

       System.out.println("Select the name of the hotel:\n1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine(); 
      
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine(); 
       break;
     
     case 5:
       B="Book a Restaurant ";  
           
       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R= s.nextLine(); 
       break;      
     
     case 6:
       B="Book a Tourist place";
       
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine(); 
       break;     
     
     case 7:
       B="Book a Restaurant anf Tourist place";       
            
       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R= s.nextLine();   
       
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine();  
       break;
     
     case 8:
       System.out.println("Thank you have a nice trip");
       break;   

     default:
       System.out.println("invalid choose from 1 to 8");
   }
   System.out.println("----------------------------------------------------------------");
    if(q==1){
       System.out.println(B);
 
       System.out.println("The hotel name is "+ hotel);
       System.out.println("200");
    }
    else if(q==2){
       System.out.println(B);
       
       System.out.println("The hotel name is "+ hotel);
       
       System.out.println("The Restaurant name is "+ R);
       System.out.println("400");
    }
    else if(q==3){
       System.out.println(B);
       
       System.out.println("The hotel name is "+ hotel);
       
       System.out.println("The Restaurant name is "+ R);
       
       System.out.println("The Tourist place name is "+ T);
       System.out.println("650");

    } 
    else if (q==4){
       System.out.println(B);
       
       System.out.println("The hotel name is "+ hotel);
       
       System.out.println("The Tourist place name is "+ T);
       System.out.println("450");
    }
    
    else if (q==5){
       System.out.println(B);
       
       System.out.println("The Restaurant name is "+ R);
              System.out.println("200");
    }
    
    else if(q==6){
       System.out.println(B);
       
       System.out.println("The Tourist place name is "+ T); 
              System.out.println("250");

    }
    else {
       System.out.println(B);
       
       System.out.println("The Restaurant name is "+ R);
       
       System.out.println("The Tourist place name is "+ T);  
       System.out.println("450");
    } 
        break;
      
        case 2:
         Flight f2 = new  Flight();
      
        f2.setNumOfFlight("BA263");    
        f2.setDeparture("London Heathrow(LHR), The United Kingdom(The UK)");
        f2.setDestination("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f2.setDuration ("LHR → RUH (6h 35m)");
        f2.setOperator(new Operator("British Airways") );
        
       System.out.println(f2);
        
        flights.add(f2.getNumOfFlight());
       break;
       
        case 3:
         Flight f3 = new  Flight();
         
        f3.setNumOfFlight ("SV111");   
        f3.setDeparture("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f3.setDestination("London Heathrow(LHR), The United Kingdom(The UK)");
        f3.setDuration("RUH → LHR (7h 25m)");
        f3.setOperator(new Operator("Saudi Airways") );
        
        System.out.println(f3);
        
        flights.add(f3.getNumOfFlight());
        
      Country cc =new Country();    //عرفت اول اوبجكت عشان استخدمة لطباعة معلومات مدينه لندن
      
       cc.setCurrency(0.24);
       System.out.println("1SR ="+cc.getCurrency()+"euro");
       System.out.println("\n");       
       
       cc.setHotel("onw of the best hotels in Londo:\n1-Hard Rock Hotel 2-London The Hulkin como 3-Dorchester Hotel London");
       System.out.println(cc.getHotel());
       System.out.println("\n");       
       
       cc.setTouristPlaces("One of the most famous places in Londo: \nBuckingham Palace, London Tower, The View form The Shard, London Eye");
       System.out.println(cc.getTouristPlaces());
       System.out.println("\n");       
       
       cc.setRestaurant("One of the most famous Restaurant: \n1-Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       System.out.println(cc.getRestaurant());
       System.out.println("\n");       
      
       cc.setPopularFood("The most popular food in Londo: \nFull English breakfast, Banger and Mash, Pie and puree, Fish and chips, Spaghetti Bolognese");
       System.out.println(cc.getPopularFood());
       
      //لحجز الفنادق والمطاعم والاماكن الاثرية 
       System.out.println("we have a service for booking hotels, restaurant and tourist places");
       System.out.println("\n");
       
       System.out.println(" if you want to reserve a Hotel, choose 1,\nand if you want reserve a Hotel and restaurant choose, 2,\nand if you want reserve a Hotel, restaurant, and one of the tourist places, choose 3,\nif you want to book a hotel and tourist places, choose 4 ,\nif you want to book a restaurant just, choose 5, \nif you want to book a tourist places just, choose 6,\nif you want to book a restaurant and tourist places, choos7 ,\nif you do not want to book, choos 8");
       int z= s.nextInt();
       s.nextLine(); 
       System.out.println("\n");
   
   switch (z){
     case 1:
       B="Book a Hotel";
       
       System.out.println("Select the name of the hotel:\n 1-Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine();
       break;

     case 2:
       B="Book a Hotel,Restaurant ";
  
       System.out.println("Select the name of the hotel:\n1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine();
     
       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R = s.nextLine();
       break;

     case 3:
       B="Book a Hotel,Restauran and Tourist place";
       
       System.out.println("Select the name of the hotel:\n  1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine();       

       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R= s.nextLine();
      
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine();
       break;

     case 4:
       B="Book a Hotel and Tourist place";

       System.out.println("Select the name of the hotel:\n1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel= s.nextLine(); 
      
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine(); 
       break;
     
     case 5:
       B="Book a Restaurant ";  
           
       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R= s.nextLine(); 
       break;      
     
     case 6:
       B="Book a Tourist place";
       
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine(); 
       break;     
     
     case 7:
       B="Book a Restaurant anf Tourist place";       
            
       System.out.println("Select the name of the Restaurant: 1- Cocotte Notting Hill, 2- Bonoo Indian Tapas, 3- E&O, 4- Hibox, 5- Spasso "); 
       R= s.nextLine();   
       
       System.out.println("Select the name of the Tourist place: 1- Buckingham Palace\n 2- London Tower\n 3-The view form The Shard\n 4-London Eye");
       T= s.nextLine();  
       break;
     
     case 8:
       System.out.println("Thank you have a nice trip");
       break;   

     default:
       System.out.println("invalid choose from 1 to 8");
   }
   System.out.println("----------------------------------------------------------------");
    if(z==1){
       System.out.println(B);
 
       System.out.println("The hotel name is "+ hotel);
    }
    else if(z==2){
       System.out.println(B);
       
       System.out.println("The hotel name is "+ hotel);
       
       System.out.println("The Restaurant name is "+ R);
    }
    else if(z==3){
       System.out.println(B);
       
       System.out.println("The hotel name is "+ hotel);
       
       System.out.println("The Restaurant name is "+ R);
       
       System.out.println("The Tourist place name is "+ T);
    } 
    else if (z==4){
       System.out.println(B);
       
       System.out.println("The hotel name is "+ hotel);
       
       System.out.println("The Tourist place name is "+ T);
    }
    
    else if (z==5){
       System.out.println(B);
       
       System.out.println("The Restaurant name is "+ R);
    }
    
    else if(z==6){
       System.out.println(B);
       
       System.out.println("The Tourist place name is "+ T);    
    }
    else {
       System.out.println(B);
       
       System.out.println("The Restaurant name is "+ R);
       
       System.out.println("The Tourist place name is "+ T);    
    }
         break;
      
               
       case 4:
         Flight f4 = new  Flight();
         
        f4.setNumOfFlight("SV120");   
        f4.setDeparture("London Heathrow(LHR), The United Kingdom(The UK)");
        f4.setDestination("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f4.setDuration("LHR → RUH (6h 30m)");
        f4.setOperator(new Operator("Saudi Airways") );
        
        System.out.println(f4);
        
        flights.add(f4.getNumOfFlight());
         break;
      
        case 5:
         Flight f5 = new  Flight();
         
        f5.setNumOfFlight("F3541");   
        f5.setDeparture("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f5.setDestination("Amman(AMM),Jordan");
        f5.setDuration("RUH → AMM (3h 15m)");
        f5.setOperator(new Operator("flyadeal") );
        
        System.out.println(f5);
        
        flights.add(f5.getNumOfFlight());
           
     Country c1=new Country();//اوبجكت لمعلومات مدينه عمان
       
       c1.setCurrency(0.19 );
       System.out.println("1SR ="+c1.getCurrency()+"Jordanian dinar");
       System.out.println("\n");       
 
       c1.setHotel("onw of the best hotels in Amman:\n1-Amman Rotana 2-La Casa Hotel Amman by FHM 3-Suwan Housing");
       System.out.println(c1.getHotel());
       System.out.println("\n");       

       c1.setTouristPlaces("One of the most famous places in Amman: \nRoman amphitheater, Amman Citadel, Taj Mall Amman, Rainbow Street");        
       System.out.println(c1.getTouristPlaces());
       System.out.println("\n");       

       c1.setRestaurant("One of the most famous Restaurant: \n1-Abu Zaghleh 2- Fakhr El Din 3- Areej Al Sham 4-Dining table");
       System.out.println(c1.getRestaurant());
       System.out.println("\n");       

       c1.setPopularFood("The most popular food in Amman: \nMansaf, almqaluba, kabsa, Zarb");
       System.out.println(c1.getPopularFood());
       System.out.println("\n");       
       
       //لحجز الفنادق والمطاعم والاماكن السياحية
       System.out.println("we have a service for booking hotels, restaurant and tourist places");
       System.out.println("\n");

       System.out.println(" if you want to reserve a Hotel, choose 1,\nand if you want reserve a Hotel and restaurant choose, 2,\nand if you want reserve a Hotel, restaurant, and one of the tourist places, choose 3,\nif you want to book a hotel and tourist places, choose 4 ,\nif you want to book a restaurant just, choose 5, \nif you want to book a tourist places just, choose 6,\nif you want to book a restaurant and tourist places, choos7 ,\nif you do not want to book, choos 8");
       int p= s.nextInt();
       s.nextLine(); 

  switch (p){
      case 1:    
       B="Book a Hotel";
    
      System.out.println("Select the name of the hotel:\n1- Amman Rotana \n 2-La Casa Hotel Amman by FHM \n 3-Suwan Housing "); 
      hotel = s.nextLine();
      break;
     
      case 2:
       B="Book a Hotel,Restaurant ";
      
       System.out.println("Select the name of the hotel:\n  1- Amman Rotana \n 2-La Casa Hotel Amman by FHM \n 3-Suwan Housing "); 
       hotel=s.nextLine();
      
            
       System.out.println("Select the name of the Restaurant: 1- Abu Zaghleh 2- Fakhr El Din 3- Areej Al Sham 4-Dining table");
       R= s.nextLine();
       break;
       
      case 3:
       B="Book a Hotel,Restauran and Tourist place";
             
       System.out.println("Select the name of the hotel:\n  1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel = s.nextLine();
       
       System.out.println("Select the name of the Restaurant:1- Abu Zaghleh+\n 2- Fakhr El Din\n 3- Areej Al Sham \n 4-Dining table");
       R =s.nextLine();

       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T = s.nextLine();
       break;
       
      case 4:
       B="Book a Hotel and Tourist place";
    
       System.out.println("Select the name of the hotel:\n  1- Amman Rotana \n 2-La Casa Hotel Amman by FHM \n 3-Suwan Housing "); 
       hotel= s.nextLine(); 
      
       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T= s.nextLine();
       break;
       
      case 5:
       B="Book a Restaurant ";  
      
       System.out.println("Select the name of the Restaurant:1- Abu Zaghleh+\n 2- Fakhr El Din\n 3- Areej Al Sham \n 4-Dining table");
       R= s.nextLine();          
       break;
       
      case 6:
       B="Book a Tourist place";
       
       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T= s.nextLine(); 
       break;
       
      case 7:
       B="Book a Restaurant anf Tourist place";       
           
       System.out.println("Select the name of the Restaurant:1- Abu Zaghleh+\n 2- Fakhr El Din\n 3- Areej Al Sham \n 4-Dining table");
       R= s.nextLine();   
       
       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T= s.nextLine();       
       break;     
       
      case 8:
       System.out.println("Thank you have a nice trip");
       break;
      
      default:
        System.out.println("invalid choose from 1 to 8");
        break;
  }
  System.out.println("-------------------------------------------------------------------------");
  System.out.print("\n");
  
   if(p==1){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
    }
    else if(p==2){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Restaurant name is "+ R);
    }
    else if(p==3){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Restaurant name is "+ R);
       System.out.println("The Tourist place name is "+ T);
    } 
    else if (p==4){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Tourist place name is "+ T);
    }
    
    else if (p==5){
       System.out.println(B);
       System.out.println("The Restaurant name is "+ R);
    }
    
    else if(p==6){
       System.out.println(B);
       System.out.println("The Tourist place name is "+ T);    
    }
    else if(p==7){
       System.out.println(B);
       System.out.println("The Restaurant name is "+ R);
       System.out.println("The Tourist place name is "+ T);    
    }

         break;
        
        case 6:
         Flight f6 = new  Flight();
         
        f6.setNumOfFlight("F3542");   
        f6.setDeparture("Amman(AMM),Jordan");
        f6.setDestination ("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f6.setDuration("AMM → RUH (1h 20m)");
        f6.setOperator(new Operator("flyadeal") );
        
        System.out.println(f6);
        
        flights.add(f6.getNumOfFlight());
         break;
         
       case 7:
         Flight f7 = new  Flight();
         
        f7.setNumOfFlight ("XY-253");   
        f7.setDeparture("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f7.setDestination("Amman(AMM),Jordan");
        f7.setDuration ("RUH → AMM (3h 40m)");
        f7.setOperator(new Operator("flynas") );
        
        System.out.println(f7);
        
        flights.add(f7.getNumOfFlight());
           
     Country c3=new Country();//اوبجكت لمعلومات مدينه عمان
       
       c3.setCurrency(0.19 );
       System.out.println("1SR ="+c3.getCurrency()+"Jordanian dinar");
       System.out.println("\n");       
 
       c3.setHotel("onw of the best hotels in Amman:\n1-Amman Rotana 2-La Casa Hotel Amman by FHM 3-Suwan Housing");
       System.out.println(c3.getHotel());
       System.out.println("\n");       

       c3.setTouristPlaces("One of the most famous places in Amman: \nRoman amphitheater, Amman Citadel, Taj Mall Amman, Rainbow Street");        
       System.out.println(c3.getTouristPlaces());
       System.out.println("\n");       

       c3.setRestaurant("One of the most famous Restaurant: \n1-Abu Zaghleh 2- Fakhr El Din 3- Areej Al Sham 4-Dining table");
       System.out.println(c3.getRestaurant());
       System.out.println("\n");       

       c3.setPopularFood("The most popular food in Amman: \nMansaf, almqaluba, kabsa, Zarb");
       System.out.println(c3.getPopularFood());
       System.out.println("\n");       
       
       //لحجز الفنادق والمطاعم والاماكن الاثرية 
       System.out.println("we have a service for booking hotels, restaurant and tourist places");
       System.out.println("\n");

       System.out.println(" if you want to reserve a Hotel, choose 1,\nand if you want reserve a Hotel and restaurant choose, 2,\nand if you want reserve a Hotel, restaurant, and one of the tourist places, choose 3,\nif you want to book a hotel and tourist places, choose 4 ,\nif you want to book a restaurant just, choose 5, \nif you want to book a tourist places just, choose 6,\nif you want to book a restaurant and tourist places, choos7 ,\nif you do not want to book, choos 8");
       int n= s.nextInt();
       s.nextLine(); 

  switch (n){
      case 1:    
       B="Book a Hotel";
    
      System.out.println("Select the name of the hotel:\n1- Amman Rotana \n 2-La Casa Hotel Amman by FHM \n 3-Suwan Housing "); 
      hotel = s.nextLine();
      break;
     
      case 2:
       B="Book a Hotel,Restaurant ";
      
       System.out.println("Select the name of the hotel:\n  1- Amman Rotana \n 2-La Casa Hotel Amman by FHM \n 3-Suwan Housing "); 
       hotel=s.nextLine();
      
            
       System.out.println("Select the name of the Restaurant: 1- Abu Zaghleh 2- Fakhr El Din 3- Areej Al Sham 4-Dining table");
       R= s.nextLine();
       break;
       
      case 3:
       B="Book a Hotel,Restauran and Tourist place";
             
       System.out.println("Select the name of the hotel:\n  1- Hard Rock Hotel London \n 2-Hard Rock Hotel London \n 3-The Hulkin como "); 
       hotel = s.nextLine();
       
       System.out.println("Select the name of the Restaurant:1- Abu Zaghleh+\n 2- Fakhr El Din\n 3- Areej Al Sham \n 4-Dining table");
       R =s.nextLine();

       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T = s.nextLine();
       break;
       
      case 4:
       B="Book a Hotel and Tourist place";
    
       System.out.println("Select the name of the hotel:\n  1- Amman Rotana \n 2-La Casa Hotel Amman by FHM \n 3-Suwan Housing "); 
       hotel= s.nextLine(); 
      
       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T= s.nextLine();
       break;
       
      case 5:
       B="Book a Restaurant ";  
      
       System.out.println("Select the name of the Restaurant:1- Abu Zaghleh+\n 2- Fakhr El Din\n 3- Areej Al Sham \n 4-Dining table");
       R= s.nextLine();          
       break;
       
      case 6:
       B="Book a Tourist place";
       
       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T= s.nextLine(); 
       break;
       
      case 7:
       B="Book a Restaurant anf Tourist place";       
           
       System.out.println("Select the name of the Restaurant:1- Abu Zaghleh+\n 2- Fakhr El Din\n 3- Areej Al Sham \n 4-Dining table");
       R= s.nextLine();   
       
       System.out.println("Select the name of the Tourist place: 1-Roman amphitheater\n 2- Amman Citadel \n 3- Taj Mall Amman\n 4- Rainbow Street");
       T= s.nextLine();       
       break;     
       
      case 8:
       System.out.println("Thank you have a nice trip");
       break;
      
      default:
        System.out.println("invalid choose from 1 to 8");
        break;
  }
  System.out.println("-------------------------------------------------------------------------");
  System.out.print("\n");
  
   if(n==1){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
    }
    else if(n==2){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Restaurant name is "+ R);
    }
    else if(n==3){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Restaurant name is "+ R);
       System.out.println("The Tourist place name is "+ T);
    } 
    else if (n==4){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Tourist place name is "+ T);
    }
    
    else if (n==5){
       System.out.println(B);
       System.out.println("The Restaurant name is "+ R);
    }
    
    else if(n==6){
       System.out.println(B);
       System.out.println("The Tourist place name is "+ T);    
    }
    else if(n==7){
       System.out.println(B);
       System.out.println("The Restaurant name is "+ R);
       System.out.println("The Tourist place name is "+ T);    
    }
     break;
        
        case 8:
         Flight f8 = new  Flight();
         
        f8.setNumOfFlight("XY-252");   
        f8.setDeparture("Amman(AMM),Jordan");
        f8.setDestination("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f8.setDuration("AMM → RUH (1h 10m)");
        f8.setOperator(new Operator("flynas") );
        
        System.out.println(f8);           
        flights.add(f8.getNumOfFlight());
         break;
        
         case 9:
         Flight f9 = new  Flight();
         
        f9.setNumOfFlight("SV23");   
        f9.setDeparture("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f9.setDestination("New York John F.Kennedy(JFK), United States of America(USA)");
        f9.setDuration("RUH → JFK (14h 20m)");
        f9.setOperator(new Operator("Saudi Airways ") );
        
        System.out.println(f9);
        
        flights.add(f9.getNumOfFlight());
        
    Country c2=new Country();//اوبجكت لمدينه نيويورك
     
       c2.setCurrency(0.27);
       System.out.println("1SR ="+ c2.getCurrency()+"$");
       System.out.println("\n");       
       
       c2.setHotel("onw of the best hotels in New York:\n1-the peninsula New York  2-the dominick hotel 3-New York marriott marquis");
       System.out.println(c2.getHotel());
       System.out.println("\n");       

       c2.setTouristPlaces("One of the most famous places in New York: \nstatue of liberty, niagara falls, central park, empire state building");
       System.out.println(c2.getTouristPlaces());
       System.out.println("\n");       

       c2.setRestaurant("One of the most famous Restaurant: \n1-piccola, 2-club a steakhouse, 3-olio e piu, 4-the consulate "); 
       System.out.println(c2.getRestaurant());
       System.out.println("\n");       

       c2.setPopularFood("The most popular food in New York: \npizza, bread bagel, grilled beef ribs, apple pie");
       System.out.println(c2.getPopularFood());
       System.out.println("\n");       
       
//       لحجز الفنادق والمطاعم والاماكن الاثرية 
       System.out.println("we have a service for booking hotels, restaurant and tourist places");
       System.out.println("\n");
   
       System.out.println(" if you want to reserve a Hotel, choose 1,\nand if you want reserve a Hotel and restaurant choose, 2,\nand if you want reserve a Hotel, restaurant, and one of the tourist places, choose 3,\nif you want to book a hotel and tourist places, choose 4 ,\nif you want to book a restaurant just, choose 5, \nif you want to book a tourist places just, choose 6,\nif you want to book a restaurant and tourist places, choos7 ,\nif you do not want to book, choos 8");
       int m= s.nextInt();
       s.nextLine(); 

    switch(m){  
       case 1:
       B="Book a Hotel";
     
       System.out.println("Select the name of the hotel:\n  1- the peninsula New York \n 2-the dominick hotel \n 3-New York marriott marquis "); 
       hotel= s.nextLine();
       break;
     
       case 2:
       B="Book a Hotel,Restaurant ";
     
       System.out.println("Select the name of the hotel:\n  1- the peninsula New York \n 2-the dominick hotel \n 3-New York marriott marquis "); 
       hotel= s.nextLine();

       System.out.println("Select the Restaurant using the number next to Restaurant name: 1- piccola \n2- club a steakhouse \n3- olio e piu \n4-the consulate");
       R= s.nextLine();
       break;
     
     
     case 3:
       B="Book a Hotel,Restauran and Tourist place";
       
       System.out.println("Select the name of the hotel:\n  1- the peninsula New York \n 2-the dominick hotel \n 3-New York marriott marquis "); 
       hotel= s.nextLine();
           
       System.out.println("Select the name of the Restaurant: 1- piccola \n2- club a steakhouse \n3- olio e piu \n4-the consulate");
       R= s.nextLine();
             
       System.out.println("Select the name of the Tourist place: \n1-statue of liberty \n2-niagara falls \n3-central park \n4-empire state building");
       T = s.nextLine();
       break;
       
     case 4: 
       B="Book a Hotel and Tourist place";
         
       hotel= s.nextLine();
       System.out.println("Select the name of the hotel:\n  1- the peninsula New York \n 2-the dominick hotel \n 3-New York marriott marquis "); 
       hotel= s.nextLine();
             
       System.out.println("Select the name of the Tourist place: \n1-statue of liberty \n2-niagara falls \n3-central park \n4-empire state building");
       T = s.nextLine();
       break;
     
     case 5:
       B="Book a Restauran";
       
       System.out.println("Select the name of the Restaurant: 1- piccola \n2- club a steakhouse \n3- olio e piu \n4-the consulate");
       R= s.nextLine(); 
       break;
     
     case 6:
       B="Book a Tourist place";
       
       System.out.println("Select the name of the Tourist place: \n1-statue of liberty \n2-niagara falls \n3-central park \n4-empire state building");
       T = s.nextLine();
       break;
     
     case 7:
       B="Book a Restauran and Tourist place";

       System.out.println("Select the name of the Restaurant: 1- piccola \n2- club a steakhouse \n3- olio e piu \n4-the consulate");
       R= s.nextLine();

       System.out.println("Select the name of the Tourist place: \n1-statue of liberty \n2-niagara falls \n3-central park \n4-empire state building");
       T = s.nextLine();
       break;
       
     case 8:
       System.out.println("Thank you have a nice trip");
       break;
      
     default:
       System.out.println("invalid choose from 1 to 8"); break;
               }  
  System.out.println("-------------------------------------------------------------------------");
  System.out.print("\n");
  
   if(m==1){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
    }
    else if(m==2){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Restaurant name is "+ R);
    }
    else if(m==3){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Restaurant name is "+ R);
       System.out.println("The Tourist place name is "+ T);
    } 
    else if (m==4){
       System.out.println(B);
       System.out.println("The hotel name is "+ hotel);
       System.out.println("The Tourist place name is "+ T);
    }
    
    else if (m==5){
       System.out.println(B);
       System.out.println("The Restaurant name is "+ R);
    }
    
    else if(m==6){
       System.out.println(B);
       System.out.println("The Tourist place name is "+ T);    
    }
    else if(m==7){
       System.out.println(B);
       System.out.println("The Restaurant name is "+ R);
       System.out.println("The Tourist place name is "+ T);    
    }
         break;
         
      case 10:
         Flight f10 = new  Flight();
         
        f10.setNumOfFlight("SV22");   
        f10.setDeparture("New York John F.Kennedy(JFK), United States of America(USA)");
        f10.setDestination("Riyadh(RUH), Kingdom of Saudi Arabia(KSA)");
        f10.setDuration("JFK → RUH (11h 50m)");
        f10.setOperator(new Operator("Saudi Airways ") );
        
        System.out.println(f10);
        
        flights.add(f10.getNumOfFlight());
         break;
      }//end switch 
     
     AllTicket=new ArrayList<Ticket>();
int service=0;
while(service!=-1){
     

Flight FF= new Flight();
        System.out.println(FF.getOperator());
        System.out.println("1- RUH\n 2- LHR\n 3- AMM\n 4-JFK" );
        String from;
        String to;
        System.out.println("");
        System.out.print("Please Enter your destination ");
        System.out.println("From:");
        from =  s.next();
        System.out.println("To:");
        to =  s.next();
        String d;
        int m; 
       System.out.println("Enter date doing:"); 
          System.out.println("Enter A Day:"); 
        d = s.next();
           System.out.println("Enter The Month"); 
         m = s.nextInt();

         
         
         
       double price=250;
       Seats S = null;
       int Num=0; 
       while((S == null)){
            while(Num>3 || Num<1){
       System.out.println("1- First Class\n2- Economy class\n3- Extra Space");
       System.out.println("Enter Number from 1 to 3.");
       Num = s.nextInt();
            }
            System.out.println("--------------------------------------------------------------------");
       System.out.println("Choose your seat,You must Enter the row first \nand then colunmn for the seat");
       System.out.println("Enter a Row number: ");
       System.out.println(" --  --                 --  --");      
       System.out.println("|00||01|   --  --  --  |05||06|");
       System.out.println(" --  --   |02||03||04|  --  --");
       System.out.println(" --  --    --  --  --   --  -- ");
       System.out.println("|10||11|   --  --  --  |15||16|");
       System.out.println(" --  --   |12||13||14|  --  --");
       System.out.println(" --  --    --  --  --   --  -- ");
       System.out.println("|20||21|   --  --  --  |25||26|");
       System.out.println(" --  --   |22||23||24|  --  --");
       System.out.println(" --  --    --  --  --   --  -- ");
       System.out.println("|30||31|   --  --  --  |35||36|");
       System.out.println(" --  --   |32||33||34|  --  --");
       System.out.println(" --  --    --  --  --   --  -- ");
       System.out.println("|40||41|   --  --  --  |45||46|");
       System.out.println(" --  --   |42||43||44|  --  --");
       System.out.println("           --  --  --");
            int row = s.nextInt();
       System.out.println("Enter a colunmn number: ");
            int column = s.nextInt();
              
       switch(Num){
           case(1):
               
               String color = "Green";
               System.out.println("there are special offers in this class!");
                                       String spof = "Independent room";
               System.out.println("We also offer free sancks Enjoy!");
                                       String snak = "FreeSnaks";
                S= new FirstClass(spof,snak,column,row,color);
                  
               break;
           case(2) :
               String color1="White";
               System.out.println("This class provides internet service!");
                          String WiFi = "Unlimited internet";
                          S=new EconomyClass(WiFi,column,row,color1);
               break;
           case(3):
               String color2="Yellow";
                System.out.println("There is a discount in this class!");
                          double disc = 100;
                          S=new ExtraSpace(disc,column,row,color2);
               break;
       }//swich
       
   }//while  
   System.out.println("----------------------------------------");
   System.out.println("Now we need information for the Ticket");
   System.out.println("Enter your Name:");
   Name=s.next();
   System.out.println("Enter a phone number:");
   long PhoneNum=s.nextLong();
   System.out.println("Enter the email Address:");
   String Email=s.next();
   System.out.println("Enter the passport:");
   String pp = s.next();
    Ticket t=new Ticket (S,Name,PhoneNum,Email,pp,price);
    System.out.println("Reserved\n----------Your Ticket----------");
    System.out.println(t.toString());
    System.out.println("----------Thank you----------");
    
    AllTicket.add(t);
System.out.println("Enter 1 for New reservation or enter -1 to exit");
          service = s.nextInt() ; 
    }
  for(int i=0;i<AllTicket.size();i++){
System.out.println(AllTicket.get(i));
}  
}
}
