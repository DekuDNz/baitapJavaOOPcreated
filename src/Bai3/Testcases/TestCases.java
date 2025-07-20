package Bai3.Testcases;

import Bai3.Common.BaseTest;

public class TestCases  extends BaseTest {
    public void testLogin(){
        createDriver();
        System.out.println("Navigate to facebook.com");
        System.out.println("Enter email : admin@exemple.com");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
        System.out.println("Verify menu dashboard is display");
        closeDriver();
    }

    public void testAddCategory(){
        createDriver("facebook.com");
        System.out.println("Navigate to facebook.com");
        System.out.println("Enter email : admin@exemple.com");
        System.out.println("Enter password: 123456");
        System.out.println("Click login button");
        System.out.println("Verify menu category is display");
        closeDriver("facebook.com");
    }

    public static void main(String[] args) {
        TestCases testcase = new TestCases();
        testcase.testLogin();
        testcase.testAddCategory();
    }

}
