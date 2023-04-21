package automatedfunctions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register extends Utils{
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("jayani");
        driver.findElement(By.id("LastName")).sendKeys("shah");
        //1.
//        driver.findElement(By.name("DateOfBirthDay")).sendKeys("18");
//        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("April");
//        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1985");

        //2.
        WebElement Day = driver.findElement(By.name("DateOfBirthDay"));
        WebElement Month = driver.findElement(By.name("DateOfBirthMonth"));
        WebElement Year = driver.findElement(By.name("DateOfBirthYear"));
//            //a.
//        Day.sendKeys("18");
//        Month.sendKeys("April");
//        Year.sendKeys("1984");
//            //b.
//        Select select = new Select(Day);
//        select.selectByIndex(19);
//        Select select1 = new Select(Month);
//        select1.selectByVisibleText("June");
//        Select select2 = new Select(Year);
//        select2.selectByValue("1985");

            //c.Generic Method - Reusable method
        //Pass value if the method is defined with selectByVisibleText or SelectByValue
        //Pass index if the method is defined with selectByIndex
        selectFromDropDown(Day, "18");
        selectFromDropDown(Month, "April");
        selectFromDropDown(Year, "1983");


        driver.findElement(By.name("Email")).sendKeys("jaini.shah@gmail.com");
        driver.findElement(By.id("Company")).sendKeys("ABC Ltd.");
        driver.findElement(By.id("Newsletter")).click();
        driver.findElement(By.id("Password")).sendKeys("jaini1804");
        driver.findElement(By.id("ConfirmPassword")).sendKeys("jaini1804");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
        Thread.sleep(2000);
        driver.close();

    }
}
