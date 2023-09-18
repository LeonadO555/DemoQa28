package java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static java.lang.Thread.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Hover {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://crossbrowsertesting.github.io/hover-menu.html#");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void hoverTest() {
        WebElement dropdown = driver.findElement(By.cssSelector("li[class=\"dropdown\"]>a"));

        Actions actions = new Actions(driver);
        actions.moveToElement(dropdown).perform();
        //  sleep(1000);
        WebElement secondaryAction = driver.findElement(By.cssSelector("[onclick=\"handleSecondaryAction()\"]"));
        secondaryAction.click();
        WebElement secondaryPageHeader = driver.
                findElement(By.cssSelector("[class=\"jumbotron secondary-clicked\"]>h1"));
        assertEquals("Secondary Page", secondaryPageHeader.getText());
        WebElement subHeader = driver.
                findElement(By.xpath("(//div[@class=\"jumbotron secondary-clicked\"]/p)[1]"));
        assertEquals("Secondary action in the menu was clicked successfully!",
                subHeader.getText()); Alert alert;
     //   alert = wait.until(ExpectedConditions.alertIsPresent()Nested);

        //Check Secondary Page
        // Secondary action in the menu was clicked successfully!
    }
}
