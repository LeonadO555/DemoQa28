package test.java;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedFrames {
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
    public void nestedFrameTest(){
        driver.switchTo().frame("frame1");
        WebElement header = driver.findElement(By.tagName("body"));
        assertEquals("Parent frame", header.getText());

        WebElement childFrame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(childFrame);
        WebElement header2 = driver.findElement(By.tagName("p"));
        assertEquals("Child Iframe", header2.getText());
        //Check "Parent frame" text
        //Check "Child Iframe" text
    }
}
/*driver.switchTo().defaultContent();
        driver.switchTo().frame("frame2");
        WebElement secondHeader= driver.findElement(By.id("sampleHeading"));
        assertEquals("This is a sample page", secondHeader.getText());*/
