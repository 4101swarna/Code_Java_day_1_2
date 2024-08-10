/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT123;

/**
 *
 * @author python
 */
import java.awt.*;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Awt1 extends Frame implements ActionListener
{
    private Button small;
    private Label label = new Label("Hello!!");
    public Awt1()
        {
            setTitle("Title");
            setSize(300, 400);
            small = new Button("Click ");
            add(small);
            small.addActionListener(this);
            setLayout(new FlowLayout());
            setVisible(true);
            addWindowListener(new WindowAdapter()
            {
                public void windowClosing(WindowEvent we)
                {
                        dispose();
                        System.exit(0);
                }
            });
        }
    @Override
    public void actionPerformed(ActionEvent act)
    {
        System.out.println("Button Clicked");
        add(label);
    }
    public static void main(String[] args)
    {
       new Awt1(); 
    }
}

