package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;

import static util.TestUtil.*;

public class AddPreviousImplantPage extends TestBase {

    String sheetName = "Add Previous Implant";
    CommonPage commonPage = new CommonPage();

    @FindBy(xpath = "(//div[@class='chat-profile-left chat-profile-name'])[1]")
    WebElement patientName;

    @FindBy(xpath = "//span[contains(text(),'Implants')]")
    WebElement labelImplantsInHeader;

    @FindBy(xpath = "//button[contains(text(),'Add Previous Implants')]")
    WebElement buttonAddPreviousImplant;

    @FindBy(xpath = "//select[@id='manufacturer']/option[1]")
    WebElement dropdownImplantManufacturerIsAllergan;

    @FindBy(xpath = "//select[@id='manufacturer']")
    WebElement dropdownImplantManufacturer;

    @FindBy(xpath = "//input[@id='procedureDate']")
    WebElement dateOfPreviousImplantSurgeryTextBox;

    @FindBy(xpath = "//select[@id='procedureGroup']")
    WebElement procedureGroupBySelection;

    @FindBy(xpath = "//select[@name='procedureName']")
    WebElement procedureNameSelected;

    @FindBy(xpath = "(//ul[@class='tabs-ul fs-16'])[1]/li[2]")
    WebElement implantLocationRightButton;

    @FindBy(xpath = "(//li[@class='tabs-li tabs-li-selected ng-star-inserted'])[1]")
    WebElement implantLocationBothButton;

    @FindBy(xpath = "//button[contains(text(),'Manual Entry')]")
    WebElement manualEntryButton;

    @FindBy(xpath = "(//div[@class='addLabel-section flex-hv-center fs-16'])[2]")
    WebElement leftImplantLabel;

    @FindBy(xpath = "(//div[@class='addLabel-section flex-hv-center fs-16'])[3]")
    WebElement rightImplantLabel;

    @FindBy(xpath = "(//div[@class='form-group ma-form-group my-2'])[1]/label")
    WebElement refLabelInManualEntryOfLeftImplant;

    @FindBy(xpath = "(//div[@class='form-group ma-form-group my-2'])[4]/label")
    WebElement refLabelInManualEntryOfRightImplant;

    @FindBy(xpath = "(//div[@class='form-group ma-form-group my-2'])[5]/label")
    WebElement snLabelInManualEntryOfRightImplant;

    @FindBy(xpath = "(//div[@class='form-group ma-form-group my-2'])[6]/label")
    WebElement lotLabelInManualEntryOfRightImplant;

    @FindBy(xpath = "(//div[@class='form-group ma-form-group my-2'])[2]/label")
    WebElement snLabelInManualEntry;

    @FindBy(xpath = "(//div[@class='form-group ma-form-group my-2'])[3]/label")
    WebElement lotLabelInManualEntryOfLeftImplant;

    @FindBy(xpath = "//div[@class='addLabel-outer bg-light']//input[@name='lot']")
    WebElement lotNumberTextBoxForRightImplant;

    @FindBy(xpath = "//div[@class='addLabel-outer bg-light mb-2']//input[@name='lot']")
    WebElement lotNumberTextBoxForLeftImplant;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-hollow']")
    WebElement okButton;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[11]/div[2]")
    WebElement loaderForStartedPageOfAddImplantInfo;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[12]/div[2]")
    WebElement loaderForAfterSkipOfImplantForm;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[9]/div[2]")
    WebElement secondLoaderForAfterSkipOfImplantForm;

    @FindBy(xpath = "//div[@id='requiredStartDate']")
    WebElement enterDateErrorMessage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[1]/div")
    WebElement invalidDateErrorMessage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[2]")
    WebElement enterRefNoErrorMessage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[3]")
    WebElement enterSerialNoErrorMessage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[3]")
    WebElement enterImplantInformationErrorMessage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[5]")
    WebElement enterImplantInformationErrorMessageForBothImplants;

    @FindBy(xpath = "(//input[@name='stringInput'])[1]")
    WebElement firstNameTextBoxInFormInEditForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[2]")
    WebElement fNameTextBoxInFormInEditForm;

    @FindBy(xpath = "(//input[@name='stringInput'])[3]")
    WebElement fNameWithDefaultValueTextBoxInFormInEditForm;

    @FindBy(xpath = "(//div[@class='aptcode-item aptcode-input-integer ng-star-inserted'])[2]/input")
    WebElement intWithDefaultValueTextBoxInFormInEditForm;

    @FindBy(xpath = "(//div[@class='aptcode-item aptcode-input-integer ng-star-inserted'])[3]/input")
    WebElement intWithoutDefaultValueTextBoxInFormInEditForm;

    @FindBy(xpath = "(//div[@class='aptcode-item aptcode-input-integer ng-star-inserted'])[1]/input")
    WebElement ageTextBoxInFormInEditForm;

