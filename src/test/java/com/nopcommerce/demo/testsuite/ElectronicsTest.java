package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ElectronicsPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * 1. Create the class ElectronicsTest
 * Write the following test
 * 1. Test name verifyUserShouldNavigateToCellPhonesPageSuccessfully()
 * 1.1 Mouse Hover on “Electronics” Tab
 * 1.2 Mouse Hover on “Cell phones” and click
 * 1.3 Verify the text “Cell phones”
 * 2. Test name verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully()
 * <p>
 * 2.1 Mouse Hover on “Electronics” Tab
 * 2.2 Mouse Hover on “Cell phones” and click
 * 2.3 Verify the text “Cell phones”
 * 2.4 Click on List View Tab
 * 2.5 Click on product name “Nokia Lumia 1020” link
 * 2.6 Verify the text “Nokia Lumia 1020”
 * 2.7 Verify the price “$349.00”
 * 2.8 Change quantity to 2
 * 2.9 Click on “ADD TO CART” tab
 * 2.10 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.12 Verify the message "Shopping cart"
 * 2.13 Verify the quantity is 2
 * 2.14 Verify the Total $698.00
 * 2.15 click on checkbox “I agree with the terms of service”
 * 2.16 Click on “CHECKOUT”
 * 2.17 Verify the Text “Welcome, Please Sign In!”
 * 2.18 Click on “REGISTER” tab
 * 2.19 Verify the text “Register”
 * 2.20 Fill the mandatory fields
 * 2.21 Click on “REGISTER” Button
 * 2.22 Verify the message “Your registration completed”
 * 2.23 Click on “CONTINUE” tab
 * 2.24 Verify the text “Shopping card”
 * 2.25 click on checkbox “I agree with the terms of service”
 * 2.26 Click on “CHECKOUT”
 * 2.27 Fill the Mandatory fields
 * 2.28 Click on “CONTINUE”
 * 2.29 Click on Radio Button “2nd Day Air ($0.00)”
 * 2.30 Click on “CONTINUE”
 * 2.31 Select Radio Button “Credit Card”
 * 2.32 Select “Visa” From Select credit card dropdown
 * 2.33 Fill all the details
 * 2.34 Click on “CONTINUE”
 * 2.35 Verify “Payment Method” is “Credit Card”
 * 2.36 Verify “Shipping Method” is “2nd Day Air”
 * 2.37 Verify Total is “$698.00”
 * 2.38 Click on “CONFIRM”
 * 2.39 Verify the Text “Thank You”
 * 2.40 Verify the message “Your order has been successfully processed!”
 * 2.41 Click on “CONTINUE”
 * 2.42 Verify the text “Welcome to our store”
 * <p>
 * 2.43 Click on “Logout” link
 * 2.44 Verify the URL is “https://demo.nopcommerce.com/”
 */

public class ElectronicsTest extends TestBase {

    ElectronicsPage electronicsPage = new ElectronicsPage();

    @Test
    public void verifyUserShouldNavigateToCellPhonesPageSuccessfully() {
        electronicsPage.mouseHoverAndClickOnElectronics();
        electronicsPage.mouseHoverAndClickOnCellPhones();

        // Verify the text “Cell phones”
        String expectedResult = "Cell phones";
        String actualResult = electronicsPage.verifyTextCellPhones();
        Assert.assertEquals(actualResult, expectedResult, "Text didn't match!");
    }

