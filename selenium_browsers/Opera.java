package selenium_browsers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.opera.OperaDriver;

public class Opera {
    public static void main(String[] args) {

        //With driver path
        System.setProperty("webdriver.opera.driver","C:\\Software\\Driver\\operadriver.exe");
        WebDriver driver1=new OperaDriver();
        driver1.get("https://demo.nopcommerce.com/");
        driver1.manage().window().maximize();
        driver1.quit();

        //Without driver Path (bonigarcia concept)

        WebDriverManager.operadriver().setup();
        WebDriver driver=new OperaDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        driver.quit();


    }
}
