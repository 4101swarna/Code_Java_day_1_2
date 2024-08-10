/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusReserve;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author python
 */
class Booking {
String name;
int Busno;
Date date;
int Booked = 0;
Scanner sc = new Scanner(System.in);


Booking(){
System.out.print("Enter bus no: ");
Busno = sc.nextInt();
System.out.print("Enter name: ");
name = sc.next();
System.out.print("Enter date (DD-MM-YYYY) : ");
String input = sc.next();
SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
try{
    date = sdf.parse(input);
}
catch(ParseException e){
    e.printStackTrace();
}
}

    /**
     *
     * @param Buses
     * @param Bookings
     * @return
     */
    public boolean isAvailable(ArrayList<BUS> Buses, ArrayList<Booking> Bookings)
{    
    int capacity = 0;
    
    for(BUS b:Buses){
    if(b.getBuses() == Busno){
        capacity = b.getCapacity();
    }
    }
    
    for(Booking b:Bookings){
        if(b.Busno == Busno && b.date.equals(date)){
        Booked++;
        }
    }
    return Booked<capacity?true:false;
} 
}
