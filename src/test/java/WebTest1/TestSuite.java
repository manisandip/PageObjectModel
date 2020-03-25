package WebTest1;

import org.testng.annotations.Test;

public class TestSuite extends BaseTest {
    //creating objects of the class to use all the methods and properties from the class
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    JewelleryPage jewelleryPage = new JewelleryPage();
    ProductComparisionPage productComparisionPage = new ProductComparisionPage();
    ProductDetailsPage productDetailsPage = new ProductDetailsPage();
    Categories categories = new Categories();
    ChangeCurrency changeCurrency = new ChangeCurrency();
    NewsPage newsPage= new NewsPage();
    GuestCheckout guestCheckout = new GuestCheckout();
    PaymentMethod paymentMethod = new PaymentMethod();
    CheckoutResult checkoutResult = new CheckoutResult();
    ShippingAddress shippingAddress = new ShippingAddress();
    Computers computers = new Computers();
    AddToCartButton addToCartButton = new AddToCartButton();


    @Test
    public void usershouldBeAbleToRegisterSuccessfully(){
        //user clicks on register button
        homePage.clickOnRegisterButton();
        //user enters registration details
        registrationPage.userEntersRegistrationDetails();
        //verify user is on register page
        registrationPage.verifyUserIsOnRegisterPage();
        //user can see success message
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
    }

   @Test
    public void userShouldBeAbleToCompareToProductsSuccessfully(){
        //user clicks on jewellery link
        homePage.clickOnJewelleryLink();
        //verify user is on jewellery page
        jewelleryPage.VerifyUserIsOnJeweleryPage();
        //user selects two products to add to compare list
        jewelleryPage.ChooseProductsToCompare();
        //user is on product comparision page
        productComparisionPage.verifyUserIsOnProductComparisionPage();
    }

    @Test
    public void unregisteredUserShouldNotBeAbleToReferAFriend(){
        //user click on computer link
        homePage.clickOnComputerCategoryPage();
        //verify that user is on computer category page
        productDetailsPage.VerifyUserIsOnComputerCatagoryPage();
        //user selects Applemac
        productDetailsPage.userClickOnAppleMac();
        //User selects notebook
        productDetailsPage.userClickOnNoteBook();
        //user clicks on refer a friend
        productDetailsPage.UserReferToFriend();
}

    @Test
    public void RegisteredUserShouldBeAbleToReferAFriendSuccessfully() {
        //click on register button
        homePage.clickOnRegisterButton();
        //verify user is on registration page
        registrationPage.verifyUserIsOnRegisterPage();
        //Enter registration details
        registrationPage.userEntersRegistrationDetails();
        //verify user is registered successfully
        registrationResultPage.verifyUserSeeRegistrationSuccessMessage();
        //click on computer category
        homePage.clickOnComputerCategoryPage();
        //verify user is on computer page
        categories.verifyUserOnComputerCatagoriesPage();
        //user click on notebook
        categories.userClickOnNoteBook();
        //user click on Applemac
        categories.userClickOnApplemac();
        //user refer  friend
        categories.userReferToFriend();
    }

    @Test
    public void userShouldBeAbleToVerifyCurrencyChange(){
        //user selects currency from drop down list
        changeCurrency.selectCurrencyFromDropDown();
        //user verify correct currency is present in the list of products
        changeCurrency.verifyCurrencySymbolPresent();
    }

    @Test
    public void userShouldBeAbleToAddNewCommentOnNopCommerceWeb(){
        //user clicks on details and enters new comment
        newsPage.userClickOnDetails();
        //user can see new message in the list
        newsPage.verifysuccessmessageofcomment();
    }

    @Test
    public void guestUserShouldBeAbleToCheckoutSuccessfully(){
        //User click on jewelry
        homePage.clickOnJewelleryLink();
        //user is on jewelery page
        jewelleryPage.VerifyUserIsOnJeweleryPage();
        //user add product to cart
        jewelleryPage.AddToCartProduct();
        //checkout as a guest
        guestCheckout.checkoutAsGuest();
        //enter shipping address
        shippingAddress.userShippingAddress();
        //enters payment method
        paymentMethod.userChoosePaymentMethod();
        //check out successfully
        checkoutResult.verifyCheckoutSuccessMessage();

    }
    @Test
    public void UserShouldBeAbleToSortProductHighToLowByPrice() {
        //click on computer category
        homePage.clickOnComputerCategoryPage();
        //click on notebook
        computers.UserClickOnNotebook();
        //select position price High to low from dropdown
        computers.UserSelectFRomPositionPriceHighToLow();
        computers.verifyUserShouldBeAbleToSeePriceHighToLow();

    }
    @Test
    public void verifyAddToCartButtonIsPresentInProducts(){
        addToCartButton.verifyAddToCartButton();

    }



}
