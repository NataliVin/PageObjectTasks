package tests;

import com.github.javafaker.Faker;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountNoFirstNameTest extends BaseTest{
    @Test
    public void checkThatNewUserIsNotCreatedWithoutFirstName () {
        String expectedResult = "First Name must be between 1 and 32 characters!";
        Faker faker = new Faker();

        String fakePassword = faker.internet().password();
        MainPage mainPage = new MainPage();
        String actualResult;
                mainPage.clickOnMyAccountButton()
                        .clickOnRegisterButton()
                        .enterLastName(faker.name().lastName())
                        .enterEmail(faker.internet().emailAddress())
                        .enterTelephone(faker.phoneNumber().phoneNumber())
                        .enterPassword(fakePassword)
                        .enterPasswordConfirm(fakePassword)
                        .clickCheckbox()
                        .clickContinueButton();





        assertThat(actualResult)
                .as("Message not as expected")
                .isEqualTo(expectedResult);
    }
}
