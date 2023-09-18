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
import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SwitchToTab {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://suninjuly.github.io/redirect_accept.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
/*
@Test
    public void tabTest(){
        WebElement redirectButton= driver.findElement(By.tagName("button");
        redirectButton.click();
     //   System.out.println( driver.getWindowHandle());
       // System.out.println( driver.getWindowHandles());
        ArrayList<String> tabs =new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebElement answerInputField=driver.findElement(By.id("answer"));
        assertTrue(answerInputField.isDisplayed());
//assert Alert has text ""  ln(abs(12*sin(x))), where x = 778?
    WebElement answerInputField1 = driver.findElement(By.id("answer"));
    WebElement x = driver.findElement(By.id("input_value"));
    double xValue = parseDouble(x.getText());
    double result = funcCalc(xValue);
    answerInputField1.sendKeys(String.valueOf(result));
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
*/
    public double funcCalc(double x){
        return Math.log1p(abs(12*sin(x)));
    }
    //assert that al

    @Test
    public void tabTest() {
        WebElement redirectButton = driver.findElement(By.tagName("button"));
        redirectButton.click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebElement answerInputField = driver.findElement(By.id("answer"));
        assertTrue(answerInputField.isDisplayed());
        WebElement x = driver.findElement(By.id("input_value"));
        double xValue = parseDouble(x.getText());
        double result = funcCalc(xValue);
        answerInputField.sendKeys(String.valueOf(result));
        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        assertTrue(alert.getText().contains("Congrats, you've passed the task!"));
    }
}