package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static util.TestUtil.*;


public class PhysicianLoginPage extends TestBase {
    String sheetName = "LoginPage";

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary btn-beforelogin btn-block mb-3']")
    WebElement registerMyMobileButton;

    @FindBy(xpath = "//div[@class='account__errorMsg  text-center']")
    WebElement checkboxErrorMessage;

    @FindBy(xpath = "//div[@class='fnts-14']")
    WebElement mobileNumberErrorMessage;

    @FindBy(xpath = "//input[@name='setupInput']")
    WebElement mobileNumberTextBox;

    @FindBy(xpath = "//label[@for='isCheckSomthing']")
    WebElement checkbox;

    @FindBy(xpath = "//div[@class='col-sm-12']/div")
    WebElement wrongNumberErrorMessage;

    @FindBy(xpath = "//div[@class='invalid-feedback d-block text-right']/p")
    WebElement pleaseEnterPinErrorMessageOfMobile;

    @FindBy(xpath = "//div[@class='form-group pt-3 text-center']/button")
    WebElement verifyPinButton;

    @FindBy(xpath = "//div[@class='invalid-feedback d-block text-right']")
    WebElement incorrectPinErrorMessageOfMobile;

    @FindBy(xpath = "//span[@class='annicon-phlogout']")
    WebElement logoutButton;

    @FindBy(xpath = "//button[@class='btn btn-md btn-outline-primary']")
    WebElement logoutButtonClickYES;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary']")
    WebElement logoutButtonClickNo;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary btn-beforelogin btn-block mb-3 ng-star-inserted']")
    WebElement signInWithTextMessageButton;

    @FindBy(xpath = "//div[@class='col-sm-12 justify-content-center d-flex']/h3")
    WebElement welcomeAestheticOneLabel;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[1]/div[2]")
    WebElement loader;

    @FindBy(xpath = "//div[@class='ann-header-provider']")
    WebElement physicianName;

    @FindBy(xpath = "//div[@class='float-form-row mt-4']//input")
    List<WebElement> pinInputBox;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[5]/div[2]")
    WebElement loaderAfterLogin;

    @FindBy(xpath = "//div[@class= 'modal-body ann-popup__body text-center mb-0']//select")
    WebElement selectPracticeDropdown;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    WebElement goToSelectedPracticeButton;


    /*************************************Common Method*********************************************************/
    public void enterMobileNumber(int mobileNumber) {
        waitForElementToBeDisplayed(welcomeAestheticOneLabel);
        String mobileNumber1 = excel.getCellData(sheetName, "Mobile Number", mobileNumber);
        sendKeys(mobileNumberTextBox, mobileNumber1, "Send Keys in Mobile Number");
        javascriptUsingClick(checkbox, "Click on checkbox");
        click(registerMyMobileButton, "Click on register my mobile button");
        waitForLoader(loader);
    }

    public void enterEmailPin(int emailPin) {
        for (int i = 0; i < pinInputBox.size(); i++) {
            waitForElementToBeDisplayed(pinInputBox.get(i));
            sendKeys(pinInputBox.get(i), excel.getCellData(sheetName, "Pin", i + emailPin), "Send Keys In Email Box");
        }
        click(verifyPinButton, "Click on verify Pin Button");
        waitForLoader(loader);
    }

    public void enterMobilePin(int mobilePin) {
        for (int i = 0; i < pinInputBox.size(); i++) {
            waitForElementToBeDisplayed(pinInputBox.get(i));
            sendKeys(pinInputBox.get(i), excel.getCellData(sheetName, "Pin", i + mobilePin), "");
        }
        click(verifyPinButton, "Click on verify Pin Button");
        waitForLoader(loader);
    }

    public void successfulLogin() {
        driver.get(prop.getProperty("url"));
        enterMobileNumber(3);
        enterMobilePin(2);
        enterEmailPin(2);
        sleep(5000);
    }

    /**************************************************************************************************/

    public void verifyMobileNumberErrorMessageWithoutFillAnyData() {
        driver.get(prop.getProperty("url"));
        click(registerMyMobileButton, "Click on register my mobile button");
        waitForElementToBeDisplayed(mobileNumberErrorMessage);
        sa.assertEquals(mobileNumberErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        sa.assertAll();
    }

    public void verifyCheckBoxErrorMessage() {
        sendKeys(mobileNumberTextBox, excel.getCellData(sheetName, "Invalid Data", 2), "Send Keys in Mobile Number");
        click(registerMyMobileButton, "Click on register my mobile button");
        sa.assertEquals(checkboxErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 3));
        sa.assertAll();
    }

