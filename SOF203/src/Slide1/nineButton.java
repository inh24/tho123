/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Slide1;

import java.awt.Button;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Tho
 */
public class nineButton extends javax.swing.JFrame{
   public static void  main(String[] args) {
       JFrame f=new JFrame();
       f.setSize(500,450);
       f.setLocationRelativeTo(f);
       f.setDefaultCloseOperation(HIDE_ON_CLOSE);
       JPanel p=new JPanel();
       JButton[] btn=new JButton[9];
       for(int i=0;i<9 ;i++){
           btn[i] =new JButton("Tho"+i);
           p.add(btn[i]);
       }
       f.add(p);
       f.setVisible(true);
   }
}
    

