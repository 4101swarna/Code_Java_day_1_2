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
import java.util.Scanner;
public class Main_1 {
    
    private static boolean coPrime(int a, int b)
    {
        return gcd(a,b) == 1;
    }
    
    
    private static int gcd(int a, int b)
    {
        int temp = 0;
        while(b!= 0)
        {
            temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[])throws InterruptedException
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter range: ");
        int r = sc.nextInt();
        for(int i = 3; i<=r;i++)
        {
            //System.out.println(i);
            for(int j = 3;j<i;j++)
            {
                //System.out.println(j);
                for(int k = 3;k<j; k++)
                {
                    //System.out.println(k*k + j*j == i*i);
                    //System.out.println(coPrime(j,i));
                    //System.out.println(coPrime(k,j));
                    //System.out.println(coPrime(i,k));
                    if( (k*k + j*j == i*i) && coPrime(i,j) && coPrime(j,k) && coPrime(k,i))
                    {
                        System.out.println(k+" "+j+" "+i);
                    }
                    
                }
            }
        }
    }
    

    
    
}
