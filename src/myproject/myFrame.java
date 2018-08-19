/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myproject; 

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author Kevin
 */
public class myFrame{
        
       public myFrame(int width, int height){
        JFrame theFrame = new JFrame();
        theFrame.setSize(width, height);
        theFrame.setVisible(true);
        theFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setSize(width/3, height);
        panel.setVisible(true);
        panel.setBackground(Color.red);
        
        theFrame.add(panel);
        
        
        }
       
}
