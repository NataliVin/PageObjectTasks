package tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import pages.MainPage;

import static org.assertj.core.api.Assertions.assertThat;

public class AccountCreateTest extends BaseTest{
    @Test
    public void checkThatNewUserIsCreated () {
        String expectedResult = "Your Account Has Been Created!";
        Faker faker = new Faker();

        String fakePassword = faker.internet().password();
        MainPage mainPage = new MainPage();
        String actualResult=
        mainPage.clickOnMyAccountButton()
                .clickOnRegisterButton()
                .enterFirstName(faker.name().firstName())
                .enterLastName(faker.name().lastName())
                .enterEmail(faker.internet().emailAddress())
                .enterTelephone(faker.phoneNumber().phoneNumber())
                .enterPassword(fakePassword)
                .enterPasswordConfirm(fakePassword)
                .clickCheckbox()
                .clickContinueButton()
                .getMessage();


        assertThat(actualResult)
                .as("Message not as expected")
                .isEqualTo(expectedResult);
    }
}
