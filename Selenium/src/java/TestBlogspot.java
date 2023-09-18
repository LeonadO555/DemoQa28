package java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBlogspot {
    ChromeDriver driver = new ChromeDriver();

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("http://only-testing-blog.blogspot.com/2013/09/test.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testSelectBox() throws InterruptedException {
        //  #1
        WebElement selectBox1 = driver.findElement(By.xpath("//div[1]/select/option[1]"));
        selectBox1.click();
        WebElement selectBoxValue1 = driver.findElement(By.xpath("//div[1]/select/option[1]/value"));
        assertEquals("Volvo", selectBoxValue1.getText());

        //  #2

        WebElement selectBox2 = driver.findElement(By.xpath("//div[1]/select/option[2]"));
        selectBox2.click();
        WebElement selectBoxValue2 = driver.findElement(By.xpath("//div[1]/select/option[2]/value"));
        assertEquals("Saab", selectBoxValue2.getText());

        //  #3
        WebElement selectBox3 = driver.findElement(By.xpath("//div[1]/select/option[3]"));
        selectBox3.click();
        WebElement selectBoxValue3 = driver.findElement(By.xpath("//div[1]/select/option[3]/value"));
        assertEquals("Opel", selectBoxValue3.getText());

        //#4
        WebElement selectBox4 = driver.findElement(By.xpath("//div[1]/select/option[4]"));
        selectBox4.click();
        WebElement selectBoxValue4 = driver.findElement(By.xpath("//div[1]/select/option[4]/value"));
        assertEquals("Audi", selectBoxValue4.getText());

    }
}