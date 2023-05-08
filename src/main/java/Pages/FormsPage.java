package Pages;

import base.TestBase;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static util.TestUtil.*;
import static util.TestUtil.Upload_file;

public class FormsPage extends TestBase {
    CommonPage commonPage = new CommonPage();
    PatientLoginPage patientLoginPage = new PatientLoginPage();
    PhysicianLoginPage physicianLoginPage = new PhysicianLoginPage();
    String sheetName = "Forms";

    @FindBy(xpath = "(//button[@class='btn btn-outline-primary min-w160'])[1]")
    WebElement shareIntakeFormButton;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[11]//div[2]")
    WebElement loaderWhenOpenIntakeForm;

    @FindBy(xpath = "(//button[@class='btn btn-outline-primary min-w160'])[2]")
    WebElement shareInformedConsentForm;

    @FindBy(xpath = "(//button[@class='btn btn-outline-primary min-w160'])[3]")
    WebElement shareScreeningForm;

    @FindBy(xpath = "//input[@placeholder='Search Intake Forms']")
    WebElement searchBarForIntakeForm;

    @FindBy(xpath = "//input[@placeholder='Search Screening Forms']")
    WebElement searchBarForScreeningForm;

    @FindBy(xpath = "//i[@class='annicon-cross ng-star-inserted']")
    WebElement searchFormCloseButton;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary min-w150']")
    WebElement cancelButtonOfIntakeForm;

    @FindBy(xpath = "//button[@class='btn btn-md btn-outline-primary yn-btn-wd mr-3']")
    WebElement cancelButtonOfScreeningForm;

    @FindBy(xpath = "//button[@class='btn btn-primary min-w150 ng-star-inserted']")
    WebElement okButtonOfIntakeForm;

    @FindBy(xpath = "//input[@name='stringInput']")
    List<WebElement> firstNameOfIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[1]")
    WebElement verifyFirstNameIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[2]")
    WebElement verifyLastNameIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[3]")
    WebElement verifyEmailOfIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[4]")
    WebElement verifyCellPhoneOfIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[5]")
    WebElement verifyAddressOfIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[6]")
    WebElement verifyCityOfIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[7]")
    WebElement verifyStateOfIntakeForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[8]")
    WebElement verifyZipCodeOfIntakeForm;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[1]/div[2]")
    WebElement loaderWhenIntakeFormOpen;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[11]/div[2]")
    WebElement loaderWhenAddForm;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[12]/div[2]")
    WebElement loaderOfAddForm;

    @FindBy(xpath = "//button[@id='save-button']")
    WebElement saveButtonOfAddForm;

    @FindBy(xpath = "//div[@class='position-relative surland-search']/input")
    WebElement searchFormOfInformedConsentForm;

    @FindBy(xpath = "//i[@class='annicon-checkmark text-primary linksel-ico']")
    WebElement selectedFormImageVerify;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary yn-btn-wd']")
    WebElement okButtonOfInformedConsentForm;

    @FindBy(xpath = "//div[@class='modal-body ann-popup__body text-center mb-0 pb-0']/p")
    WebElement pleaseSelectFormErrorMessageInInformedConsentForm;

    @FindBy(xpath = "//button[@class='btn btn-apurple-outline btn-width-120']")
    WebElement cancelButtonOfForm;

    @FindBy(xpath = "(//button[@class='btn btn-width-120 btn-apurple-outline ng-star-inserted'])[3]")
    WebElement closeButtonOfForm;

    @FindBy(xpath = "(//button[@class='btn btn-width-120 btn-apurple-outline ng-star-inserted'])[2]")
    WebElement closeButtonOfAboutMePreviousForm;

    @FindBy(xpath = "//i[.=' Not Filled ']")
    WebElement notFilledStatus;

    @FindBy(xpath = "(//button[@class='btn btn-width-120 btn-apurple-outline ng-star-inserted'])[2]")
    WebElement editButtonOfIntakeForm;

    @FindBy(xpath = "//button[@class='btn btn-apurple btn-width-120']")
    WebElement saveButtonOfForm;

    @FindBy(xpath = "//button[@class='btn btn-width-120 btn-apurple ng-star-inserted']")
    WebElement nextButtonOfForm;

    @FindBy(xpath = "(//button[@class='btn btn-width-120 btn-apurple-outline ng-star-inserted'])[1]")
    WebElement printButtonOfForm;

    @FindBy(xpath = "//button[@class='btn btn-width-120 btn-apurple-outline mt-3']")
    WebElement closeButtonOfPrintForm;

