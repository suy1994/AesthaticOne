package testcases;

import Pages.LinksPage;
import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LinksPageTest extends TestBase {

    LinksPage linksPage;
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        linksPage = new LinksPage();
        physicianLoginPage = new PhysicianLoginPage();
        createExcelSheetObject();
    }

    @BeforeMethod
    public void createObject() {
        createSoftAssertObject();
    }

    @Test
    public void successfulLogin() {
        physicianLoginPage.successfulLogin();
    }

    @Test
    public void wayToLinksPageTest() {
        linksPage.wayToLinksPage();
    }

    @Test
    public void verifyShareLinkButtonTest() {
        linksPage.verifyShareLinkButton();
    }

    @Test
    public void verifyCancelButtonOfShareLinkTest() {
        linksPage.verifyCancelButtonOfShareLink();
    }

    @Test
    public void verifyErrorMessageWithoutSelectingLinkTest() {
        linksPage.verifyErrorMessageWithoutSelectingLink();
    }

    @Test
    public void verifyAddButtonInLinkTest() {
        linksPage.verifyAddButtonInLink();
    }

    @Test
    public void verifyCancelButtonOfAddNewLinkTest() {
        linksPage.verifyCancelButtonOfAddNewLink();
    }

    @Test
    public void verifyErrorMessageWithoutEnterAnyDataInLinkTest() {
        linksPage.verifyErrorMessageWithoutEnterAnyDataInLink();
    }

    @Test
    public void verifyErrorMessageEnterWrongKeysTest() {
        linksPage.verifyErrorMessageEnterWrongKeys();
    }

    @Test
    public void enterDetailsInNewLinkPageTest() {
        linksPage.enterDetailsInNewLinkPage();
    }

    @Test
    public void verifyAndShareLinkTest() {
        linksPage.verifyAndShareLink();
    }

    @Test
    public void verifyLinkDisplayByPatientTest() {
        linksPage.verifyLinkDisplayByPatient();
    }


}
