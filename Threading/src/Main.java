/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author python
 */
class Master extends Thread{
    public void display(){
    System.out.println("Swarna --- Pia");
    }
}
    class Even extends Master implements Runnable{
    public void run()
    {
        for(int i = 0;i<10;i++){
            if(i%2 == 0){
                System.out.println(i);
            }
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e){
            System.out.print("Thread Mistake");
            }
        }
    }
    }
    
    
    class Odd extends Master implements Runnable{
    public void run()
    {
        for(int i = 0;i<10;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
            try{
            Thread.sleep(1000);
            }
            catch(InterruptedException e){
            System.out.print("Thread Mistake");
            }
        }
    }
    }
    public class Main{
        public static void main(String args[]){
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        o.start();
        e.display();
        o.display();
        }
}