    @FindBy(xpath = "//button[@class='btn btn-apurple-outline btn-width-120']")
    WebElement cancelButtonOfAboutMeSecondForm;

    @FindBy(xpath = "//button[@class='btn btn-apurple btn-width-120']")
    WebElement saveButtonOfAboutMeSecondForm;

    @FindBy(xpath = "//h3[@class='intke-ttle']")
    WebElement labelAboutMe;

    @FindBy(xpath = "//div[@class='tp-menu']/div[2]/a")
    WebElement closeButtonOfProfileName;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-sorbet']/span")
    WebElement addButtonOfInformedConsentForm;

    @FindBy(xpath = "(//button[@class='btn btn-md btn-outline-primary bt-pr-btm hsc-btn-wd'])[2]")
    WebElement cancelButtonOfAddNewInformedConsentForm;

    @FindBy(xpath = "//input[@id='form-name']")
    WebElement formNameTextBox;

    @FindBy(xpath = "//input[@id='typeahead-group']")
    WebElement groupNameTextBox;

    @FindBy(xpath = "//input[@formControlName='field1Lable']")
    WebElement labelOneTextBox;

    @FindBy(xpath = "//input[@formControlName='field2Lable']")
    WebElement labelTwoTextBox;

    @FindBy(xpath = "//input[@id='isFieldLable1Curly']")
    WebElement curlyBoxOne;

    @FindBy(xpath = "//input[@id='isFieldLable2Curly']")
    WebElement curlyBoxTwo;

    @FindBy(xpath = "//textarea[@id='consent-text']")
    WebElement consentTextBox;

    @FindBy(xpath = "//input[@formcontrolname='item']")
    WebElement tags;

    @FindBy(xpath = "//input[@name='file']")
    WebElement uploadFile;

    @FindBy(xpath = "(//button[@class='btn btn-same-width btn-apurple-outline'])[1]")
    WebElement closeButtonOfInformedConsentForm;

    @FindBy(xpath = "//button[@class='btn btn-same-width btn-apurple ng-star-inserted']")
    WebElement signButtonOfInformedConsentForm;

    @FindBy(xpath = "//button[@class='btn btn-same-width btn-apurple ng-star-inserted']")
    WebElement agreeButtonOfInformedConsentForm;

    @FindBy(xpath = "(//button[@class='btn btn-same-width btn-apurple-outline'])[1]")
    WebElement closeButtonOfInformedConsentFormByFilledForm;

    @FindBy(xpath = "//input[@id='lable1-value-input']")
    WebElement labelOneOfInformedConsentFormByFilledForm;

    @FindBy(xpath = "//input[@id='lable2-value-input']")
    WebElement labelTwoOfInformedConsentFormByFilledForm;

    @FindBy(xpath = "(//div[@class='col d-flex flex-column'])[5]/div/h6")
    WebElement InformedConsentFormIsVerified;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary yn-btn-wd']")
    WebElement okButtonOfScreeningForm;

    @FindBy(xpath = "//a[@class='btn btn-outline-primary ng-tns-c11-0 ng-star-inserted']")
    WebElement closeButtonOfScreeningForm;

    @FindBy(xpath = "(//div[@class='c-btn']/span[@class='ng-star-inserted'])[1]")
    WebElement selectDropdownOfScreeningForm;

    @FindBy(xpath = "//button[@class='btn btn-same-width btn-apurple ng-star-inserted']")
    WebElement submitButtonOfScreeningForm;

    @FindBy(xpath = "//div[@class='modal-body ann-popup__body text-center mb-0 pb-0']/p")
    WebElement pleaseSelectIntakeFormErrorMessage;

    @FindBy(xpath = "//div[@class='modal-footer border-top-0']/button")
    WebElement okButtonOfFormPopup;

    @FindBy(xpath = "//li[.=' Screening Forms ']")
    WebElement screeningFormLabel;

    @FindBy(xpath = "((//ul[@class='list-group block-ui__element ng-star-inserted'])[2]//h6)[1]")
    WebElement screeningFormFilledStatus;

    @FindBy(xpath = "//div[@class='form-group ng-star-inserted']/label")
    List<WebElement> aboutMeLabels;

    @FindBy(xpath = "//div[@class='ng-star-inserted']/p")
    List<WebElement> errorMessagesLabel;


