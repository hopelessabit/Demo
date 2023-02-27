/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;


import demo.Demo;
import org.testng.annotations.Test;
import org.testng.Assert;

/**
 *
 * @author mical
 */
public class DemoTestCase {
    @Test
    public void testGetPowerForIntGivenRightArgumentReturnWell(){
        //Test case 1: Expect 0^5 = 0
        int a = 0, b = 5;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 0);
        
        //Test case 2: Expect 0^7 = 0
        a = 0; b = 7;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 0);

        //Test case 3: Expect 1^3 = 1
        a = 1; b = 3;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 1);

        //Test case 4: Expect 0^7 = 128
        a = 2; b = 7;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 128);
        
        //Test case 5: Expect 6^7 = 279936
        a = 6; b = 7;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 279936);
        
        //Test case 6: Expect 9^9 = 387420489
        a = 9; b = 9;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 387420489);
        
    }
    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testGetPowerForIntGivenWrongtArgumentThrowsExpection(){
        //Test case 6: 
        //0^0 Throws exception "Undefined"
        Demo.getPowerForInt(0, 0);
        
        //Test case 7: 10^12
        //Exception result: Invalid a. a must be between 0..9
        Demo.getPowerForInt(10, 12);
        
        //Test case 8: 9^12
        //Exception result: Invalid b. b must be between 0..9
        Demo.getPowerForInt(8, 10);
        
        //Test case 9: (-1)^5
        //Exception result: Invalid a. a must be between 0..9
        Demo.getPowerForInt(-1, 5);
        
        //Test case 10: 4^(-3)
        //Exception result: Invalid b. b must be between 0..9
        Demo.getPowerForInt(4, -3);
    }
}
