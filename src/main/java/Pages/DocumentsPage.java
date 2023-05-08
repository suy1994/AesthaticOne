package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.TestUtil.*;

public class DocumentsPage extends TestBase {

    String sheetName = "Documents";
    PhysicianLoginPage physicianLoginPage = new PhysicianLoginPage();
    PatientLoginPage patientLoginPage = new PatientLoginPage();
    CommonPage commonPage = new CommonPage();

    @FindBy(xpath = "(//button[@class='btn btn-outline-primary min-w160'])[4]")
    WebElement shareDocumentButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-sorbet'])[1]")
    WebElement addButton;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[12]/div[2]")
    WebElement loaderOfAddForm;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[11]/div[2]")
    WebElement loaderOfShareDocumentPhysicianToSurgeon;

    @FindBy(xpath = "(//input[@id='doc-name'])[2]")
    WebElement documentNameInAddNewDocument;

    @FindBy(xpath = "(//input[@id='typeahead-group'])[2]")
    WebElement groupInAddNewDocument;

    @FindBy(xpath = "(//div[@class='ng2-tags-container'])[2]//input")
    WebElement tagsInAddNewDocument;

    @FindBy(xpath = "(//input[@name='file'])[2]")
    WebElement pdfUploadInAddNewDocument;

    @FindBy(xpath = "(//button[@class='btn btn-md btn-outline-primary bt-pr-btm hsc-btn-wd'])[2]")
    WebElement cancelButtonOfAddNewDocument;

    @FindBy(xpath = "(//button[@id='save-button'])[2]")
    WebElement saveButtonOfAddNewDocument;

    @FindBy(xpath = "(//button[@class='btn btn-md btn-primary yn-btn-wd'])[1]")
    WebElement okButtonOfDocumentSendSurgeon;

    @FindBy(xpath = "//div[@class='tp-menu']/div[2]/a")
    WebElement closeButtonOfProfileName;

    @FindBy(xpath = "(//button[@class='btn btn-same-width btn-apurple-outline'])[1]")
    WebElement closeButtonOfDocumentByPatient;

    @FindBy(xpath = "(//button[@class='btn btn-sorbet btn-left-icon'])[1]")
    WebElement addButtonOfDocumentByPatient;

    @FindBy(xpath = "//input[@id='file']")
    WebElement fileUpload;

    @FindBy(xpath = "//button[@class='btn btn-apurple-outline btn-same-width']")
    WebElement cancelButtonOfFileUpload;

    @FindBy(xpath = "//button[@class='btn btn-apurple btn-same-width']")
    WebElement doneButtonOfFileUpload;

    @FindBy(xpath = "(//div[@class='fh-wrap-div'])[2]//div/textarea")
    WebElement addNotesTextBox;

    @FindBy(xpath = "(//button[@class='btn btn-same-width btn-apurple-outline'])[2]")
    WebElement deleteButtonOfSelectedDocument;

    @FindBy(xpath = "((//div[@class='center-sm'])[1]/button)[1]")
    WebElement noButtonInDeleteOfSelectedDocument;

    @FindBy(xpath = "((//div[@class='center-sm'])[1]/button)[2]")
    WebElement yesButtonInDeleteOfSelectedDocument;

    @FindBy(xpath = "(//button[@class='btn btn-same-width btn-apurple'])[1]")
    WebElement shareButtonOfDocument;

    @FindBy(xpath = "//button[@class='btn btn-apurple-outline btn-same-width']")
    WebElement cancelButtonOfSelectPhysician;

    @FindBy(xpath = "(//span[@class='hlist-lft-pht'])[1]")
    WebElement selectPhysician;

    @FindBy(xpath = "//button[@class='btn btn-apurple btn-same-width']")
    WebElement shareDocumentWhenSelectDocument;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary']")
    WebElement okButtonOfDocumentErrorMessage;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[1]/div[2]")
    WebElement loaderForShareDocumentDone;

    @FindBy(xpath = "(//ul[@class='left-section generic-list-tab--outer']/li)[2]")
    WebElement sharedByPatientLabel;


