/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.arenagame;
     import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
//import javax.swing.*;
/**
 *
 * @author fletc
 */
public class Arenagame implements ActionListener{
     private static JLabel userLabel;
    
    private static JLabel passwordLabel;
  
    private static JButton button;
    private static JLabel success;
    private static JLabel Player;
    private static JLabel Potion;
    

    public static void main(String[] args) {
        

//import javax.swing.*;
    
   
        // TODO code application logic here
        
        JPanel panel = new JPanel();
        JFrame frame = new JFrame();
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.add(panel);
        
        panel.setLayout(null);
        
        userLabel = new JLabel("Level:1 ");
        userLabel.setBounds(30, 20, 80, 25);
        panel.add(userLabel);
        
   ;
        
        passwordLabel = new JLabel("Monster HP:120 ");
        passwordLabel.setBounds(120, 20, 80, 25);
        panel.add(passwordLabel);
        
        Player = new JLabel("Player HP:100 ");
        Player.setBounds(30, 160, 80, 25);
        panel.add(Player);
        
        Potion = new JLabel("Potions:3 ");
        Potion.setBounds(360, 160, 80, 25);
        panel.add(Potion);
        
      
        
        button = new JButton("Attack!");
        button.setBounds(30, 180, 80, 25);
        button.addActionListener(new Arenagame());
        panel.add(button);
        
         button = new JButton("Heal");
        button.setBounds(360, 180, 80, 25);
        button.addActionListener(new Arenagame());
        panel.add(button);
        
        
        
        success = new JLabel("");
        success.setBounds(10, 110, 300, 25);
        panel.add(success);
        
        frame.setVisible(true);   
        
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
      
            }
    
    
}
        
        
        
        
        
        
        
        
        
    

