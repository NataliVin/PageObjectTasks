package components;

import lombok.Getter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

@Getter
public class Header {
    @FindBy(xpath ="//nav[@id='top']//a[@class='dropdown-toggle']")
    private WebElement myAccountButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu dropdown-menu-right']//a[contains (text(), 'Register')]")
    private WebElement RegisterButton;


    public Header (WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