    @FindBy(xpath = "//div[@class='error ng-star-inserted']")
    WebElement duplicateSerialNumberErrorMessage;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-hollow']")
    WebElement cancelButtonOfForm;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-hollow mr-2']")
    WebElement cancelButtonOfAddImplantInformationPage;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-hollow'])[2]")
    WebElement cancelButtonOfCancelPopupInForm;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-hollow'])[3]")
    WebElement okButtonOfCancelPopupInForm;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-hollow ml-3 ng-star-inserted'])[1]")
    WebElement skipButtonOfForm;

    @FindBy(xpath = "(//div[@class='myimplant-btn-trash flex-hv-center'])[1]")
    WebElement deleteButtonOfImplantCard;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-hollow btn-danger']")
    WebElement deleteButtonOfPopupImplantCard;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-hollow'])[1]")
    WebElement cancelButtonOfDeletePopupImplantCard;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-hollow ml-3 ng-star-inserted'])[2]")
    WebElement doneButtonOfForm;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[8]/div[2]")
    WebElement loaderForChatFunction;

    @FindBy(xpath = "//div[@class='tp-menu']/div[2]/a")
    WebElement closeButtonOfProfileName;

    @FindBy(xpath = "(//div[@class='myinfolist']//img)[1]")
    WebElement manufacturerImplantCardLogo;

    @FindBy(xpath = "(//button[@class='btn btn-outline-primary btn-block full-width-implant-btn'])[1]")
    WebElement operativeSummaryButton;

    @FindBy(xpath = "//div[@class='modal-footer border-top-0 ng-star-inserted']//button[2]")
    WebElement editButton;

    @FindBy(xpath = "//div[@class='onoffswitch ml-auto']//label/span[2]")
    WebElement saveAsDefaultButtonInEditForm;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary yn-btn-wd']")
    WebElement saveButtonInEditOpReportInEditForm;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary yn-btn-wd']")
    WebElement doneButtonInOperativeReport;

    @FindBy(xpath = "//div[@class='opsummary-list']/p")
    List<WebElement> operativeSummaryList;

    /******************************************Common Methods********************************************/

    public void scrollingTheElementIsDisplay(WebElement scrollTillTheElement) {
        Actions actions = new Actions(driver);
        sleep(3000);
        do {
            actions.keyDown(Keys.COMMAND).sendKeys(Keys.END).sendKeys(Keys.UP).perform();
        } while (!scrollTillTheElement.isDisplayed());
    }

    public void selectDropdownValueInForm() {
        sleep(2000);
        String[] colName = {"History Dropdown", "Implant Surface", "Implant Type", "Implants", "Clinical Infection"};
        int[] colNumber = {3, 3, 4, 2, 4};
        int[] dropdownColNumber = {8, 6, 8, 5, 7};
        for (int i = 0; i < colName.length; i++) {
            String DropdownValue = excel.getCellData(sheetName, colName[i], colNumber[i]);
            WebElement dropdown1 = driver.findElement(By.xpath("//span[@class='ng-star-inserted']/span[.='" + DropdownValue + "']"));
            scrollingTheElementIsDisplay(dropdown1);
            sleep(1000);
            click(dropdown1, "Click On Dropdown");
            String DropdownValueSelected = excel.getCellData(sheetName, colName[i], dropdownColNumber[i]);
            WebElement dropdownValueSelected = driver.findElement(By.xpath("//ul[@class='lazyContainer']//label[.='" + DropdownValueSelected + "']"));
            sleep(1000);
            click(dropdownValueSelected, "Select Dropdown Value");
            sleep(1000);
        }
        clearInputText(firstNameTextBoxInFormInEditForm);
        sendKeys(firstNameTextBoxInFormInEditForm, excel.getCellData(sheetName, "First Name In Form", 2), "Send Keys Into First Name");
        clearInputText(fNameTextBoxInFormInEditForm);
        sendKeys(fNameTextBoxInFormInEditForm, excel.getCellData(sheetName, "F Name In Form", 2), "Send Keys Into F Name");
        clearInputText(fNameWithDefaultValueTextBoxInFormInEditForm);
        sendKeys(fNameWithDefaultValueTextBoxInFormInEditForm, excel.getCellData(sheetName, "F Name default In Form", 2), "Send Keys Into F Name Default Value");
        sleep(1000);
        clearInputText(intWithDefaultValueTextBoxInFormInEditForm);
        sendKeys(intWithDefaultValueTextBoxInFormInEditForm, excel.getCellData(sheetName, "Int Default Value", 2), "Send Int With Default Value");
        scrollTillTheElementIsDisplay(intWithoutDefaultValueTextBoxInFormInEditForm);
        clearInputText(intWithoutDefaultValueTextBoxInFormInEditForm);
        sendKeys(intWithoutDefaultValueTextBoxInFormInEditForm, excel.getCellData(sheetName, "Int Without Default Value", 2), "Send Int Without Default Value");
        clearInputText(ageTextBoxInFormInEditForm);
        sendKeys(ageTextBoxInFormInEditForm, excel.getCellData(sheetName, "Age", 2), "Send Int Without Default Value");
        click(saveAsDefaultButtonInEditForm, "Click On Save As Default Button");
    }

