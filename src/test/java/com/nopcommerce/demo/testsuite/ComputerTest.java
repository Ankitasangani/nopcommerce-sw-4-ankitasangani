package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * 1. Create class “ComputerTest” into testsuite package
 * Write the following Test:
 * 1.Test name verifyProductArrangeInAlphaBaticalOrder()
 * 1.1 Click on Computer Menu.
 * 1.2 Click on Desktop
 * 1.3 Select Sort By position "Name: Z to A"
 * 1.4 Verify the Product will arrange in Descending order.
 * 2. Test name verifyProductAddedToShoppingCartSuccessFully()
 * 2.1 Click on Computer Menu.
 * 2.2 Click on Desktop
 * 2.3 Select Sort By position "Name: A to Z"
 * 2.4 Click on "Add To Cart"
 *
 * 2.5 Verify the Text "Build your own computer"
 * 2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
 * 2.7.Select "8GB [+$60.00]" using Select class.
 * 2.8 Select HDD radio "400 GB [+$100.00]"
 * 2.9 Select OS radio "Vista Premium [+$60.00]"
 * 2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander
 * [+$5.00]"
 * 2.11 Verify the price "$1,475.00"
 * 2.12 Click on "ADD TO CARD" Button.
 * 2.13 Verify the Message "The product has been added to your shopping cart" on Top
 * green Bar
 * After that close the bar clicking on the cross button.
 * 2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
 * 2.15 Verify the message "Shopping cart"
 * 2.16 Change the Qty to "2" and Click on "Update shopping cart"
 * 2.17 Verify the Total"$2,950.00"
 * 2.18 click on checkbox “I agree with the terms of service”
 * 2.19 Click on “CHECKOUT”
 * 2.20 Verify the Text “Welcome, Please Sign In!”
 * 2.21Click on “CHECKOUT AS GUEST” Tab
 * 2.22 Fill the all mandatory field
 * 2.23 Click on “CONTINUE”
 * 2.24 Click on Radio Button “Next Day Air($0.00)”
 * 2.25 Click on “CONTINUE”
 * 2.26 Select Radio Button “Credit Card”
 * 2.27 Select “Master card” From Select credit card dropdown
 * 2.28 Fill all the details
 * 2.29 Click on “CONTINUE”
 * 2.30 Verify “Payment Method” is “Credit Card”
 * 2.32 Verify “Shipping Method” is “Next Day Air”
 * 2.33 Verify Total is “$2,950.00”
 * 2.34 Click on “CONFIRM”
 * 2.35 Verify the Text “Thank You”
 * 2.36 Verify the message “Your order has been successfully processed!”
 * 2.37 Click on “CONTINUE”
 * 2.37 Verify the text “Welcome to our store”
 */

public class ComputerTest extends TestBase {

    ComputerPage computerPage = new ComputerPage();


    @Test
    public void verifyProductArrangeInAlphabeticalOrder() throws InterruptedException {
        computerPage.mouseHoverAndClickOnComputer();
        computerPage.mouseHoverAndClickOnDesktop();
        computerPage.sortByPositionZTOA();

        // Verify the Product will arrange in Descending order.
        List<String> actualText = computerPage.getProductsNameBeforeFilterZToA();
        computerPage.sortByPositionZTOA();
        Thread.sleep(2000);
        List<String> expectedText = computerPage.getProductsNameAfterFilterZToA();
        Assert.assertEquals(actualText, expectedText, "Text didn't match!");

    }

