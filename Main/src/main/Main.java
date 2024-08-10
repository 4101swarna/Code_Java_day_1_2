/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.awt.Color;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException 
    {
        Scanner sc = new Scanner(System.in);
        String player1, player2;
        Color myColor = Color.RED;
        Color myColor2 = Color.ORANGE;
        
        System.out.println("Enter first player name: ");
        player1 = sc.nextLine();
        System.out.println("Enter Second player name: ");
        player2 = sc.nextLine();
        System.out.println("Welcome "+player1+" "+"and"+" "+player2+" ");
        Thread.sleep(1000);
        List<Integer> randomNumbers = new ArrayList<>();
        Random r = new Random();
        int a;
        a = r.nextInt(10);
        while(randomNumbers.size() != 5)
        {
            a = r.nextInt(10)+1;
            if(! randomNumbers.contains(a))
            {
                randomNumbers.add(a);
            }
        }
        //System.out.println(randomNumbers);
        
        List<Integer> playerOne = new ArrayList<>();
        List<Integer> playerTwo = new ArrayList<>();
        
        int g1, g2, j = 0, score_1 = 0, score_2 = 0;
        while(j<3)
        {
            System.out.println("-------Turn "+(j+1)+" -------");
            System.out.println(player1+" Enter a number, kudasai!!");
            g1 = sc.nextInt();
        
            while(playerOne.contains(g1) || playerTwo.contains(g1))
            {
                System.out.println("Enter a different number Kudasai!!");
                g1 = sc.nextInt();
            }
        
            if(! playerOne.contains(g1))
            {
                playerOne.add(g1); 
                score_1++;
            }
            
            if(randomNumbers.contains(g1))
            {
                score_1++;
            }
            
            
            System.out.println(player2+" Enter a number, kudasai!!");
            g2 = sc.nextInt();
            while(playerOne.contains(g2) || playerTwo.contains(g2))
            {
                System.out.println("Enter a different number Kudasai!!");
                g2 = sc.nextInt();
            }
        
            if(! playerTwo.contains(g2))
            {
                playerTwo.add(g2);
                
            }
            
            if(randomNumbers.contains(g2))
            {
                score_2++;
            }
            
            j++;
            
            Thread.sleep(400);
        }
        
        System.out.println("Computer's guesses: ");
        System.out.println(randomNumbers);
        
        System.out.println(player1+" 's guesses: ");
        System.out.println(playerOne);
        System.out.println(score_1);
        
        System.out.println(player2+" 's guesses: ");
        System.out.println(playerTwo);
        System.out.println(score_2);
        Thread.sleep(800);
        if(score_1 < score_2)
        {
            System.out.println("Winner is "+ player2+" !");
            //System.out.println(score_1);
        }
        
        else if(score_1 > score_2)
        {
            System.out.println("Winner is "+ player1+" !");
            
        }
        
        else
        {
            System.out.println("It's a draw!!");
        
        }
    }
}
