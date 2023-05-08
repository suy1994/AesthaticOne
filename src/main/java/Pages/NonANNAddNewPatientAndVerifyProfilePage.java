package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.swing.*;

import static util.TestUtil.*;

public class NonANNAddNewPatientAndVerifyProfilePage extends TestBase {
    String sheetName = "Add Patient";
    PhysicianLoginPage physicianLoginPage = new PhysicianLoginPage();

    @FindBy(xpath = "//input[@name='firstName']")
    WebElement firstNameTextBox;

    @FindBy(xpath = "//input[@name='lastName']")
    WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='cellPhone']")
    WebElement mobileNumberTextBoxInAddPatient;

    @FindBy(xpath = "//input[@name='birthDate']")
    WebElement birthDateTextBoxInAddPatient;

    @FindBy(xpath = "//input[@name='email']")
    WebElement emailTextBoxInAddPatient;

    @FindBy(xpath = "//input[@name='address']")
    WebElement homeAddressTextBoxInAddPatient;

    @FindBy(xpath = "//input[@name='zipCode']")
    WebElement zipCodeTextBoxInAddPatient;

    @FindBy(xpath = "(//div[@class='col-sm-9'])[12]/label[1]")
    WebElement appointmentType;

    @FindBy(xpath = "//div[@class='form-control addpatient-dropdown-button']")
    WebElement appointmentCategoryDropdown;

    @FindBy(xpath = "(//input[@class='ng-untouched ng-pristine ng-valid'])[2]")
    WebElement appointmentCategoryCheckboxNotDisply;

    @FindBy(xpath = "(//div[@class='multiselchk multisel-main-tr mb-0'])[1]/label")
    WebElement appointmentCategoryCheckbox;

    @FindBy(xpath = "(//div[@class='multiselchk multisel-main-tr mb-0'])[1]/input")
    WebElement appointmentCategoryCheckbox1;

    @FindBy(xpath = "(//div[@class='mb-0 text-danger text-right ng-star-inserted'])[1]/div")
    WebElement firstNameErrorMessage;

    @FindBy(xpath = "(//div[@class='mb-0 text-danger text-right ng-star-inserted'])[2]/div")
    WebElement lastNameErrorMessage;

    @FindBy(xpath = "(//div[@class='mb-0 text-danger text-right ng-star-inserted'])[3]/div")
    WebElement mobileNumberErrorMessage;

    @FindBy(xpath = "(//div[@class='mb-0 text-danger text-right ng-star-inserted'])[4]/div")
    WebElement dobErrorMessage;

    @FindBy(xpath = "(//div[@class='mb-0 text-danger text-right ng-star-inserted'])[5]/div")
    WebElement appointmentCategoryErrorMessage;

    @FindBy(xpath = "//div[@class='col-md-12 text-center p-2']/button")
    WebElement doneButtonInAddProfile;

    @FindBy(xpath = "//button[@class='btn btn-md btn-outline-primary min-80']")
    WebElement okButtonOfAppointmentCategory;

    @FindBy(xpath = "//div[@class='row res-invi ng-star-inserted']//div[@class='col-auto d-flex']/div")
    WebElement patientAppInstalledImage;

    @FindBy(xpath = "//div[@class='tp-profdiv-rgt']/b")
    WebElement patientName;

    @FindBy(xpath = "//div[@class='tp-profdiv-rgt']//span")
    WebElement patientNumber;

    @FindBy(xpath = "//input[@placeholder='Find patient by name']")
    WebElement patientGloballySearch;

    @FindBy(xpath = "//div[@class='account__errorMsg ng-star-inserted']")
    WebElement patientIsAlreadyRegisteredErrorMessage;

    @FindBy(xpath = "//div[@class='patient-list-outer ptsrch-wrap']//li[1]")
    WebElement patientSelectedInSearchBar;

    @FindBy(xpath = "//span[@class='annicon-chat-pencil']")
    WebElement editProfileButton;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary bt-pr-btm hsc-btn-wd']")
    WebElement saveButtonInProfile;

    @FindBy(xpath = "//div[@class='tp-menu']/div[2]/a")
    WebElement closeButtonOfProfileName;

    @FindBy(xpath = "//input[@name='email']")
    WebElement patientEmailInProfile;

    @FindBy(xpath = "//input[@name='mobileNumber']")
    WebElement patientMobileNumberInProfile;

    @FindBy(xpath = "//input[@name='dateOfBirth']")
    WebElement patientDOBInProfile;

    @FindBy(xpath = "//input[@name='address']")
    WebElement patientHomeAddressInProfile;

    @FindBy(xpath = "//input[@name='zipCode']")
    WebElement zipCodeInProfile;

    @FindBy(xpath = "//input[@name='city']")
    WebElement cityInProfile;

    @FindBy(xpath = "//input[@name='state']")
    WebElement stateInProfile;

    @FindBy(xpath = "//input[@name='country']")
    WebElement countryInProfile;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[1]")
    WebElement firstNameErrorMessageInProfilePage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[2]")
    WebElement lastNameErrorMessageInProfilePage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[3]")
    WebElement mobileNumberErrorMessageInProfilePage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[4]")
    WebElement dobErrorMessageInProfilePage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[5]")
    WebElement homeAddressErrorMessageInProfilePage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[6]")
    WebElement zipCodeErrorMessageInProfilePage;

    @FindBy(xpath = "//button[@class='btn btn-md btn-outline-primary bt-pr-btm hsc-btn-wd mr-3']")
    WebElement cancelButtonInProfilePage;

    @FindBy(xpath = "//div[@class='error']")
    WebElement validZipCodeErrorMessageInProfilePage;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[9]/div[2]")
    WebElement loader;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[10]/div[2]")
    WebElement loaderForPatientProfile;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[1]/div[2]")
    WebElement loaderForAddPatient;

    @FindBy(xpath = "//div[@class='toast-message ng-star-inserted']")
    WebElement toastedMessage;

    @FindBy(xpath = "//div[@class='toast-error ngx-toastr ng-trigger ng-trigger-flyInOut']")
    WebElement toastedMessageClose;


    /****************************************Common Methods***************************************/

    public void enterPatientDetailsInAddPatientForm(int firstNameEnterRowNo, int lastNameEnterRowNo, int mobileNumberEnterRowNo, int birthDateEnterRowNo, int emailEnterRowNo, int homeAddressEnterRowNo, int zipCodeEnterRowNo) {
        WebElement[] AddPatientFormWebElements = {firstNameTextBox, lastNameTextBox, mobileNumberTextBoxInAddPatient, birthDateTextBoxInAddPatient, emailTextBoxInAddPatient, homeAddressTextBoxInAddPatient, zipCodeTextBoxInAddPatient};
        String[] colName = {"First Name", "Last Name", "Mobile Number", "DOB", "Patient Email", "Home Address", "Zip Code"};
        int[] colNumber = {firstNameEnterRowNo, lastNameEnterRowNo, mobileNumberEnterRowNo, birthDateEnterRowNo, emailEnterRowNo, homeAddressEnterRowNo, zipCodeEnterRowNo};
        for (int i = 0; i < AddPatientFormWebElements.length; i++) {
            waitForElementToBeDisplayed(AddPatientFormWebElements[i]);
            sendKeys(AddPatientFormWebElements[i], excel.getCellData(sheetName, colName[i], colNumber[i]), "Send Keys into Add Patient Form");
        }
        click(appointmentType, "Click on Appointment Type");
        sleep(1000);
        click(appointmentCategoryDropdown, "Click On Appointment Category Dropdown");
        sleep(1000);
        System.out.println("The Checkbox category is display" + appointmentCategoryCheckbox.isSelected());
        if (appointmentCategoryCheckbox1.isSelected() == false) {
            click(appointmentCategoryCheckbox, "Click On Appointment Category Checkbox");
        }

    }

    public void enterDetailsInProfile(int firstNameProfileEnterRowNo, int lastNameProfileEnterRowNo, int patientEmailProfileEnterRowNo, int patientMobileNumberProfileEnterRowNo, int patientDOBProfileEnterRowNo, int patientHomeAddressProfileEnterRowNo, int zipCodeProfileEnterRowNo) {
        WebElement[] profileFormWebElements = {firstNameTextBox, lastNameTextBox, patientEmailInProfile, patientMobileNumberInProfile, patientDOBInProfile, patientHomeAddressInProfile, zipCodeInProfile};
        String[] colName = {"First Name", "Last Name", "Patient Email", "Mobile Number Verify", "Patient DOB", "Home Address", "Zip Code"};
        int[] colNumber = {firstNameProfileEnterRowNo, lastNameProfileEnterRowNo, patientEmailProfileEnterRowNo, patientMobileNumberProfileEnterRowNo, patientDOBProfileEnterRowNo, patientHomeAddressProfileEnterRowNo, zipCodeProfileEnterRowNo};
        for (int i = 0; i < profileFormWebElements.length; i++) {
            waitForElementToBeDisplayed(profileFormWebElements[i]);
            sendKeys(profileFormWebElements[i], excel.getCellData(sheetName, colName[i], colNumber[i]), "Send Keys into Add Patient Form");
        }
        sleep(1000);
        click(saveButtonInProfile, "Click On Save Button In Profile");
        waitForLoader(loader);
    }

    /****************************************End Of Common Methods***********************************/
    public void verifyErrorMessagesWithoutFillData() {
        waitForLoader(loaderForAddPatient);
        javascriptUsingClick(doneButtonInAddProfile, "Click on done button");
        WebElement[] labels = {firstNameErrorMessage, lastNameErrorMessage, mobileNumberErrorMessage, dobErrorMessage, appointmentCategoryErrorMessage};
        int[] colNumber = {2, 3, 4, 5, 6};
        for (int i = 0; i < labels.length; i++) {
            waitForElementToBeDisplayed(labels[i]);
            sa.assertEquals(labels[i].getText(), excel.getCellData(sheetName, "Error Messages", colNumber[i]));
            sa.assertAll();
        }
        sa.assertAll();
    }

    public void verifyValidDOBErrorMessage() {
        sendKeys(birthDateTextBoxInAddPatient, excel.getCellData(sheetName, "Invalid Data", 2), "Send Invalid key in dob field");
        sa.assertEquals(dobErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 7));
        report("Verify Please enter valid Date of birth Error Message");
        sa.assertAll();
    }

    public void verifyPatientIsAlreadyRegisterWithEmailErrorMessage(int firstNameInAddPatientEnterRowNo, int lastNameInAddPatientEnterRowNo, int mobileNumberInAddPatientEnterRowNo, int birthDateInAddPatientEnterRowNo, int emailInAddPatientEnterRowNo, int homeAddressInAddPatientEnterRowNo, int zipCodeInAddPatientEnterRowNo) {
        enterPatientDetailsInAddPatientForm(firstNameInAddPatientEnterRowNo, lastNameInAddPatientEnterRowNo, mobileNumberInAddPatientEnterRowNo, birthDateInAddPatientEnterRowNo, emailInAddPatientEnterRowNo, homeAddressInAddPatientEnterRowNo, zipCodeInAddPatientEnterRowNo);
        click(okButtonOfAppointmentCategory, "Click on OK Button Of Appointment Category");
        sleep(1000);
        javascriptUsingClick(doneButtonInAddProfile, "Click on done button");
        sa.assertEquals(patientIsAlreadyRegisteredErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 8));
        report("Verify A Patient is already registered with this Email Error Message");
        sa.assertAll();
    }

    public void verifyPatientIsAlreadyRegisterWithMobileErrorMessage() {
        clearInputText(emailTextBoxInAddPatient);
        report("Clear the Email Text Box");
        javascriptUsingClick(doneButtonInAddProfile, "Click on done button");
        sa.assertEquals(patientIsAlreadyRegisteredErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 9));
        report("Verify A Patient is already registered with this Mobile Number Error Message");
        sa.assertAll();
    }

    public void addPatient(int firstNameInAddPatientEnterRowNo, int lastNameInAddPatientEnterRowNo, int mobileNumberInAddPatientEnterRowNo, int birthDateInAddPatientEnterRowNo, int emailInAddPatientEnterRowNo, int homeAddressInAddPatientEnterRowNo, int zipCodeInAddPatientEnterRowNo) {
        enterPatientDetailsInAddPatientForm(firstNameInAddPatientEnterRowNo, lastNameInAddPatientEnterRowNo, mobileNumberInAddPatientEnterRowNo, birthDateInAddPatientEnterRowNo, emailInAddPatientEnterRowNo, homeAddressInAddPatientEnterRowNo, zipCodeInAddPatientEnterRowNo);
        click(okButtonOfAppointmentCategory, "Click on OK Button Of Appointment Category");
        sleep(1000);
        javascriptUsingClick(doneButtonInAddProfile, "Click on done button");
        waitForLoader(loaderForAddPatient);
        sleep(1000);
        String PatientAddedToastedMessage = excel.getCellData(sheetName, "Labels", 2);
        WebElement successfullyAddedPatient = driver.findElement(By.xpath("//div[contains(text(),'" + PatientAddedToastedMessage + "')]"));
        sa.assertEquals(successfullyAddedPatient.getText(), excel.getCellData(sheetName, "Labels", 2));
        report("Verified Patient Added Successfully Toasted Message");
        waitForLoader(loader);
        waitForInvisibilityOfElement(toastedMessage);
        javascriptUsingClick(closeButtonOfProfileName, "Click On Close Button Of Patient Profile");
        sa.assertAll();
    }

    public void verifyGloballySearchPatient(int patientSearchGloballyEnterRowNo) {
        sendKeys(patientGloballySearch, excel.getCellData(sheetName, "Mobile Number", patientSearchGloballyEnterRowNo), "Enter patient in Globally Search Text Box");
        clickEnterButton(patientGloballySearch);
        report("Click On Enter Button Of Patient");
        click(patientSelectedInSearchBar, "Click on Patient Name");
        waitForLoader(loader);
        sleep(2000);
    }

    public void verifyDisplayPictureName(int verifyPatientNameEnterRowNo, int verifyPatientMobileNumberEnterRowNo) {
        waitForElementToBeDisplayed(patientName);
        sa.assertEquals(patientName.getText(), excel.getCellData(sheetName, "Patient Name", verifyPatientNameEnterRowNo));
        report("Verified Patient Display Picture Name");
        sa.assertEquals(patientNumber.getText(), excel.getCellData(sheetName, "Mobile Number", verifyPatientMobileNumberEnterRowNo));
        report("Verified Patient Mobile Number, is display on Display Picture");
        sleep(1000);
        sa.assertAll();
    }

    public void verifyPatientAppNotInstalled() throws Exception {
        takeScreenshot(patientAppInstalledImage, "Patient App Not Installed");
        report("");
        sleep(1000);
        imageComparison(patientAppInstalledImage, "Patient App Not Installed");
        sa.assertAll();
    }

    public void verifyProfile(int verifyFirstNameEnterRowNo, int verifyLastNameEnterRowNo, int verifyEmailEnterRowNo, int verifyPatientDOBEnterRowNo, int verifyPatientMobileNumberEnterRowNo, int verifyHomeAddressEnterRowNo, int verifyZipCodeEnterRowNo, int verifyCityEnterRowNo, int verifyStateEnterRowNo, int verifyCountryEnterRowNo) {
        click(editProfileButton, "Click On Edit Profile Button");
        waitForLoader(loaderForPatientProfile);
        WebElement[] labels = {firstNameTextBox, lastNameTextBox, patientEmailInProfile, patientDOBInProfile, patientMobileNumberInProfile, patientHomeAddressInProfile, zipCodeInProfile, cityInProfile, stateInProfile, countryInProfile};
        String[] colName = {"First Name", "Last Name", "Patient Email", "Patient DOB", "Mobile Number Verify", "Home Address", "Zip Code", "City", "State", "Country"};
        int[] colNumber = {verifyFirstNameEnterRowNo, verifyLastNameEnterRowNo, verifyEmailEnterRowNo, verifyPatientDOBEnterRowNo, verifyPatientMobileNumberEnterRowNo, verifyHomeAddressEnterRowNo, verifyZipCodeEnterRowNo, verifyCityEnterRowNo, verifyStateEnterRowNo, verifyCountryEnterRowNo};
        for (int i = 0; i < labels.length; i++) {
            waitForElementToBeDisplayed(labels[i]);
            sa.assertEquals(labels[i].getAttribute("value"), excel.getCellData(sheetName, colName[i], colNumber[i]));
            sa.assertAll();
        }
        sa.assertAll();
    }

    public void verifyAlreadyRegisterMobileNumberErrorMessage() {
        waitForElementToBeDisplayed(patientMobileNumberInProfile);
        sendKeys(patientMobileNumberInProfile, excel.getCellData(sheetName, "Mobile Number", 4), "Enter Already Registered Mobile Number");
        click(saveButtonInProfile, "Click On Save Button In Profile");
        waitForElementToBeDisplayed(toastedMessage);
        sa.assertEquals(toastedMessage.getText(), excel.getCellData(sheetName, "Error Messages", 18));
        click(toastedMessageClose, "Click On Cancel Button Of Toasted Message");
        click(cancelButtonInProfilePage, "Click On Cancel Button");
        sa.assertAll();
    }

    public void verifyAlreadyRegisterEmailErrorMessage() {
        click(editProfileButton, "Click On Edit Profile Button");
        waitForLoader(loaderForPatientProfile);
        sendKeys(patientEmailInProfile, excel.getCellData(sheetName, "Patient Email", 4), "Enter Already Registered Email");
        click(saveButtonInProfile, "Click On Save Button In Profile");
        waitForElementToBeDisplayed(toastedMessage);
        sleep(1000);
        sa.assertEquals(toastedMessage.getText(), excel.getCellData(sheetName, "Error Messages", 19));
        click(toastedMessageClose, "Click On Cancel Button Of Toasted Message");
        click(cancelButtonInProfilePage, "Click On Cancel Button");
        sa.assertAll();
    }

    public void verifyErrorMessagesInProfileWhenRemovingOldData() {
        click(editProfileButton, "Click On Edit Profile Button");
        waitForLoader(loaderForPatientProfile);
        WebElement[] clearBoxes = {firstNameTextBox, lastNameTextBox, patientEmailInProfile, patientMobileNumberInProfile, patientDOBInProfile,
                patientHomeAddressInProfile, zipCodeInProfile};
        clearAllTextBoxes(clearBoxes);
        click(saveButtonInProfile, "Click On Save Button In Profile");
        sa.assertEquals(firstNameErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 10));
        sa.assertEquals(lastNameErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 11));
        sa.assertEquals(mobileNumberErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 12));
        sa.assertEquals(dobErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 13));
        sa.assertEquals(homeAddressErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 14));
        sa.assertEquals(zipCodeErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 15));
        sa.assertAll();
    }

    public void verifyErrorMessageInMobile() {
        waitForElementToBeDisplayed(patientMobileNumberInProfile);
        sendKeys(patientMobileNumberInProfile, excel.getCellData(sheetName, "Invalid Data", 2), "Send Invalid Mobile Number");
        click(saveButtonInProfile, "Click On Save Button In Profile");
        sa.assertEquals(mobileNumberErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 16));
        click(cancelButtonInProfilePage, "Click On Cancel Button");
        sa.assertAll();
    }

    public void verifyErrorMessageZipCode() {
        click(editProfileButton, "Click On Edit Profile Button");
        clear(zipCodeInProfile, "Clear Zip Code");
        sendKeys(zipCodeInProfile, excel.getCellData(sheetName, "Invalid Data", 6), "Send Invalid Zip Code");
        click(saveButtonInProfile, "Click On Save Button In Profile");
        waitForElementToBeDisplayed(validZipCodeErrorMessageInProfilePage);
        sa.assertEquals(validZipCodeErrorMessageInProfilePage.getText(), excel.getCellData(sheetName, "Error Messages", 17));
        click(cancelButtonInProfilePage, "Click On Cancel Button");
        sa.assertAll();
    }

    public void editProfile(int editFirstNameProfileEnterRowNo, int editLastNameProfileEnterRowNo, int editPatientEmailProfileEnterRowNo, int editPatientMobileNumberProfileEnterRowNo, int editPatientDOBProfileEnterRowNo, int editPatientHomeAddressProfileEnterRowNo, int editZipCodeProfileEnterRowNo) {
        click(editProfileButton, "Click On Edit Profile Button");
        waitForLoader(loaderForPatientProfile);
        enterDetailsInProfile(editFirstNameProfileEnterRowNo, editLastNameProfileEnterRowNo, editPatientEmailProfileEnterRowNo, editPatientMobileNumberProfileEnterRowNo, editPatientDOBProfileEnterRowNo, editPatientHomeAddressProfileEnterRowNo, editZipCodeProfileEnterRowNo);
    }

    public void verifyEditedData(int verifyEditedPatientEmailProfileEnterRowNo, int verifyEditedPatientMobileNumberProfileEnterRowNo, int verifyEditedPatientDOBProfileEnterRowNo, int verifyEditedPatientHomeAddressProfileEnterRowNo, int verifyEditedZipCodeProfileEnterRowNo, int verifyEditedCityInProfileEnterRowNo, int verifyEditedStateInProfileEnterRowNo, int verifyEditedCountryInProfileEnterRowNo) {
        click(editProfileButton, "Click On Edit Profile Button");
        WebElement[] labels = {patientEmailInProfile, patientMobileNumberInProfile, patientDOBInProfile, patientHomeAddressInProfile, zipCodeInProfile, cityInProfile, stateInProfile, countryInProfile};
        String[] colName = {"Patient Email", "Mobile Number Verify", "Patient DOB", "Home Address", "Zip Code", "City", "State", "Country"};
        int[] colNumber = {verifyEditedPatientEmailProfileEnterRowNo, verifyEditedPatientMobileNumberProfileEnterRowNo, verifyEditedPatientDOBProfileEnterRowNo, verifyEditedPatientHomeAddressProfileEnterRowNo, verifyEditedZipCodeProfileEnterRowNo, verifyEditedCityInProfileEnterRowNo, verifyEditedStateInProfileEnterRowNo, verifyEditedCountryInProfileEnterRowNo};
        for (int i = 0; i < labels.length; i++) {
            waitForElementToBeDisplayed(labels[i]);
            sa.assertEquals(labels[i].getAttribute("value"), excel.getCellData(sheetName, colName[i], colNumber[i]));
            sa.assertAll();
        }
        sa.assertAll();
    }

    public void enterProfileData(int firstNameInProfileEnterRowNo, int lastNameInProfileEnterRowNo, int patientEmailInProfileEnterRowNo, int patientMobileNumberInProfileEnterRowNo, int patientDOBInProfileEnterRowNo, int patientHomeAddressProfileEnterRowNo, int zipCodeProfileEnterRowNo) {
        enterDetailsInProfile(firstNameInProfileEnterRowNo, lastNameInProfileEnterRowNo, patientEmailInProfileEnterRowNo, patientMobileNumberInProfileEnterRowNo, patientDOBInProfileEnterRowNo, patientHomeAddressProfileEnterRowNo, zipCodeProfileEnterRowNo);
        click(closeButtonOfProfileName, "Click In Close Button Of Profile Name");
    }

    public void verifyPatientAppInstalled(int verifyPatientSearchByEnterRowNo, int verifyPatientNameEnterRowNo, int verifyPatientMobileNumberEnterRowNo) throws Exception {
        verifyGloballySearchPatient(verifyPatientSearchByEnterRowNo);
        waitForElementToBeDisplayed(patientName);
        sa.assertEquals(patientName.getText(), excel.getCellData(sheetName, "Patient Name", verifyPatientNameEnterRowNo));
        sa.assertEquals(patientNumber.getText(), excel.getCellData(sheetName, "Mobile Number", verifyPatientMobileNumberEnterRowNo));
        sleep(1000);
        takeScreenshot(patientAppInstalledImage, "Patient App Installed");
        sleep(1000);
        imageComparison(patientAppInstalledImage, "Patient App Installed");
        sleep(1000);
        click(closeButtonOfProfileName, "Click In Close Button Of Profile Name");
        sa.assertAll();
    }

    public void verifyPatientAppInUse(int patientSearchByGloballyEnterRowNo, int patientNameEnterRowNo, int patientMobileNumberEnterRowNo) throws Exception {
        verifyGloballySearchPatient(patientSearchByGloballyEnterRowNo);
        sa.assertEquals(patientName.getText(), excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNo));
        sa.assertEquals(patientNumber.getText(), excel.getCellData(sheetName, "Mobile Number", patientMobileNumberEnterRowNo));
        sleep(1000);
        takeScreenshot(patientAppInstalledImage, "Patient App In Use");
        sleep(1000);
        imageComparison(patientAppInstalledImage, "Patient App In Use");
        click(closeButtonOfProfileName, "Click In Close Button Of Profile Name");
        physicianLoginPage.logout();
        sa.assertAll();
    }

}