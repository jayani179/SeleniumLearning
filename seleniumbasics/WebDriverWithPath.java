package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class WebDriverWithPath {
    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver","C:\\Software\\Driver\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.close();

        System.setProperty("webdriver.edge.driver","C:\\Software\\Driver\\msedgedriver.exe");
        WebDriver driver1=new EdgeDriver();
        driver1.get("https://demo.nopcommerce.com/");
        driver1.manage().window().maximize();
        driver1.close();


    }
}
