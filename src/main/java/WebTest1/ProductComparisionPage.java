package WebTest1;

import org.openqa.selenium.By;

public class ProductComparisionPage extends Utils {
    String expected = "Compare products";
   private By _PageTitle = By.xpath("//div [@class='page-title']");
   //verify compare products message is displayed
    public void verifyUserIsOnProductComparisionPage(){
        assertTextMessage("Compare products",expected,_PageTitle);
    }
}
