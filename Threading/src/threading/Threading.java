/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threading;

/**
 *
 * @author python
 */
public class Threading extends Thread{

    /**
     * @param args the command line arguments
     */
    
    public void run(){
        for(int i = 0;i<10;i++){
            System.out.print(i+"\n");
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread Interrupted! ");
            }
        }
    }
    public static void main(String[] args) {
        Threading t = new Threading();
        t.start();
        for(int i = 0;i<10;i++){
            System.out.print(i+"\n");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.print("Interrupted Exception");
            }
        }
        // TODO code application logic here
        
    }
    
}
