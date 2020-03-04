package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {

        /*
        1. go to Cybertek practice website
        htpp://practice.cybertekschool.com/
        2. verify the URL
         */
       // public class practice {
         //   public static void main(String[] args) {
                WebDriverManager.chromedriver().setup();
                WebDriver driver = new ChromeDriver();
                //driver.get("http://practice.cybertekschool.com/");
                String expectedUrl = "http://practice.cybertekschool.com/";
                String actualUrl = driver.getCurrentUrl();
                driver.get(expectedUrl);
                if (expectedUrl.equals(actualUrl)) {
                    System.out.println("PASS");
                } else {
                    System.out.println("FAIL");
                }
                System.out.println("a=" + actualUrl + "\n e=" + expectedUrl);
                driver.manage().window().maximize();

            }
        }
    







