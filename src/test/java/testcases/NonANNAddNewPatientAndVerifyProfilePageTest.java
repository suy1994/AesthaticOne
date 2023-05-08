package testcases;

import Pages.NonANNAddNewPatientAndVerifyProfilePage;

import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NonANNAddNewPatientAndVerifyProfilePageTest extends TestBase {
    NonANNAddNewPatientAndVerifyProfilePage nonANNAddNewPatientAndVerifyProfilePage;
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        nonANNAddNewPatientAndVerifyProfilePage = new NonANNAddNewPatientAndVerifyProfilePage();
        physicianLoginPage = new PhysicianLoginPage();
        createExcelSheetObject();
    }

    @BeforeMethod
    public void createObject() {
        createSoftAssertObject();
    }

    @Test
    public void successfulLogin() {
        physicianLoginPage.successfulLogin();
    }

    @Test
    public void verifyErrorMessagesWithoutFillDataTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyErrorMessagesWithoutFillData();
    }

    @Test
    public void verifyValidDOBErrorMessageTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyValidDOBErrorMessage();
    }

    @Test
    public void verifyPatientIsAlreadyRegisterWithEmailErrorMessageTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyPatientIsAlreadyRegisterWithEmailErrorMessage(4, 4, 4, 4, 4, 4, 4);
    }

    @Test
    public void verifyPatientIsAlreadyRegisterWithMobileErrorMessageTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyPatientIsAlreadyRegisterWithMobileErrorMessage();
    }

//    @Test(description = "Enter Patient Details and Add New Patient")
//    public void addPatientTest() {
//        nonANNAddNewPatientAndVerifyProfilePage.addPatient(100, 100, 100, 100, 100, 100, 100);
//    }

    @Test(description = "Search Added Patient In Globally")
    public void verifyGloballySearchPatientTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyGloballySearchPatient(100);
    }

    @Test(description = "Verify Patient Name And Number In DP")
    public void verifyDisplayPictureNameTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyDisplayPictureName(100, 100);
    }

    @Test
    public void verifyPatientAppNotInstalledTest() throws Exception {
        nonANNAddNewPatientAndVerifyProfilePage.verifyPatientAppNotInstalled();
    }

    @Test(description = "Verified patient data, viewed in attached patient profile")
    public void verifyProfileTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyProfile(100, 100, 100, 100, 100, 100, 100, 100, 100, 100);
    }

    @Test(description = "Verified patient data, viewed in attached patient profile")
    public void verifyAlreadyRegisterMobileNumberErrorMessageTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyAlreadyRegisterMobileNumberErrorMessage();
    }


    @Test(description = "Verified patient data, viewed in attached patient profile")
    public void verifyAlreadyRegisterEmailErrorMessageTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyAlreadyRegisterEmailErrorMessage();
    }

    @Test
    public void verifyErrorMessagesInProfileWhenRemovingOldDataTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyErrorMessagesInProfileWhenRemovingOldData();
    }

    @Test
    public void verifyErrorMessageInMobileTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyErrorMessageInMobile();
    }

    @Test
    public void verifyErrorMessageZipCodeTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyErrorMessageZipCode();
    }

    @Test(description = "Enter Edited Data")
    public void editProfileTest() {
        nonANNAddNewPatientAndVerifyProfilePage.editProfile(63, 63, 63, 63, 63, 63, 63);
    }

    @Test(description = "Verify Entered Data")
    public void verifyEditedDataTest() {
        nonANNAddNewPatientAndVerifyProfilePage.verifyEditedData(63, 63, 63, 63, 63, 63, 63, 63);
    }

    @Test(description = "Enter Original Data Of Patient")
    public void enterProfileDataTest() {
        nonANNAddNewPatientAndVerifyProfilePage.enterProfileData(100, 100, 100, 100, 100, 100, 100);
    }


    @Test(description = "verify Patient App Installed By Patient After Installation App")
    public void verifyPatientAppInstalledTest() throws Exception {
        nonANNAddNewPatientAndVerifyProfilePage.verifyPatientAppInstalled(28, 28, 28);
    }

    @Test(description = "verify Patient App Installed By Patient After Installation App")
    public void verifyPatientAppInUseTest() throws Exception {
        nonANNAddNewPatientAndVerifyProfilePage.verifyPatientAppInUse(30, 30, 30);
    }

    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
