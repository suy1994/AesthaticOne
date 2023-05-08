package testcases;

import Pages.PatientLoginPage;

import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class patientLoginPageTest extends TestBase {
    PatientLoginPage patientLoginPage;

    @BeforeTest
    public void setup() {
        patientLoginPage = new PatientLoginPage();
        createExcelSheetObject();
    }

    @BeforeMethod
    public void createObject() {
        createSoftAssertObject();
    }

    @Test
    public void verifyErrorMessageWithoutEnterAnyDataInRegistration() {
        patientLoginPage.verifyErrorMessageWithoutEnterAnyDataInRegistration();
    }

    @Test
    public void verifyErrorMessageForCheckBox() {
        patientLoginPage.verifyErrorMessageForCheckBox(3);
    }

    @Test
    public void verifyInvalidMobileNumberErrorMessage() {
        patientLoginPage.verifyInvalidMobileNumberErrorMessage(2);
    }

    @Test
    public void verifyInvalidPinErrorMessage() {
        patientLoginPage.verifyInvalidPinErrorMessage(3);
    }

    @Test
    public void verifyIncorrectPinErrorMessage() {
        patientLoginPage.verifyIncorrectPinErrorMessage(3);
    }

    @Test
    public void verifyWithoutEnterErrorMessageTest() {
        patientLoginPage.emailTextBoxForPatientLogin(7,2,2,2,2,2,3);
    }

//    @Test
//    public void successfulLoginInPatientTest() {
//        patientLoginPage.successfulLoginInPatient(3,2,2,2);
//    }

//    @Test
//    public void logoutPatientTest() {
//        patientLoginPage.logoutPatient();
//    }

}
