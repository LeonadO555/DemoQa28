package test.java;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Frame {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
@Test
    public  void frameTest(){
        //CHECK 1nd header
        driver.switchTo().frame("frame1");
        WebElement firstHeader= driver.findElement(By.id("sampleHeading"));
        assertEquals("This is a sample page", firstHeader.getText());

//CHECK 2nd header
        driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement secondHeader= driver.findElement(By.id("sampleHeading"));
        assertEquals("This is a sample page", secondHeader.getText());
    }
}
