/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit.programming;

import java.awt.Graphics;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author cmneville
 */
public class SimpleDrawTest {
    
    public SimpleDrawTest() {
    }
    
    @Test
    public void testInstance(){
        SimpleDraw instance = new SimpleDraw(new DrawGraphics());
        assertTrue(!(instance.draw.box1.xDirection == 0));
        assertTrue(!(instance.draw.box2.xDirection == 0));
        assertTrue(!(instance.draw.box3.xDirection == 0));
    }
    
}
