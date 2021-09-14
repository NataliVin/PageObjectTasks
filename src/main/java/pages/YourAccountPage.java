package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourAccountPage extends BasePage{
    @FindBy(xpath ="//div[@id='content']//h1")
    private WebElement newAccountMessage;

    public YourAccountPage(){
        PageFactory.initElements(getWebDriver(), this);
    }

    public String getMessage(){
       return newAccountMessage.getText();
    }

}
