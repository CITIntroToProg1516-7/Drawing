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
    
    /** Initializes this class for drawing. */
    public DrawGraphics() {
        array.add(new BouncingBox(200, 50, Color.BLUE));
        array.add(new BouncingBox(-93, 30, Color.RED));
        array.add(new BouncingBox(20, 1000, Color.BLACK));
       
        array.get(0).setMovementVector(10, -23);
        array.get(1).setMovementVector(4, 0);
        array.get(2).setMovementVector(30,30);
        
    }

    /** Draw the contents of the window on surface. Called 20 times per second.
     * @param surface */
    public void draw(Graphics surface) {
        surface.drawLine(2, 4, 6, 8);
        surface.draw3DRect(10, 30, 30, 70, true);
        surface.drawString("Ninjas", 100, 40); 
        
        for(BouncingBox box: array){ //for every element of bouncing box in the array, draw it
            box.draw(surface);
       }
    }
} 