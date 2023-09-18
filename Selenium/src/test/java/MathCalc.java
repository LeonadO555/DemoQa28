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
import static java.lang.Thread.sleep;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MathCalc {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-driver.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://suninjuly.github.io/math.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }


    public double funcCalc(double x){
        return Math.log(abs(12*sin(x)));
    }
    //assert that alerts has text "Congrats, you've passed the task!"
    @Test
    public void validAnswer() {
        WebElement answerInputField = driver.findElement(By.id("answer"));
        WebElement x = driver.findElement(By.id("input_value"));
        double xValue = parseDouble(x.getText());
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
