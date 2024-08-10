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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author python
 */
import java.util.ArrayList;
import java.util.Scanner;


class BUS {
    private int BusNo;
    private boolean Ac;
    private int Capacity;
    BUS(int busno, boolean ac, int capacity){
    this.BusNo = busno;
    this.Ac =ac;
    this.Capacity = capacity;
    }
    public int getBuses(){
    return BusNo;
    }
    public boolean getAc(){
    return Ac;
    }
    public int getCapacity(){
    return Capacity;
    }
    public boolean setAc(boolean val){
    return Ac = val;
    }
    public int setCapacity(){
    return Capacity;
    }
    public void display(){
    System.out.print("Bus no: "+BusNo+"    ");
    System.out.print("Bus Ac availability: "+Ac+"    ");
    System.out.print("Bus Capacity: "+BusNo+"\n");
    }
    
}
