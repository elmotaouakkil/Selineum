package com.cybertek.tests.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURL {
    /*
    go to Etsy
    verify Url
     */
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://www.etsy.com/");
        driver.manage().window().maximize();

        //for verify Title ---->get title()
        //for verify url--->
        String expectedURL = "https://www.etsy.com/";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)) {
                    System.out.println("pass");
                }else{
                    System.out.println("Fail");
                    System.out.println("i expected "+ expectedURL);
            System.out.println("The actual URl is "+actualURL);
                }
    }
}
