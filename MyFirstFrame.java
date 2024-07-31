/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ul;

import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author nomyy
 */
public class MyFirstFrame extends JFrame{

    public MyFirstFrame() {
        setTitle("My First GUI");
        setSize(400,200);
        setDefaultLookAndFeelDecorated(true);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setForeground(Color.blue);
        setVisible(true);
    }
    
    
}
