package Pages;

import base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static util.TestUtil.*;

public class PatientLoginPage extends TestBase {
    String sheetName = "Patient Login";

    @FindBy(xpath = "//input[@id='mobile-number']")
    WebElement mobileNumberLoginTextBoxForPatient;

    @FindBy(xpath = "//input[@id='agreeChkBox']")
    WebElement checkBoxForPatient;

    @FindBy(xpath = "//input[@id='dob']")
    WebElement dobForPatient;

    @FindBy(xpath = "(//div[@class='form-group'])[1]//input")
    WebElement emailTextBoxForPatientLogin;

    @FindBy(xpath = "(//div[@class='form-group'])[2]//input")
    WebElement repeatEmailForPatient;

    @FindBy(xpath = "//button[@class='btn btn-block btn-apurple']")
    WebElement confirmEmailButtonForPatient;

    @FindBy(xpath = "(//button[@class='btn btn-block btn-apurple'])[2]")
    WebElement verifyPinButtonForEmail;

    @FindBy(xpath = "//button[@class='btn btn-block btn-apurple']")
    WebElement verifyPinAndConFirmButton;

    @FindBy(xpath = "//button[@class='btn btn-apurple btn-block']")
    WebElement signInWithTextMessageButton;

    @FindBy(xpath = "//div[@class='err ng-star-inserted']")
    WebElement mobileNumberIsRequiredErrorMessage;

    @FindBy(xpath = "(//select[@class='ng-untouched ng-pristine ng-valid'])")
    WebElement securityQuestion1;

    @FindBy(xpath = "(//div[@class='form-group'])[2]//input")
    WebElement securityAnswer1;

    @FindBy(xpath = "(//select[@class='ng-untouched ng-pristine ng-valid'])")
    WebElement securityQuestion2;

    @FindBy(xpath = "(//div[@class='form-group'])[4]//input")
    WebElement securityAnswer2;

    @FindBy(xpath = "(//select[@class='ng-untouched ng-pristine ng-valid'])")
    WebElement securityQuestion3;

    @FindBy(xpath = "(//div[@class='form-group'])[6]//input")
    WebElement securityAnswer3;

    @FindBy(xpath = "//button[@class='btn btn-block btn-apurple']")
    WebElement finishButton;

    @FindBy(xpath = "(//button[@class='btn btn-same-width btn-apurple'])[2]")
    WebElement agreeAgreementButton;

    @FindBy(xpath = "//b[@class='fnts-18']")
    WebElement profileNameOfPatient;

    @FindBy(xpath = "//button[@class='btn btn-apurple-outline btn-icon']/span")
    WebElement logoutButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-same-width btn-apurple'])[1]")
    WebElement popupLogoutYesButton;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[1]/div[2]")
    WebElement loaderForMobileNumberPage;

    @FindBy(xpath = "//div[@class='invalid-msg ng-star-inserted']")
    WebElement pinIsRequiredErrorMessage;

    @FindBy(xpath = "//div[@id='toast-container']")
    WebElement inCorrectPinErrorMessage;

    @FindBy(xpath = "(//select[@class='ng-untouched ng-pristine ng-valid'])")
    WebElement securityQuestionsPage;

    @FindBy(xpath = "//div[@class='security-ques-form fh-wrap-div fh-wrap-autoh text-left']/button")
    WebElement finishButton2;

    @FindBy(xpath = "//div[@class='form-group']//input")
    List<WebElement> pinBoxForMobilePin;

    @FindBy(xpath = "(//div[@class='form-group'])[3]//input")
    List<WebElement> pinBoxForEmail;

    public void verifyErrorMessageWithoutEnterAnyDataInRegistration() {
        driver.get(getPropertyValueByKey("patientUrl"));
        click(signInWithTextMessageButton, "Click On Sign In Text Message");
        sa.assertEquals(mobileNumberIsRequiredErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        sa.assertAll();
    }

    public void verifyErrorMessageForCheckBox(int mobileNumber) {
        sendKeys(mobileNumberLoginTextBoxForPatient, excel.getCellData(sheetName, "Mobile Number", mobileNumber), "Send Keys Into Mobile Number");
        sa.assertEquals(mobileNumberIsRequiredErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 3));
        sa.assertAll();
    }

