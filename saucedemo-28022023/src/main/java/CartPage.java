import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Double.parseDouble;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(className = "cart_item")
    private List<WebElement> items;

    @FindBy(className = "inventory_item_price")
    private List<WebElement> itemPrices;

    @FindBy(id = "checkout")
    private WebElement checkoutButton;

    public int getItemsQuantity(){
        return items.size();
    }

    public String getPriceOfFirstItem(){
        return itemPrices.get(0).getText();
    }

    //'ABCDEF'.substring(1)
    //'BCDEF'
    //'15.99'
    public double getTotalPriceOfAllItems(){
        double total = 0;
        for (WebElement price: itemPrices) {
            total += parseDouble(price.getText().substring(1));
        }
        return total;
    }

    public void clickOnCheckoutButton(){
        checkoutButton.click();
    }

    public boolean cartIsEmpty(){
        boolean empty = false;
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1));
            wait.until(ExpectedConditions.visibilityOf(items.get(0)));
        } catch (Exception e){
            empty = true;
        }
        return empty;
    }
}
