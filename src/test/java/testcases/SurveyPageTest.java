package testcases;

import Pages.PhysicianLoginPage;
import Pages.SurveyPage;
import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SurveyPageTest extends TestBase {
    SurveyPage surveyPage;
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        surveyPage = new SurveyPage();
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
    public void wayToSurveyPage() {
        surveyPage.wayToSurveyPage();
    }

    @Test
    public void verifySendSurveyButtonTest() {
        surveyPage.verifySendSurveyButton();
    }

    @Test
    public void searchingSurveyTest() {
        surveyPage.searchingSurvey();
    }

    @Test
    public void verifyErrorMessageWithoutSelectSurveyTest() {
        surveyPage.verifyErrorMessageWithoutSelectSurvey();
    }

    @Test
    public void verifyCancelButtonOfSurveyTest() {
        surveyPage.verifyCancelButtonOfSurvey();
    }

    @Test
    public void sendSurveyToPatientTest() {
        surveyPage.sendSurveyToPatient();
    }

    @Test
    public void patientVerifyingTheSurveyTest() {
        surveyPage.patientVerifyingTheSurvey();
    }

    @Test
    public void verifyCloseButtonOfSharedSurveyTest() {
        surveyPage.verifyCloseButtonOfSharedSurvey();
    }

    @Test
    public void submitSurveyTest() {
        surveyPage.submitSurvey();
    }

}

