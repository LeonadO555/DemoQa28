package java;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstScript  {

    @Test
    public void openGoogle() {
        System.setProperty("webdriver.chrome.driver", "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        ChromeDriver driver = new ChromeDriver(options);
       // options.setBinary("C:/Applications/chrome.app");
        
        driver.get("https://www.Google.com/");
     //   driver.quit();
    }
}
     /*   System.setProperty("", "/Users/nataliaawerschina/Downloads/chromedriver-mac-x64");
        WebDriver driver = new ChromeDriver();
   // assertTrue( driver.findElement(By.className("jumbotron-heading")).isDisplayed());
    }}
      
      
        options.setBinary("C:/Tools/chrome-win64/chrome.exe");
       /Users/nataliaawerschina/Downloads/chromedriver-mac-x64/chromedriver
System.setProperty("webdriver.chrome.driver", "/Users/lynevivan/IdeaProjects/telran/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);

        driver.get("https://testpages.herokuapp.com/styled/csspseudo/css-hover.html");
           
      */