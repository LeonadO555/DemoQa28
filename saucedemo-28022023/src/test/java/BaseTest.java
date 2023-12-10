import io.qameta.allure.Attachment;
import org.junit.After;
import org.junit.AssumptionViolatedException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class BaseTest {
    ChromeDriver driver;
    String BASE_URL = "https://www.saucedemo.com/";


    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\VivoBook\\IdeaProjects\\saucedemo-28022023\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get(BASE_URL);
    }

    // @After
    public void tearDown() {
        driver.quit();
    }

    @Rule

    public TestWatcher screenShotOnFailure = new TestWatcher() {
        @Override
        protected void skipped(AssumptionViolatedException e, Description description) {
            super.skipped(e, description);
            driver.quit();
        }

        @Override
        protected void succeeded(Description description) {
            super.succeeded(description);
            driver.quit();
        }

        @Override
        protected void failed(Throwable e, Description description) {
            makesScreenShotOnFailure();
            //      driver.close();
            driver.quit();
        }
    };

    @Attachment
    public byte[] makesScreenShotOnFailure() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

}

