package test.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoverButton {
    ChromeOptions options = new ChromeOptions();

    ChromeDriver driver = new ChromeDriver(options);

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
        driver.get("https://testpages.herokuapp.com/styled/csspseudo/css-hover.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void HoverButton() {
//#1
        WebElement hoverpara = driver.findElement(By.id("hoverpara"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverpara).perform();
        WebElement secondaryText = driver.findElement(By.id("hoverlink"));
        assertEquals("You can see this paragraph now that you hovered on the above 'button'", secondaryText.getText());


        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //  You can see this paragraph now that you hovered on the above 'button'.


    }

    @Test
    public void HoverSecondButton() {
//#2
        WebElement hoverdivpara = driver.findElement(By.id("hoverdivpara"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverdivpara).click().release().build().perform();

        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        WebElement headerText = driver.findElement(By.tagName("h1"));
        assertEquals("Action Complete'", headerText.getText());

        try {
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);

        }
    }
}
/*  WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();
    ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    WebElement headerText = driver.findElement(By.id("sampleHeading"));
    assertEquals("This is a sample page", headerText.getText());
   */