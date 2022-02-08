package Tests;


import Base.BaseTwo;
import Pages.FlicrUploadPhoto;
import org.testng.annotations.Test;

public class FlicerUploadPhotoTest extends BaseTwo {

    @Test
    public void uploadSuccess(){

        FlicrUploadPhoto flicrUploadPhoto = homePage.uploadPhoto();
        flicrUploadPhoto.setEmailId("marazislam8@gmail.com");
        flicrUploadPhoto.clickEmail();
        flicrUploadPhoto.setPassWord("TestCase0101");
        flicrUploadPhoto.clickLogin();
        flicrUploadPhoto.setChosePhoto("C:\\Users\\Syed Ashiq\\Pictures\\Saved Pictures/index.jpg");
        flicrUploadPhoto.uploadBtn();
        flicrUploadPhoto.upLOad();

    }

}
