package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws InterruptedException {

        /*
        1. go to VyTrack login page
        2. write username   date : storemanager53
        3. write password UserUsere123
        4. click login button
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput")).sendKeys("storemanager53");

        Thread.sleep(3000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");

        Thread.sleep(3000);
        driver.findElement(By.id("_submit")).click();

        Thread.sleep(5000);


        /*
        Verify that you are in home page
         */
        String Title = "https://app.vytrack.com/";
        String actualHomePage= driver.getCurrentUrl();

        if (Title.equals(actualHomePage)) {
            System.out.println("pass");
        }else{
            System.out.println("Fail");
            System.out.println("i expected "+ Title);
            System.out.println("The actual URl is "+actualHomePage);
        }
    }
}
