import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.HashMap;

public class DownloadExample {

    WebDriver driver;


    @Test
    public void DownloadTest() throws InterruptedException {
        HashMap<String, Object> prefs = new HashMap<>();
        prefs.put("download.default_directory", System.getProperty("user.dir"));
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\VivoBook\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-web-security");
        options.addArguments("--allow-running-insecure-content");
        options.setExperimentalOption("prefs", prefs);

        driver = new ChromeDriver(options);

        driver.get("https://testpages.eviltester.com/styled/download/download.html");

        driver.findElement(By.id("direct-download")).click();

        Thread.sleep(2000);

        File testFolder = new File(System.getProperty("user.dir"));

        File[] listOfFiles = testFolder.listFiles();

        File testFile = null;
        boolean find = false;

        for (File fileInList : listOfFiles ) {
            if (fileInList.isFile()) {
                String fileName = fileInList.getName();
                if(fileName.contains("textfile.txt")) {
                    find = true;
                    testFile = new File(fileName);
                }
            }
        }

        Assertions.assertTrue(find, "File not found");
        testFile.deleteOnExit();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}