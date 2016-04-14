/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.programming;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

public class DrawGraphics {
    static ArrayList<BouncingBox> array = new ArrayList<>();
    BouncingBox box1;
    BouncingBox box2;
    BouncingBox box3;
    
    
    
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        box1 = new BouncingBox(200, 50, Color.BLUE);
        box2 = new BouncingBox(180, 30, Color.RED);
        box3 = new BouncingBox(91, 1, Color.BLACK);
    }

    /** Draw the contents of the window on surface. Called 20 times per second. */
    public void draw(Graphics surface) {
        surface.drawLine(50, 50, 250, 250);
        box1.draw(surface);
        box2.draw(surface);
        box3.draw(surface);
    }
} 