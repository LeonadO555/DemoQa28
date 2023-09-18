package test.java;

import org.checkerframework.checker.index.qual.EnsuresLTLengthOfIf;
import org.checkerframework.checker.lock.qual.EnsuresLockHeldIf;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import javax.swing.*;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Cats {


    ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://suninjuly.github.io/cats.html");
    }

    @Test
    public void headerIsCorrect() {
        WebElement header = driver.findElement(By.cssSelector("[class='jumbotron-heading']"));
        assertTrue(header.isDisplayed());
        assertEquals("Cat memes", header.getText(),
                "Header is NOT correct");
    }

    @Test
    //check 9 mins od 3th cat
    public void checkTimeOf3thCat() {
        WebElement timeOf3thCat = driver.findElement(By.cssSelector("[class=\"col-sm-4\"]:nth-child(3) [class=\"text-muted\"]"));
        assertEquals("9 mins", timeOf3thCat.getText());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    //check 9 mins od 5th cat by Xpath
    public void checkTimeOf5thCat() {
        WebElement timeOf5thCat = driver.findElement(By.xpath("//div[@class=\"col-sm-4\"][5]//small"));
        assertEquals("9 mins", timeOf5thCat.getText());
    }

    @Test
    public void checkTextOfLastCard() {
        //"I love you so much" in the last card name
        WebElement lastCardName = driver.findElement(By.xpath("//div[@class=\"col-sm-4\"][6]//'card-text'"));
        assertEquals("I love you so much", lastCardName.getText());
    }

    @Test
    public void checkCardQuality() {
        //check that 6 images are on the page
        List<WebElement> cards = (List<WebElement>) driver.findElement(By.xpath("//div[@class=\"col-sm-4\"]"));
        assertEquals(6, cards.size());
    }

    @Test
    //check that 6 images are on the page
    public void checkImagesQuantity() {
        List<WebElement> images = driver.findElements(By.xpath("//img"));
        assertEquals(6, images.size());
    }

    @Test
    public void  allCardsAreDisplayed() {
        List<WebElement> cards = (List<WebElement>) driver.findElement(By.xpath("//div[@class=\"col-sm-4\"]"));
        /*for (WebElement card; cards) assertTrue(card.isDisplayed());*/
         cards.forEach(card->assertTrue(card.isDisplayed()));
    }
    //Check that all cards have no empty names
    @Test
    //Check that all cards have no empty names
    public void allNamesAreNotEmpty(){
        List<WebElement> cardNames = driver.findElements(By.tagName("p"));
        for (WebElement name: cardNames) {
            assertFalse(name.getText().isEmpty());
        }
    }
}
//    ChromeOptions options = new ChromeOptions();
//    WebDriver driver = new ChromeDriver();
//        driver.get("https://sky-todo-list.herokuapp.com/");
//        header.sendKeys("test message");
//       element_name.click();
//
//}
//   @Test
//
//    // #root > div > header > div > div > div:nth-child(1) > div > form > div > div > div > p > input
//    @Test
//    //check 9 min od 3th cat
//    public void checkTimeOf3thCat(){
//        System.setProperty("web driver.AVG Secure Browser.driver", "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64");
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://sky-todo-list.herokuapp.com/");
//        WebElement timeOf3thCat = driver.findElement(By.cssSelector("#root > div > header > div > div > div:nth-child(1) > div > form > div > div > div > p > input"));
//        assertEquals("9 mins", timeOf3thCat.getText());
//        driver.quit();
//}