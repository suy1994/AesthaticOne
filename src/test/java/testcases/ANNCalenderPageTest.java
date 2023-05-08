package testcases;

import Pages.ANNCalenderPage;
import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ANNCalenderPageTest extends TestBase {
    ANNCalenderPage annCalenderPage;
    PhysicianLoginPage physicianLoginPage;


    @BeforeTest
    public void setup() {
        annCalenderPage = new ANNCalenderPage();
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
    public void verifyBottomCalenderTest() {
        annCalenderPage.verifyBottomCalender(2, 2);
    }

    @Test
    public void verifyPatientInAllTest() {
        annCalenderPage.verifyPatientInAll(3);
    }

    @Test
    public void verifyEnterMobileNumberErrorMessageTest() {
        annCalenderPage.verifyEnterMobileNumberErrorMessage(3);
    }

    @Test
    public void verifyEnterValidMobileNumberErrorMessageTest() {
        annCalenderPage.verifyEnterValidMobileNumberErrorMessage();
    }

    @Test
    public void verifyPatientInProcedureTest() {
        annCalenderPage.verifyPatientInProcedure(2, 4);
    }

    @Test
    public void verifyPatientInConsultsTest() {
        annCalenderPage.verifyPatientInConsults(3, 5);
    }

    @Test
    public void verifyPatientInAppointmentTest() {
        annCalenderPage.verifyPatientInAppointment(4, 3);
    }

    @Test
    public void verifyViewCalenderTest() {
        annCalenderPage.verifyViewCalenderDateWise(2, 3);
    }

    @Test
    public void verifyPatientAllBySelectedDateTest() {
        annCalenderPage.verifyPatientInAllBySelectedDate(3);
    }

    @Test
    public void verifyPatientInProcedureBySelectedDateTest() {
        annCalenderPage.verifyPatientInProcedureBySelectedDate(2, 4, 2, 3);
    }

    @Test
    public void verifyPatientInConsultsBySelectedDateTest() {
        annCalenderPage.verifyPatientInConsultsBySelectedDate(3, 5, 2, 4);
    }

    @Test
    public void verifyPatientInAppointmentsBySelectedDateTest() {
        annCalenderPage.verifyPatientInAppointmentsBySelectedDate(4, 3, 2, 3);
    }

    @Test
    public void verifySelectWeekTest() {
        annCalenderPage.verifySelectWeek(2, 2, 3);
    }

    @Test
    public void verifyPatientInAllBySelectedWeekTest() {
        annCalenderPage.verifyPatientInAllBySelectedWeek(3);
    }

    @Test
    public void verifyPatientInProcedureBySelectedWeekTest() {
        annCalenderPage.verifyPatientInProcedureBySelectedWeek(2, 2, 2, 3, 4);
    }

    @Test
    public void verifyPatientInConsultsBySelectedWeekTest() {
        annCalenderPage.verifyPatientInConsultsBySelectedWeek(3, 2, 2, 3, 5);
    }

    @Test
    public void verifyPatientInAppointmentsBySelectedWeekTest() {
        annCalenderPage.verifyPatientInAppointmentsBySelectedWeek(4, 2, 2, 3, 3);
    }

    @Test
    public void verifyPatientBySelectedMonthInViewCalenderTest() {
        annCalenderPage.verifyPatientBySelectedMonthInViewCalender(2, 2);
    }

    @Test
    public void verifyPatientInAllBySelectedMonthInViewCalenderTest() {
        annCalenderPage.verifyPatientInAllBySelectedMonthInViewCalender(3);
    }

    @Test
    public void verifyPatientInProcedureBySelectedMonthInViewCalenderTest() {
        annCalenderPage.verifyPatientInProcedureBySelectedMonthInViewCalender(2, 2, 2, 4);
    }

    @Test
    public void verifyPatientInConsultsBySelectedMonthInViewCalenderTest() {
        annCalenderPage.verifyPatientInConsultsBySelectedMonthInViewCalender(3, 2, 2, 5);
    }

    @Test
    public void verifyPatientInAppointmentsBySelectedMonthInViewCalenderTest() {
        annCalenderPage.verifyPatientInAppointmentsBySelectedMonthInViewCalender(4, 2, 2, 3);
    }


    @AfterTest
    public void teardown() {
        driver.quit();
    }

}
