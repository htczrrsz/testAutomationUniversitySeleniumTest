package horizontalSlider;

import base.BaseTests;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class HorizontalSliderTests extends BaseTests {

  @Test
   public void testSlideToWholeElement() throws InterruptedException {
     String value= "4";
     var sliderPage= homePage.clickHorizontalSlider();

     sliderPage.setSliderValue(value);
     assertEquals(sliderPage.getSliderValue(),value,"Slider value is incorrect");
  }





}
