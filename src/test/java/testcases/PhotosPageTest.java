package testcases;

import Pages.PhotosPage;
import Pages.PhysicianLoginPage;
import base.TestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PhotosPageTest extends TestBase {

    PhotosPage photosPage;
    PhysicianLoginPage physicianLoginPage;

    @BeforeTest
    public void setup() {
        photosPage = new PhotosPage();
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
    public void wayToPhotosPageTest() {
        photosPage.wayToPhotosPage();
    }

    @Test
    public void verifyAddPhotoButtonTest() {
        photosPage.verifyAddPhotoButton();
    }

    @Test
    public void verifyUploadPhotoButtonTest() {
        photosPage.verifyUploadPhotoButton();
    }

    @Test
    public void imageUploadFromDesktopTest() throws Exception {
        photosPage.imageUploadFromDesktop();
    }

    @Test
    public void verifyCancelButtonInCropImageTest() {
        photosPage.verifyCancelButtonInCropImage();
    }

    @Test
    public void verifyDoneButtonInCropImageTest() throws Exception {
        photosPage.verifyDoneButtonInCropImage();
    }

    @Test
    public void verifyingErrorMessageWithoutSelectProcedureGPAndNameTest() {
        photosPage.verifyingErrorMessageWithoutSelectProcedureGPAndName();
    }

    @Test
    public void selectingDropdownValueIsProcedureGPAndProcedureNameTest() {
        photosPage.selectingDropdownValueInProcedureGPAndProcedureName();
    }

    @Test
    public void verifyCancelButtonOfAddPhotoDetailsTest() {
        photosPage.verifyCancelButtonOfAddPhotoDetails();
    }

    @Test
    public void verifyDoneButtonTest() throws Exception {
        photosPage.verifyDoneButton();
    }

    @Test
    public void verifyImageDetailsTest() {
        photosPage.verifyImageDetails();
    }

    @Test
    public void verifyShareButtonTest() {
        photosPage.verifyShareButton();
    }

    @Test
    public void verifyNoButtonInSharePhotosTest() {
        photosPage.verifyNoButtonInSharePhotos();
    }

    @Test
    public void verifyYesButtonTest() {
        photosPage.verifyYesButton();
    }

    @Test
    public void patientLoginTest() {
        photosPage.patientLogin();
    }

    @Test
    public void verifyingImageAndProcedureByPatientTest() {
        photosPage.verifyingImageAndProcedureByPatient();
    }

    @Test
    public void wayToMyInformationTest() {
        photosPage.wayToMyInformation();
    }

    @Test
    public void openPhotoTabTest() {
        photosPage.openPhotoTab();
    }

    @Test
    public void verifyAddButtonTest() {
        photosPage.verifyAddButton();
    }

    @Test
    public void browseFileImageFromDesktopTest() throws Exception {
        photosPage.browseFileImageFromDesktop();
    }

    @Test
    public void verifyNotesTextBoxTest() {
        photosPage.verifyNotesTextBox();
    }

    @Test
    public void verifyCancelButtonTest() {
        photosPage.verifyCancelButton();
    }

    @Test
    public void verifyDoneButtonInUploadImageTest() throws Exception {
        photosPage.verifyDoneButtonInUploadImage();
    }

    @Test
    public void verifyOpenUploadedImageTest() {
        photosPage.verifyOpenUploadedImage();
    }

    @Test
    public void verifyCloseButtonTest() {
        photosPage.verifyCloseButton();
    }

    @Test
    public void verifyDeleteButtonTest() {
        photosPage.verifyDeleteButton();
    }

    @Test
    public void verifyDeleteImageTest() {
        photosPage.verifyDeleteImage();
    }

    @Test
    public void uploadNewImageAndShareTest() throws Exception {
        photosPage.uploadNewImageAndShare();
    }

    @Test
    public void verifyCancelButtonOfSharePhotoTest() {
        photosPage.verifyCancelButtonOfSharePhoto();
    }

    @Test
    public void sharePhotoByPatientTest() {
        photosPage.sharePhotoByPatient();
    }

    @Test
    public void verifyImageBySurgeonTest() {
        photosPage.verifyImageBySurgeon();
    }


}
