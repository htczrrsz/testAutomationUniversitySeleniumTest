package contextMenu;

import base.BaseTests;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContextMenuTests extends BaseTests {


    @Test
    public void rightClickContextMenu(){
        var contextMenuPage= homePage.clickContextMenu();
        contextMenuPage.rightClickToBox();
        String popUpMessage= contextMenuPage.getPopUpText();
        contextMenuPage.acceptThePopUp();
        Assert.assertEquals(popUpMessage,"You selected a context menu","PopUp message incorrect");

    }



}