    public void verifyWrongMobileNumberErrorMessage() {
        click(checkbox, "Click on checkbox");
        click(registerMyMobileButton, "Click on register my mobile button");
        waitForLoader(loader);
        sa.assertEquals(wrongNumberErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 4));
        click(checkbox, "Click on checkbox");
        sa.assertAll();
    }

    public void verifyPleaseEnterPinErrorMessageInMobile() {
        click(verifyPinButton, "Click on verify Pin Button");
        sa.assertEquals(pleaseEnterPinErrorMessageOfMobile.getText(), excel.getCellData(sheetName, "Error Messages", 5));
        sa.assertAll();
    }

    public void verifyIncorrectMobilePinErrorMessage() {
        for (int i = 0; i < pinInputBox.size(); i++) {
            waitForElementToBeDisplayed(pinInputBox.get(i));
            sendKeys(pinInputBox.get(i), excel.getCellData(sheetName, "Invalid Data", i + 4), "");
        }
        click(verifyPinButton, "Click on verify Pin Button");
        waitForLoader(loader);
        sa.assertEquals(incorrectPinErrorMessageOfMobile.getText(), excel.getCellData(sheetName, "Error Messages", 6));
        sa.assertAll();
    }

    public void verifyPleaseEnterPinErrorMessageInEmail() {
        click(verifyPinButton, "Click on verify Pin Button");
        sa.assertEquals(pleaseEnterPinErrorMessageOfMobile.getText(), excel.getCellData(sheetName, "Error Messages", 5));
        sa.assertAll();
    }

    public void verifyIncorrectEmailPinErrorMessage() {
        for (int i = 0; i < pinInputBox.size(); i++) {
            waitForElementToBeDisplayed(pinInputBox.get(i));
            sendKeys(pinInputBox.get(i), excel.getCellData(sheetName, "Invalid Data", i + 4), "");
        }
        click(verifyPinButton, "Click on verify Pin Button");
        waitForLoader(loader);
        sa.assertEquals(incorrectPinErrorMessageOfMobile.getText(), excel.getCellData(sheetName, "Error Messages", 6));
        successfulLogin();
        sa.assertAll();
    }

    public void verifyItsSurgeonAccountOrStaffAccount(int SelectPracticeRowNumber, int SelectPracticeCancelButtonRowNumber, int selectPracticeButtonName) {
        sleep(2000);
        String selectPracticeCancelButton = excel.getCellData(sheetName, "Labels", SelectPracticeCancelButtonRowNumber);
        String SelectPractice = excel.getCellData(sheetName, "Labels", SelectPracticeRowNumber);
        WebElement selectPracticeLabel = driver.findElement(By.xpath("//button[.='" + selectPracticeCancelButton + "']"));
        if (selectPracticeLabel.isDisplayed()) {
            System.out.println("It's staff account");
            report("It's staff account");
            click(selectPracticeLabel, "Click on cancel button");
            successfulLogin();
            sleep(2000);
            Select select = new Select(selectPracticeDropdown);
            select.selectByValue("1: Object");
            sleep(1000);
            click(goToSelectedPracticeButton, "Click on practice button name");
            waitForLoader(loader);
        } else {
            report("It's Surgeon Account");
            System.out.println("It's Surgeon Account");
        }
    }

    public void verifyNoButtonInLogout(int physicianNameRowNo) {
        sleep(1000);
        click(logoutButton, "Click on logout Button");
        click(logoutButtonClickNo, "Click on No Button");
        sa.assertEquals(physicianName.getText(), excel.getCellData(sheetName, "Physician Name", physicianNameRowNo));
        sa.assertAll();
    }

    public void logout() {
        sleep(2000);
        click(logoutButton, "Click on logout Button");
        click(logoutButtonClickYES, "Click on Yes Button");
        waitForLoader(loader);
    }

    public void verifyMobileNumberDisplayAfterLogout(int mobileNumberVerify, int signInWithTextMessageButtonVerify) {
        waitForElementToBeDisplayed(mobileNumberTextBox);
        sa.assertEquals(mobileNumberTextBox.getAttribute("value"), excel.getCellData(sheetName, "Mobile Number", mobileNumberVerify));
        waitForElementToBeDisplayed(signInWithTextMessageButton);
        sa.assertEquals(signInWithTextMessageButton.getText(), excel.getCellData(sheetName, "Labels", signInWithTextMessageButtonVerify));
        sa.assertAll();
    }


}








