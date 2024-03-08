import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Category {
    public void SubCategory(WebDriver driver) throws InterruptedException{
        Thread.sleep(2000);
        List<WebElement> elements= driver.findElements(By.xpath("//*[contains(text(),'GREY TROUSERS')]"));
        for (WebElement element: elements){
            System.out.println(element.getTagName());
        }
        driver.findElement(By.xpath("//*[contains(text(),'GREY TROUSERS')]")).click();
        Thread.sleep(2000);
    }
}
