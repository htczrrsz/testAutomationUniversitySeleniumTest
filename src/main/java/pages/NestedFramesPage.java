package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NestedFramesPage {

   private WebDriver driver;
 private String topFrame="frame-top";
 private String leftFrame="frame-left";
 private String bottomFrame="frame-bottom";
 private By body=By.tagName("body");



   public NestedFramesPage(WebDriver driver){
      this.driver= driver;
   }




public String goLeftFrameAndGetText(){
       driver.switchTo().frame(topFrame);
       driver.switchTo().frame(leftFrame);
       String text= getFrameText();
//       driver.switchTo().parentFrame();
//       driver.switchTo().parentFrame();
    driver.switchTo().defaultContent();
      return text;
}




    public String goBottomFrameAndGetText(){
       driver.switchTo().frame(bottomFrame);
       String text= getFrameText();
       driver.switchTo().parentFrame();
      return text;
}


    private String getFrameText() {
        return driver.findElement(body).getText();
    }


    public NestedFramesPage clickNestedFrames(){
        driver.findElement(By.linkText("Nested Frames")).click();
        return new NestedFramesPage(driver);
    }

}
