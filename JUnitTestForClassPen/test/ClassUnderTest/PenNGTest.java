/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ClassUnderTest;

import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author Sergey Grigoryev
 */
public class PenNGTest {
    
    public PenNGTest() {
         
    }    
    @Test
    public void testGetColorOnBlue(){
        Assert.assertEquals(new Pen(1).getColor(), "BLUE");
    }
     @Test
    public void testGetColorOnGreen(){ 
        Assert.assertEquals(new Pen(1,1.0,"GREEN").getColor(), "GREEN");        
    }
    @Test
    public void testIsWorkOnPositive(){
        Assert.assertEquals(String.valueOf(new Pen(1).isWork()),String.valueOf(true));
    }
    @Test
    public void testIsWorkOnZero(){
        Assert.assertEquals(String.valueOf(new Pen(0).isWork()),String.valueOf(false));
    }
    @Test
    public void testIsWorkOnNegative(){
        Assert.assertEquals(String.valueOf(new Pen(-1).isWork()),String.valueOf(false));
    }
    @Test
    public void testWriteOnNotWork(){
        Assert.assertEquals(new Pen(-1,1.0).write("testWord"),"");
    }
    @Test
    public void testWriteOnInkMoreThenWordLength(){
        Assert.assertEquals(new Pen(9,1.0).write("testWord"),"testWord");
    }
    @Test
    public void testWriteOnInkEqualToWordLength(){
        Assert.assertEquals(new Pen(8,1.0).write("testWord"),"testWord");
    }
    @Test
    public void testWriteOnInkLessThenWordLength(){
        Assert.assertEquals(new Pen(4,1.0).write("testWord"),"test");
    }
    @Test
    public void testWriteOnSizeLetterEqualZero(){
        Assert.assertEquals(new Pen(4,0).write("testWord"),"");
    }    
    @Test
    public void testWriteOnSizeLetterLessZero(){
        Assert.assertEquals(new Pen(4,-1.0).write("testWord"),"");
    }    
    @Test
    public void testWriteOnSizeOfWordMoreThanInc(){
        Assert.assertEquals(new Pen(4,2).write("testWord"),"te");
    }  
}
