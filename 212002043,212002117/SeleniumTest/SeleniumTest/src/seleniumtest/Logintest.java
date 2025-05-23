package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Logintest {

    public static void main(String[] args) throws InterruptedException {
        // Set your ChromeDriver path
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazmul Islam Rakib\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        try {
            driver.manage().window().maximize();

            driver.get("https://practicetestautomation.com/practice-test-login/");

            driver.findElement(By.id("username")).sendKeys("student");

            driver.findElement(By.id("password")).sendKeys("Password123");

            driver.findElement(By.id("submit")).click();

            Thread.sleep(4000);

            System.out.println("Current URL: " + driver.getCurrentUrl());
            System.out.println("Page Title: " + driver.getTitle());

        } finally {

            driver.quit();
        }
    }
}
