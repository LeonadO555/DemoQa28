package java;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NewTabLeads {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/browser-windows");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void tabTest(){
        WebElement newTabButton = driver.findElement(By.id("tabButton"));
        newTabButton.click();
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebElement headerText = driver.findElement(By.id("sampleHeading"));
        assertEquals("This is a sample page", headerText.getText());
    }
}
