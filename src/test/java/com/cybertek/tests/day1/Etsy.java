package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Etsy {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to etsy --->data url

        driver.get("https://www.etsy.com/");
        //verify title
        //expecte vs actual

        String expectedTitle= "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("I expected "+expectedTitle);
            System.out.println((expectedTitle +"vs"+actualTitle));

            driver.close();
        }
    }
}
