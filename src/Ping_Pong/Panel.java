/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ping_Pong;
import java.awt.Graphics;
import javax.swing.JPanel;
import static Ping_Pong.Main.LENGTH;
import static Ping_Pong.Main.HEIGHT;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
        
import java.awt.Color;
/**
 *
 * @author Lawal Nafiu
 */
public class Panel extends JPanel {
    
    public void paintComponent(Graphics g){
        Color[] colors = new Color[4];
        colors[0] = Color.RED ;
        colors[1] = Color.BLUE;
        colors[2] = Color.ORANGE ;
        colors[3] = Color.MAGENTA;
        super.paintComponent(g);
        for(int j = 10; j <= 150 ; j += 15)
        {
            g.setColor(colors[(j + 99) % 4]);
            for(int i = 9; i <= LENGTH  ; i += 55)
            {
                g.fillRect(i,j, 50, 10);
            }
        }
    }
        
    }
