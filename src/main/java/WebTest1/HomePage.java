package WebTest1;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    private By _registerLink = By.xpath("//a[contains(., 'Register')]");
    private By _jewellerylink = By.linkText("Jewelry");
    private By _computers =By.linkText("Computers");

    // verify that user click on register button
    public void clickOnRegisterButton(){clickOnElement(_registerLink);}
    public void clickOnJewelleryLink(){
        //clicking on jewellery link
        clickOnElement(_jewellerylink);

    }
    //clicking on computer category
    public void clickOnComputerCategoryPage(){clickOnElement(_computers);

    }


}
