/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ping_Pong;
import javax.swing.JFrame;
/**
 *
 * @author SIVLEK DNOMMAH
 */
public class Window extends JFrame{
    public Window(int length, int breadth){
    JFrame window = new JFrame();
    window.setSize(breadth, length);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    
}
    
}