    /**********************CommonMethod*********************/
    public void verifyFormsByPatient(int formsNameEnterRowNo) {
        WebElement verifyForm = driver.findElement(By.xpath("//i[.='Intake Form']"));
        sa.assertEquals(verifyForm.getText(), excel.getCellData(sheetName, "Forms Name", formsNameEnterRowNo));
        sa.assertAll();
    }

    public void verifyStatusOfIntakeForm(int[] rowNoForElement, int[] rowNo) {
        for (int i = 0; i < rowNo.length; i++) {
            String filledStatusVerifying = excel.getCellData(sheetName, "Labels", rowNoForElement[i]);
            WebElement verifyStatus = driver.findElement(By.xpath("//h6[.='" + filledStatusVerifying + "']"));
            sa.assertEquals(verifyStatus.getText(), excel.getCellData(sheetName, "Labels", rowNo[i]));
            sa.assertAll();
        }
    }

    public void selectButtonYes(String selectLabelOfDropdownColumnName, int[] labelName, int[] yesNoLabel, int[] selectedValue) {
        for (int i = 0; i < 3; i++) {
            String selectLabelOfDropdown = excel.getCellData(sheetName, selectLabelOfDropdownColumnName, labelName[i]);
            String selectYesNoButton = excel.getCellData(sheetName, "Options In Dropdown", yesNoLabel[i]);
            WebElement selectYesOrNoButton = driver.findElement(By.xpath("//label[.='" + selectLabelOfDropdown + "']//following::label[.='" + selectYesNoButton + "']"));
            click(selectYesOrNoButton, "Click On Yes/No Button");
            String selectValueFromLabel = excel.getCellData(sheetName, "Options In Dropdown", selectedValue[i]);
            WebElement selectFormValue = driver.findElement(By.xpath("//label[.='" + selectYesNoButton + "']//following::label[.='" + selectValueFromLabel + "']"));
            click(selectFormValue, "Click On Selected Form Value");
            sleep(1000);
        }
    }

    public void selectButtonNo(int[] labelName, int[] yesNoLabel) {
        for (int i = 0; i < labelName.length; i++) {
            String selectLabelOfDropdown = excel.getCellData(sheetName, "About Me", labelName[i]);
            String selectYesNoButton = excel.getCellData(sheetName, "Options In Dropdown", yesNoLabel[i]);
            WebElement selectYesOrNoButton = driver.findElement(By.xpath("//label[.='" + selectLabelOfDropdown + "']//following::label[.='" + selectYesNoButton + "']"));
            click(selectYesOrNoButton, "Click On Yes/No Button");
        }
    }

