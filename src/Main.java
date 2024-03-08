import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.zara.com/in/");
        Thread.sleep(2000);
        driver.manage().window().fullscreen();
        Thread.sleep(2000);
        Search s= new Search();
        s.SearchBar(driver);
    }
}