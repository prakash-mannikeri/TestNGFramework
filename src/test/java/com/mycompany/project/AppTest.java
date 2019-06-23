package com.mycompany.project;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    @Test
    public void testMethod(){

        Assert.assertEquals("a","a");
        System.out.println("String are equal");


    }

    @Test
    public void launchbrowser() throws Exception{

        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("http://www.javatpoint.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("scrollBy(0,5000)");
        driver.findElement(By.linkText("Core Java")).click();
        Thread.sleep(2000);

/*        driver.findElement(By.linkText("Home")).click();

        Thread.sleep(2000);*/
        driver.quit();
    }
}
