package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazmul Islam Rakib\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://vbsca.ca/login/login.asp");
        driver.manage().window().maximize();

        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        Thread.sleep(1500);
        driver.findElement(By.name("txtPassword")).sendKeys("Admin");
        Thread.sleep(1500);

        driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(3000);

        String actual = driver.getTitle();
        String expected = "Facebook";

        driver.close();

        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("Test Successful");
        } else {
            System.out.println("Test Failed!");
        }
    }
}
