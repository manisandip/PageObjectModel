package WebTest1;

import org.openqa.selenium.By;

public class CheckoutResult extends Utils {
    //storing locator of success message ............................>
    private By _checkoutsuccessmessage =By.xpath("//strong[contains(text(),'processed')]");

    public void verifyCheckoutSuccessMessage()

    {
        TimeDelay(5);
        clickOnElement(_checkoutsuccessmessage);
        String expected = "Your order has been successfully processed!";
        //Assert for verifying if user checkout successfully message is displayed...............................>
        assertTextMessage("Your order has been successfully processed!",expected,_checkoutsuccessmessage);
    }
}
