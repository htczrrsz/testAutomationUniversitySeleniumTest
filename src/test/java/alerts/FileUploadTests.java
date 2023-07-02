package alerts;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FileUploadTests extends BaseTests {


    @Test
    public void testFileUpload(){
        var uploadPage=homePage.clickFileUpload();
        uploadPage.uploadFile("");
        Assert.assertEquals(uploadPage.getUploadedFiles(),"","Uploaded files incorrect");
    }




}