    @Test
    public void verifyThatTheProductAddedSuccessfullyAndPlaceOrderSuccessfully() throws InterruptedException {
        electronicsPage.mouseHoverAndClickOnElectronics();
        electronicsPage.mouseHoverAndClickOnCellPhones();

        // Verify the text “Cell phones”
        String expectedResult = "Cell phones";
        String actualResult = electronicsPage.verifyTextCellPhones();
        Assert.assertEquals(actualResult, expectedResult, "Text didn't match!");
        electronicsPage.clickOnListViewTab();
        Thread.sleep(1000);
        electronicsPage.clickOnProductNokiaLumia1020();

        // Verify the text “Nokia Lumia 1020”
        String expectedText = "Nokia Lumia 1020";
        String actualText = electronicsPage.verifyTextNokiaLumia1020();
        Assert.assertEquals(actualText, expectedText, "Text didn't match!");

        // Verify the price “$349.00”
        String expectedPrice = "$349.00";
        String actualPrice = electronicsPage.verifyThePrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Text didn't match!");
        electronicsPage.changeQtyTo2();
        electronicsPage.clickOnAddToCart();

        // Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = electronicsPage.verifyMessageProductAdded();
        Assert.assertEquals(actualMessage, expectedMessage, "Text didn't match!");
        electronicsPage.clickOnCrossButton();
        electronicsPage.mouseHoverOnShoppingCart();
        Thread.sleep(2000);
        electronicsPage.ClickOnGoToCart();

        // Verify the message "Shopping cart"
        String expected = "Shopping cart";
        String actual = electronicsPage.verifyMessageShoppingCart();
        Assert.assertEquals(actual, expected, "Text didn't match!");
        Thread.sleep(2000);

        // Verify the quantity is 2
        String expectedQty = "2";
        String actualQty = electronicsPage.verifyTheQtyIs2();
        Assert.assertEquals(actualQty, expectedQty, "Text didn't match!");

        // Verify the Total $698.00
        String expectedTotal = "$698.00";
        String actualTotal = electronicsPage.verifyTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Text didn't match!");
        electronicsPage.clickOnTermsOfService();
        electronicsPage.clickOnCheckout();

        // Verify the Text “Welcome, Please Sign In!”
        String expectedText1 = "Welcome, Please Sign In!";
        String actualText1 = electronicsPage.verifyWelcomeText();
        Assert.assertEquals(actualText1, expectedText1, "Text didn't match!");
        electronicsPage.clickOnRegisterTab();

        // Verify the text “Register”
        String expectedText2 = "Register";
        String actualText2 = electronicsPage.verifyRegisterText();
        Assert.assertEquals(actualText2, expectedText2, "Text didn't match!");
        electronicsPage.registerFields();
        electronicsPage.clickOnRegisterButton();
        electronicsPage.verifyRegisterMessage();
        electronicsPage.clickOnNextContinue();

        // Verify the text “Shopping cart”
        String expectedCart = "Shopping cart";
        String actualCart = electronicsPage.textShoppingCart();
        Assert.assertEquals(actualCart, expectedCart, "Text didn't match!");
        electronicsPage.clickOnTermsOfService();
        electronicsPage.clickOnCheckout();
        Thread.sleep(2000);
        electronicsPage.checkOutFields();
        electronicsPage.clickContinue();
        electronicsPage.clickOnRadioButton();
        electronicsPage.clickOnNextstepContinue();
        electronicsPage.clickOnRadioButtonCreditCard();
        Thread.sleep(1000);
        electronicsPage.clickOnRadioButtonSelectCredit();
        electronicsPage.selectVisa();
        Thread.sleep(2000);
        electronicsPage.fillPaymentDetails();
        electronicsPage.clickOnAfterPaymentContinue();

        // Verify “Payment Method” is “Credit Card”
        String expectedCard = "Credit Card";
        String actualCard = electronicsPage.verifyPaymentMethod();
        Assert.assertEquals(actualCard, expectedCard, "Text didn't match!");

        // Verify “Shipping Method” is “2nd Day Air”
        String expectedMethod = "2nd Day Air";
        String actualMethod = electronicsPage.verifyShippingMethod();
        Assert.assertEquals(actualMethod, expectedMethod, "Text didn't match!");

        // Verify Total is “$698.00”
        String expectedPay = "$698.00";
        String actualPay = electronicsPage.verifyTotalPayment();
        Assert.assertEquals(actualPay, expectedPay, "Text didn't match!");
        electronicsPage.clickOnConfirm();

        // Verify the Text “Thank You”
        String expectedVerify = "Thank you";
        String actualVerify = electronicsPage.verifyTextThankYou();
        Assert.assertEquals(actualVerify, expectedVerify, "Text didn't match!");

        // Verify the message “Your order has been successfully processed!”
        String expectedGetText = "Your order has been successfully processed!";
        String actualGetText = electronicsPage.verifySuccessfullyOrderMessage();
        Assert.assertEquals(actualGetText, expectedGetText, "Text didn't match!");

        electronicsPage.clickOnContinueButton();

        // Verify the text “Welcome to our store!"
        String expectedX = "Welcome to our store";
        String actualY = electronicsPage.verifyWelcomeToOurStore();
        Assert.assertEquals(actualY, expectedX, "Text didn't match!");

        electronicsPage.clickOnLogOutLink();

        // Verify the URL is “https://demo.nopcommerce.com/"
        String expectedUrl = "https://demo.nopcommerce.com/";
        String actualUrl = electronicsPage.verifyTheURL();
        Assert.assertEquals(actualUrl, expectedUrl, "Text didn't match!");

    }
}
