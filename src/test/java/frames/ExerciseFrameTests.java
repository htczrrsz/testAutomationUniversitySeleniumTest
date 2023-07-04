package frames;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExerciseFrameTests extends BaseTests {

    @Test
    public void testFrame() {
        var nestedFramesPage = homePage.clickFrames().clickNestedFrames();
        Assert.assertEquals(nestedFramesPage.goLeftFrameAndGetText(),"LEFT","Left frame text incorrect");
        Assert.assertEquals(nestedFramesPage.goBottomFrameAndGetText(),"BOTTOM","Bottom frame text incorrect");

    }



}
