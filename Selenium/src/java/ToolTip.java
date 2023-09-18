package java;

import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToolTip {
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
        public void allToolTipsTest() throws InterruptedException {
            WebElement hoverMeToSeeButton = driver.
                    findElement(By.id("toolTipButton"));
            Actions actions = new Actions(driver);
            actions.moveToElement(hoverMeToSeeButton).perform();
            //check text of 3 tooltips
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement tooltip  =
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class = 'tooltip-inner']")));
            assertEquals("You hovered over the Button",tooltip.getText());//2 tooltips
            //sleep(2000);
            WebElement contraryLink = driver
                    .findElement(By.xpath("//a[contains(text(), \"Contrary\")]"));
            actions.moveToElement(contraryLink).perform();
            WebElement tooltipOfContrary  =
                    wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class = 'tooltip-inner']")));
            assertEquals("You hovered over the Contrary",tooltipOfContrary.getText());
        }
    @Test
    public void allToolTipsTest1() throws InterruptedException {
        WebElement hoverMeToSeeButton = driver.
                findElement(By.id("toolTipButton"));
        Actions actions = new Actions(driver);
        actions.moveToElement(hoverMeToSeeButton).pause(5000).build().perform();

        WebElement tooltip  = driver.findElement(By.cssSelector("[class = 'tooltip-inner']"));
        assertEquals("You hovered over the Button",tooltip.getText());
        WebElement contraryLink = driver
                .findElement(By.xpath("//a[contains(text(), \"Contrary\")]"));
        actions.moveToElement(contraryLink).pause(5000).build().perform();
        WebElement tooltipOfContrary  = driver.findElement(By.cssSelector("[class = 'tooltip-inner']"));
        assertEquals("You hovered over the Contrary",tooltipOfContrary.getText());
    }
    }
