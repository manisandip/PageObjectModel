package WebTest1;

import static WebTest1.Utils.assertURL;

public class RegistrationResultPage {

    //method for asserting(verifying) registration message
    public void verifyUserSeeRegistrationSuccessMessage(){
        assertURL("registerresult");

    }
}
