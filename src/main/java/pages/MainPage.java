package pages;

import components.Header;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BasePage{

    private Header header;


    public MainPage() {
        PageFactory.initElements(getWebDriver(), this);
        header = new Header(getWebDriver());
    }

    public MainPage clickOnMyAccountButton() {
        header.getMyAccountButton().click();
        return new MainPage();
    }

    public RegisterAccountPage clickOnRegisterButton() {
        header.getRegisterButton().click();
        return new RegisterAccountPage();
    }
}
