package Pages;

import base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import static util.TestUtil.*;


public class ANNCalenderPage extends TestBase {
    String sheetName = "Calender";

    @FindBy(xpath = "(//a[@class='ann-calendar__month'])[1]")
    WebElement monthSelectedByViewCalender;

    @FindBy(xpath = "(//i[@class='ann-calendar__arrow-inner annicon-calendar-left'])[1]")
    WebElement leftHandSideCursor;

    @FindBy(xpath = "//a[@class='btn btn-outline-white btn-sm']")
    WebElement calenderViewButton;

    @FindBy(xpath = "(//li[@class='customCalendar-button ng-star-inserted'])[4]")
    WebElement calenderFilterDayWise;

    @FindBy(xpath = "(//ul[@class='customCalendar-button-outer'])[2]//li[2]")
    WebElement calenderFilterWeekWise;

    @FindBy(xpath = "(//a[@class='customCalendar-arrow customCalendar-arrow-left'])[2]")
    WebElement leftCursorOfCalenderFilter;

    @FindBy(xpath = "(//a[@class='curmnth'])[2]")
    WebElement monthAndYearLabelInCalender;

    @FindBy(xpath = "(//tbody[@class='customCalendar-month'])[2]/tr[1]")
    WebElement firstWeekSelected;

    @FindBy(xpath = "(//button[contains(text(),'Apply')])[2]")
    WebElement applyButton;

    @FindBy(xpath = "(//a[@class='ann-calendar__month'])[4]")
    WebElement month;

    @FindBy(xpath = "(//a[@class='ann-calendar__month'])[4]")
    WebElement calenderMonthOfBottomCalender;

    @FindBy(xpath = "//i[@class='annicon-back-arrow']")
    WebElement cancelButtonOfInvitation;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[1]/div[2]")
    WebElement loader;

    @FindBy(xpath = "(//div[@class='lds-ripple'])[4]/div[2]")
    WebElement loaderForAfterClickOnPatientName;

    @FindBy(xpath = "(//a[@class='ann-window__nav ann-window__nav-item'])[2]")
    WebElement consults;

    @FindBy(xpath = "(//a[@class='ann-window__nav ann-window__nav-item'])[3]")
    WebElement appointments;

    @FindBy(xpath = "//li[@class='ann-calendar__month-outer ann-calendar__month-selected ng-star-inserted']/a[1]")
    WebElement verifyMonthOfSelectedWeek;

    @FindBy(xpath = "//li[@class='ann-calendar__month-outer ann-calendar__month-selected ng-star-inserted']/a[2]")
    WebElement verifyWeekFromSelectedWeek;

    @FindBy(xpath = "//input[@name='phone']")
    WebElement mobileTextBox;

    @FindBy(xpath = "//button[@class='btn btn-md btn-primary btn-block mt-4 w-25']")
    WebElement addPatientButton;

    @FindBy(xpath = "//div[@class='ng-star-inserted']")
    WebElement enterMobileNumberErrorMessage;

    @FindBy(xpath = "//div[@class='tp-menu']/div[2]/a")
    WebElement closeButtonOfProfileName;


    public void verifyBottomCalender(int selectMonthEnterRowNo, int verifyEnterMonthRowNo) {
        String monthSelected = excel.getCellData(sheetName, "Month", selectMonthEnterRowNo);
        do {
            click(leftHandSideCursor, "");
        }
        while (!calenderMonthOfBottomCalender.getText().equals(monthSelected));
        sa.assertEquals(month.getText(), excel.getCellData(sheetName, "Month", verifyEnterMonthRowNo));
        click(month, "Click On this month ");
        sa.assertAll();
        sleep(2000);
    }

    public void verifyPatientInAll(int patientNameEnterRowNumber) {
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInAll = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        click(patientSearchInAll, "");
        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(2000);
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");
    }

