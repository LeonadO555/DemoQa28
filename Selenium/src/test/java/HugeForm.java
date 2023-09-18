package test.java;

import org.junit.AfterClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class HugeForm {

    ChromeDriver driver = new ChromeDriver();



    @BeforeEach
    void setUp() {

    }

    @BeforeAll
    static void beforeAll() {

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void successRegistration() throws InterruptedException {
        List<WebElement> inputFields = driver.findElements(By.tagName("input"));
        //fill in all inputs and push submit button
        for (WebElement input: inputFields) {
            input.sendKeys("Hello");
        }
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();
     //   sleep(10000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(200));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));
    }
}