    public void enterLotNumber(int whichImplantRowNumber, int lotNumberTextBoxEnterRowNo) {
        String whichImplant = excel.getCellData(sheetName, "Labels", whichImplantRowNumber);
        WebElement lotNumberTextBox = driver.findElement(By.xpath("(//div[.='" + whichImplant + "']//following::input[@placeholder='For Older Implants'])[1]"));
        sendKeys(lotNumberTextBox, excel.getCellData(sheetName, "Lot Number", lotNumberTextBoxEnterRowNo), "Send Lot number into the Lot text box");
    }

    public void enterRefAndSNNumber(int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo) {
        String whichImplant = excel.getCellData(sheetName, "Labels", whichImplantForRefNoRowNumber);
        WebElement refNumberTextBox = driver.findElement(By.xpath("(//div[.='" + whichImplant + "']//following::input[@name='reference'])[1]"));
        sendKeys(refNumberTextBox, excel.getCellData(sheetName, "Ref Number", RefNumberTextBoxEnterRowNo), "Send Ref number into the Ref text box");

        String whichImplantForSNNumber = excel.getCellData(sheetName, "Labels", whichImplantForSNNoRowNumber);
        WebElement snNumberTextBox = driver.findElement(By.xpath("(//div[.='" + whichImplantForSNNumber + "']//following::input[@name='serial'])[1]"));
        sendKeys(snNumberTextBox, excel.getCellData(sheetName, "SN Number", SNNumberTextBoxEnterRowNo), "Send SN number into the SN text box");
    }

    public void enterAddImplantInformation(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber) {
        selectDropdownValue(dropdownImplantManufacturer, excel.getCellData(sheetName, "Dropdown Values", manufacturerValueSelectFromExcelSheet), "Selected Dropdown Value In Implant Manufacturer");
        sendKeys(dateOfPreviousImplantSurgeryTextBox, excel.getCellData(sheetName, "Date", dateOfPreviousImplantSurgery), "Send keys into date textBox");
        selectDropdownValue(procedureGroupBySelection, excel.getCellData(sheetName, "Procedure Group Value", procedureGroupValueSelectFromDropdown), "");
        selectDropdownValue(procedureNameSelected, excel.getCellData(sheetName, "Procedure Name Value", procedureNameValueSelectFromDropdown), "");
        String ImplantLocation = excel.getCellData(sheetName, "Labels", enterImplantLocationRowNumber);
        WebElement implantLocationLeftButton = driver.findElement(By.xpath("(//ul[@class='tabs-ul fs-16'])[1]/li[.='" + ImplantLocation + "']"));
        click(implantLocationLeftButton, "Click On Left Button Of Implant");
        WebElement implantInformationAvailableForLabels = driver.findElement(By.xpath("//li[.=' Labels ']"));
        click(implantInformationAvailableForLabels, "Click On Information Label Button");
        sleep(1000);
        click(manualEntryButton, "Click On Manual Entry Button");
        sa.assertAll();
    }

