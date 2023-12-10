import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class InventoryTest extends BaseTest{
    @Test
    public void inventoryItemsTest(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        assertEquals(6, inventoryPage.getItemsQuantity());
        assertTrue("Not all items are displayed", inventoryPage.allItemsAreDisplayed());
        //all items names are not empty
        assertTrue(inventoryPage.allNamesAreNotEmpty());
        //all items names starts with "Sauce Labs"
        assertTrue(inventoryPage.allNamesStartsWithSauceLabs());
    }
    @Test
    public void sortNameAtoZ(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickSortByNameAtoZ();
        assertTrue(inventoryPage.checkNameSortAtoZ());
    }

    @Test
    public void sortNameZtoA(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickSortByNameZtoA();
        assertTrue(inventoryPage.checkNameSortZtoA());
    }

    @Test
    public void sortPriceHighToLow(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickSortByPriceHighToLow();
        assertTrue(inventoryPage.checkPriceSortHighToLow());
    }
    @Test
    public void sortPriceLowToHigh(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.successLogin("standard_user", "secret_sauce");
        InventoryPage inventoryPage = new InventoryPage(driver);
        assertTrue(inventoryPage.inventoryListIsDisplayed());
        inventoryPage.clickSortByPriceLowToHigh();
        assertTrue(inventoryPage.checkPriceSortLowToHigh());
    }
}