    public void fillIntakeFormByPatient() {
        String formName = excel.getCellData(sheetName, "Forms Name", 2);
        WebElement fillForm = driver.findElement(By.xpath("//i[.='" + formName + "']"));
        click(fillForm, "Click On Fill Form");
        waitForLoader(loaderWhenIntakeFormOpen);
        sleep(2000);
        sa.assertEquals(verifyFirstNameIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 2));
        sa.assertEquals(verifyLastNameIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 3));
        sa.assertEquals(verifyEmailOfIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 4));
        sa.assertEquals(verifyCellPhoneOfIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 5));
        sa.assertEquals(verifyAddressOfIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 7));
        sa.assertEquals(verifyCityOfIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 8));
        sa.assertEquals(verifyStateOfIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 9));
        sa.assertEquals(verifyZipCodeOfIntakeForm.getAttribute("value"), excel.getCellData(sheetName, "Patient Info", 10));
        String labels = excel.getCellData(sheetName, "Relationship", 1);
        WebElement labelRelationshipOfIntakeForm = driver.findElement(By.xpath("//label[.='" + labels + "']"));
        scrollTillTheElementIsDisplay(labelRelationshipOfIntakeForm);
        sa.assertEquals(labelRelationshipOfIntakeForm.getText(), excel.getCellData(sheetName, "Relationship", 1));
        String RelationshipElement = excel.getCellData(sheetName, "Relationship", 2);
        WebElement selectRelationship = driver.findElement(By.xpath("//label[.='" + RelationshipElement + "']"));
        scrollTillTheElementIsDisplay(labelRelationshipOfIntakeForm);
        click(selectRelationship, "Click On label Relationship Of Intake Form");
        String OccupationElement = excel.getCellData(sheetName, "Occupation Details", 2);
        WebElement selectOccupation = driver.findElement(By.xpath("//label[.='" + OccupationElement + "']"));
        scrollTillTheElementIsDisplay(labelRelationshipOfIntakeForm);
        click(selectOccupation, "Click On label Relationship Of Intake Form");
        sa.assertAll();
    }

    public void clickOnNextButton() {
        sleep(2000);
        String buttonLabel = excel.getCellData(sheetName, "Labels", 10);
        Boolean selectNextButton = driver.findElements(By.xpath("//div[@class='ng-star-inserted']//button[.='" + buttonLabel + "']")).size() > 0;
        if (selectNextButton) {
            System.out.println("Click on Next Button");
            WebElement selectNextButtonOfElement = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='Next']"));
            click(selectNextButtonOfElement, "Click On Next Button Of Element");
        } else {
            System.out.println("Next Button Not Display");
        }

        sleep(3000);
    }

    public void clickOnSaveButton() {
        sleep(3000);
        String saveButtonLabel = excel.getCellData(sheetName, "Labels", 9);
        Boolean saveButtonDisplay = driver.findElements(By.xpath("//div[@class='ng-star-inserted']//button[.='" + saveButtonLabel + "']")).size() > 0;
        if (saveButtonDisplay) {
            System.out.println("Click on Save Button");
            WebElement saveButton = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + saveButtonLabel + "']"));
            click(saveButton, "Click On Cancel Button");
        } else {
            System.out.println("Save Button Not Display");
        }
        sleep(2000);
    }

    /**************************End Of Common Method***********************/

    public void wayToFormsPage() {
        sleep(2000);
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 5));
        sleep(5000);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 3));
    }

    public void verifyErrorMessageWithoutFillIntakeForm() {
        sleep(2000);
        scrollTillTheElementIsDisplay(shareIntakeFormButton);
        click(shareIntakeFormButton, "Click On Share Intake Form");
        waitForLoader(loaderWhenOpenIntakeForm);
        waitForElementToBeDisplayed(shareIntakeFormButton);
        javascriptUsingClick(okButtonOfIntakeForm, "Click On Ok Button In Intake Form");
        sa.assertEquals(pleaseSelectIntakeFormErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        javascriptUsingClick(okButtonOfFormPopup, "Click On Intake Form");
        click(cancelButtonOfIntakeForm, "Click on cancel button of Intake Form");
        sa.assertAll();
    }

    public void selectIntakeForm(int SelectFormRowNumber) {
        scrollTillTheElementIsDisplay(shareIntakeFormButton);
        javascriptUsingClick(shareIntakeFormButton, "Click On Share Intake Form");
        waitForLoader(loaderWhenOpenIntakeForm);
        sendKeys(searchBarForIntakeForm, excel.getCellData(sheetName, "Intake Forms", SelectFormRowNumber).trim(), "Send Keys In Search Bar");
        click(searchFormCloseButton, "Click On Close Button Of Implant");
        String selectFormInSheet = excel.getCellData(sheetName, "Intake Forms", SelectFormRowNumber);
        WebElement selectForm = driver.findElement(By.xpath("//li[@class='row prlist align-items-center ng-star-inserted']/div[.='" + selectFormInSheet + "']"));
        javascriptUsingClick(selectForm, "Click On Select Form");
        waitForElementToBeDisplayed(cancelButtonOfIntakeForm);
        javascriptUsingClick(cancelButtonOfIntakeForm, "Click On Cancel Button Of Intake Form");
    }

    public void shareIntakeForm(int SelectFormRowNumber) {
        scrollTillTheElementIsDisplay(shareIntakeFormButton);
        javascriptUsingClick(shareIntakeFormButton, "Click On Share Intake Form");
        waitForLoader(loaderWhenOpenIntakeForm);
        sendKeys(searchBarForIntakeForm, excel.getCellData(sheetName, "Intake Forms", SelectFormRowNumber).trim(), "Send Keys In Search Bar");
        String selectFormInSheet = excel.getCellData(sheetName, "Intake Forms", SelectFormRowNumber);
        WebElement selectForm = driver.findElement(By.xpath("//li[@class='row prlist align-items-center ng-star-inserted']/div[.='" + selectFormInSheet + "']"));
        click(selectForm, "Click On Select Form");
        waitForElementToBeDisplayed(okButtonOfIntakeForm);
        javascriptUsingClick(okButtonOfIntakeForm, "Click On Ok Button In Intake Form");
    }

    public void verifySharedIntakeForm() {
        for (int i = 0; i < 4; i++) {
            String FormName = excel.getCellData(sheetName, "Intake Forms Verify1", i + 2);
            WebElement sharedIntakeForm = driver.findElement(By.xpath("//div[@class='col d-flex flex-column']//span[.='" + FormName + "']"));
            sa.assertEquals(sharedIntakeForm.getText(), excel.getCellData(sheetName, "Intake Forms Verify", i + 2));
            sa.assertAll();
        }
    }

    public void verifyFormInPatientLogin() {
        driver.get(getPropertyValueByKey("patientUrl"));
        patientLoginPage.successfulLoginInPatient(6, 2, 3, 2);
        String selectFormTab = excel.getCellData(sheetName, "Labels", 3);
        WebElement selectTab = driver.findElement(By.xpath("//ul[@class='tabwrapper']/li[.='" + selectFormTab + "']"));
        javascriptUsingClick(selectTab, "Click On Implant Label");
        verifyFormsByPatient(2);
        sleep(3000);
    }

    public void verifyCloseButtonOfIntakeForm() {
        String selectForm = excel.getCellData(sheetName, "Forms Name", 2);
        WebElement fillForm = driver.findElement(By.xpath("//i[.='" + selectForm + "']"));
        click(fillForm, "Click On Fill Form");
        sleep(5000);
        String saveLabel = excel.getCellData(sheetName, "Labels", 9);
        Boolean saveButtonDisplay = driver.findElements(By.xpath("//div[@class='ng-star-inserted']//button[.='" + saveLabel + "']")).size() > 0;
        if (saveButtonDisplay) {
            WebElement saveButton = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + saveLabel + "']"));
            click(saveButton, "Click On Save Button");
        } else {

        }
        sleep(3000);
        String closeLabel = excel.getCellData(sheetName, "Labels", 11);
        WebElement closeButtonOfDemographicInformation = driver.findElement(By.xpath("(//div[@class='ng-star-inserted']//button[.='" + closeLabel + "'])[2]"));
        javascriptUsingClick(closeButtonOfDemographicInformation, "Click On Close Button");
        sleep(2000);
    }

    public void clickToNextFormOpenInIntakeForm() {
        sleep(2000);
        String formLabel = excel.getCellData(sheetName, "Forms Name", 2);
        WebElement formLabels = driver.findElement(By.xpath("//i[.='" + formLabel + "']"));
        javascriptUsingClick(formLabels, "Click On Fill Form");
        sleep(2000);
        String buttonLabel = excel.getCellData(sheetName, "Labels", 10);
        do {
            clickOnNextButton();
            clickOnSaveButton();
        } while (driver.findElements(By.xpath("//div[@class='ng-star-inserted']//button[.='" + buttonLabel + "']")).size() > 0);

        String doneButtonLabel = excel.getCellData(sheetName, "Labels", 12);
        WebElement doneOfMySurgicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + doneButtonLabel + "']"));
        click(doneOfMySurgicalHistory, "Click On Done Button");
    }

    public void verifyEditButtonOfForm() {
        String formLabel = excel.getCellData(sheetName, "Forms Name", 2);
        WebElement fillForm = driver.findElement(By.xpath("//i[.='" + formLabel + "']"));
        click(fillForm, "Click On Fill Form");
        sleep(2000);
        click(editButtonOfIntakeForm, "Click On Edit Button");
        String OccupationElement = excel.getCellData(sheetName, "Occupation Details", 3);
        WebElement selectOccupation = driver.findElement(By.xpath("//label[.='" + OccupationElement + "']"));
        scrollTillTheElementIsDisplay(selectOccupation);

        click(selectOccupation, "Click On label Relationship Of Intake Form");
        click(saveButtonOfForm, "Click On Save Button");
        waitForLoader(loaderWhenIntakeFormOpen);
    }

    public void verifyPrintButtonOfForm() {
        click(printButtonOfForm, "Click On Print Button Of Form");
        sleep(1000);
        click(closeButtonOfPrintForm, "Click On Print Button Of Close Form");
    }

    public void verifyNextButton() {
        click(nextButtonOfForm, "Click On Next Button Of Form");
        sleep(2000);
    }

    public void editMedicalHistory() {
        String editButtonLabel = excel.getCellData(sheetName, "Labels", 13);
        WebElement editOfMedicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + editButtonLabel + "']"));
        click(editOfMedicalHistory, "Click On edit Button");
    }

    public void verifySaveButtonOfAboutMeSecondFormInIntakeForm() {
        sleep(2000);
        int[] labelName = {2, 3, 4};
        int[] yesNoLabel = {2, 2, 2};
        int[] selectedValue = {4, 5, 6};
        selectButtonYes("About Me", labelName, yesNoLabel, selectedValue);
        int[] labelNameForNoButton = {5, 6, 7};
        int[] noLabel = {3, 3, 3};
        selectButtonNo(labelNameForNoButton, noLabel);
        click(saveButtonOfAboutMeSecondForm, "Click On Save Button");
        sleep(10000);
        String nextButtonLabel = excel.getCellData(sheetName, "Labels", 10);
        WebElement selectNextButton = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + nextButtonLabel + "']"));
        click(selectNextButton, "Click On Next Button");
        waitForLoader(loaderWhenIntakeFormOpen);
        String editButtonLabel = excel.getCellData(sheetName, "Labels", 13);
        WebElement editOfMedicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + editButtonLabel + "']"));
        click(editOfMedicalHistory, "Click On edit Button");
        int[] labelNameForNoButtonInMedicalHistory = {8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
        int[] noLabelInMedicalHistory = {3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        selectButtonNo(labelNameForNoButtonInMedicalHistory, noLabelInMedicalHistory);
        String saveButtonLabel = excel.getCellData(sheetName, "Labels", 9);
        WebElement saveOfMedicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + saveButtonLabel + "']"));
        click(saveOfMedicalHistory, "Click On Save Button");
        waitForLoader(loaderWhenIntakeFormOpen);
        sleep(3000);
        WebElement selectNextButtonOfMedicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + nextButtonLabel + "']"));
        click(selectNextButtonOfMedicalHistory, "Click On Next Button");
        waitForLoader(loaderWhenIntakeFormOpen);
        WebElement editOfMySurgicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + editButtonLabel + "']"));
        click(editOfMySurgicalHistory, "Click On edit Button");
        int[] labelNameForNoButtonInMySurgicalHistory = {23, 24, 25};
        int[] noLabelInMySurgicalHistory = {3, 3, 3};
        selectButtonNo(labelNameForNoButtonInMySurgicalHistory, noLabelInMySurgicalHistory);
        WebElement saveOfMySurgicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + saveButtonLabel + "']"));
        click(saveOfMySurgicalHistory, "Click On Save Button");
        waitForLoader(loaderWhenIntakeFormOpen);
        String doneButtonLabel = excel.getCellData(sheetName, "Labels", 12);
        WebElement doneOfMySurgicalHistory = driver.findElement(By.xpath("//div[@class='ng-star-inserted']//button[.='" + doneButtonLabel + "']"));
        click(doneOfMySurgicalHistory, "Click On Save Button");
        sleep(2000);
        patientLoginPage.logoutPatient();
    }

    public void verifyStatusOfFormInSurgeonLogin() {
        driver.get(getPropertyValueByKey("url"));
        physicianLoginPage.successfulLogin();
        wayToFormsPage();
        int[] rowNo = {7, 7, 7, 7};
        int[] rowNoForElement = {6, 6, 6, 6};
        verifyStatusOfIntakeForm(rowNoForElement, rowNo);
        click(closeButtonOfProfileName, "Click On Close Button Of Profile Name");
//        physicianLoginPage.logout();
    }

    /*******************************Informed Consent Forms***************/
    public void wayToInformedConsentForms() {
        driver.get(getPropertyValueByKey("url"));
        physicianLoginPage.successfulLogin();
        wayToFormsPage();
        click(shareInformedConsentForm, "Click On Informed Consent Forms");
    }

    public void verifyErrorMessageInformedConsentFormWithoutSelectAnyForm() {
        click(okButtonOfInformedConsentForm, "Click On Ok Button");
        sleep(2000);
        sa.assertEquals(pleaseSelectFormErrorMessageInInformedConsentForm.getText(), excel.getCellData(sheetName, "Error Messages", 3));
        click(okButtonOfFormPopup, "Click On Intake Form");
        sa.assertAll();
    }

    public void verifyErrorMessageInAddInformedConsentForm() {
        for (int i = 0; i < errorMessagesLabel.size(); i++) {
            sa.assertEquals(errorMessagesLabel.get(i).getText(), excel.getCellData(sheetName, "Error Messages", i + 4));
            sa.assertAll();
        }
    }

    public void addInformedConsentForm() {
        sleep(2000);
        click(addButtonOfInformedConsentForm, "Click On Add Button Of Informed Consent Form");
        sleep(2000);
    }

    public void verifyCancelButtonOfNewInformedConsentForm() {
        sleep(2000);
        click(cancelButtonOfAddNewInformedConsentForm, "Click On Cancel Button Of Informed Consent Form");
    }

    public void fillAddNewInformedConsentForm() throws Exception {
        addInformedConsentForm();
        sendKeys(formNameTextBox, excel.getCellData(sheetName, "Form Name In Informed Consent Form", 2), "Send Keys In Form Name Field");
        sendKeys(groupNameTextBox, excel.getCellData(sheetName, "Group Name In Informed Consent Form", 2), "Send Keys In Group Name Text Box Field");
        clickEnterButton(groupNameTextBox);
        sendKeys(labelOneTextBox, excel.getCellData(sheetName, "Label One", 2), "Send Keys In Label One Text Box Field");
        sendKeys(labelTwoTextBox, excel.getCellData(sheetName, "Label Two", 2), "Send Keys In Label One Text Box Field");
        click(curlyBoxOne, "Click On Curly Box Of Label 1");
        click(curlyBoxTwo, "Click On Curly Box Of Label 2");
        sendKeys(consentTextBox, excel.getCellData(sheetName, "Consent Text", 2), "Send Keys In Consent Text Box");
        sendKeys(tags, excel.getCellData(sheetName, "Tags", 2), "Send Keys In Tags");
        clickEnterButton(tags);
        javascriptUsingClick(uploadFile, "Click On Upload File");
        sleep(3000);
        String fileUploadPath = "/Users/suyogshinde/Downloads/test.pdf";
        Upload_file(fileUploadPath);
        sleep(10000);
        waitForLoader(loaderWhenAddForm);
        click(saveButtonOfAddForm, "Click On Save Button");
        waitForLoader(loaderOfAddForm);
    }

    public void searchInformedConsentForm() throws Exception {
        sleep(4000);
        sendKeys(searchFormOfInformedConsentForm, excel.getCellData(sheetName, "Form Name In Informed Consent Form", 2).trim(), "Send Keys In Informed Consent Form");
        clickEnterButton(searchFormOfInformedConsentForm);
        imageComparison(selectedFormImageVerify, "Selected Form Image");
        click(okButtonOfInformedConsentForm, "Click On Ok Button");
        sleep(2000);
        click(closeButtonOfProfileName, "Click On Close Button");
        sleep(3000);
        physicianLoginPage.logout();
        sleep(2000);
    }

    public void verifyInformedConsentFormInPatientLogin() {
        driver.get(getPropertyValueByKey("patientUrl"));
        patientLoginPage.successfulLoginInPatient(5, 2, 3, 2);
        String verifyingFillForm = excel.getCellData(sheetName, "Form Name In Informed Consent Form", 2);
        WebElement fillForm = driver.findElement(By.xpath("//i[.='" + verifyingFillForm + "']"));
        javascriptUsingClick(fillForm, "Click On Fill Form");
    }

    public void verifyCloseButtonOfInformedConsentForm() {
        sleep(2000);
        click(closeButtonOfInformedConsentForm, "Click On Cancel Button Of Form");
    }

    public void verifySignInButtonOfForm() {
        String verifyingFillForm = excel.getCellData(sheetName, "Form Name In Informed Consent Form", 2);
        WebElement fillForm = driver.findElement(By.xpath("//i[.='" + verifyingFillForm + "']"));
        click(fillForm, "Click On Fill Form");
        sleep(1000);
        click(signButtonOfInformedConsentForm, "Click On Sign Button");
    }

    public void verifyAddedForm() {
        String labelOneVerifying = excel.getCellData(sheetName, "Label One", 3);
        WebElement labelOne = driver.findElement(By.xpath("//label[.='" + labelOneVerifying + "']"));
        sa.assertEquals(labelOne.getText(), excel.getCellData(sheetName, "Label One", 2));
        String labelTwoVerifying = excel.getCellData(sheetName, "Label Two", 3);
        WebElement labelTwo = driver.findElement(By.xpath("//label[.='" + labelTwoVerifying + "']"));
        sa.assertEquals(labelTwo.getText(), excel.getCellData(sheetName, "Label Two", 2));
        sa.assertAll();
    }

    public void verifyCloseButtonOfFormInInformedConsentForm() {
        click(closeButtonOfInformedConsentFormByFilledForm, "Click On Close Button");
    }

    public void verifyAgreeButtonOfInformedConsentForm() {
        String filledFormName = excel.getCellData(sheetName, "Form Name In Informed Consent Form", 2);
        WebElement fillForm = driver.findElement(By.xpath("//i[.='" + filledFormName + "']"));
        click(fillForm, "Click On Fill Form");
        click(signButtonOfInformedConsentForm, "Click On Sign Button");
        sendKeys(labelOneOfInformedConsentFormByFilledForm, excel.getCellData(sheetName, "Label One", 4), "Label Of One");
        sendKeys(labelTwoOfInformedConsentFormByFilledForm, excel.getCellData(sheetName, "Label Two", 4), "Label Of Two");
        click(agreeButtonOfInformedConsentForm, "Click On I Agree Button");
        waitForLoader(loaderWhenIntakeFormOpen);
        patientLoginPage.logoutPatient();
    }

    public void verifyFilledFormBySurgeon() {
        driver.get(getPropertyValueByKey("url"));
        physicianLoginPage.successfulLogin();
        wayToFormsPage();
        sa.assertEquals(InformedConsentFormIsVerified.getText(), excel.getCellData(sheetName, "Filled Status", 4));
        click(closeButtonOfProfileName, "Click On Close Button Of Profile Name");
        sleep(2000);
        physicianLoginPage.logout();
        sa.assertAll();
    }

    /***************************************************Screening Forms***************************************/
    public void wayToScreeningForms() {
        driver.get(getPropertyValueByKey("url"));
        physicianLoginPage.successfulLogin();
        wayToFormsPage();
        click(shareScreeningForm, "Click On Share Form");
        sleep(2000);
    }

    public void verifyErrorMessageInScreeningForm() {
        sleep(2000);
        click(okButtonOfScreeningForm, "Click On Ok Button");
        sa.assertEquals(pleaseSelectIntakeFormErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 3));
        click(okButtonOfFormPopup, "Click On Intake Form");
        sa.assertAll();
    }

    public void verifyCancelButtonOfScreeningForm() {
        click(cancelButtonOfScreeningForm, "Click On Cancel Button Of Screening Form");
    }

    public void searchOfFormInScreeningForm() {
        click(shareScreeningForm, "Click On Share Form");
        sleep(2000);
        sendKeys(searchBarForScreeningForm, excel.getCellData(sheetName, "Screening Forms", 2).trim(), "Send keys into search bar");
        clickEnterButton(searchBarForScreeningForm);
    }

    public void selectFormInScreeningForm() {
        String selectFormInScreeningForm = excel.getCellData(sheetName, "Screening Forms", 2);
        WebElement selectForm = driver.findElement(By.xpath("//span[.='" + selectFormInScreeningForm + "']"));
        click(selectForm, "Click On Selected Form");
        click(okButtonOfScreeningForm, "Click On Ok Button");
        sleep(2000);
        click(closeButtonOfProfileName, "Click On Close Button Of Profile Name");
        physicianLoginPage.logout();
        sleep(2000);
    }

    public void verifyScreeningFormInPatient() {
        driver.get(getPropertyValueByKey("patientUrl"));
        patientLoginPage.successfulLoginInPatient(5, 2, 3, 2);
        String selectFormTab = excel.getCellData(sheetName, "Labels", 3);
        WebElement selectTab = driver.findElement(By.xpath("//ul[@class='tabwrapper']/li[.='" + selectFormTab + "']"));
        javascriptUsingClick(selectTab, "Click On Implant Label");
        sleep(2000);
    }

    public void formFilledByPatient() {
        String screeningFormLabel = excel.getCellData(sheetName, "Forms Name", 4);
        WebElement selectForm = driver.findElement(By.xpath("//i[.='" + screeningFormLabel + "']"));
        click(selectForm, "Click On Selected Form");
        click(selectDropdownOfScreeningForm, "Click On Select Button");
        String dropdownLabel = excel.getCellData(sheetName, "Forms Name", 8);
        WebElement selectValueInDropdown = driver.findElement(By.xpath("//label[.='" + dropdownLabel + "']"));
        click(selectValueInDropdown, "Click On Dropdown Value");
        click(submitButtonOfScreeningForm, "Click On Submit Button");
        waitForLoader(loaderWhenIntakeFormOpen);
        patientLoginPage.logoutPatient();
        sleep(2000);
    }

    public void verifyingScreeningFormFilledByPhysician() {
        driver.get(getPropertyValueByKey("url"));
        physicianLoginPage.successfulLogin();
        wayToFormsPage();
        sleep(2000);
        String screeningFormLabel = excel.getCellData(sheetName, "Forms Name", 3);
        WebElement screeningForm = driver.findElement(By.xpath("//li[.='" + screeningFormLabel + "']"));
        scrollTillTheElementIsDisplay(screeningForm);
        sa.assertEquals(screeningFormFilledStatus.getText(), excel.getCellData(sheetName, "Filled Status", 4));
        sa.assertAll();
    }


}



