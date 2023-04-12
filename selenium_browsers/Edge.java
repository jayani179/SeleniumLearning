package selenium_browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {
    public static void main(String[] args) {
        //With driver path
        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();

        //Without driver Path (bonigarcia concept)
        WebDriverManager.edgedriver().setup();
        WebDriver driver1=new EdgeDriver();
        driver1.get("https://demo.nopcommerce.com/");
        driver1.manage().window().maximize();
        driver1.close();
    }
}
