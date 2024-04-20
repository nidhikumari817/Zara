import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

public class SearchResults {

    public void Results (WebDriver driver) throws InterruptedException {

        // Finding the main container of product using xpath
        WebElement productListsElement = driver.findElement(By.xpath("//ul[@class=\"product-grid__product-list\"]"));

        // Finding all child elements inside the container (list of trousers)
        List<WebElement> productItems = productListsElement.findElements(By.xpath("*"));
        System.out.println("Number of Child Elements: " + productItems.size());

        // Clicking on the first item of the product list (first trouser)
        if (!productItems.isEmpty()) {
            WebElement firstTrouser = productItems.get(0);
            firstTrouser.click();

    }
    }
}
