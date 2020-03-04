package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigator {

    public static void main(String[] args) throws InterruptedException {

  /*
       Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()
        */
        // go to practice --> go to google --> back to practice
        // --> forward to google
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        String practiceWebURL = "http://practice.cybertekschool.com/";
        // go to practice
        driver.get(practiceWebURL);
        Thread.sleep(3000);
        // go to google
        String gglURL = "https://www.google.com";
        driver.navigate().to(gglURL);
        Thread.sleep(3000);
        //back to practice
        driver.navigate().back();
        driver.navigate().refresh();
        driver.navigate().forward();

        driver.navigate();
        driver.close();
        driver.quit();


    }

}


