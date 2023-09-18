package test.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class UploadFile {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void uploudFileTest() {

        WebElement firstNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Enter first name\"]"));
        firstNameInputField.sendKeys("John");
        WebElement lastNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Enter last name\"]"));
        lastNameInputField.sendKeys("Smith");
        WebElement emailInputField = driver.findElement(By.cssSelector("[placeholder=\"Enter email\"]"));
        emailInputField.sendKeys("jsmith@gmail.com");

        WebElement uploadFile = driver.findElement(By.id("file"));
        uploadFile.sendKeys("/Users/nataliaawerschina/Downloads/textfile.txt");
        WebElement submitButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));
    }
}