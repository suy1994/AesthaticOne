package testcases;

import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PhysicianLoginPageTest extends TestBase {
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        physicianLoginPage = new PhysicianLoginPage();
        createExcelSheetObject();
    }

    @BeforeMethod
    public void createObject() {
        createSoftAssertObject();
    }

    @Test
    public void verifyMobileNumberErrorMessageWithoutFillAnyDataTest() {
        physicianLoginPage.verifyMobileNumberErrorMessageWithoutFillAnyData();
    }

    @Test
    public void verifyCheckBoxErrorMessageTest() {
        physicianLoginPage.verifyCheckBoxErrorMessage();
    }

    @Test
    public void verifyWrongMobileNumberErrorMessageTest() {
        physicianLoginPage.verifyWrongMobileNumberErrorMessage();
    }

    @Test
    public void enterMobileNumberTest() {
        physicianLoginPage.enterMobileNumber(4);
    }

    @Test
    public void verifyPleaseEnterPinErrorMessageInMobileTest() {
        physicianLoginPage.verifyPleaseEnterPinErrorMessageInMobile();
    }

    @Test
    public void verifyIncorrectMobilePinErrorMessageTest() {
        physicianLoginPage.verifyIncorrectMobilePinErrorMessage();
    }

    @Test
    public void verifyMobilePinTest() {
        physicianLoginPage.enterMobilePin(2);
    }

    @Test
    public void verifyPleaseEnterPinErrorMessageInEmailTest() {
        physicianLoginPage.verifyPleaseEnterPinErrorMessageInEmail();
    }

    @Test
    public void verifyIncorrectEmailPinErrorMessageTest() {
        physicianLoginPage.verifyIncorrectEmailPinErrorMessage();
    }

    @Test
    public void verifyItsSurgeonAccountOrStaffAccount(){
        physicianLoginPage.verifyItsSurgeonAccountOrStaffAccount(4,4,5);
    }

    @Test
    public void verifyNoButtonInLogoutTest() {
        physicianLoginPage.verifyNoButtonInLogout(2);
    }

    @Test
    public void logout() {
        physicianLoginPage.logout();
    }

    @Test
    public void verifyMobileNumberDisplayAfterLogout() {
        physicianLoginPage.verifyMobileNumberDisplayAfterLogout(2, 3);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }
}
