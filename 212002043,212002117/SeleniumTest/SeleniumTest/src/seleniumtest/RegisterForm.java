package seleniumtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterForm {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nazmul Islam Rakib\\Documents\\chromedriver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.automationtesting.in/Register.html");

        driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("John");
        driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Doe");

        driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("123 Main St, City, Country");

        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("john.doe@example.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("1234567890");

        driver.findElement(By.xpath("//input[@value='Male']")).click();

        driver.findElement(By.id("checkbox1")).click();
        driver.findElement(By.id("checkbox2")).click();

        driver.findElement(By.id("msdd")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[text()='English']")).click();
        driver.findElement(By.xpath("//a[text()='French']")).click();
        driver.findElement(By.xpath("//label[text()='Languages']")).click();

        Select skills = new Select(driver.findElement(By.id("Skills")));
        skills.selectByVisibleText("Java");

        Select country = new Select(driver.findElement(By.id("countries")));
        country.selectByVisibleText("India");

        driver.findElement(By.xpath("//span[@role='combobox']")).click();
        WebElement searchInput = driver.findElement(By.xpath("//input[@type='search']"));
        searchInput.sendKeys("Australia");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//li[contains(text(),'Australia')]")).click();

        Select year = new Select(driver.findElement(By.id("yearbox")));
        year.selectByVisibleText("1990");

        Select month = new Select(driver.findElement(By.xpath("//select[@placeholder='Month']")));
        month.selectByVisibleText("February");

        Select day = new Select(driver.findElement(By.id("daybox")));
        day.selectByVisibleText("10");

        driver.findElement(By.id("firstpassword")).sendKeys("MyPassword123");
        driver.findElement(By.id("secondpassword")).sendKeys("MyPassword123");

        driver.findElement(By.id("submitbtn")).click();

        Thread.sleep(3000);

        driver.quit();
    }
}
