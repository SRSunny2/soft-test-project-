package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLoginTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazmul Islam Rakib\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();

            driver.get("https://www.facebook.com/");

            driver.findElement(By.id("email")).sendKeys("nazmul@gmail.com");

            driver.findElement(By.id("pass")).sendKeys("Nazmul@123");

            driver.findElement(By.name("login")).click();

            Thread.sleep(5000);

            String title = driver.getTitle();
            System.out.println("Page title after login attempt: " + title);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            driver.quit();
        }
    }
}
