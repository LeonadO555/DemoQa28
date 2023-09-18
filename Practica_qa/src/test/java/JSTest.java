package test.java;

import org.junit.jupiter.api.Test;

import java.util.concurrent.TimeUnit;

public class JSTest {
     WebDriver driver;

    @Test
    public void Login() throws InterruptedException {

    }

    @Test
    public void getPageProperties() {

    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
    System.setProperty("webdriver.chrome.driver", "C:\Users\VivoBook\Downloads\chromedriver_win32\chromedriver.exe");
    ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");


    driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://testpages.eviltester.com/styled/iframes-test.html");

        driver.findElement(By.name("user_name")).sensKeys("Admin");
        driver.findElement(By.name("password")).sensKeys("admin123");

        WebElement

    JavascriptExecutor jsExec = (JavascriptExecutor) driver;

}
