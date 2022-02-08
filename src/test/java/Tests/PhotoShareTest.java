package Tests;

import Base.BaseTwo;
import Pages.PhotoShare;
import org.testng.annotations.Test;

public class PhotoShareTest extends BaseTwo {

    @Test
    public void shareSuccess(){

        PhotoShare photoShare = homePage.photoShare();
        photoShare.setEmailId("marazislam8@gmail.com");
        photoShare.clickEmail();
        photoShare.setPassWord("TestCase0101");
        photoShare.clickLogin();
        photoShare.setChosePhoto("C:\\Users\\Syed Ashiq\\Pictures\\Saved Pictures/index.jpg");
        photoShare.uploadBtn();
        photoShare.upLOad();
        photoShare.sharePhoto();

    }

}
