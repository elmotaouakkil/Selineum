package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {

        /*
        1. go to cybertek practice web site
        2. verify Title expecteed Title: Practice

        Actual Title

        http://practice.cybertekschool.com/

         */
        //connect browser and driver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get( "http://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        String expectedTitle= "Practice";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equals(actualTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("I expected "+expectedTitle);
            System.out.println(("the Actual Title is "+actualTitle));
        }
    }
}