    @Test
    public void verifyProductAddedToShoppingCartSuccessFully() throws InterruptedException {
        computerPage.mouseHoverAndClickOnComputer();
        computerPage.mouseHoverAndClickOnDesktop();
        computerPage.sortByPositionAToZ();
        Thread.sleep(2000);
        computerPage.clickOnAddToCart();

        //Verify the message "Build your own computer"
        String expectedResult = "Build your own computer";
        String actualResult = computerPage.verifyTheText();
        Assert.assertEquals(actualResult, expectedResult, "Text didn't match!");

        computerPage.selectProduct(); // Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        computerPage.selectRam();   // Select "8GB [+$60.00]" using Select class.
        computerPage.selectHDDRadio();  // Select HDD radio "400 GB [+$100.00]"
        Thread.sleep(1000);
        computerPage.selectOSRadio();  // Select OS radio "Vista Premium [+$60.00]"
        Thread.sleep(1000);
        computerPage.twoCheckBoxes();  //  Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Command
        Thread.sleep(1000);

        //Verify the price "$1,475.00"
        String expectedPrice = "$1,475.00";
        String actualPrice = computerPage.verifyProductPrice();
        Assert.assertEquals(actualPrice, expectedPrice, "Text didn't match!");
        computerPage.addToCartButton();

        //Verify the Message "The product has been added to your shopping cart" on Top green Bar
        String expectedMessage = "The product has been added to your shopping cart";
        String actualMessage = computerPage.verifyTheMessage();
        Assert.assertEquals(actualPrice, expectedPrice, "Text didn't match!");
        computerPage.closeTheBar();
        computerPage.shoppingCart(); // Then MouseHover on "Shopping cart"
        Thread.sleep(2000);
        computerPage.goToCartButton(); // Click on "GO TO CART" button.

        // Verify the message "Shopping cart"
        String expected = "Shopping cart";
        String actual = computerPage.verifyShoppingCartMessage();
        Assert.assertEquals(actual, expected, "Text didn't match!");
        computerPage.changeQtyAndUpdateShoppingCart();

        //Verify the Total"$2,950.00"
        String expectedTotal = "$2,950.00";
        String actualTotal = computerPage.verifyTotal();
        Assert.assertEquals(actualTotal, expectedTotal, "Text didn't match!");
        computerPage.clickOnCheckBoxOfTermsNCondition();
        computerPage.clickOnCheckOut();
        // Verify the Text “Welcome, Please Sign In!”
        String expectedText = "Welcome, Please Sign In!";
        String actualText = computerPage.verifyWelcomeSignIn();
        Assert.assertEquals(actualText, expectedText, "Text didn't match!");
        computerPage.checkOutAsGuest(); // Click on “CHECKOUT AS GUEST” Tab
        computerPage.guestCheckoutFields();
        computerPage.clickOnContinue();
        computerPage.clickOnNextDayAir();
        computerPage.clickOnNextContinue();
        computerPage.clickOnCreditCard();
        Thread.sleep(1000);
        computerPage.selectMasterCard();
        computerPage.selectCreditCard();
        computerPage.fillPaymentCardDetails();
        computerPage.clickOnContinueButton();
        // Verify “Payment Method” is “Credit Card”
        String expectedCard = "Payment Method:Credit Card";
        String actualCard = computerPage.verifyPaymentMethod();
        Assert.assertEquals(actualCard, expectedCard, "Text didn't match!");

        // Verify “Shipping Method” is “Next Day Air”
        String expectedShippingText = "Shipping Method:Next Day Air";
        String actualShippingText = computerPage.verifyShippingMethod();
        Assert.assertEquals(actualShippingText, expectedShippingText, "Text didn't match!");

        // Verify Total is “$2,950.00”
        String expectedPayment = "$2,950.00";
        String actualPayment = computerPage.verifyTotalPayment();
        Assert.assertEquals(actualPayment, expectedPayment, "Text didn't match!");
        computerPage.clickOnConfirm();

        //Verify the Text “Thank You”
        String expected1 = "Thank you";
        String actual1 = computerPage.verifyTextThankYou();
        Assert.assertEquals(actual1, expected1, "Text didn't match!");

        //Verify the message “Your order has been successfully processed!”
        String expected2 = "Your order has been successfully processed!";
        String actual2 = computerPage.verifyYourOrder();
        Assert.assertEquals(actual2, expected2, "Text didn't match!");
        computerPage.ClickOnOrderCompletedContinueButton();

        //Verify the text “Welcome to our store”
        String expected3 = "Welcome to our store";
        String actual3 = computerPage.verifyTextWelcomeToOurStore();
        Assert.assertEquals(actual3, expected3, "Text didn't match!");

    }
}




















