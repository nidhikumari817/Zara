import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--window-size=2560,1440");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.zara.com/in/");
        Thread.sleep(2000);
        Search s = new Search();
        s.SearchBar(driver);
        Thread.sleep(2000);
        SearchResults r = new SearchResults();
        r.Results(driver);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        Login l = new Login();
        l.ZaraLogin(driver);
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
    }
}