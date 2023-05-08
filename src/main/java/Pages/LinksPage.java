package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.TestUtil.*;

public class LinksPage extends TestBase {

    CommonPage commonPage = new CommonPage();
    PhysicianLoginPage physicianLoginPage = new PhysicianLoginPage();
    PatientLoginPage patientLoginPage = new PatientLoginPage();

    String sheetName = "Links";

    @FindBy(xpath = "//a[@class='btn btn-outline-primary min-w160']")
    WebElement shareLinkButton;

    @FindBy(xpath = "//button[@class='btn btn-md btn-outline-primary yn-btn-wd mr-3']")
    WebElement cancelButtonOfShareLink;

    @FindBy(xpath = "(//button[@class='btn btn-md btn-primary yn-btn-wd'])[1]")
    WebElement okButtonOfLinkSendSurgeon;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[11]/div[2]")
    WebElement loaderOfShareLinkPhysicianToSurgeon;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary']")
    WebElement okButtonOfLinkErrorMessage;

    @FindBy(xpath = "(//button[@class='btn btn-sm btn-sorbet'])[1]")
    WebElement addButton;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[11]/div[2]")
    WebElement loaderOfAfterAddButton;

    @FindBy(xpath = "(//button[@class='btn btn-md btn-outline-primary bt-pr-btm hsc-btn-wd'])[2]")
    WebElement cancelButtonOfAddNewLink;

    @FindBy(xpath = "//button[@id='save-button']")
    WebElement saveButtonOfAddNewLink;

    @FindBy(id = "link-name")
    WebElement linkNameTextBox;

    @FindBy(id = "link-url")
    WebElement urlTextBox;

    @FindBy(xpath = "(//p[@class='mb-0 text-danger text-right ng-star-inserted'])[1]")
    WebElement validLinkNameErrorMessage;

    @FindBy(xpath = "(//p[@class='mb-0 text-danger text-right ng-star-inserted'])[2]")
    WebElement validUrlErrorMessage;

    @FindBy(xpath = "//input[@id='typeahead-group']")
    WebElement groupTextBox;

    @FindBy(xpath = "//input[@placeholder='Select or enter new tag']")
    WebElement tagsTextBox;

    @FindBy(xpath = "//div[@class='tp-menu']/div[2]/a")
    WebElement closeButtonOfProfileName;


