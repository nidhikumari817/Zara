import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Search {
    // Method to perform a search in the search bar
    public void SearchBar(WebDriver driver) throws InterruptedException {
        // Clicking on the search bar link
        driver.findElement(By.xpath("//a[@class=\"layout-search-link__link link\"]")).click();
        Thread.sleep(2000);

        // Typing 'Trousers' in the search input field and hitting Enter
        WebElement searchInput = driver.findElement(By.id("search-products-form-combo-input"));
        searchInput.sendKeys("Trousers");
        Thread.sleep(2000);
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);

        // Finding the main container of product using xpath
        String productListsXpath = "//ul[@class=\"product-grid__product-list\"]";
        WebElement productListsElement = driver.findElement(By.xpath(productListsXpath));

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
