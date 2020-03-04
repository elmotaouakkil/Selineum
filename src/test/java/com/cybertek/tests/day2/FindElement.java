package com.cybertek.tests.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) throws InterruptedException {
        // locator 1. ID
        //go to cyberTek okta login page
        //write email to the text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://cybertekschool.okta.com/");

        //Write email to the text box first ---> 1---> find the text box ----->findElement()  from WebDriver
        String word = "java";
        Thread.sleep(3000);
        WebElement emailBox = driver.findElement(By.id("okta-signin-username"));

        Thread.sleep(5000);
        emailBox.sendKeys("rachid.moutawakil@hotmail.fr");
        emailBox.sendKeys("");

        WebElement password = driver.findElement(By.id("okta-signin-password"));
        password.sendKeys("Elmotaouakkil1988");

        WebElement Sumbit = driver.findElement(By.id("okta-signin-submit"));
        Sumbit.sendKeys("Sign In");

        WebElement SendPush = driver.findElement(By.id("button button-primary link-button-disabled"));
        SendPush.sendKeys("Send Push");






    }
}