    public void wayToLinksPage() {
        sleep(3000);
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 4));
        sleep(5000);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 2));
        sleep(2000);
    }

    public void verifyShareLinkButton() {
        javascriptUsingClick(shareLinkButton, "Click On Share Link Button");
    }

    public void verifyCancelButtonOfShareLink() {
        sleep(2000);
        javascriptUsingClick(cancelButtonOfShareLink, "Click On Cancel Button");
    }

    public void verifyErrorMessageWithoutSelectingLink() {
        javascriptUsingClick(shareLinkButton, "Click On Share Link Button");
        waitForLoader(loaderOfShareLinkPhysicianToSurgeon);
        javascriptUsingClick(okButtonOfLinkSendSurgeon, "Click On Ok Button");
        sleep(1000);
        String selectDocumentErrorMessage = excel.getCellData(sheetName, "Error Messages", 2);
        WebElement selectDocument = driver.findElement(By.xpath("//p[.='" + selectDocumentErrorMessage + "']"));
        sa.assertEquals(selectDocument.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        click(okButtonOfLinkErrorMessage, "Click On Ok Button");
        sleep(2000);
        sa.assertAll();
    }

    public void verifyAddButtonInLink() {
        javascriptUsingClick(addButton, "Click On Add Button");
        waitForLoader(loaderOfAfterAddButton);
    }

    public void verifyCancelButtonOfAddNewLink() {
        click(cancelButtonOfAddNewLink, "Click On Cancel Button Of Add New Link");
    }

    public void verifyErrorMessageWithoutEnterAnyDataInLink() {
        verifyAddButtonInLink();
        click(saveButtonOfAddNewLink, "Click On Save Button Of Link");
        int[] errorMessagesValue = {3, 4, 5};
        int[] errorMessageVerifying = {6, 7, 8};
        for (int i = 0; i < errorMessagesValue.length; i++) {
            String errorMessages = excel.getCellData(sheetName, "Error Messages", errorMessagesValue[i]);
            WebElement verifyErrorMessages = driver.findElement(By.xpath("(//div[@class='ng-star-inserted'])/p[.='" + errorMessages + "']"));
            sa.assertEquals(verifyErrorMessages.getText(), excel.getCellData(sheetName, "Error Messages", errorMessageVerifying[i]));
            sa.assertAll();
        }
        click(cancelButtonOfAddNewLink, "Click On Cancel Button Of Add New Link");
        sa.assertAll();
    }

    public void verifyErrorMessageEnterWrongKeys() {
        verifyAddButtonInLink();
        sendKeys(linkNameTextBox, excel.getCellData(sheetName, "Invalid Data", 2), "Send Keys In Link Name Text Box");
        sendKeys(urlTextBox, excel.getCellData(sheetName, "Invalid Data", 2), "Send Keys In Link Name Text Box");
        sa.assertEquals(validLinkNameErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 9));
        sa.assertEquals(validUrlErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 10));
        verifyCancelButtonOfAddNewLink();
        sa.assertAll();
    }

    public void enterDetailsInNewLinkPage() {
        verifyAddButtonInLink();
        sendKeys(linkNameTextBox, excel.getCellData(sheetName, "Link Name", 2), "Send Keys In Link Name Text Box");
        sendKeys(urlTextBox, excel.getCellData(sheetName, "Url", 2), "Send Keys In Link Name Text Box");
        sendKeys(groupTextBox, excel.getCellData(sheetName, "Group", 2), "Send Keys In Link Name Text Box");
        waitForElementToBeDisplayed(tagsTextBox);
        sendKeys(tagsTextBox, excel.getCellData(sheetName, "Tag", 2), "Send Keys In Link Name Text Box");
        waitForElementToBeDisplayed(saveButtonOfAddNewLink);
        click(saveButtonOfAddNewLink, "Click On Save Button Of Link");
        waitForLoader(loaderOfShareLinkPhysicianToSurgeon);
    }

    public void verifyAndShareLink() {
        String groupName = excel.getCellData(sheetName, "Group", 2);
        WebElement verifyLinksName = driver.findElement(By.xpath("//li[.='" + groupName + "']/following-sibling::li//span"));
        sa.assertEquals(verifyLinksName.getText(), excel.getCellData(sheetName, "Link Name", 2));
        javascriptUsingClick(okButtonOfLinkSendSurgeon, "Click On Ok Button");
        waitForLoader(loaderOfShareLinkPhysicianToSurgeon);
        waitForElementToBeDisplayed(closeButtonOfProfileName);
        click(closeButtonOfProfileName, "Click On Close Button Of Profile");
        physicianLoginPage.logout();
        sa.assertAll();
    }

    public void verifyLinkDisplayByPatient() {
        driver.get(getPropertyValueByKey("patientUrl"));
        patientLoginPage.successfulLoginInPatient(4, 2, 3, 2);
        sleep(2000);
        String verifyingFillForm = excel.getCellData(sheetName, "Labels", 2);
        WebElement fillForm = driver.findElement(By.xpath("(//li[.='" + verifyingFillForm + "'])[1]"));
        javascriptUsingClick(fillForm, "Click On Fill Form");
        sleep(2000);
        String name = excel.getCellData(sheetName, "Link Name", 2);
        WebElement linkName = driver.findElement(By.xpath("//i[.='" + name + "']"));
        sa.assertEquals(linkName.getText(), excel.getCellData(sheetName, "Link Name", 2));
        waitForElementToBeDisplayed(linkName);
        click(linkName, "Click On Link name");
        sleep(2000);
        focusOnOldTab(0);
        sleep(1000);
        WebElement viewedStatus = driver.findElement(By.xpath("//span[@class='hlist-lft-mid-div']/following::span[.='Viewed']/preceding::i[.='" + name + "']"));
        sa.assertEquals(viewedStatus.getText(), excel.getCellData(sheetName, "Link Name", 2));
        sa.assertAll();
    }


}







