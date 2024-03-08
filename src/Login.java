import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    public void ZaraLogin(WebDriver driver) throws InterruptedException
    {
      driver.findElement(By.xpath("//a[@class=\"layout-header-link layout-header-link-logon link\"]")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@class=\"zds-input-base__input\"and@name=\"logonId\"]")).sendKeys("cnidhi785@gmail.com");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//input[@class=\"zds-input-base__input\"and@name=\"password\"]")).sendKeys("Get@Rate817");
      Thread.sleep(2000);
      driver.findElement(By.xpath("//button[@class=\"zds-button zds-button--secondary zds-button--small\"and@data-qa-action=\"logon-form-submit\"]")).click();
      Thread.sleep(2000);
    }
}
