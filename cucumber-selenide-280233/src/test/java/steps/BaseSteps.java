package steps;

import com.codeborne.selenide.logevents.SelenideLogger;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.qameta.allure.selenide.AllureSelenide;
import pages.InventoryPage;
import pages.LoginPage;
import pages.YourCartPage;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class BaseSteps {
    LoginPage loginPage = new LoginPage();

    InventoryPage inventoryPage = new InventoryPage();
    YourCartPage yourCartPage=new YourCartPage();

   // String BASE_URL = "https://www.saucedemo.com/";

   /* @Before
    public void setUp(){
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        open(BASE_URL);
    }
    @After
    public void tearDown(){
        closeWebDriver();
    }*/
}


