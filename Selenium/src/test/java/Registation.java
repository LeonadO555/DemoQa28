package test.java;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Registation {
    ChromeDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("web-river.chrome.driver",
                "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64_3/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://suninjuly.github.io/registration1.html");
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void successRegistration() throws InterruptedException {
        WebElement firstNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your first name\"]"));
        firstNameInputField.sendKeys("John");
        WebElement lastNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your last name\"]"));
        lastNameInputField.sendKeys("Smith");
        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
        emailInputField.sendKeys("jsmith@gmail.com");
        WebElement phoneInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your phone:\"]"));
        phoneInputField.sendKeys("1111111111");
        WebElement addressInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your address:\"]"));
        addressInputField.sendKeys("fadghshjdd");
        WebElement submitButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        submitButton.click();
        WebElement successRegistrationHeader = driver.findElement(By.tagName("h1"));
        assertEquals("Congratulations! You have successfully registered!",
                successRegistrationHeader.getText());
    }

    @Test
    public void registrationWithoutFirstName() {
        WebElement firstNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your first name\"]"));
        firstNameInputField.sendKeys("John");
        WebElement lastNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your last name\"]"));
        lastNameInputField.sendKeys("Smith");
        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
        emailInputField.sendKeys("jsmith@gmail.com");
        WebElement phoneInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your phone:\"]"));
        phoneInputField.sendKeys("1111111111");
        WebElement addressInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your address:\"]"));
        addressInputField.sendKeys("fadghshjdd");
        WebElement submitButton = driver.findElement(By.cssSelector("[type=\"submit\"]"));
        submitButton.click();

        assertEquals("Congratulations! You have successfully registered!", firstNameInputField.getAttribute("validationMessage"));
        // assertEquals("https://suninjuly.github.io/registration1.html",driver.getCurrentUrl());
        assertTrue("registration1.html", driver.getCurrentUrl().contains("registration1.html"));

        assertTrue(driver.getCurrentUrl().contains("registration_result.html"));

    }

    //add ATs to cover registration page test cases
    @Test
    public void registrationOthers() {
        WebElement firstNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your first name\"]"));
        firstNameInputField.sendKeys("John");
        WebElement lastNameInputField = driver.findElement(By.cssSelector("[placeholder=\"Input your last name\"]"));
        lastNameInputField.sendKeys("Smith");
        WebElement emailInputField = driver.findElement(By.cssSelector("[class=\"form-control third\"]"));
        emailInputField.sendKeys("jsmith@gmail.com");
        assertEquals("Smith", lastNameInputField.getAttribute("validationMessage"));
      //  assertEquals("jsmith@gmail.com", emailInputField.getAttribute("validationMessage"));

    }
}