    public void verifyInvalidMobileNumberErrorMessage(int mobileNumber) {
        click(checkBoxForPatient, "Click On CheckBox");
        sendKeys(mobileNumberLoginTextBoxForPatient, excel.getCellData(sheetName, "Invalid Data", mobileNumber), "Send Keys Into Mobile Number");
        click(signInWithTextMessageButton, "Click On Sign In Text Message Button");
        waitForLoader(loaderForMobileNumberPage);
        sa.assertEquals(mobileNumberIsRequiredErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 4));
        sa.assertAll();
    }

    public void verifyInvalidPinErrorMessage(int mobileNumber) {
        sendKeys(mobileNumberLoginTextBoxForPatient, excel.getCellData(sheetName, "Mobile Number", mobileNumber), "Send Keys Into Mobile Number");
        click(signInWithTextMessageButton, "Click On Sign In Text Message");
        sleep(2000);
        javascriptUsingClick(verifyPinAndConFirmButton, "Click On Verify Pin Button Of Mobile Pin");
        sa.assertEquals(pinIsRequiredErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 6));
        sa.assertAll();
    }

    public void verifyIncorrectPinErrorMessage(int mobilePin) {
        for (int i = 0; i < pinBoxForMobilePin.size(); i++) {
            waitForElementToBeDisplayed(pinBoxForMobilePin.get(i));
            sendKeys(pinBoxForMobilePin.get(i), excel.getCellData(sheetName, "Invalid Data", i + mobilePin), "Send Keys In Email Box");
        }
        javascriptUsingClick(verifyPinAndConFirmButton, "Click On Verify Pin Button Of Mobile Pin");
        sleep(1000);
        sa.assertEquals(inCorrectPinErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 7));
        sa.assertAll();
    }

    public void emailTextBoxForPatientLogin(int mobileNumber, int mobilePin, int DOB, int emailPin, int verifyPatientEmail, int repeatPatientEmail, int verifyPatientNameOfProfile) {
        driver.get(getPropertyValueByKey("patientUrl"));
        sendKeys(mobileNumberLoginTextBoxForPatient, excel.getCellData(sheetName, "Mobile Number", mobileNumber), "Send Keys Into Mobile Number");
        click(checkBoxForPatient, "Click On CheckBox");
        click(signInWithTextMessageButton, "Click On Sign In Text Message");
        for (int i = 0; i < pinBoxForMobilePin.size(); i++) {
            waitForElementToBeDisplayed(pinBoxForMobilePin.get(i));
            sendKeys(pinBoxForMobilePin.get(i), excel.getCellData(sheetName, "Mobile Pin", i + mobilePin), "Send Keys In Email Box");
        }
        click(verifyPinAndConFirmButton, "Click On Verify Pin Button Of Mobile Pin");
        sendKeys(dobForPatient, excel.getCellData(sheetName, "DOB", DOB), "Send Keys In Date Of Birth ");
        click(verifyPinAndConFirmButton, "Click On Verify And Confirm Button");
        sleep(2000);
        if (emailTextBoxForPatientLogin.isDisplayed()) {
            System.out.println("The value display is " + emailTextBoxForPatientLogin.getText());
            sa.assertEquals(emailTextBoxForPatientLogin.getAttribute("value"), excel.getCellData(sheetName, "Patient Email", verifyPatientEmail));
            sendKeys(repeatEmailForPatient, excel.getCellData(sheetName, "Patient Email", repeatPatientEmail), "Send Keys Into Repeat Email Field");
            click(confirmEmailButtonForPatient, "Click On Confirm Email Button");
            sleep(2000);

            for (int i = 0; i < pinBoxForEmail.size(); i++) {
                waitForElementToBeDisplayed(pinBoxForEmail.get(i));
                sendKeys(pinBoxForEmail.get(i), excel.getCellData(sheetName, "Email Pin", i + emailPin), "Send Keys In Email Box");
            }
            click(verifyPinAndConFirmButton, "Click On Verify Pin");
        }

//        System.out.println("The Security "+securityQuestionsPage.getText());

//        if (securityQuestionsPage.isDisplayed()) {
//            System.out.println("The value display is " + securityQuestion1.getText());
//            selectDropdownValue(securityQuestion1, excel.getCellData(sheetName, "Security Question Dropdown", 2), "");
//            sendKeys(securityAnswer1, excel.getCellData(sheetName, "Security Answer", 2), "Enter Security Answer");
//            selectDropdownValue(securityQuestion2, excel.getCellData(sheetName, "Security Question Dropdown", 3), "");
//            sendKeys(securityAnswer2, excel.getCellData(sheetName, "Security Answer", 3), "Enter Security Answer");
//            selectDropdownValue(securityQuestion3, excel.getCellData(sheetName, "Security Question Dropdown", 4), "");
//            sendKeys(securityAnswer3, excel.getCellData(sheetName, "Security Answer", 4), "Enter Security Answer");
//            click(finishButton, "Click On Finish Button");
//        }

//        if (agreeAgreementButton.isDisplayed()) {
//            click(agreeAgreementButton, "Click On I Agree Button of First Agreement ");
//            click(agreeAgreementButton, "Click On I Agree Button Of Second Agreement");
//            sleep(3000);
//        }
//        sa.assertEquals(profileNameOfPatient.getText(), excel.getCellData(sheetName, "Profile Name", verifyPatientNameOfProfile));
        sa.assertAll();
    }

    public void successfulLoginInPatient(int mobileNumber, int mobilePin, int DOB, int emailPin) {
        sendKeys(mobileNumberLoginTextBoxForPatient, excel.getCellData(sheetName, "Mobile Number", mobileNumber), "Send Keys Into Mobile Number");
        click(checkBoxForPatient, "Click On CheckBox");
        click(signInWithTextMessageButton, "Click On Sign In Text Message");
        for (int i = 0; i < pinBoxForMobilePin.size(); i++) {
            waitForElementToBeDisplayed(pinBoxForMobilePin.get(i));
            sendKeys(pinBoxForMobilePin.get(i), excel.getCellData(sheetName, "Mobile Pin", i + mobilePin), "Send Keys In Email Box");
        }
        click(verifyPinAndConFirmButton, "Click On Verify Pin Button Of Mobile Pin");
        sendKeys(dobForPatient, excel.getCellData(sheetName, "DOB", DOB), "Send Keys In Date Of Birth ");
        click(verifyPinAndConFirmButton, "Click On Verify And Confirm Button");
        sleep(5000);
    }

    public void logoutPatient() {
        sleep(2000);
        click(logoutButton, "Click On Logout Button");
        click(popupLogoutYesButton, "click On Yes Button Of Popup");
    }
}
