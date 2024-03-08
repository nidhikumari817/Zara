import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
public class Search {
    public void SearchBar(WebDriver driver) throws InterruptedException{
        driver.findElement(By.xpath("//a[@class=\"layout-search-link__link link\"]")).click();
        driver.manage().window().fullscreen();
        Thread.sleep(500);
        driver.findElement(By.id("search-products-form-combo-input")).sendKeys("Trousers");
        Thread.sleep(500);
        driver.findElement(By.id("search-products-form-combo-input")).sendKeys(Keys.ENTER);
    }
}
