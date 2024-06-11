package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComputerPage extends Utility {

    By computer = By.linkText("Computers"); // Click on computer link
    By desktop = By.xpath("//a[@title='Show products in category Desktops'][normalize-space()='Desktops']");
    By filter = By.id("products-orderby");  // Select the filter
    By beforeFilter = By.cssSelector(".product-title"); // Store products before clicking on filter
    By afterFilter = By.className("product-title"); // Store elements after filtering
    By orderBy = By.id("products-orderby"); // Select Sort By position "Name: A to Z"
    By click = By.xpath("//button[text()='Add to cart']"); // Click on "Add To Cart"
    By verify = By.xpath("//h1[text()='Build your own computer']"); //Verify the Text "Build your own computer"
    By product = By.id("product_attribute_1"); // Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    By ram = By.id("product_attribute_2");  // Select "8GB [+$60.00]" using Select class
    By radio = By.id("product_attribute_3_7");  //Select HDD radio "400 GB [+$100.00]"
    By osRadio = By.id("product_attribute_4_9");  // Select OS radio "Vista Premium [+$60.00]"
    By boxes = By.id("product_attribute_5_12"); // Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Command
    By verifyPrice = By.id("price-value-1");   //Verify the price "$1,475.00"
    By addToCart = By.id("add-to-cart-button-1");   //Click on "ADD TO CARD" Button.
    By verifyMessage = By.xpath("//p[@class='content']");  //Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By crossButton = By.xpath("//span[@class='close']");  //close the bar clicking on the cross button.
    By cart = By.xpath("//span[@class='cart-label']"); //  MouseHover on "Shopping cart"
    By goToCart = By.xpath("//button[@class='button-1 cart-button']"); // Click on "GO TO CART" button.
    By verifyShoppingCart = By.xpath("//h1[text()='Shopping cart']");  //Verify the message "Shopping cart"
    By qty = By.xpath("//div[@class='quantity up']");  //Change the Qty to "2" and Click on "Update shopping cart"
    By total = By.xpath("//span[@class='product-subtotal']"); //Verify the Total"$2,950.00"
    By check = By.id("termsofservice"); // click on checkbox “I agree with the terms of service”
    By checkOut = By.id("checkout");  //Click on “CHECKOUT”
    By signIn = By.xpath("//h1[text()='Welcome, Please Sign In!']"); //Verify the Text “Welcome, Please Sign In!”
    By guest = By.xpath("//button[text()='Checkout as Guest']"); //Click on “CHECKOUT AS GUEST” Tab
    By firstName = By.id("BillingNewAddress_FirstName");
    By lastname = By.id("BillingNewAddress_LastName");
    By eMail = By.id("BillingNewAddress_Email");
    By countryId = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By postcode = By.id("BillingNewAddress_ZipPostalCode");
    By telephone = By.id("BillingNewAddress_PhoneNumber");
    By save = By.name("save");  //Click on “CONTINUE”
    By radioButton = By.id("shippingoption_1");  // Click on Radio Button “Next Day Air($0.00)”
    By nextButton = By.cssSelector(".button-1.shipping-method-next-step-button");  // //Click on “CONTINUE”
    By pay = By.id("paymentmethod_1");  // //Select Radio Button “Credit Card”
    By card = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"); // Select “Master card” From Select credit card dropdown
    By creditCard = By.id("CreditCardType");
    By name = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By year = By.id("ExpireYear");
    By code = By.id("CardCode");
    By button = By.xpath("//button[@class='button-1 payment-info-next-step-button']"); //Click on “CONTINUE”
    By method = By.xpath("//span[normalize-space()='Payment Method:']"); // Verify “Payment Method”
    By credit = By.xpath("//span[normalize-space()='Credit Card']"); // Payment method is “Credit Card”
    By shipping = By.xpath("//span[normalize-space()='Shipping Method:']"); // Verify “shipping Method”
    By next = By.xpath("//span[normalize-space()='Next Day Air']"); //  is “Next Day Air”
    By payment = By.xpath("//span[@class='value-summary']"); //Verify Total is “$2,950.00”
    By confirm = By.xpath("//button[text()='Confirm']"); //Click on “CONFIRM”
    By text = By.xpath("//h1[text()='Thank you']"); // Verify the Text “Thank You”
    By yourOrder = By.xpath("//strong[text()='Your order has been successfully processed!']"); //Verify the message “Your order has been successfully processed!”
    By button1 = By.xpath("//button[@class='button-1 order-completed-continue-button']"); //Click on “CONTINUE”
    By text1 = By.xpath("//h2[text()='Welcome to our store']"); // Verify the text “Welcome to our store”


    public void mouseHoverAndClickOnComputer() {
        mouseHoverToElementAndClick(computer);
    }

    public void mouseHoverAndClickOnDesktop() {
        mouseHoverToElementAndClick(desktop);
    }

    public void sortByPositionZTOA() {
        selectByValueFromDropDown(filter, "6");
    }

    public List<String> getProductsNameBeforeFilterZToA() {
        //Store products before clicking on filter
        List<WebElement> beforeFilterProductNames = getMultipleElements(beforeFilter);
        //Create arraylist
        List<String> beforeFilterProductNamesList = new ArrayList<>();
        //Store elements text to array list
        for (WebElement p : beforeFilterProductNames) {
            beforeFilterProductNamesList.add(p.getText());
        }
        //Sort arraylist to ascending order
        Collections.sort(beforeFilterProductNamesList);
        //Reverse the list
        Collections.reverse(beforeFilterProductNamesList);
        return beforeFilterProductNamesList;
    }

    public List<String> getProductsNameAfterFilterZToA() {
        //Store elements after filtering
        List<WebElement> afterFilterProductNames = getMultipleElements(afterFilter);
        //Create another list to store text of elements after clicking on filter Z to A
        List<String> afterFilterProductNamesList = new ArrayList<>();
        for (WebElement s : afterFilterProductNames) {
            afterFilterProductNamesList.add(s.getText());
        }
        return afterFilterProductNamesList;
    }

    public void sortByPositionAToZ() {
        selectByValueFromDropDown(orderBy, "5");
    }

    public void clickOnAddToCart() {
        mouseHoverToElementAndClick(click);
    }

    public String verifyTheText() {
        return getTextFromElement(verify);
    }

    public void selectProduct() {
        selectByValueFromDropDown(product, "1");
    }

    public void selectRam() {
        selectByValueFromDropDown(ram, "5");
    }

    public void selectHDDRadio() {
        clickOnElement(radio);
    }

    public void selectOSRadio() {
        clickOnElement(osRadio);
    }

    public void twoCheckBoxes() {
        clickOnElement(boxes);
    }

    public String verifyProductPrice() {
        return getTextFromElement(verifyPrice);
    }

    public void addToCartButton() {
        clickOnElement(addToCart);
    }

    public String verifyTheMessage() {
        return getTextFromElement(verifyMessage);
    }

    public void closeTheBar() {
        clickOnElement(crossButton);
    }

    public void shoppingCart() {
        mouseHoverToElement(cart);
    }

    public void goToCartButton() {
        mouseHoverToElementAndClick(goToCart);
    }

    public String verifyShoppingCartMessage() {
        return getTextFromElement(verifyShoppingCart);
    }

    public void changeQtyAndUpdateShoppingCart() {
        clickOnElement(qty);
    }

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    public void clickOnCheckBoxOfTermsNCondition() {
        clickOnElement(check);
    }

    public void clickOnCheckOut() {
        clickOnElement(checkOut);
    }

    public String verifyWelcomeSignIn() {
        return getTextFromElement(signIn);
    }

    public void checkOutAsGuest() {
        clickOnElement(guest);
    }

    public void guestCheckoutFields() {
        sendTextToElement(firstName, "Ankita");
        sendTextToElement(lastname, "Sangi");
        sendTextToElement(eMail, "ankitasangi123@gmail.com");
        selectByValueFromDropDown(countryId, "133");
        sendTextToElement(city, "Delhi");
        sendTextToElement(address, "25 Harbor Street");
        sendTextToElement(postcode, "110006");
        sendTextToElement(telephone, "07424365789");
    }

    public void clickOnContinue() {
        clickOnElement(save);
    }

    public void clickOnNextDayAir() {
        clickOnElement(radioButton);
    }

    public void clickOnNextContinue() {
        clickOnElement(nextButton);
    }

    public void clickOnCreditCard() {
        clickOnElement(pay);
    }

    public void selectMasterCard() {
        clickOnElement(card);
    }

    public void selectCreditCard() {
        selectByValueFromDropDown(creditCard, "MasterCard");
    }

    public void fillPaymentCardDetails() {
        sendTextToElement(name, "Ankita sangi");
        sendTextToElement(cardNumber, "5413330089010640");
        selectByValueFromDropDown(year, "2028");
        sendTextToElement(code, "828");
    }

    public void clickOnContinueButton() {
        clickOnElement(button);
    }

    public String verifyPaymentMethod() {
        return getTextFromElement(method) + getTextFromElement(credit);
    }

    public String verifyShippingMethod() {
        return getTextFromElement(shipping) + getTextFromElement(next);
    }

    public String verifyTotalPayment() {
        return getTextFromElement(payment);
    }

    public void clickOnConfirm() {
        clickOnElement(confirm);
    }

    public String verifyTextThankYou() {
        return getTextFromElement(text);
    }

    public String verifyYourOrder() {
        return getTextFromElement(yourOrder);
    }

    public void ClickOnOrderCompletedContinueButton() {
        clickOnElement(button1);
    }

    public String verifyTextWelcomeToOurStore() {
        return getTextFromElement(text1);
    }

}
