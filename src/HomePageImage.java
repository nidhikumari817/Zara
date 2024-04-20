import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageImage {

    public void imageCarousel (WebDriver driver) throws InterruptedException{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(25));
        String carouselPath = "(//ul[@class=\"slider-spot__universe-items\"])[1]/li[5]";
        By locator = By.xpath(carouselPath); // Change to your element's locator (id, class, cssSelector, xpath, etc.)

            // Wait for the element to be clickable
            try{
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            element.click();
            // If no exceptions are thrown, the element is clickable
            System.out.println("The element is clickable.");
        } catch (Exception e) {
            // If an exception is caught, the element is not clickable
            System.out.println("The element is not clickable.");
        };
    }
}
