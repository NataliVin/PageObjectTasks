package pages;

import org.openqa.selenium.WebDriver;

public class BasePage {


        private static WebDriver webDriver;

        public static WebDriver getWebDriver() {
            return webDriver;
        }

        public static void setWebDriver(WebDriver driver) {
            webDriver = driver;
        }

}
