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

import static java.lang.Double.parseDouble;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAttribute {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://suninjuly.github.io/get_attribute.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void validAttribute() throws InterruptedException {
        WebElement answerInputField = driver.findElement(By.id("answer"));
        WebElement x = driver.findElement(By.id("treasure"));
        double xValue = parseDouble(x.getAttribute("valuex"));
        double result = funcCalc(xValue);
        answerInputField.sendKeys(String.valueOf(result));
        // sleep(10000);
    }

    public double funcCalc(double x){
        return Math.log1p(abs(12*sin(x)));
    }
    @Test
    public void validAttributeAnswer() throws InterruptedException {
        WebElement answerInputField = driver.findElement(By.id("answer"));
        WebElement x = driver.findElement(By.id("treasure"));
        double xValue = parseDouble(x.getAttribute("valuex"));
        double result = funcCalc(xValue);
        answerInputField.sendKeys(String.valueOf(result));
     

        WebElement checkBox = driver.findElement(By.id("robotCheckbox"));
        checkBox.click();
        WebElement robotsRuleRadioButton = driver.findElement(By.id("robotsRule"));
        robotsRuleRadioButton.click();
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(((Alert) alert).getText().contains("Congrats, you've passed the task!"));
    }
}