package test.java;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestTodo {
    /*  @Test
      public void testChrome() {
          ChromeOptions options = new ChromeOptions();
          options.setBinary("/Applications/chrome.app");
          ChromeDriver driver = new ChromeDriver(options);
          driver.get("https://sky-todo-list.herokuapp.com/");
          WebElement header = driver.findElement(By.cssSelector("[class='jumbotron-heading']"));
          assertTrue(header.isDisplayed());
          assertEquals("Cat memes", header.getText(), "Header is NOT correct");
          header.sendKeys("test message");
  //       element_name.click();
          driver.quit();*/
    @BeforeEach

    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://sky-todo-list.herokuapp.com/");
    }


   /* @AfterEach
    public void tearDown() {
        driver.quit();
    }


    @Test
    public void setElement() {
        List<WebElement> listOfEditIcon = driver.findElements(By.cssSelector("\"//*[@id='root']/div/header/div/div/div[2]/div/table/tbody/tr\""));
        for (WebElement element : listOfEditIcon){
            if (element.getText().contain("jkjk")

            )
        }
        {
                WebElement button = element.sendKeys(By.cssSelector("[data-icon=‘edit’]"));
                button.click();
                //  assertTrue(element.getText().isEmpty());

            }
    }
                Thread.sleep(5000);*/
}

