package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.TestUtil.*;

public class PhotosPage extends TestBase {

    CommonPage commonPage = new CommonPage();
    PhysicianLoginPage physicianLoginPage = new PhysicianLoginPage();
    PatientLoginPage patientLoginPage = new PatientLoginPage();
    String sheetName = "Photos";

    @FindBy(xpath = "(//div[@class='lds-ripple'])[8]/div[2]")
    WebElement loaderForMessageFunction;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[9]/div[2]")
    WebElement loaderForAfterSharingPhotoBySurgeon;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[1]/div[2]")
    WebElement loaderForPhotoUpload;

    @FindBy(xpath = "//input[@class='addPhotos-inputFile']")
    WebElement uploadPhotoButton;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary min-w100 mr-3']")
    WebElement cancelButtonInCropImage;

    @FindBy(xpath = "//button[@class='btn btn-primary min-w100 min-w80']")
    WebElement doneButtonInCropImage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[1]/div")
    WebElement procedureGroupErrorMessage;

    @FindBy(xpath = "(//div[@class='error ng-star-inserted'])[2]/div")
    WebElement procedureNameErrorMessage;

    @FindBy(xpath = "//select[@placeholder='Select Procedure Group']")
    WebElement procedureGroupSelect;

    @FindBy(xpath = "//select[@placeholder='Select Procedure Name']")
    WebElement procedureNameSelect;

    @FindBy(xpath = "//button[@class='btn btn-primary min-w100']")
    WebElement doneButtonInAddPhotoDetails;

    @FindBy(xpath = "//textarea[@placeholder='Add a Note here...']")
    WebElement addingNoteTextBox;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary min-w100 mr-3']")
    WebElement cancelButtonInAddPhotoDetails;

    @FindBy(xpath = "(//div[@class='col-12 mb-2 fnts-18 text-charcoal ng-star-inserted'])[1]")
    WebElement procedureName;

    @FindBy(xpath = "//div[@class='mt-1 text-charcoal fnts-16 ng-star-inserted']")
    WebElement notes;

    @FindBy(xpath = "//a[@class='slider-button slider-button__left']")
    WebElement shareButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-white min-w60']")
    WebElement noButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-white min-w60 mr-3']")
    WebElement yesButton;

    @FindBy(xpath = "//p[@class='proc-desc']")
    WebElement procedureNameVerify;

    @FindBy(xpath = "(//button[@class='btn btn-sorbet btn-left-icon'])[3]")
    WebElement verifyAddButton;

    @FindBy(xpath = "//input[@id='file']")
    WebElement browserFile;

    @FindBy(xpath = "//button[@class='btn btn-apurple btn-same-width']")
    WebElement doneButtonOfImageUpload;

    @FindBy(xpath = "//textarea[@placeholder='Add notes (Optional)']")
    WebElement addNotesTextBox;

    @FindBy(xpath = "//button[@class='btn btn-apurple-outline btn-same-width']")
    WebElement cancelButtonOfUploadPhoto;

    @FindBy(xpath = "//div[@class='iframe-img start-sm']")
    WebElement uploadedImage;

    @FindBy(xpath = "(//button[.='Close'])[2]")
    WebElement closeButtonInUploadedImage;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-same-width btn-apurple'])[2]")
    WebElement yesDeleteButton;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-same-width btn-apurple-outline'])[2]")
    WebElement noDeleteButton;

    @FindBy(xpath = "//app-modal[@id='shareConfirmation']//button[@class='btn btn-sm btn-same-width btn-apurple-outline']")
    WebElement cancelButtonOfSharePhoto;

    @FindBy(xpath = "//ul[@class='pc-center-tab__outer justify-content-center']/li[2]")
    WebElement sharedByPatientVerifySurgeon;

    @FindBy(xpath = "//div[@class='mt-1 text-charcoal fnts-16']")
    WebElement noteDisplayInSurgeon;

    @FindBy(xpath = "//app-modal[@id='shareConfirmation']//button[@class='btn btn-sm btn-same-width btn-apurple']")
    WebElement sharePhotoYesButton;

