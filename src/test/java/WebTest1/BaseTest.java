package WebTest1;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest extends Utils {
    BrowserSelector browserSelector = new BrowserSelector();

    @BeforeMethod
    public void OpenBrowser(){
        browserSelector.openBrowser();
    }
    @AfterMethod
    public void CloseBrowser(ITestResult result){
        if (!result.isSuccess()) {
            takeScreenShot(result.getName() + TimeStamp());
        }

            browserSelector.CloseBrowser();
        }
    }

