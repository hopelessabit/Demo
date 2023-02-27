/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import demo.Demo;


import org.testng.Assert;
import static org.testng.Assert.*;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

/**
 *
 * @author mical
 */
public class DemoSoftAssert {
    @BeforeTest
    public void beforeTest2(){
        System.out.println("---Before test2");
    }
    @Test()
    public void testGetPowerForIntGivenRightArgumentReturnWrong() {
        //Test case 1: Expect 1^5 = 0 -> Test fail
        int a = 1, b = 5;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 0, "Test case 1 fail");

        //Test case 2: Expect 1^7 = 0 -> Test fail
        a = 1;
        b = 7;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 0, "Test case 2 fail");

        //Test case 3: Expect 3^3 = 1 -> Test fail
        a = 3;
        b = 3;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 1, "Test case 3 fail");

        //Test case 4: Expect 4^7 = 0 -> Test fail
        a = 4;
        b = 7;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 0, "Test case 4 fail");

        //Test case 5: Expect 6^7 = 0 -> Test fail
        a = 6;
        b = 7;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 0, "Test case 5 fail");

        //Test case 6: Expect 9^9 = 0 -> Test fail
        a = 9;
        b = 9;
        Assert.assertEquals(demo.Demo.getPowerForInt(a, b), 0, "Test case 6 fail");
    }

    @BeforeTest
    public void testBeforeTestAnotation() {
        System.out.println("+++++++++++++++++++ Before Test +++++++++++++++++++");
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(1, 2, "Test case in @BeforeTest fail");
//        softAssert.assertAll();
//        
//        Assert.assertEquals(1, 2, "Test case in @BeforeTest fail");
    }

    @AfterTest
    public void testAfterTestAnotaion() {
//        SoftAssert softAssert = new SoftAssert();
//        softAssert.assertEquals(1, 2, "Test 1 case in @AfterTest fail");
//        softAssert.assertEquals(1, 2, "Test 2 case in @AfterTest fail");
        

        System.out.println("+++++++++++++++++++ After Test +++++++++++++++++++");
//        softAssert.assertAll();
//        Assert.assertEquals(1, 2, "Test case in @AfterTest fail");
    }

    @Test
    public void testGetPowerForIntGivenRightArgumentReturnWrongWithSoftAssert() {
        SoftAssert softAssert = new SoftAssert();
        //Test case 7: Expect 1^5 = 0 -> Test fail
        int a = 1, b = 5;
        softAssert.assertEquals(demo.Demo.getPowerForInt(a, b), 0, "Test case 1 fail");

        //Test case 2: Expect 1^7 = 0 -> Test fail
        a = 1;
        b = 7;
        softAssert.assertEquals(demo.Demo.getPowerForInt(a, b), 0, "Test case 2 fail");

        //Test case 3: Expect 3^3 = 1 -> Test fail
        a = 3;
        b = 3;
        softAssert.assertEquals(demo.Demo.getPowerForInt(a, b), 1, "Test case 3 fail");

        //Test case 4: Expect 4^7 = 0 -> Test fail
        a = 4;
        b = 7;
        softAssert.assertEquals(demo.Demo.getPowerForInt(a, b), 128, "Test case 4 fail");

        //Test case 5: Expect 6^7 = 0 -> Test fail
        a = 6;
        b = 7;
        softAssert.assertEquals(demo.Demo.getPowerForInt(a, b), 279936, "Test case 5 fail");

        //Test case 6: Expect 9^9 = 0 -> Test fail
        a = 9;
        b = 9;
        softAssert.assertEquals(demo.Demo.getPowerForInt(a, b), 387420489, "Test case 6 fail");

        softAssert.assertAll();
    }
}
