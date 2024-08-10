/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusReserve;

/**
 *
 * @author python
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        ArrayList<BUS> Buses = new ArrayList<BUS>();
        ArrayList<Booking> Bookings = new ArrayList<Booking>();
        Scanner sc = new Scanner(System.in);

        Buses.add(new BUS(1,true,2));
        Buses.add(new BUS(2,false,3));
        Buses.add(new BUS(3,true,3));

        for(BUS b : Buses)
        {
            b.display();
        }

        int choice = 1;
        while(choice ==1){
        System.out.print("Press 1 to book or 2 to exit \n");
        choice = sc.nextInt();
        Booking book = new Booking();
        if(choice == 1){
            if(book.isAvailable(Buses, Bookings)){
                System.out.print("Confirmed Booking \n\n");
                Bookings.add(book);
        }
            else{
            System.out.print("Not Available \n\n");
            }
        }
    }
}
}