    /*******************************************Common Methods*********************************************************/

    public void selectButtonAndClick(int buttonNameRowNo) {
        String buttonType = excel.getCellData(sheetName, "Buttons", buttonNameRowNo);
        sleep(2000);
        WebElement Button = driver.findElement(By.xpath("//button[.='" + buttonType + "']"));
        click(Button, "Click On This Button");
        sleep(2000);
    }

    /*******************************************End Of Common Methods*********************************************************/

    public void wayToPhotosPage() {
        sleep(2000);
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 4));
        sleep(5000);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 2));
        sleep(2000);
        waitForLoader(loaderForMessageFunction);
    }

    public void verifyAddPhotoButton() {
        String addPhotoButtonLabel = excel.getCellData(sheetName, "Buttons", 5);
        WebElement addPhotoButton = driver.findElement(By.xpath("(//button[.='" + addPhotoButtonLabel + "'])[1]"));
        click(addPhotoButton, "Click On Add Photo Button");
    }

    public void verifyUploadPhotoButton() {
        sleep(2000);
        javascriptUsingClick(uploadPhotoButton, "Click On Upload Photo Button");
    }

    public void imageUploadFromDesktop() throws Exception {
        sleep(2000);
        String fileUploadPath = "/Users/suyogshinde/Downloads/Checking Images/60*60.png";
        Upload_file(fileUploadPath);
    }

    public void verifyCancelButtonInCropImage() {
        waitForElementToBeDisplayed(cancelButtonInCropImage);
        sleep(2000);
        click(cancelButtonInCropImage, "Click On Cancel Button Of Crop Image");
    }

    public void verifyDoneButtonInCropImage() throws Exception {
        sleep(2000);
        verifyAddPhotoButton();
        verifyUploadPhotoButton();
        imageUploadFromDesktop();
        sleep(2000);
        click(doneButtonInCropImage, "Click On Done Button Of Crop Image");
    }

    public void verifyingErrorMessageWithoutSelectProcedureGPAndName() {
        sleep(2000);
        click(doneButtonInAddPhotoDetails, "Click On Done Button In Add Photo Details");
        sa.assertEquals(procedureGroupErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        sa.assertEquals(procedureNameErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 3));
        sa.assertAll();
    }

    public void selectingDropdownValueInProcedureGPAndProcedureName() {
        sleep(2000);
        selectDropdownValue(procedureGroupSelect, excel.getCellData(sheetName, "Procedure Group", 2), "Selected Value From Procedure Group Dropdown");
        sleep(2000);
        selectDropdownValue(procedureNameSelect, excel.getCellData(sheetName, "Procedure Name", 2), "Selected Value From Procedure Name Dropdown");
        sendKeys(addingNoteTextBox, excel.getCellData(sheetName, "Note", 2), "Writing Note In Text Box");
    }

    public void verifyCancelButtonOfAddPhotoDetails() {
        click(cancelButtonInAddPhotoDetails, "Click On Cancel Button");
    }

    public void verifyDoneButton() throws Exception {
        verifyDoneButtonInCropImage();
        selectingDropdownValueInProcedureGPAndProcedureName();
        click(doneButtonInAddPhotoDetails, "Click On Done Button In Add Photo Details");
    }

    public void verifyImageDetails() {
        sa.assertEquals(procedureName.getText(), excel.getCellData(sheetName, "Labels", 3));
        sa.assertEquals(notes.getText(), excel.getCellData(sheetName, "Labels", 4));
        sa.assertAll();
    }

    public void verifyShareButton() {
        sleep(2000);
        javascriptUsingClick(shareButton, "Click On Share Button");
    }

    public void verifyNoButtonInSharePhotos() {
        sleep(2000);
        click(noButton, "Click On No Button Of Share Photos");
    }

    public void verifyYesButton() {
        verifyShareButton();
        sleep(2000);
        click(yesButton, "Click On Yes Button Of Share Photos");
        waitForLoader(loaderForAfterSharingPhotoBySurgeon);
    }

    public void patientLogin() {
        driver.get(getPropertyValueByKey("patientUrl"));
        patientLoginPage.successfulLoginInPatient(4, 2, 3, 2);
        sleep(2000);
        String photosLabel = excel.getCellData(sheetName, "Labels", 2);
        WebElement photosTab = driver.findElement(By.xpath("(//li[.='" + photosLabel + "'])[1]"));
        javascriptUsingClick(photosTab, "Click On Photos Tab");
    }

    public void verifyingImageAndProcedureByPatient() {
        sleep(2000);
        sa.assertEquals(procedureNameVerify.getText(), excel.getCellData(sheetName, "Labels", 5));
        sa.assertAll();
    }

    public void wayToMyInformation() {
        String verifyingFillForm = excel.getCellData(sheetName, "Labels", 6);
        WebElement myInformation = driver.findElement(By.xpath("//li[.='" + verifyingFillForm + "']"));
        javascriptUsingClick(myInformation, "Click On My Information Button");
    }

    public void openPhotoTab() {
        String verifyingFillForm = excel.getCellData(sheetName, "Labels", 2);
        WebElement photoTab = driver.findElement(By.xpath("(//ul[@class='tabwrapper'])[3]/li[.='" + verifyingFillForm + "']"));
        javascriptUsingClick(photoTab, "Click On Photos Button");
    }

    public void verifyAddButton() {
        click(verifyAddButton, "Click On Add Button");
    }

    public void browseFileImageFromDesktop() throws Exception {
        sleep(1000);
        javascriptUsingClick(browserFile, "Click On Browse Image");
        sleep(2000);
        String fileUploadPath = "/Users/suyogshinde/Downloads/Checking Images/spiderman.jpg";
        Upload_file(fileUploadPath);
        waitForElementToBeDisplayed(doneButtonOfImageUpload);
    }

    public void verifyNotesTextBox() {
        sendKeys(addNotesTextBox, excel.getCellData(sheetName, "Note", 3), "Send Keys In Notes");
    }

    public void verifyCancelButton() {
        sleep(2000);
        click(cancelButtonOfUploadPhoto, "Click On Cancel Button");
    }

    public void verifyDoneButtonInUploadImage() throws Exception {
        verifyAddButton();
        browseFileImageFromDesktop();
        verifyNotesTextBox();
        sleep(2000);
        click(doneButtonOfImageUpload, "Click On Done Button");
        waitForLoader(loaderForPhotoUpload);
    }

    public void verifyOpenUploadedImage() {
        click(uploadedImage, "Click On Uploaded Image");
        sleep(2000);
    }

    public void verifyCloseButton() {
        click(closeButtonInUploadedImage, "Click On Close Button In Upload Image");
        sleep(2000);
    }

    public void verifyDeleteButton() {
        verifyOpenUploadedImage();
        selectButtonAndClick(2);
        sleep(1000);
        click(noDeleteButton, "Click On No Select Button");
    }

    public void verifyDeleteImage() {
        selectButtonAndClick(2);
        click(yesDeleteButton, "Click On Yes Button Of Delete");
    }

    public void uploadNewImageAndShare() throws Exception {
        verifyDoneButtonInUploadImage();
        verifyOpenUploadedImage();
        selectButtonAndClick(3);
    }

    public void verifyCancelButtonOfSharePhoto() {
        sleep(2000);
        click(cancelButtonOfSharePhoto, "Click On Cancel Button Of Share Photo");
    }

    public void sharePhotoByPatient() {
        sleep(1000);
        selectButtonAndClick(3);
        click(sharePhotoYesButton, "Click on yes button");
        sleep(5000);
    }

    public void verifyImageBySurgeon() {
        driver.get(getPropertyValueByKey("url"));
        physicianLoginPage.successfulLogin();
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 4));
        sleep(5000);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 2));
        sleep(2000);
        click(sharedByPatientVerifySurgeon, "Click On Shared By Patient");
        sleep(1000);
        sa.assertEquals(noteDisplayInSurgeon.getText(), excel.getCellData(sheetName, "Note", 3));
        sa.assertAll();
    }




}

