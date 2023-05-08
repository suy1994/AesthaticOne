package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static util.TestUtil.*;

public class SurveyPage extends TestBase {

    CommonPage commonPage = new CommonPage();
    PhysicianLoginPage physicianLoginPage = new PhysicianLoginPage();
    PatientLoginPage patientLoginPage = new PatientLoginPage();
    String sheetName = "Survey";

    @FindBy(xpath = "(//button[@class='btn btn-outline-primary min-w160'])[6]")
    WebElement sendSurveyButton;

    @FindBy(xpath = "//input[@placeholder='Search Surveys']")
    WebElement searchSurvey;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary yn-btn-wd']")
    WebElement okButtonOfSurvey;

    @FindBy(xpath = "//button[@class='btn btn-outline-primary']")
    WebElement okButtonOfSelectSurvey;

    @FindBy(xpath = "//p[@class='mb-0 text-left fnts-17']")
    WebElement selectSurveyErrorMessage;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[8]/div[2]")
    WebElement loaderForMessageFunction;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[11]/div[2]")
    WebElement loaderForSendSurvey;

    @FindBy(xpath = "//button[@class='btn btn-md btn-outline-primary yn-btn-wd mr-3']")
    WebElement cancelButtonOfSurvey;

    @FindBy(xpath = "//div[@class='tp-menu']/div[2]/a")
    WebElement closeButtonOfProfileName;

    /************************Common Methods**********************/
    public void surveyNameInPhysicianSite() {
        String surveyName = excel.getCellData(sheetName, "Survey", 4);
        WebElement selectSurvey = driver.findElement(By.xpath("//span[.='" + surveyName + "']"));
        click(selectSurvey, "Click On Selected Survey");
    }

    public void surveyNameInPatientSite() {
        String surveyName = excel.getCellData(sheetName, "Survey", 4);
        WebElement selectSurvey = driver.findElement(By.xpath("//i[.='" + surveyName + "']"));
        click(selectSurvey, "Click On Selected Survey");
    }

    public void searchSurveyInPhysicianSite() {
        sendKeys(searchSurvey, excel.getCellData(sheetName, "Survey", 4), "Send Keys In Survey");
        clickEnterButton(searchSurvey);
        sleep(2000);
    }

    /**************End Of Common Methods**********************/

    public void wayToSurveyPage() {
        sleep(2000);
        commonPage.selectPatient(excel.getCellData(sheetName, "Patient Name", 4));
        sleep(5000);
        commonPage.selectSurgeonTab(excel.getCellData(sheetName, "Labels", 2));
        sleep(2000);
        waitForLoader(loaderForMessageFunction);
    }

    public void verifySendSurveyButton() {
        scrollTillTheElementIsDisplay(sendSurveyButton);
        click(sendSurveyButton, "Click On Send Survey Button");
        waitForLoader(loaderForSendSurvey);
    }

    public void searchingSurvey() {
        searchSurveyInPhysicianSite();
    }

    public void verifyErrorMessageWithoutSelectSurvey() {
        javascriptUsingClick(okButtonOfSurvey, "Click On Ok Button of Survey");
        sa.assertEquals(selectSurveyErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        sleep(2000);
        click(okButtonOfSelectSurvey, "Click On Ok Button Of Survey");
        sa.assertAll();
    }

    public void verifyCancelButtonOfSurvey() {
        click(cancelButtonOfSurvey, "Click On Cancel Button Of Survey");
    }

    public void sendSurveyToPatient() {
        verifySendSurveyButton();
        searchingSurvey();
        surveyNameInPhysicianSite();
        javascriptUsingClick(okButtonOfSurvey, "Click On Selected Survey");
        sleep(2000);
        javascriptUsingClick(closeButtonOfProfileName, "Click On Close Button");
        sleep(2000);
        physicianLoginPage.logout();
    }

    public void patientVerifyingTheSurvey() {
        driver.get(getPropertyValueByKey("patientUrl"));
        patientLoginPage.successfulLoginInPatient(4, 2, 3, 2);
        String surveyIsVerify = excel.getCellData(sheetName, "Labels", 2);
        WebElement selectSurvey = driver.findElement(By.xpath("(//li[.='" + surveyIsVerify + "'])[1]"));
        javascriptUsingClick(selectSurvey, "Click On Surveys");
        sleep(2000);
    }

    public void verifyCloseButtonOfSharedSurvey() {
        surveyNameInPatientSite();
        sleep(2000);
        String closeButton = excel.getCellData(sheetName, "Labels", 4);
        WebElement closeButtonOfSurvey = driver.findElement(By.xpath("(//button[.='" + closeButton + "'])[2]"));
        javascriptUsingClick(closeButtonOfSurvey, "Click On Close Button Of Survey");
    }

    public void submitSurvey() {
        sleep(2000);
        surveyNameInPatientSite();
        String selectButton = excel.getCellData(sheetName, "Labels", 3);
        WebElement submitButton = driver.findElement(By.xpath("//button[.='" + selectButton + "']"));
        javascriptUsingClick(submitButton, "Click On Submit Button Of Survey");
        sleep(2000);
    }


}




