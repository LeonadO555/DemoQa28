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

import static java.lang.Integer.parseInt;
import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DropDown {
  // System.set
    ChromeDriver driver;


    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://suninjuly.github.io/selects1.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void dropDownTest() throws InterruptedException {
        WebElement num1 = driver.findElement(By.id("num1"));
        WebElement num2 = driver.findElement(By.id("num2"));
        int sum = parseInt(num1.getText()) + parseInt(num2.getText());
        WebElement dropDown = driver.findElement(By.id("dropdown"));
        dropDown.click();
        WebElement answerOption = driver.findElement(By.cssSelector("[value='" + sum + "']"));
        answerOption.click();
        // sleep(1000);
        WebElement submitButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains(("Congrat. You've passed the task!")));
//push submit button, check alert text "Congratulations! You have successfully registered!"    }
    }

   /* public ChromeDriver getDriver() {
        return driver;
    }*/
}