    public void wayToDocumentPage() {
        sleep(2000);
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 4));
        sleep(5000);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 2));
    }

    public void verifyCancelButton() {
        click(shareDocumentButton, "Click On Share Document Button");
        sleep(2000);
        javascriptUsingClick(addButton, "Click On Add Button");
        waitForLoader(loaderOfAddForm);
        WebElement cancelButton = driver.findElement(By.xpath("(//button[.='Cancel'])[2]"));
        click(cancelButton, "Click On Cancel Button");
        sleep(2000);
    }

    public void verifyErrorMessageSelectDocument() {
        javascriptUsingClick(shareDocumentButton, "Click On Share Document Button");
        waitForLoader(loaderOfShareDocumentPhysicianToSurgeon);
        javascriptUsingClick(okButtonOfDocumentSendSurgeon, "Click On Ok Button");
        sleep(1000);
        String documentName = excel.getCellData(sheetName, "Error Messages", 2);
        WebElement selectDocument = driver.findElement(By.xpath("//p[.='" + documentName + "']"));
        sa.assertEquals(selectDocument.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        click(okButtonOfDocumentErrorMessage, "Click On Ok Button");
        sleep(2000);
        sa.assertAll();
    }

    public void verifyErrorMessageWithoutFillAnyDataInAddDocument() {
        javascriptUsingClick(addButton, "Click On Add Button");
        waitForLoader(loaderOfAddForm);
        javascriptUsingClick(saveButtonOfAddNewDocument, "Click On Save Button");
        int[] errorMessagesValue = {3, 4, 5};
        int[] errorMessageVerifying = {6, 7, 8};
        for (int i = 0; i < errorMessagesValue.length; i++) {
            String errorMessages = excel.getCellData(sheetName, "Error Messages", errorMessagesValue[i]);
            WebElement verifyErrorMessages = driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])/p[.='" + errorMessages + "']"));
            sa.assertEquals(verifyErrorMessages.getText(), excel.getCellData(sheetName, "Error Messages", errorMessageVerifying[i]));
            sa.assertAll();
        }
        javascriptUsingClick(cancelButtonOfAddNewDocument, "Click On Cancel Button");
        sa.assertAll();
    }

    public void verifyShareDocumentByPatient() throws Exception {
        javascriptUsingClick(addButton, "Click On Add Button");
        waitForLoader(loaderOfAddForm);
        waitForElementToBeDisplayed(documentNameInAddNewDocument);
        sendKeys(documentNameInAddNewDocument, excel.getCellData(sheetName, "Document Name", 2), "Send Keys In Document Name");
        sleep(1000);
        sendKeys(groupInAddNewDocument, excel.getCellData(sheetName, "Group", 2), "Send Keys In Group");
        sleep(2000);
        sendKeys(tagsInAddNewDocument, excel.getCellData(sheetName, "Tags", 2), "Send Keys In Tags");
        javascriptUsingClick(pdfUploadInAddNewDocument, "Click On Upload PDF Document");
        sleep(2000);
        String fileUploadPath = "/Users/suyogshinde/Downloads/test.pdf";
        Upload_file(fileUploadPath);
        sleep(10000);
        waitForElementToBeDisplayed(saveButtonOfAddNewDocument);
        javascriptUsingClick(saveButtonOfAddNewDocument, "Click On Save Button");
        waitForLoader(loaderOfAddForm);
    }

    public void verifyDocument() {
        sleep(2000);
        javascriptUsingClick(okButtonOfDocumentSendSurgeon, "Click On Ok Button");
        waitForLoader(loaderOfShareDocumentPhysicianToSurgeon);
        driver.navigate().refresh();
        waitForLoader(loaderForShareDocumentDone);
        sleep(4000);
        javascriptUsingClick(closeButtonOfProfileName, "Click On Close Button");
        sleep(2000);
        physicianLoginPage.logout();
    }

    public void verifyDocumentByPatient() {
        driver.get(getPropertyValueByKey("patientUrl"));
        patientLoginPage.successfulLoginInPatient(4, 2, 3, 2);
        String verifyingFillForm = excel.getCellData(sheetName, "Labels", 2);
        WebElement fillForm = driver.findElement(By.xpath("(//li[.='" + verifyingFillForm + "'])[1]"));
        javascriptUsingClick(fillForm, "Click On Fill Form");
    }

    public void viewDocumentByPatient() {
        String verifyingFillForm = excel.getCellData(sheetName, "Document Name", 2);
        WebElement fillForm = driver.findElement(By.xpath("//i[.='" + verifyingFillForm + "']"));
        javascriptUsingClick(fillForm, "Click On Fill Form");
        click(closeButtonOfDocumentByPatient, "Click On Close Button");
    }

    public void wayToMyInformation() {
        String verifyingFillForm = excel.getCellData(sheetName, "Labels", 3);
        WebElement fillForm = driver.findElement(By.xpath("//li[.='" + verifyingFillForm + "']"));
        javascriptUsingClick(fillForm, "Click On Fill Form");
    }

    public void shareDocumentPatientToPhysician() throws Exception {
        click(addButtonOfDocumentByPatient, "Click On Add Button Of Document");
        sleep(2000);
        javascriptUsingClick(fileUpload, "Click On Upload File");
        sleep(1000);
        String fileUploadPath = "/Users/suyogshinde/Downloads/test.pdf";
        Upload_file(fileUploadPath);
    }

    public void verifyCancelButtonOfUploadDocument() {
        sleep(2000);
        click(cancelButtonOfFileUpload, "Clicked On Cancel Button");
        sleep(5000);
    }

    public void shareDocumentPatientToSurgeon() throws Exception {
        shareDocumentPatientToPhysician();
        sleep(6000);
        sendKeys(addNotesTextBox, excel.getCellData(sheetName, "Add Notes", 2), "Send Keys In Add Notes Text Box");
        sleep(2000);
        click(doneButtonOfFileUpload, "Click On Done Button");
        sleep(2000);
        String SelectDocumentName = excel.getCellData(sheetName, "Add Notes", 2);
        WebElement SelectDocument = driver.findElement(By.xpath("//i[.='" + SelectDocumentName + "']"));
        click(SelectDocument, "Click On Document");
    }

    public void verifyCloseButtonInDocumentShare() {
        sleep(1000);
        WebElement closeButton = driver.findElement(By.xpath("//div[@class='between-sm display-flex']/button[.='Close']"));
        click(closeButton, "Click On Close Button");
        sleep(2000);
    }

    public void verifyDeleteButton() {
        String verifyingDocument = excel.getCellData(sheetName, "Add Notes", 2);
        WebElement selectDocument = driver.findElement(By.xpath("//i[.='" + verifyingDocument + "']"));
        javascriptUsingClick(selectDocument, "Click On Select Document");
        javascriptUsingClick(deleteButtonOfSelectedDocument, "Click On Delete Button");
        sleep(2000);
        click(noButtonInDeleteOfSelectedDocument, "Click On No Button Of Delete Document");
        sleep(2000);
        click(deleteButtonOfSelectedDocument, "Click On Delete Button");
        sleep(2000);
        click(yesButtonInDeleteOfSelectedDocument, "Click On No Button Of Delete Document");
    }

    public void shareDocumentToSurgeon() throws Exception {
        shareDocumentPatientToSurgeon();
        String verifyingDocument = excel.getCellData(sheetName, "Add Notes", 2);
        WebElement selectDocument = driver.findElement(By.xpath("//i[.='" + verifyingDocument + "']"));
        javascriptUsingClick(selectDocument, "Click On Select Document");
        sleep(2000);
        click(shareButtonOfDocument, "Click On Share Button");
    }

    public void verifyCancelButtonOfSelectPhysician() {
        sleep(2000);
        click(cancelButtonOfSelectPhysician, "Click On Cancel Button");
    }

    public void selectPhysicianForSharingDocument() {
        click(shareButtonOfDocument, "Click On Share Button");
        sleep(2000);
        click(selectPhysician, "Click On Select Physician");
        sleep(2000);
        click(shareDocumentWhenSelectDocument, "Click On Share Document");
        waitForLoader(loaderForShareDocumentDone);
        verifyCloseButtonInDocumentShare();
        patientLoginPage.logoutPatient();
    }

    public void verifySharedDocumentBySurgeon() {
        driver.get(getPropertyValueByKey("url"));
        physicianLoginPage.successfulLogin();
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 4));
        sleep(5000);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 2));
        sleep(2000);
        click(sharedByPatientLabel, "Click On Shared By Patient Label");
    }

}
