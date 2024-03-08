import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class Search {
    public void SearchBar(WebDriver driver) throws InterruptedException{
        driver.findElement(By.xpath("//a[@class=\"layout-search-link__link link\"]")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("search-products-form-combo-input")).sendKeys("Trousers");
        Thread.sleep(2000);
        //driver.findElement(By.id("search-products-form-combo-input")).sendKeys(Keys.ENTER);
        Thread.sleep(2000);
    }
}
