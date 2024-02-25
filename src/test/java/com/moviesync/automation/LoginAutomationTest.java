package com.moviesync.automation;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginAutomationTest {
    public static void main(String[] args) {
        System.out.println("Automation Login Script started...");       
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/login");
        WebElement username = driver.findElement(By.id("userName"));
        WebElement password = driver.findElement(By.id("password"));
        WebElement login = driver.findElement(By.id("login"));

        String user_id = "faiz_99";
        String user_password = "@Faiz_99";
        
        username.sendKeys(user_id);
        password.sendKeys(user_password);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.elementToBeClickable(login)).click();

        System.out.println("Login successful..");
    }
}
