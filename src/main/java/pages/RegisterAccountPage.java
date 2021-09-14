package pages;

import components.Header;
import lombok.Getter;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static pages.BasePage.getWebDriver;

public class RegisterAccountPage extends BasePage{
    @FindBy(id ="input-firstname")
    private WebElement firstNameField;
    @Getter
    @FindBy(xpath ="//div[@class='text-danger']")
    private WebElement NoFirstNameWarning;

    @FindBy(id = "input-lastname")
    private WebElement lastNameField;

    @FindBy(id = "input-email")
    private WebElement eMailField;

    @FindBy(id = "input-telephone")
    private WebElement telephoneField;

    @FindBy(id = "input-password")
    private WebElement passwordField;

    @FindBy(id = "input-confirm")
    private WebElement passwordConfirmField;

    @FindBy(xpath = "//div[@class='pull-right']//input[1]")
    private WebElement checkbox;

    @FindBy(xpath = "//div[@class='pull-right']//input[2]")
    private WebElement continueButton;

    public RegisterAccountPage() {
        PageFactory.initElements(getWebDriver(), this);
        Header header = new Header(getWebDriver());
    }
    public RegisterAccountPage enterFirstName(String firstName){
        firstNameField.sendKeys(firstName);
        return this;
    }
    public RegisterAccountPage enterLastName(String lastName){
        lastNameField.sendKeys(lastName);
        return this;
    }
    public RegisterAccountPage enterEmail(String eMail){
        eMailField.sendKeys(eMail);
        return this;
    }
    public RegisterAccountPage enterTelephone(String telephone){
        telephoneField.sendKeys(telephone);
        return this;
    }
    public RegisterAccountPage enterPassword(String password){
        passwordField.sendKeys(password);
        return this;
    }
    public RegisterAccountPage enterPasswordConfirm(String password){
        passwordConfirmField.sendKeys(password);
        return this;
    }
    public RegisterAccountPage clickCheckbox (){
        checkbox.click();
        return this;
    }



    public YourAccountPage clickContinueButton (){
        continueButton.click();
        return  new YourAccountPage();
    }
//    public  <? extends BasePage> T clickContinueButton (){
//        continueButton.click();
//
//        if(getNoFirstNameWarning()==null){
//            return (T) this;
//        }
//        return  (T) new YourAccountPage();
//    }
    public String getMessageIfNoFirstName(){
        return NoFirstNameWarning.getText();
    }
}
