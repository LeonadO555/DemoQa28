package java;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DrogNDrop {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/drag-and-drop.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void dragNDropTest() throws InterruptedException {
        WebElement draggable = driver.findElement(By.id("draggable"));
        WebElement droppable = driver.findElement(By.id("droppable"));
        Actions actions = new Actions(driver);
        //actions.dragAndDrop(draggable, droppable).perform();
        actions.moveToElement(draggable).clickAndHold()
                .moveToElement(droppable).release().build().perform();
        assertEquals("Dropped!", droppable.getText());
    }

}


