package testcases;

import Pages.FormsPage;
import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FormsPageTest extends TestBase {
    FormsPage formsPage;
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        formsPage = new FormsPage();
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
    public void verifyWayToFormsPage() {
        formsPage.wayToFormsPage();
    }

    @Test
    public void verifyErrorMessageWithoutSelectIntakeForm() {
        formsPage.verifyErrorMessageWithoutFillIntakeForm();
    }

    @Test
    public void selectIntakeFormTest() {
        formsPage.selectIntakeForm(5);
    }


    @Test
    public void shareIntakeFormTest() {
        formsPage.shareIntakeForm(5);
    }

    @Test
    public void verifySharedIntakeFormTest() {
        formsPage.verifySharedIntakeForm();
    }

    @Test
    public void verifyFormInPatientLoginPage() {
        formsPage.verifyFormInPatientLogin();
    }

    @Test
    public void verifyCloseButtonOfIntakeFormTest() {
        formsPage.verifyCloseButtonOfIntakeForm();
    }

    @Test
    public void clickToNextFormOpenInIntakeFormTest() {
        formsPage.clickToNextFormOpenInIntakeForm();
    }

//    @Test
//    public void verifyEditButtonOfFormTest() {
//        formsPage.verifyEditButtonOfForm();
//    }
//
//    @Test
//    public void verifyPrintButtonOfFormTest() {
//        formsPage.verifyPrintButtonOfForm();
//    }
//
//    @Test
//    public void verifyNextButtonTest() {
//        formsPage.verifyNextButton();
//    }
//
//    @Test
//    public void verifyCancelButtonOfAboutMeSecondFormTest() {
//        formsPage.editMedicalHistory();
//    }
//
//    @Test
//    public void verifyAboutMeFormInIntakeFormTest() {
//        formsPage.verifySaveButtonOfAboutMeSecondFormInIntakeForm();
//    }
//
//    @Test
//    public void verifyStatusOfFormInSurgeonLogin() {
//        formsPage.verifyStatusOfFormInSurgeonLogin();
//    }
//
//    @Test(description = "Inform Consent Form Is Started")
//    public void wayToInformedConsentFormsTest() {
//        formsPage.wayToInformedConsentForms();
//    }
//
//    @Test(description = "Inform Consent Form Is Started")
//    public void verifyErrorMessageInformedConsentFormWithoutSelectAnyFormTest() {
//        formsPage.verifyErrorMessageInformedConsentFormWithoutSelectAnyForm();
//    }
//
//    @Test
//    public void verifyErrorMessageOfInformedConsentFormWithoutSelectAnyFormTest() {
//        formsPage.verifyErrorMessageInAddInformedConsentForm();
//    }
//
//    @Test
//    public void addInformedConsentForm() {
//        formsPage.addInformedConsentForm();
//    }
//
//    @Test
//    public void verifyCancelButtonOfNewInformedConsentForm() {
//        formsPage.verifyCancelButtonOfNewInformedConsentForm();
//    }
//
//    @Test
//    public void fillAddNewInformedConsentForm() throws Exception {
//        formsPage.fillAddNewInformedConsentForm();
//    }
//
//    @Test
//    public void searchInformedConsentForm() throws Exception {
//        formsPage.searchInformedConsentForm();
//    }
//
//    @Test
//    public void verifyInformedConsentFormInPatientLogin() {
//        formsPage.verifyInformedConsentFormInPatientLogin();
//    }
//
//    @Test
//    public void verifyCloseButtonOfInformedConsentForm() {
//        formsPage.verifyCloseButtonOfInformedConsentForm();
//    }
//
//    @Test
//    public void verifySignInButtonOfForm() {
//        formsPage.verifySignInButtonOfForm();
//    }
//
//    @Test
//    public void verifyAddedForm() {
//        formsPage.verifyAddedForm();
//    }
//
//    @Test
//    public void verifyCloseButtonOfFormInInformedConsentForm() {
//        formsPage.verifyCloseButtonOfFormInInformedConsentForm();
//    }
//
//    @Test
//    public void verifyAgreeButtonOfInformedConsentForm() {
//        formsPage.verifyAgreeButtonOfInformedConsentForm();
//    }
//
//    @Test
//    public void verifyFilledFormBySurgeonTest() {
//        formsPage.verifyFilledFormBySurgeon();
//    }
//
//    @Test
//    public void wayToScreeningForms() {
//        formsPage.wayToScreeningForms();
//    }
//
//    @Test
//    public void verifyErrorMessageInScreeningFormTest() {
//        formsPage.verifyErrorMessageInScreeningForm();
//    }
//
//    @Test
//    public void verifyCancelButtonOfScreeningFormTest() {
//        formsPage.verifyCancelButtonOfScreeningForm();
//    }
//
//    @Test
//    public void searchOfFormTest() {
//        formsPage.searchOfFormInScreeningForm();
//    }
//
//    @Test
//    public void selectFormInScreeningFormTest() {
//        formsPage.selectFormInScreeningForm();
//    }
//
//    @Test
//    public void verifyScreeningFormInPatientTest() {
//        formsPage.verifyScreeningFormInPatient();
//    }
//
//    @Test
//    public void formFilledByPatientTest() {
//        formsPage.formFilledByPatient();
//    }
//
//    @Test
//    public void verifyingScreeningFormFilledByPhysicianTest() {
//        formsPage.verifyingScreeningFormFilledByPhysician();
//    }

}


