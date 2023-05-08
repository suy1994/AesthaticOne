package testcases;

import Pages.AddPreviousImplantPage;
import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AddPreviousImplantPageTest extends TestBase {
    AddPreviousImplantPage addPreviousImplantPage;
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        addPreviousImplantPage = new AddPreviousImplantPage();
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
    public void wayToAddPreviousImplantTest() {
        addPreviousImplantPage.wayToAddPreviousImplant();
    }

    @Test
    public void verifyAddImplantInformationTest() {
        addPreviousImplantPage.verifyByDefaultValueDisplayOfManufacturerDropdown();
    }

    @Test
    public void verifyManualEntryLabelsTest() {
        addPreviousImplantPage.verifyManualEntryLabelsForLeftImplant();
    }

    @Test
    public void verifyErrorMessagesWithoutEnterAnyDataTest() {
        addPreviousImplantPage.verifyErrorMessagesWithoutEnterAnyDataForLeftImplant();
    }

    @Test
    public void verifyEnterImplantErrorMessageTest() {
        addPreviousImplantPage.verifyEnterImplantErrorMessage();
    }

    @Test
    public void verifyInvalidDateErrorMessageTest() {
        addPreviousImplantPage.verifyInvalidDateErrorMessage();
    }

    @Test
    public void verifyErrorMessageForEitherEnterRefNoAndSNNoOrLotNoForLeftImplantTest() {
        addPreviousImplantPage.verifyErrorMessageForEitherEnterRefNoAndSNNoOrLotNo(10, 2, 10, 2, 10, 2, 10);
    }

    @Test
    public void verifyCancelButtonOfAddImplantPageTest() {
        addPreviousImplantPage.verifyCancelButtonOfAddImplantPage();
    }

    @Test
    public void enterAddImplantInformationForLeftImplantTest() {
        addPreviousImplantPage.enterAddImplantInformationForLeftImplant(4, 2, 2, 2, 2, 10, 2);
    }

    @Test
    public void verifyCancelButtonOfFormTest() {
        addPreviousImplantPage.verifyCancelButtonOfForm();
    }

    @Test
    public void verifySkipOfFormTest() {
        addPreviousImplantPage.verifySkipOfForm(4, 2, 2, 2, 2, 10, 2);
    }

    @Test
    public void verifyImplantCardTest() throws Exception {
        addPreviousImplantPage.verifyLeftImplantCard(4);
    }

    @Test
    public void verifyDeleteImplantCardTest() {
        addPreviousImplantPage.verifyDeleteImplantCard();
    }

    @Test
    public void verifyDoneButtonTest() {
        addPreviousImplantPage.verifyDoneButton(2, 2, 2, 2, 2, 10, 2);
    }

    @Test
    public void verifyOperativeSummaryTest() {
        addPreviousImplantPage.verifyOpReportInOpSummary();
    }

    @Test
    public void editOperativeSummaryTest() {
        addPreviousImplantPage.editOperativeSummary();
    }


    @Test
    public void verifyEditedOpSummaryTest() {
        addPreviousImplantPage.verifyEditedOpSummary();
    }

    @Test
    public void verifyDeleteEditedImplantCardTest() {
        addPreviousImplantPage.verifyDeleteEditedImplantCard();
    }

    @Test
    public void enterDetailsWithRefAndSrNumberForLeftImplantCardTest() {
        addPreviousImplantPage.enterDetailsWithRefAndSrNumber(2, 2, 2, 2, 2, 10, 2, 10, 2);
    }

    @Test
    public void verifySkipOfImplantCardOfEnteredRefAndSrNumberTest() {
        addPreviousImplantPage.verifySkipOfLeftImplantCardOfEnteredRefAndSrNumber();
    }

    @Test
    public void verifyLeftImplantCardOfEnteredRefAndSrNumberTest() throws Exception {
        addPreviousImplantPage.verifyLeftImplantCardOfEnteredRefAndSrNumber(4);
    }

    @Test
    public void verifyDeleteOfLeftImplantCardOfEnteredRefAndSrNumberTest() {
        addPreviousImplantPage.verifyDeleteOfLeftImplantCardOfEnteredRefAndSrNumber();
    }

    @Test
    public void verifyDoneButtonForRefAndSrNumberTest() {
        addPreviousImplantPage.verifyDoneButtonForRefAndSrNumber(2, 2, 2, 2, 2, 10, 2, 10, 2);
    }

    @Test
    public void verifyOperativeSummaryForRefAndSrNumberTest() {
        addPreviousImplantPage.verifyOpReportInOpSummaryForRefAndSrNumber();
    }

    @Test
    public void editOperativeSummaryForRefAndSrNumberTest() {
        addPreviousImplantPage.editOperativeSummaryForRefAndSrNumber();
    }

    @Test
    public void verifyEditedOpSummaryForRefAndSrNumberTest() {
        addPreviousImplantPage.verifyEditedOpSummaryForRefAndSrNumber();
    }

    @Test
    public void verifyDeleteLeftImplantCardForRefAndSrNumberTest() {
        addPreviousImplantPage.verifyDeleteLeftImplantCardForRefAndSrNumber();
    }

    @Test
    public void verifyManualEntryLabelsForRightImplantTest() {
        addPreviousImplantPage.verifyManualEntryLabelsForRightImplant();
    }

    @Test
    public void verifyErrorMessageForRightImplantTest() {
        addPreviousImplantPage.verifyErrorMessageForRightImplant(11, 2, 11, 2, 11, 2, 11);
    }

    @Test
    public void enterAddImplantInformationForRightImplantTest() {
        addPreviousImplantPage.enterAddImplantInformationForRightImplant(2, 2, 2, 2, 3, 11, 2);
    }

    @Test
    public void verifyCancelButtonOfFormForRightImplantTest() {
        addPreviousImplantPage.verifyCancelButtonOfFormForRightImplant();
    }

    @Test
    public void verifySkipOfFormForRightImplantTest() {
        addPreviousImplantPage.verifySkipOfFormForRightImplant(4, 2, 2, 2, 3, 11, 2);
    }

    @Test
    public void verifyRightImplantCardTest() throws Exception {
        addPreviousImplantPage.verifyRightImplantCard();
    }

    @Test
    public void verifyDeleteImplantCardForRightImplantTest() {
        addPreviousImplantPage.verifyDeleteRightImplantCard();
    }

    @Test
    public void verifyDoneButtonOfRightImplantTest() {
        addPreviousImplantPage.verifyDoneButtonOfRightImplant(2, 2, 2, 2, 3, 11, 2);
    }

    @Test
    public void verifyOpReportInOpSummaryOfRightImplantTest() {
        addPreviousImplantPage.verifyOpReportInOpSummaryOfRightImplant();
    }

    @Test
    public void editOperativeSummaryOfRightImplantTest() {
        addPreviousImplantPage.editOperativeSummaryOfRightImplant();
    }

    @Test
    public void verifyEditedOperativeSummaryOfRightImplantTest() {
        addPreviousImplantPage.verifyEditedOperativeSummaryOfRightImplant();
    }

    @Test
    public void verifyDeleteImplantCardOfRightImplantAfterVerifyingOPSummaryTest() {
        addPreviousImplantPage.verifyDeleteImplantCardOfRightImplantAfterVerifyingOPSummary();
    }


    @Test
    public void enterDetailsForRightImplantCardWithRefAndSrNumberTest() {
        addPreviousImplantPage.enterDetailsForRightImplantCardWithRefAndSrNumber(4, 2, 2, 2, 3, 11, 2, 11, 2);
    }

    @Test
    public void verifySkipButtonOfRightImplantCardOfEnteredRefAndSrNumberTest() {
        addPreviousImplantPage.verifySkipButtonOfRightImplantCardOfEnteredRefAndSrNumber();
    }

    @Test
    public void verifyRightImplantCardOfEnteredRefAndSrNumberTest() throws Exception {
        addPreviousImplantPage.verifyRightImplantCardOfEnteredRefAndSrNumber(4);
    }

    @Test
    public void verifyDeleteOfRightImplantCardOfEnteredRefAndSrNumberTest() {
        addPreviousImplantPage.verifyDeleteOfRightImplantCardOfEnteredRefAndSrNumber();
    }

    @Test
    public void verifyDoneButtonForRefAndSrNumberOfRightImplantTest() {
        addPreviousImplantPage.verifyDoneButtonForRefAndSrNumberOfRightImplant(2, 2, 2, 2, 3, 11, 2);
    }

    @Test
    public void verifyOpReportInOpSummaryForRefAndSrNumberOfRightImplantTest() {
        addPreviousImplantPage.verifyOpReportInOpSummaryForRefAndSrNumberOfRightImplant();
    }

    @Test
    public void editOperativeSummaryForRefAndSrNumberOfRightImplantTest() {
        addPreviousImplantPage.verifyEditOperativeSummaryForRefAndSrNumberOfRightImplant();
    }

    @Test
    public void verifyEditedOperativeSummaryForRefAndSrNumberOfRightImplantTest() {
        addPreviousImplantPage.verifyEditedOperativeSummaryForRefAndSrNumberOfRightImplant();
    }

    @Test
    public void deleteImplantCardAfterEditingOpSummaryTest() {
        addPreviousImplantPage.deleteImplantCardAfterEditingOpSummary();
    }

    @Test
    public void verifyManualEntryLabelsForBothImplantTest() {
        addPreviousImplantPage.verifyManualEntryLabelsForBothImplant();
    }

    @Test
    public void verifyErrorMessageForBothImplantTest() {
        addPreviousImplantPage.verifyErrorMessageForBothImplant(10, 2, 10, 2, 10, 2, 10, 11, 2, 11, 2, 11, 2, 11);
    }

    @Test
    public void enterAddImplantInformationForBothImplantTest() {
        addPreviousImplantPage.enterAddImplantInformationForBothImplant(2, 2, 2, 2, 4, 10, 2, 11, 2);
    }

    @Test
    public void verifyCancelButtonOfFormForBothImplantTest() {
        addPreviousImplantPage.verifyCancelButtonOfFormForBothImplant();
    }

    @Test
    public void verifySkipOfFormForBothImplantTest() {
        addPreviousImplantPage.verifySkipOfFormForBothImplant(2, 2, 2, 2, 4, 10, 2, 11, 2);
    }

    @Test
    public void verifyBothImplantCardTest() throws Exception {
        addPreviousImplantPage.verifyBothImplantCard();
    }

    @Test
    public void verifyDeleteImplantCardForBothImplantTest() {
        addPreviousImplantPage.verifyDeleteImplantCardForBothImplant();
    }

    @Test
    public void verifyDoneButtonForBothImplantTest() {
        addPreviousImplantPage.verifyDoneButtonForBothImplant(2, 2, 2, 2, 4, 10, 2, 11, 2);
    }

    @Test
    public void verifyOpReportInOpSummaryForBothImplantTest() {
        addPreviousImplantPage.verifyOpReportInOpSummaryForBothImplant();
    }

    @Test
    public void editOperativeSummaryForBothImplantTest() {
        addPreviousImplantPage.editOperativeSummaryForBothImplant();
    }

    @Test
    public void verifyEditedOpSummaryForBothImplantTest() {
        addPreviousImplantPage.verifyEditedOpSummaryForBothImplant();
    }

    @Test
    public void verifyDeleteEditedImplantCardForBothImplantTest() {
        addPreviousImplantPage.verifyDeleteEditedImplantCardForBothImplant();
    }

    @Test
    public void enterDetailsForBothImplantCardWithRefAndSrNumberTest() {
        addPreviousImplantPage.enterDetailsForBothImplantCardWithRefAndSrNumber(4, 2, 2, 2, 4, 10, 2, 10, 2, 11, 3, 11, 3);
    }

    @Test
    public void verifySkipButtonOfBothImplantCardOfEnteredRefAndSrNumberTest() {
        addPreviousImplantPage.verifySkipButtonOfBothImplantCardOfEnteredRefAndSrNumber();
    }

    @Test
    public void verifyBothImplantCardOfEnteredRefAndSrNumberTest() throws Exception {
        addPreviousImplantPage.verifyBothImplantCardOfEnteredRefAndSrNumber(4);
    }

    @Test
    public void verifyDeleteOfBothImplantCardOfEnteredRefAndSrNumberTest() {
        addPreviousImplantPage.verifyDeleteOfBothImplantCardOfEnteredRefAndSrNumber();
    }

    @Test
    public void verifyDoneButtonForRefAndSrNumberForBothImplantsTest() {
        addPreviousImplantPage.verifyDoneButtonForRefAndSrNumberForBothImplants(2, 2, 2, 2, 4, 10, 2, 10, 2, 11, 3, 11, 3);
    }

    @Test
    public void verifyOpSummaryForRefAndSrNumberForBothImplantsTest() {
        addPreviousImplantPage.verifyOpSummaryForRefAndSrNumberForBothImplants();
    }

    @Test
    public void editOpSummaryForRefAndSrNumberForBothImplantsTest() {
        addPreviousImplantPage.editOpSummaryForRefAndSrNumberForBothImplants();
    }

    @Test
    public void deleteImplantCardForRefAndSrNumberForBothImplantsTest() {
        addPreviousImplantPage.deleteImplantCardForRefAndSrNumberForBothImplants();
    }


}
