/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PythCoPrime;

/**
 *
 * @author python
 */
public class Clock {
    public static void main(String[] args) throws InterruptedException
    {
        int s=0,m=0,h=0;
        while(true)
        {
            System.out.printf("\r %02d: %02d : %02d", h,m,s);
            System.out.flush();
            Thread.sleep(1000);
            s+=1;
            if(s == 60)
            {
                m+=1;
                s = 0;
            }
            else if(m == 60)
            {
                h+=1;
                m = 0;
                s = 0;
            }
            else if(h == 12)
            {
                h = 0;
                m = 0;
                s = 0;
            }
        }
    }
}