    /***************************************************Left Implant********************************************/
    public void wayToAddPreviousImplant() {
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 2));
        sleep(5000);
        waitForElementToBeDisplayed(labelImplantsInHeader);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 14));
        scrollTillTheElementIsDisplay(buttonAddPreviousImplant);
        click(buttonAddPreviousImplant, "Click On add previous Implant Button");
        waitForLoader(loaderForChatFunction);
    }

    public void verifyByDefaultValueDisplayOfManufacturerDropdown() {
        waitForLoader(loaderForStartedPageOfAddImplantInfo);
        sa.assertEquals(dropdownImplantManufacturerIsAllergan.getText(), excel.getCellData(sheetName, "Manufacturer", 2));
        sa.assertAll();
    }

    public void verifyManualEntryLabelsForLeftImplant() {
        scrollTillTheElementIsDisplay(lotLabelInManualEntryOfLeftImplant);
        click(manualEntryButton, "Click On Manual Entry Button");
        WebElement implantLocationLeftButton = driver.findElement(By.xpath("(//ul[@class='tabs-ul fs-16'])[1]/li[.=' Left ']"));
        click(implantLocationLeftButton, "Click On Left Button Of Implant");
        waitForElementToBeDisplayed(leftImplantLabel);
        sa.assertEquals(leftImplantLabel.getText(), excel.getCellData(sheetName, "Labels", 5));
        sa.assertEquals(refLabelInManualEntryOfLeftImplant.getText(), excel.getCellData(sheetName, "Labels", 7));
        sa.assertEquals(snLabelInManualEntry.getText(), excel.getCellData(sheetName, "Labels", 8));
        sa.assertEquals(lotLabelInManualEntryOfLeftImplant.getText(), excel.getCellData(sheetName, "Labels", 9));
        sleep(1000);
        click(okButton, "Click On Ok Button");
        sa.assertAll();
    }

    public void verifyErrorMessagesWithoutEnterAnyDataForLeftImplant() {
        scrollTillTheElementIsDisplay(lotNumberTextBoxForRightImplant);
        sa.assertEquals(enterDateErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        sa.assertEquals(enterRefNoErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 3));
        sa.assertEquals(enterSerialNoErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 4));
        sa.assertAll();
    }

    public void verifyEnterImplantErrorMessage() {
        sendKeys(dateOfPreviousImplantSurgeryTextBox, excel.getCellData(sheetName, "Date", 2), "Send keys into date textBox");
        click(okButton, "Click On Ok Button");
        sa.assertEquals(enterImplantInformationErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 5));
        sa.assertAll();
    }

    public void verifyInvalidDateErrorMessage() {
        sendKeys(dateOfPreviousImplantSurgeryTextBox, excel.getCellData(sheetName, "Invalid Data", 2), "Send Invalid Date into date textBox");
        sa.assertEquals(invalidDateErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 6));
        sa.assertAll();
    }

    public void verifyErrorMessageForEitherEnterRefNoAndSNNoOrLotNo(int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo, int whichImplantRowNumber, int lotNumberTextBoxEnterRowNo, int whichImplantForErrorMessageEnterRowNo) {
        enterRefAndSNNumber(whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo);
        enterLotNumber(whichImplantRowNumber, lotNumberTextBoxEnterRowNo);
        String whichImplantForErrorMessage = excel.getCellData(sheetName, "Labels", whichImplantForErrorMessageEnterRowNo);
        WebElement enterEitherRefAndSNNoOrLotNoErrorMessage = driver.findElement(By.xpath("(//div[.='" + whichImplantForErrorMessage + "']//following::div[.=' Please add either Reference Number and Serial Number or only Lot Number. '])[1]"));
        sa.assertEquals(enterEitherRefAndSNNoOrLotNoErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 7));
        sa.assertAll();
    }

    public void verifyCancelButtonOfAddImplantPage() {
        click(cancelButtonOfAddImplantInformationPage, "Click On Cancel Button Of Add Implant Information Page");
    }

    public void enterAddImplantInformationForLeftImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantEnterRowNo, int lotNoTextBoxEnterRowNo) {
        click(buttonAddPreviousImplant, "Click On add previous Implant Button");
        waitForLoader(loaderForChatFunction);
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber);
        enterLotNumber(whichImplantEnterRowNo, lotNoTextBoxEnterRowNo);
        click(okButton, "Click On Ok Button");
        sleep(1000);
    }

    public void verifyCancelButtonOfForm() {
        sleep(1000);
        click(cancelButtonOfForm, "Click On Cancel Button Of Form");
        waitForElementToBeDisplayed(cancelButtonOfCancelPopupInForm);
        click(cancelButtonOfCancelPopupInForm, "Click On Cancel Button");
        waitForElementToBeDisplayed(cancelButtonOfForm);
        click(cancelButtonOfForm, "Click On Cancel Button Of Form");
        sleep(1000);
        click(okButtonOfCancelPopupInForm, "Click On Ok Button In Cancel Popup");
    }

    public void verifySkipOfForm(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantRowNo, int lotNumberTextBoxEnterRowNo) {
        sleep(1000);
        click(buttonAddPreviousImplant, "click On Add Previous Implant Button");
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber);
        enterLotNumber(whichImplantRowNo, lotNumberTextBoxEnterRowNo);
        click(okButton, "Click On Ok Button");
        click(skipButtonOfForm, "Click On Skip Button Of Form");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
        sleep(1000);
    }

    public void verifyLeftImplantCard(int imageNameEnterRowNo) throws Exception {
        sleep(1000);
        String imageName = excel.getCellData(sheetName, "Manufacturer", imageNameEnterRowNo);
        waitForElementToBeDisplayed(manufacturerImplantCardLogo);
        imageComparison(manufacturerImplantCardLogo, imageName);
        sa.assertAll();
    }

    public void verifyDeleteImplantCard() {
        waitForElementToBeDisplayed(deleteButtonOfImplantCard);
        click(deleteButtonOfImplantCard, "Click On Delete Button Of Implant Card");
        sleep(1000);
        click(cancelButtonOfDeletePopupImplantCard, "Click On Cancel Button Of Delete Popup Of Implant Card");
        waitForElementToBeDisplayed(deleteButtonOfImplantCard);
        click(deleteButtonOfImplantCard, "Click On Delete Button Of Implant Card");
        sleep(1000);
        click(deleteButtonOfPopupImplantCard, "Click On Delete Popup Of Implant Card");
        sleep(1000);
        waitForElementToBeDisplayed(closeButtonOfProfileName);
        click(closeButtonOfProfileName, "Click On close button of profile");
    }

    public void verifyDoneButton(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantRowNo, int lotNumberTextBoxEnterRowNo) {
        wayToAddPreviousImplant();
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber);
        enterLotNumber(whichImplantRowNo, lotNumberTextBoxEnterRowNo);
        click(okButton, "Click On Ok Button");
        sleep(1000);
        selectDropdownValueInForm();
        click(doneButtonOfForm, "Click On Done Button Of Implant Information Form ");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
    }

    public void verifyOpReportInOpSummary() {
        click(operativeSummaryButton, "Click On Operative Summary Button");
        for (int i = 0; i < 21; i++) {
            sa.assertEquals(operativeSummaryList.get(i).getText(), excel.getCellData(sheetName, "Op Report In Op Summary", i + 2));
            sa.assertAll();
        }
    }

    public void editOperativeSummary() {
        click(editButton, "Click On Edit Button Of Op Report");
        selectDropdownValueInForm();
        click(saveButtonInEditOpReportInEditForm, "Click On Save Button In Edit Form");
    }

    public void verifyEditedOpSummary() {
        verifyOpReportInOpSummary();
        click(doneButtonInOperativeReport, "Click On Done Button Of Operative Summary");
        sleep(2000);
    }

    public void verifyDeleteEditedImplantCard() {
        verifyDeleteImplantCard();
    }

    public void enterDetailsWithRefAndSrNumber(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo) {
        wayToAddPreviousImplant();
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber);
        enterRefAndSNNumber(whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo);
    }

    public void verifySkipOfLeftImplantCardOfEnteredRefAndSrNumber() {
        click(okButton, "Click On Ok Button");
        sleep(1000);
        click(skipButtonOfForm, "Click On Skip Button Of Form");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
        sleep(1000);
    }

    public void verifyLeftImplantCardOfEnteredRefAndSrNumber(int imageNameEnterRowNo) throws Exception {
        verifyLeftImplantCard(imageNameEnterRowNo);
    }

    public void verifyDeleteOfLeftImplantCardOfEnteredRefAndSrNumber() {
        verifyDeleteImplantCard();
    }

    public void verifyDoneButtonForRefAndSrNumber(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo) {
        wayToAddPreviousImplant();
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber);
        enterRefAndSNNumber(whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo);
        sleep(1000);
        click(okButton, "Click On Ok Button");
        selectDropdownValueInForm();
        sleep(1000);
        click(doneButtonOfForm, "Click On Done Button of Form");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
    }

    public void verifyOpReportInOpSummaryForRefAndSrNumber() {
        click(operativeSummaryButton, "Click On Operative Summary Button");
        for (int i = 0; i < 21; i++) {
            sa.assertEquals(operativeSummaryList.get(i).getText(), excel.getCellData(sheetName, "Op Report In Op Summary For Ref And Sr Number", i + 2));
            sa.assertAll();
        }
    }

    public void editOperativeSummaryForRefAndSrNumber() {
        editOperativeSummary();
    }

    public void verifyEditedOpSummaryForRefAndSrNumber() {
        verifyOpReportInOpSummaryForRefAndSrNumber();
        click(doneButtonInOperativeReport, "Click On Done Button Of Operative Summary");
    }

    public void verifyDeleteLeftImplantCardForRefAndSrNumber() {
        verifyDeleteEditedImplantCard();
    }

    /********************************************Right Implant***********************************************/
    public void verifyManualEntryLabelsForRightImplant() {
        wayToAddPreviousImplant();
        click(manualEntryButton, "Click On Manual Entry Button");
        click(implantLocationRightButton, "Click On right Implant Location");
        scrollTillTheElementIsDisplay(lotLabelInManualEntryOfRightImplant);
        sa.assertEquals(rightImplantLabel.getText(), excel.getCellData(sheetName, "Labels", 6));
        sa.assertEquals(refLabelInManualEntryOfRightImplant.getText(), excel.getCellData(sheetName, "Labels", 7));
        sa.assertEquals(snLabelInManualEntryOfRightImplant.getText(), excel.getCellData(sheetName, "Labels", 8));
        sa.assertEquals(lotLabelInManualEntryOfRightImplant.getText(), excel.getCellData(sheetName, "Labels", 9));
        sleep(1000);
        click(okButton, "Click On Ok Button");
        sa.assertAll();
    }

    public void verifyErrorMessageForRightImplant(int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo, int whichImplantRowNumber, int lotNumberTextBoxEnterRowNo, int whichImplantForErrorMessageEnterRowNo) {
        verifyErrorMessagesWithoutEnterAnyDataForLeftImplant();
        verifyEnterImplantErrorMessage();
        verifyInvalidDateErrorMessage();
        verifyErrorMessageForEitherEnterRefNoAndSNNoOrLotNo(whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo, whichImplantRowNumber, lotNumberTextBoxEnterRowNo, whichImplantForErrorMessageEnterRowNo);
        click(cancelButtonOfAddImplantInformationPage, "Click On Cancel Button Of Add Implant Information Page");
    }

    public void enterAddImplantInformationForRightImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantEnterRowNo, int lotNoTextBoxEnterRowNo) {
        click(buttonAddPreviousImplant, "Click On add previous Implant Button");
        waitForLoader(loaderForChatFunction);
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber);
        enterLotNumber(whichImplantEnterRowNo, lotNoTextBoxEnterRowNo);
        click(okButton, "Click On Ok Button");
        sa.assertAll();
    }

    public void verifyCancelButtonOfFormForRightImplant() {
        verifyCancelButtonOfForm();
    }

    public void verifySkipOfFormForRightImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantRowNo, int lotNumberTextBoxEnterRowNo) {
        verifySkipOfForm(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber, whichImplantRowNo, lotNumberTextBoxEnterRowNo);
    }

    public void verifyRightImplantCard() throws Exception {
        sleep(1000);
        String imageName = excel.getCellData(sheetName, "Manufacturer", 2);
        imageComparison(manufacturerImplantCardLogo, imageName);
        String lot = excel.getCellData(sheetName, "Lot Number", 2);
        WebElement lotNumber = driver.findElement(By.xpath("//span[.='" + lot + "']"));
        sa.assertEquals(lotNumber.getText(), excel.getCellData(sheetName, "Lot Number", 2));
        sa.assertAll();
    }

    public void verifyDeleteRightImplantCard() {
        verifyDeleteImplantCard();
    }

    public void verifyDoneButtonOfRightImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantRowNo, int lotNumberTextBoxEnterRowNo) {
        verifyDoneButton(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber, whichImplantRowNo, lotNumberTextBoxEnterRowNo);
        sleep(1000);
    }

    public void verifyOpReportInOpSummaryOfRightImplant() {
        click(operativeSummaryButton, "Click On Operative Summary Button");
        for (int i = 0; i < 21; i++) {
            sa.assertEquals(operativeSummaryList.get(i).getText(), excel.getCellData(sheetName, "Op Report In Op Summary For Right Implant", i + 2));
            sa.assertAll();
        }
    }

    public void editOperativeSummaryOfRightImplant() {
        editOperativeSummary();
    }

    public void verifyEditedOperativeSummaryOfRightImplant() {
        verifyOpReportInOpSummary();
        click(doneButtonInOperativeReport, "Click On Done Button Of Operative Summary");
    }

    public void verifyDeleteImplantCardOfRightImplantAfterVerifyingOPSummary() {
        verifyDeleteImplantCard();
    }

    public void enterDetailsForRightImplantCardWithRefAndSrNumber(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo) {
        enterDetailsWithRefAndSrNumber(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber, whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo);
    }

    public void verifySkipButtonOfRightImplantCardOfEnteredRefAndSrNumber() {
        click(okButton, "Click On Ok Button");
        sleep(1000);
        click(skipButtonOfForm, "Click On Skip Button Of Form");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
        sleep(1000);
    }

    public void verifyRightImplantCardOfEnteredRefAndSrNumber(int imageNameEnterRowNo) throws Exception {
        verifyLeftImplantCard(imageNameEnterRowNo);
    }

    public void verifyDeleteOfRightImplantCardOfEnteredRefAndSrNumber() {
        verifyDeleteImplantCard();
    }

    public void verifyDoneButtonForRefAndSrNumberOfRightImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantRowNo, int lotNumberTextBoxEnterRowNo) {
        verifyDoneButton(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber, whichImplantRowNo, lotNumberTextBoxEnterRowNo);
        sleep(1000);
    }

    public void verifyOpReportInOpSummaryForRefAndSrNumberOfRightImplant() {
        click(operativeSummaryButton, "Click On Operative Summary Button");
        for (int i = 0; i < 21; i++) {
            sa.assertEquals(operativeSummaryList.get(i).getText(), excel.getCellData(sheetName, "Op Report In Op Summary For Right Implant", i + 2));
            sa.assertAll();
        }
    }

    public void verifyEditOperativeSummaryForRefAndSrNumberOfRightImplant() {
        editOperativeSummary();
    }

    public void verifyEditedOperativeSummaryForRefAndSrNumberOfRightImplant() {
        click(operativeSummaryButton, "Click On Operative Summary Button");
        for (int i = 0; i < 21; i++) {
            sa.assertEquals(operativeSummaryList.get(i).getText(), excel.getCellData(sheetName, "Op Report In Op Summary For Right Implant", i + 2));
            sa.assertAll();
        }
        click(doneButtonInOperativeReport, "Click On Done Button Of Operative Summary");
    }

    public void deleteImplantCardAfterEditingOpSummary() {
        verifyDeleteImplantCard();
    }

    /********************************************Both Implant***********************************************/
    public void verifyManualEntryLabelsForBothImplant() {
        wayToAddPreviousImplant();
        click(manualEntryButton, "Click On Manual Entry Button");
        click(implantLocationBothButton, "Click On right Implant Location");
        scrollTillTheElementIsDisplay(lotLabelInManualEntryOfRightImplant);
        sa.assertEquals(leftImplantLabel.getText(), excel.getCellData(sheetName, "Labels", 5));
        sa.assertEquals(refLabelInManualEntryOfLeftImplant.getText(), excel.getCellData(sheetName, "Labels", 7));
        sa.assertEquals(snLabelInManualEntry.getText(), excel.getCellData(sheetName, "Labels", 8));
        sa.assertEquals(lotLabelInManualEntryOfLeftImplant.getText(), excel.getCellData(sheetName, "Labels", 9));
        sa.assertEquals(rightImplantLabel.getText(), excel.getCellData(sheetName, "Labels", 6));
        sa.assertEquals(refLabelInManualEntryOfRightImplant.getText(), excel.getCellData(sheetName, "Labels", 7));
        sa.assertEquals(snLabelInManualEntryOfRightImplant.getText(), excel.getCellData(sheetName, "Labels", 8));
        sa.assertEquals(lotLabelInManualEntryOfRightImplant.getText(), excel.getCellData(sheetName, "Labels", 9));
        sleep(1000);
        click(okButton, "Click On Ok Button");
        sa.assertAll();
    }

    public void verifyErrorMessageForBothImplant(int whichImplantForRefNoEnterRowNumber, int RefNumberTextBoxForLeftImplantEnterRowNo, int whichImplantForSNNoEnterRowNumber, int SNNumberTextBoxForLeftImplantEnterRowNo, int whichImplantInLeftLabelRowNumber, int lotNumberTextBoxForLeftImplantEnterRowNo, int whichImplantForErrorMessageForLeftImplantEnterRowNo, int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo, int whichImplantRowNumber, int lotNumberTextBoxEnterRowNo, int whichImplantForErrorMessageForRightImplantEnterRowNo) {
        verifyErrorMessagesWithoutEnterAnyDataForLeftImplant();
        sendKeys(dateOfPreviousImplantSurgeryTextBox, excel.getCellData(sheetName, "Date", 2), "Send keys into date textBox");
        click(okButton, "Click On Ok Button");
        sa.assertEquals(enterImplantInformationErrorMessageForBothImplants.getText(), excel.getCellData(sheetName, "Error Messages", 5));
        verifyInvalidDateErrorMessage();
        verifyErrorMessageForEitherEnterRefNoAndSNNoOrLotNo(whichImplantForRefNoEnterRowNumber, RefNumberTextBoxForLeftImplantEnterRowNo, whichImplantForSNNoEnterRowNumber, SNNumberTextBoxForLeftImplantEnterRowNo, whichImplantInLeftLabelRowNumber, lotNumberTextBoxForLeftImplantEnterRowNo, whichImplantForErrorMessageForLeftImplantEnterRowNo);
        verifyErrorMessageForEitherEnterRefNoAndSNNoOrLotNo(whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo, whichImplantRowNumber, lotNumberTextBoxEnterRowNo, whichImplantForErrorMessageForRightImplantEnterRowNo);
        sendKeys(dateOfPreviousImplantSurgeryTextBox, excel.getCellData(sheetName, "Date", 2), "Send keys into date textBox");
        clearInputText(lotNumberTextBoxForLeftImplant);
        clearInputText(lotNumberTextBoxForRightImplant);
        sleep(1000);
        click(okButton, "Click On Ok Button");
        sa.assertEquals(duplicateSerialNumberErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 8));
        sleep(1000);
        click(cancelButtonOfAddImplantInformationPage, "Click On Cancel Button Of Add Implant Information Page");
        sa.assertAll();
    }

    public void enterAddImplantInformationForBothImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int leftImplantEnterRowNo, int lotNoTextBoxOfLeftImplantEnterRowNo, int rightImplantEnterRowNo, int lotNoTextBoxOfRightImplantEnterRowNo) {
        sleep(1000);
        click(buttonAddPreviousImplant, "Click On add previous Implant Button");
        waitForLoader(loaderForChatFunction);
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber);
        enterLotNumber(leftImplantEnterRowNo, lotNoTextBoxOfLeftImplantEnterRowNo);
        enterLotNumber(rightImplantEnterRowNo, lotNoTextBoxOfRightImplantEnterRowNo);
        sleep(1000);
        click(okButton, "Click On Ok Button");
    }

    public void verifyCancelButtonOfFormForBothImplant() {
        verifyCancelButtonOfForm();
    }

    public void verifySkipOfFormForBothImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int leftImplantEnterRowNo, int lotNoTextBoxOfLeftImplantEnterRowNo, int rightImplantEnterRowNo, int lotNoTextBoxOfRightImplantEnterRowNo) {
        enterAddImplantInformationForBothImplant(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber, leftImplantEnterRowNo, lotNoTextBoxOfLeftImplantEnterRowNo, rightImplantEnterRowNo, lotNoTextBoxOfRightImplantEnterRowNo);
        click(skipButtonOfForm, "Click On Skip Button Of Form");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
    }

    public void verifyBothImplantCard() throws Exception {
        sleep(1000);
        String imageName = excel.getCellData(sheetName, "Manufacturer", 2);
        waitForElementToBeDisplayed(manufacturerImplantCardLogo);
        imageComparison(manufacturerImplantCardLogo, imageName);
        String lot = excel.getCellData(sheetName, "Lot Number", 2);
        WebElement lotNumber = driver.findElement(By.xpath("//span[.='" + lot + "']"));
        sa.assertEquals(lotNumber.getText(), excel.getCellData(sheetName, "Lot Number", 2));
        sa.assertAll();
    }

    public void verifyDeleteImplantCardForBothImplant() {
        verifyDeleteImplantCard();
    }

    public void verifyDoneButtonForBothImplant(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumberForLeftImplant, int whichImplantForLeftImplantRowNo, int lotNumberTextBoxEnterRowNoForLeftImplant, int whichImplantForRightImplantRowNo, int lotNumberTextBoxEnterRowNoForRightImplant) {
        wayToAddPreviousImplant();
        enterAddImplantInformation(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumberForLeftImplant);
        enterLotNumber(whichImplantForLeftImplantRowNo, lotNumberTextBoxEnterRowNoForLeftImplant);
        enterLotNumber(whichImplantForRightImplantRowNo, lotNumberTextBoxEnterRowNoForRightImplant);
        click(okButton, "Click On Ok Button");
        sleep(1000);
        selectDropdownValueInForm();
        click(doneButtonOfForm, "Click On Done Button Of Implant Information Form ");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
    }

    public void verifyOpReportInOpSummaryForBothImplant() {
        click(operativeSummaryButton, "Click On Operative Summary Button");
        for (int i = 0; i < 21; i++) {
            sa.assertEquals(operativeSummaryList.get(i).getText(), excel.getCellData(sheetName, "Op Report In Op Summary", i + 2));
            sa.assertAll();
        }
    }

    public void editOperativeSummaryForBothImplant() {
        editOperativeSummary();
    }

    public void verifyEditedOpSummaryForBothImplant() {
        verifyOpReportInOpSummaryForBothImplant();
        click(doneButtonInOperativeReport, "Click On Done Button Of Operative Summary");
    }

    public void verifyDeleteEditedImplantCardForBothImplant() {
        verifyDeleteImplantCard();
    }

    public void enterDetailsForBothImplantCardWithRefAndSrNumber(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo, int whichImplantForRightImplantRefNoEnterRowNumber, int RefNumberTextBoxForRightImplantEnterRowNo, int whichImplantForRightImplantSNNoRowNumber, int SNNumberTextBoxForRightImplantEnterRowNo) {
        enterDetailsWithRefAndSrNumber(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber, whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo);
        enterRefAndSNNumber(whichImplantForRightImplantRefNoEnterRowNumber, RefNumberTextBoxForRightImplantEnterRowNo, whichImplantForRightImplantSNNoRowNumber, SNNumberTextBoxForRightImplantEnterRowNo);
    }

    public void verifySkipButtonOfBothImplantCardOfEnteredRefAndSrNumber() {
        click(okButton, "Click On Ok Button");
        sleep(1000);
        waitForElementToBeDisplayed(skipButtonOfForm);
        click(skipButtonOfForm, "Click On Skip Button Of Form");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
        sleep(1000);
    }

    public void verifyBothImplantCardOfEnteredRefAndSrNumber(int imageNameEnterRowNo) throws Exception {
        verifyLeftImplantCard(imageNameEnterRowNo);
    }

    public void verifyDeleteOfBothImplantCardOfEnteredRefAndSrNumber() {
        verifyDeleteImplantCard();
    }

    public void verifyDoneButtonForRefAndSrNumberForBothImplants(int manufacturerValueSelectFromExcelSheet, int dateOfPreviousImplantSurgery, int procedureGroupValueSelectFromDropdown, int procedureNameValueSelectFromDropdown, int enterImplantLocationRowNumber, int whichImplantForRefNoRowNumber, int RefNumberTextBoxEnterRowNo, int whichImplantForSNNoRowNumber, int SNNumberTextBoxEnterRowNo, int whichImplantForRightImplantRefNoEnterRowNumber, int RefNumberTextBoxForRightImplantEnterRowNo, int whichImplantForRightImplantSNNoRowNumber, int SNNumberTextBoxForRightImplantEnterRowNo) {
        enterDetailsWithRefAndSrNumber(manufacturerValueSelectFromExcelSheet, dateOfPreviousImplantSurgery, procedureGroupValueSelectFromDropdown, procedureNameValueSelectFromDropdown, enterImplantLocationRowNumber, whichImplantForRefNoRowNumber, RefNumberTextBoxEnterRowNo, whichImplantForSNNoRowNumber, SNNumberTextBoxEnterRowNo);
        enterRefAndSNNumber(whichImplantForRightImplantRefNoEnterRowNumber, RefNumberTextBoxForRightImplantEnterRowNo, whichImplantForRightImplantSNNoRowNumber, SNNumberTextBoxForRightImplantEnterRowNo);
        click(okButton, "Click On Ok Button");
        sleep(1000);
        selectDropdownValueInForm();
        click(doneButtonOfForm, "Click On Done Button Of Implant Information Form ");
        waitForLoader(loaderForAfterSkipOfImplantForm);
        waitForLoader(secondLoaderForAfterSkipOfImplantForm);
    }

    public void verifyOpSummaryForRefAndSrNumberForBothImplants() {
        click(operativeSummaryButton, "Click On Operative Summary Button");
        for (int i = 0; i < 21; i++) {
            sa.assertEquals(operativeSummaryList.get(i).getText(), excel.getCellData(sheetName, "Op Report In Op Summary For Both Implant", i + 2));
            sa.assertAll();
        }
    }

    public void editOpSummaryForRefAndSrNumberForBothImplants() {
        click(editButton, "Click On Edit Button Of Op Report");
        selectDropdownValueInForm();
        click(saveButtonInEditOpReportInEditForm, "Click On Save Button In Edit Form");
        sleep(2000);
    }

    public void deleteImplantCardForRefAndSrNumberForBothImplants() {
        verifyDeleteImplantCard();
    }

}