    public void verifyEnterMobileNumberErrorMessage(int patientNameEnterRowNumber) {
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInAll = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        click(patientSearchInAll, "");
//        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(2000);
        clearListOfInputText(mobileTextBox);
        click(addPatientButton, "Click On Send Invitation to Patient Button");
        sa.assertEquals(enterMobileNumberErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 2));
        sa.assertAll();
    }

    public void verifyEnterValidMobileNumberErrorMessage() {
        sendKeys(mobileTextBox, excel.getCellData(sheetName, "Invalid Data", 2), "Send Invalid Mobile Number");
        click(addPatientButton, "Click On Send Invitation to Patient Button");
        sa.assertEquals(enterMobileNumberErrorMessage.getText(), excel.getCellData(sheetName, "Error Messages", 3));
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");
        sa.assertAll();
    }

    public void verifyPatientInProcedure(int procedureSelectEnterRowNo, int patientNameEnterRowNumber) {
        String procedureSelect = excel.getCellData(sheetName, "Labels", procedureSelectEnterRowNo);
        WebElement procedure = driver.findElement(By.xpath("//ul[@class='ann-window__navbar-sec mb-0']//a[.='" + procedureSelect + "']"));
        click(procedure, "Click On Procedure Button");
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInProcedure = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        sleep(2000);
        click(patientSearchInProcedure, "");
        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(2000);
        click(closeButtonOfProfileName, "Click On Cancel Button Of Invitation");
    }

    public void verifyPatientInConsults(int consultsSelectEnterRowNumber, int patientNameEnterRowNumber) {
        waitForElementToBeDisplayed(consults);
        sleep(2000);
        String consultsSelect = excel.getCellData(sheetName, "Labels", consultsSelectEnterRowNumber);
        WebElement consults = driver.findElement(By.xpath("//ul[@class='ann-window__navbar-sec mb-0']//a[.='" + consultsSelect + "']"));
        sleep(2000);
        click(consults, "Click On consults Button");
        verifyBottomCalender(2, 2);
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInConsults = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        sleep(2000);
        click(patientSearchInConsults, "");
//        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(3000);
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");
    }

    public void verifyPatientInAppointment(int AppointmentSelectEnterRowNumber, int patientNameEnterRowNumber) {
        waitForElementToBeDisplayed(appointments);
        String AppointmentSelect = excel.getCellData(sheetName, "Labels", AppointmentSelectEnterRowNumber);
        WebElement Appointment = driver.findElement(By.xpath("//ul[@class='ann-window__navbar-sec mb-0']//a[.='" + AppointmentSelect + "']"));
        click(Appointment, "Click On Procedure Button");
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInAppointment = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        sleep(2000);
        click(patientSearchInAppointment, "");
        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(2000);
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");
    }

    public void verifyViewCalenderDateWise(int selectMonthAndYear, int enterDateRowNumber) {
        driver.navigate().refresh();
        waitForLoader(loader);
        click(calenderViewButton, "Click on Calender button");
        waitForElementToBeDisplayed(calenderFilterDayWise);
        click(calenderFilterDayWise, "Click on Day button");
        sleep(1000);
        String MonthAndYear = excel.getCellData(sheetName, "Month And Year", selectMonthAndYear);
        do {
            click(leftCursorOfCalenderFilter, "");
        }
        while (!monthAndYearLabelInCalender.getText().equals(MonthAndYear));
        String whichDay = excel.getCellData(sheetName, "Date", enterDateRowNumber);
        WebElement daySelect = driver.findElement(By.xpath("//div[@class='p-4']//td[@class='customCalendar-date ng-star-inserted']//span[.='" + whichDay + "']"));
        click(daySelect, "");
        click(applyButton, "Click On Apply Button");
        sleep(1000);
    }

    public void verifyPatientInAllBySelectedDate(int patientNameEnterRowNumber) {
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearch = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        click(patientSearch, "");
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");
    }

    public void verifyPatientInProcedureBySelectedDate(int procedureSelectEnterRowNo, int patientNameEnterRowNumber, int selectMonthAndYear, int enterDateRowNumber) {
        verifyViewCalenderDateWise(selectMonthAndYear, enterDateRowNumber);
        verifyPatientInProcedure(procedureSelectEnterRowNo, patientNameEnterRowNumber);
    }

    public void verifyPatientInConsultsBySelectedDate(int consultsSelectEnterRowNo, int patientNameEnterRowNumber, int selectMonthAndYear, int enterDateRowNumber) {
        verifyViewCalenderDateWise(selectMonthAndYear, enterDateRowNumber);
        waitForElementToBeDisplayed(consults);
        sleep(2000);
        String consultsSelect = excel.getCellData(sheetName, "Labels", 3);
        WebElement consults = driver.findElement(By.xpath("//ul[@class='ann-window__navbar-sec mb-0']//a[.='" + consultsSelect + "']"));
        click(consults, "Click On consults Button");
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInConsults = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        sleep(2000);
        click(patientSearchInConsults, "");
//        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(3000);
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");

    }

    public void verifyPatientInAppointmentsBySelectedDate(int AppointmentSelectEnterRowNumber, int patientNameEnterRowNumber, int selectMonthAndYear, int enterDateRowNumber) {
        verifyViewCalenderDateWise(selectMonthAndYear, enterDateRowNumber);
        verifyPatientInAppointment(AppointmentSelectEnterRowNumber, patientNameEnterRowNumber);
    }

    public void verifySelectWeek(int selectMonthAndYear, int verifyMonthOFSelectedWeekEnterRowNo, int verifyWeekFromSelectedWeekEnterRowNo) {
        driver.navigate().refresh();
        waitForLoader(loader);
        click(calenderViewButton, "Click on Calender button");
        waitForElementToBeDisplayed(calenderFilterWeekWise);
        click(calenderFilterWeekWise, "Click On Week Button");
        String MonthAndYear = excel.getCellData(sheetName, "Month And Year", selectMonthAndYear);
        do {
            click(leftCursorOfCalenderFilter, "");
        }
        while (!monthAndYearLabelInCalender.getText().equals(MonthAndYear));
        click(firstWeekSelected, "");
        click(applyButton, "Click On Apply Button");
        sleep(1000);
        sa.assertEquals(verifyMonthOfSelectedWeek.getText(), excel.getCellData(sheetName, "Verify Selected Week", verifyMonthOFSelectedWeekEnterRowNo));
        sa.assertEquals(verifyWeekFromSelectedWeek.getText(), excel.getCellData(sheetName, "Verify Selected Week", verifyWeekFromSelectedWeekEnterRowNo));
        sa.assertAll();
    }

    public void verifyPatientInAllBySelectedWeek(int patientNameEnterRowNumber) {
        verifyPatientInAll(patientNameEnterRowNumber);
    }

    public void verifyPatientInProcedureBySelectedWeek(int procedureSelectEnterRowNo, int selectMonthAndYear, int verifyMonthOFSelectedWeekEnterRowNo, int verifyWeekFromSelectedWeekEnterRowNo, int patientNameEnterRowNumber) {
        verifySelectWeek(selectMonthAndYear, verifyMonthOFSelectedWeekEnterRowNo, verifyWeekFromSelectedWeekEnterRowNo);
        String procedureSelect = excel.getCellData(sheetName, "Labels", procedureSelectEnterRowNo);
        WebElement procedure = driver.findElement(By.xpath("//ul[@class='ann-window__navbar-sec mb-0']//a[.='" + procedureSelect + "']"));
        click(procedure, "Click On Procedure Button");
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInProcedure = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        sleep(3000);
        click(patientSearchInProcedure, "");
        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(3000);
        click(closeButtonOfProfileName, "Click On Cancel Button Of Invitation");
    }

    public void verifyPatientInConsultsBySelectedWeek(int consultsSelectEnterRowNumber, int selectMonthAndYear, int verifyMonthOFSelectedWeekEnterRowNo, int verifyWeekFromSelectedWeekEnterRowNo, int patientNameEnterRowNumber) {
        verifySelectWeek(selectMonthAndYear, verifyMonthOFSelectedWeekEnterRowNo, verifyWeekFromSelectedWeekEnterRowNo);
        waitForElementToBeDisplayed(consults);
        sleep(2000);
        String consultsSelect = excel.getCellData(sheetName, "Labels", consultsSelectEnterRowNumber);
        WebElement consults = driver.findElement(By.xpath("//ul[@class='ann-window__navbar-sec mb-0']//a[.='" + consultsSelect + "']"));
        sleep(2000);
        click(consults, "Click On consults Button");
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInConsults = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        sleep(2000);
        click(patientSearchInConsults, "");
        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(2000);
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");
    }

    public void verifyPatientInAppointmentsBySelectedWeek(int AppointmentSelectEnterRowNumber, int selectMonthAndYear, int verifyMonthOFSelectedWeekEnterRowNo, int verifyWeekFromSelectedWeekEnterRowNo, int patientNameEnterRowNumber) {
        verifySelectWeek(selectMonthAndYear, verifyMonthOFSelectedWeekEnterRowNo, verifyWeekFromSelectedWeekEnterRowNo);
        verifyPatientInAppointment(AppointmentSelectEnterRowNumber, patientNameEnterRowNumber);
    }

    public void verifyPatientBySelectedMonthInViewCalender(int selectMonthAndYear, int monthSelectedByViewCalenderEnterRowNo) {
        driver.navigate().refresh();
        waitForLoader(loader);
        click(calenderViewButton, "Click on Calender button");
        String MonthAndYear = excel.getCellData(sheetName, "Month And Year", selectMonthAndYear);
        do {
            click(leftCursorOfCalenderFilter, "");
        }
        while (!monthAndYearLabelInCalender.getText().equals(MonthAndYear));
        click(applyButton, "Click On Apply Button");
        sleep(1000);
        sa.assertEquals(monthSelectedByViewCalender.getText(), excel.getCellData(sheetName, "Month", monthSelectedByViewCalenderEnterRowNo));
        sa.assertAll();
    }

    public void verifyPatientInAllBySelectedMonthInViewCalender(int patientNameEnterRowNumber) {
        verifyPatientInAll(patientNameEnterRowNumber);
    }

    public void verifyPatientInProcedureBySelectedMonthInViewCalender(int procedureSelectEnterRowNo, int selectMonthAndYear, int monthSelectedByViewCalenderEnterRowNo, int patientNameEnterRowNumber) {
        verifyPatientBySelectedMonthInViewCalender(selectMonthAndYear, monthSelectedByViewCalenderEnterRowNo);
        verifyPatientInProcedure(procedureSelectEnterRowNo, patientNameEnterRowNumber);
    }

    public void verifyPatientInConsultsBySelectedMonthInViewCalender(int consultsSelectEnterRowNumber, int selectMonthAndYear, int monthSelectedByViewCalenderEnterRowNo, int patientNameEnterRowNumber) {
        verifyPatientBySelectedMonthInViewCalender(selectMonthAndYear, monthSelectedByViewCalenderEnterRowNo);
        waitForElementToBeDisplayed(consults);
        sleep(2000);
        String consultsSelect = excel.getCellData(sheetName, "Labels", consultsSelectEnterRowNumber);
        WebElement consults = driver.findElement(By.xpath("//ul[@class='ann-window__navbar-sec mb-0']//a[.='" + consultsSelect + "']"));
        sleep(2000);
        click(consults, "Click On consults Button");
        String patientNameEnter = excel.getCellData(sheetName, "Patient Name", patientNameEnterRowNumber);
        WebElement patientSearchInConsults = driver.findElement(By.xpath("//div[@class='patient-list__info-details']//p[.='" + patientNameEnter + "']"));
        sleep(2000);
        click(patientSearchInConsults, "");
        waitForLoader(loaderForAfterClickOnPatientName);
        sleep(2000);
        click(cancelButtonOfInvitation, "Click On Cancel Button Of Invitation");
    }

    public void verifyPatientInAppointmentsBySelectedMonthInViewCalender(int AppointmentSelectEnterRowNumber, int selectMonthAndYear, int monthSelectedByViewCalenderEnterRowNo, int patientNameEnterRowNumber) {
        verifyPatientBySelectedMonthInViewCalender(selectMonthAndYear, monthSelectedByViewCalenderEnterRowNo);
        verifyPatientInAppointment(AppointmentSelectEnterRowNumber, patientNameEnterRowNumber);
    }

}
