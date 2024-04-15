import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class Search {
    // Method to perform a search in the search bar
    public void SearchBar(WebDriver driver) throws InterruptedException {
        // Clicking on the search bar link
        driver.findElement(By.xpath("//a[@class=\"layout-search-link__link link\"]")).click();
        Thread.sleep(2000);

        // Typing 'Trousers' in the search input field and hitting Enter
        driver.findElement(By.xpath("//input[@class=\"search-products-form__input\"]")).sendKeys("Trousers");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@class=\"search-products-form__input\"]")).sendKeys(Keys.ENTER);
        Thread.sleep(5000);
    }
}
