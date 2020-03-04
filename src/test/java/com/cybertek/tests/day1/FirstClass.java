package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {
       // System.out.println("Hello selenium");

        WebDriverManager.chromedriver().setup();

        //webDriver object --->Interface
        //i have a driver
        WebDriver driver = new ChromeDriver();

       // i want to open google home page

       // how do you lunch ?open a web page
        //by using get()--> url as string
        driver.get("https://www.google.com");

        //Navigations
        //navigate.navigate().to---->open a web page

        driver.navigate().to("https://www.google.com");
        //get() vs navigate().to()
        //get ---->wait to load page
        //to()--->does not wait

        //open navigate ().back()-->
        //go to google 2- go to cybertek practice website
        driver.get("https://www.google.com");
        Thread.sleep(3000);
        driver.navigate().to("http://practice.cybertekschool.com");
        Thread.sleep(3000);

        driver.navigate().back();


        //navigate().forward()
        //go to practice --->google---->back to practice---->forward to google
        //-->forward to google

        /*
       Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()
        */



    }
}
