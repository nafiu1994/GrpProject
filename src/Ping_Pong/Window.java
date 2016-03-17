/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ping_Pong;
import javax.swing.*;
import java.awt.Color;
/**
 *
 * @author Lawal Nafiu
 */
public class Window extends JFrame{
    Color bg = new Color(0x0ff);
    public Window(int x, int y){
        JFrame window = new JFrame();
        window.setSize(x, y);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocation(100, 50);
        window.setVisible(true);
        Panel obstacles = new Panel();
        window.add(this);
        Animation ball = new Animation();
    }
}
