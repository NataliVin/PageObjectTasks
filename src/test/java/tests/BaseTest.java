package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.BasePage;

public class BaseTest {

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.opencart.com/");
        driver.manage().window().maximize();
        BasePage.setWebDriver(driver);
    }

//    @AfterMethod
//    public void quit() {
//        if (BasePage.getWebDriver() != null) {
//            BasePage.getWebDriver().quit();
//        }
//    }
}
