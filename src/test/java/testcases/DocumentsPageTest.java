package testcases;

import Pages.DocumentsPage;
import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DocumentsPageTest extends TestBase {
    DocumentsPage documentsPage;
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        documentsPage = new DocumentsPage();
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

    @Test()
    public void wayToDocumentPage() {
        documentsPage.wayToDocumentPage();
    }

    @Test()
    public void verifyCancelButtonTest() {
        documentsPage.verifyCancelButton();
    }

    @Test()
    public void verifyErrorMessageSelectDocumentTest() {
        documentsPage.verifyErrorMessageSelectDocument();
    }

    @Test()
    public void verifyErrorMessageWithoutFillAnyDataInAddDocumentTest() {
        documentsPage.verifyErrorMessageWithoutFillAnyDataInAddDocument();
    }

    @Test()
    public void verifyShareDocumentByPatientTest() throws Exception {
        documentsPage.verifyShareDocumentByPatient();
    }

    @Test()
    public void verifyDocumentTest() throws Exception {
        documentsPage.verifyDocument();
    }

    @Test()
    public void verifyDocumentByPatientTest() {
        documentsPage.verifyDocumentByPatient();
    }

    @Test()
    public void viewFormByPatientTest() {
        documentsPage.viewDocumentByPatient();
    }

    @Test()
    public void shareDocumentByPatientTest() {
        documentsPage.wayToMyInformation();
    }

    @Test()
    public void shareDocumentPatientToPhysicianTest() throws Exception {
        documentsPage.shareDocumentPatientToPhysician();
    }

    @Test()
    public void verifyCancelButtonOfUploadDocumentTest() {
        documentsPage.verifyCancelButtonOfUploadDocument();
    }

    @Test()
    public void shareDocumentPatientToSurgeonTest() throws Exception {
        documentsPage.shareDocumentPatientToSurgeon();
    }

    @Test()
    public void verifyCloseButtonOfDocumentTest() {
        documentsPage.verifyCloseButtonInDocumentShare();
    }

    @Test()
    public void verifyDeleteButtonTest() throws Exception {
        documentsPage.verifyDeleteButton();
    }

    @Test()
    public void shareDocumentToSurgeonTest() throws Exception {
        documentsPage.shareDocumentToSurgeon();
    }

    @Test()
    public void verifyCancelButtonOfSelectPhysicianTest() {
        documentsPage.verifyCancelButtonOfSelectPhysician();
    }

    @Test()
    public void selectPhysicianForSharingDocumentTest() {
        documentsPage.selectPhysicianForSharingDocument();
    }

    @Test()
    public void verifySharedDocumentBySurgeonTest() {
        documentsPage.verifySharedDocumentBySurgeon();
    }


}
