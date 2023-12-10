import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Double.parseDouble;
import static java.util.Collections.reverseOrder;
import static java.util.Collections.sort;
import static org.junit.Assert.assertTrue;

public class InventoryPage extends BasePage{
    public InventoryPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[class=\"inventory_list\"]")
    private WebElement inventoryList;



    @FindBy(className = "inventory_item")
    private List<WebElement> inventoryItems;

    @FindBy(className = "inventory_item_name")
    private List<WebElement> inventoryNames;

    @FindBy(className = "inventory_item_price")
    private List<WebElement> inventoryPrices;

    @FindBy(id = "add-to-cart-sauce-labs-bolt-t-shirt")
    private WebElement tShirtAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    private WebElement backPackAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    private WebElement bikeAddToCartButton;

    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    private WebElement jacketAddToCartButton;


    @FindBy(xpath = "//div[@class=\"inventory_item\"][3]//div[@class=\"inventory_item_price\"]")
    private WebElement priceOfTShirt;

    @FindBy(className = "product_sort_container")
    private WebElement sortDropdown;

    @FindBy(css = "[value='az']")
    private WebElement nameAtoZ;

    @FindBy(css = "[value='za']")
    private WebElement nameZtoA;

    @FindBy (css = "[value=\"lohi\"]")
    private WebElement priceLowToHigh;

    @FindBy(css = "[value=\"hilo\"]")
    private WebElement priceHighToLow;

    public boolean inventoryListIsDisplayed(){
        return inventoryList.isDisplayed();
    }



    public int getItemsQuantity(){
        return inventoryItems.size();
    }

    public boolean allItemsAreDisplayed(){
        boolean displayed = true;
        for (WebElement item :inventoryItems) {
            if (!item.isDisplayed()){
                displayed = false;
            }
        }
        return displayed;
    }

    public boolean allNamesAreNotEmpty(){
        boolean notEmpty = true;
        for (WebElement name: inventoryNames) {
            if (name.getText().isEmpty()){
                notEmpty = false;
            }
        }
        return notEmpty;
    }

    public boolean allNamesStartsWithSauceLabs(){
        boolean startsWith = true;
        for (WebElement name: inventoryNames) {
            if (!name.getText().startsWith("Sauce Labs")){
                startsWith = false;
            }
        }
        return startsWith;
    }

    public void clickOnTShirtAddToCart(){
        tShirtAddToCartButton.click();
    }
    public void clickOnBackPackAddToCart(){
        backPackAddToCartButton.click();
    }

    public void clickOnBikeAddToCart(){
        bikeAddToCartButton.click();
    }

    public void clickOnJacketAddToCart(){
        jacketAddToCartButton.click();
    }



    public String getPriceOfTShirt(){
        return priceOfTShirt.getText();
    }

    public void clickSortByNameAtoZ(){
        sortDropdown.click();
        nameAtoZ.click();
    }

    public void clickSortByNameZtoA(){
        sortDropdown.click();
        nameZtoA.click();
    }

    public void clickSortByPriceLowToHigh(){
        sortDropdown.click();
        priceLowToHigh.click();
    }
    public void clickSortByPriceHighToLow(){
        sortDropdown.click();
        priceHighToLow.click();
    }
    public boolean checkNameSortAtoZ(){
        List<String> actualNames = new ArrayList<>();
        for (WebElement name: inventoryNames) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames);
        return actualNames.equals(expectedNames);
    }

    public boolean checkNameSortZtoA(){
        List<String> actualNames = new ArrayList<>();
        for (WebElement name: inventoryNames) {
            actualNames.add(name.getText());
        }
        List<String> expectedNames = new ArrayList<>(actualNames);
        sort(expectedNames, reverseOrder());
        return actualNames.equals(expectedNames);
    }

    public boolean checkPriceSortLowToHigh(){
        List<Double> actualPrices = new ArrayList<>();
        for (WebElement price: inventoryPrices) {
            actualPrices.add(parseDouble(price.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices);
        return actualPrices.equals(expectedPrices);
    }
    public boolean checkPriceSortHighToLow(){
        List<Double> actualPrices = new ArrayList<>();
        for (WebElement price: inventoryPrices) {
            actualPrices.add(parseDouble(price.getText().substring(1)));
        }
        List<Double> expectedPrices = new ArrayList<>(actualPrices);
        sort(expectedPrices, reverseOrder());
        return actualPrices.equals(expectedPrices);
    }


}