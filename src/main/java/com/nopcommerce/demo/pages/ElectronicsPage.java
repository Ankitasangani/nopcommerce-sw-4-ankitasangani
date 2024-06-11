package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {

    By electronics = By.linkText("Electronics"); // Mouse Hover on “Electronics” Tab
    By phones = By.linkText("Cell phones"); // Mouse Hover on “Cell phones” and click
    By verify = By.xpath("//h1[text()='Cell phones']"); // Verify the text “Cell phones”
    By list = By.xpath("//a[@title='List']"); // Click on List View Tab
    By product = By.linkText("Nokia Lumia 1020");  // Click on product name “Nokia Lumia 1020” link
    By nokia = By.xpath("//h1[text()='Nokia Lumia 1020']");  // Verify the text “Nokia Lumia 1020”
    By price = By.id("price-value-20"); // Verify the price “$349.00”
    By qty = By.xpath("//input[@id='product_enteredQuantity_20']"); // Change quantity to 2
    By cartButton = By.id("add-to-cart-button-20"); // Click on “ADD TO CART” tab
    By added = By.xpath("//p[@class='content']"); // // Verify the Message "The product has been added to your shopping cart" on Top green Bar
    By close = By.xpath("//span[@class='close']");  // After that close the bar clicking on the cross button.
    By shopping = By.xpath("//span[@class='cart-label']"); // MouseHover on "Shopping cart"
    By goToCart = By.xpath("//button[@class='button-1 cart-button']"); // Click on "GO TO CART" button
    By message = By.xpath("//h1[text()='Shopping cart']"); // Verify the message "Shopping cart"
    By verifyQty = By.xpath("//div[@class='product-quantity']//input"); // Verify the quantity is 2
    By total = By.xpath("//span[@class='product-subtotal']");  // Verify the Total $698.00
    By terms = By.id("termsofservice");  // click on checkbox “I agree with the terms of service”
    By check = By.id("checkout"); // Click on “CHECKOUT”
    By text = By.xpath("//h1[text()='Welcome, Please Sign In!']"); // Verify the Text “Welcome, Please Sign In!”
    By tab = By.xpath("//button[normalize-space()='Register']"); // Click on “REGISTER” tab
    By register = By.xpath("//h1[text()='Register']"); // Verify the text “Register”
    By gender = By.id("gender-female"); // //Click on gender
    By firstName = By.id("FirstName");
    By lastname = By.id("LastName");
    By eMail = By.id("Email");
    By day = By.name("DateOfBirthDay");
    By month = By.name("DateOfBirthMonth");
    By year = By.name("DateOfBirthYear");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By button = By.id("register-button"); // Click on “REGISTER” Button
    By yourRegistration = By.xpath("//div[text()='Your registration completed']"); // Verify the message “Your registration completed”
    By button1 = By.xpath("//div[@class='buttons']//a"); // Click on “CONTINUE” tab
    By cart = By.xpath("//h1[text()='Shopping cart']"); // Verify the text “Shopping cart”
    By country = By.id("BillingNewAddress_CountryId");
    By city = By.id("BillingNewAddress_City");
    By address = By.id("BillingNewAddress_Address1");
    By zipCode = By.id("BillingNewAddress_ZipPostalCode");
    By phoneNumber = By.id("BillingNewAddress_PhoneNumber");
    By button3 = By.name("save"); // Click on “CONTINUE”
    By button4 = By.id("shippingoption_2"); // Click on Radio Button “2nd Day Air ($0.00)”
    By button5 = By.cssSelector(".button-1.shipping-method-next-step-button"); // Click on “CONTINUE”
    By button6 = By.id("paymentmethod_1"); // // Select Radio Button “Credit Card”
    By button7 = By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]");
    By visa = By.id("CreditCardType");  //Select “Visa” From Select credit card dropdown
    By cardHolderName = By.id("CardholderName");
    By cardNumber = By.id("CardNumber");
    By expireYear = By.id("ExpireYear");
    By code = By.id("CardCode");
    By button8 = By.xpath("//button[@class='button-1 payment-info-next-step-button']");  // Click on “CONTINUE”
    By creditCard = By.xpath("//span[contains(text(),'Credit Card')]"); // Verify “Payment Method” is “Credit Card”
    By shipping = By.xpath("//li[@class='shipping-method']//span[contains(text(),'2nd Day Air')]");// Verify “Shipping Method” is “2nd Day Air”
    By totalPayment = By.xpath("//span[@class='product-subtotal']"); // Verify Total is “$698.00”
    By button9 = By.xpath("//button[text()='Confirm']"); // Click on “CONFIRM”
    By thankYou = By.xpath("//h1[text()='Thank you']"); // Verify the Text “Thank You”
    By orderMessage = By.xpath("//strong[text()='Your order has been successfully processed!']"); // Verify the message “Your order has been successfully processed!”
    By continueButton = By.xpath("//button[@class='button-1 order-completed-continue-button']"); // Click on “CONTINUE”
    By welcome = By.xpath("//h2[text()='Welcome to our store']");  // Verify the text “Welcome to our store!"
    By link = By.xpath("//a[text()='Log out']"); // Click on “Logout” link


    public void mouseHoverAndClickOnElectronics() {
        mouseHoverToElementAndClick(electronics);
    }

    public void mouseHoverAndClickOnCellPhones() {
        mouseHoverToElementAndClick(phones);
    }

    public String verifyTextCellPhones() {
        return getTextFromElement(verify);
    }

    public void clickOnListViewTab() {
        clickOnElement(list);
    }

    public void clickOnProductNokiaLumia1020() {
        clickOnElement(product);
    }

    public String verifyTextNokiaLumia1020() {
        return getTextFromElement(nokia);
    }

    public String verifyThePrice() {
        return getTextFromElement(price);
    }

    public void changeQtyTo2() {
        driver.findElement(qty).clear();
        sendTextToElement(qty, "2");
    }

    public void clickOnAddToCart() {
        clickOnElement(cartButton);
    }

    public String verifyMessageProductAdded() {
        return getTextFromElement(added);
    }

    public void clickOnCrossButton() {
        clickOnElement(close);
    }

    public void mouseHoverOnShoppingCart() {
        mouseHoverToElementAndClick(shopping);
    }

    public void ClickOnGoToCart() {
        clickOnElement(goToCart);
    }

    public String verifyMessageShoppingCart() {
        return getTextFromElement(message);
    }

    public String verifyTheQtyIs2() {
        return driver.findElement(verifyQty).getAttribute("value");
    }

    public String verifyTotal() {
        return getTextFromElement(total);
    }

    public void clickOnTermsOfService() {
        clickOnElement(terms);
    }

    public void clickOnCheckout() {
        clickOnElement(check);
    }

    public String verifyWelcomeText() {
        return getTextFromElement(text);
    }

    public void clickOnRegisterTab() {
        clickOnElement(tab);
    }

    public String verifyRegisterText() {
        return getTextFromElement(register);
    }

    public void registerFields() {
        clickOnElement(gender);
        sendTextToElement(firstName, "Ankita");
        sendTextToElement(lastname, "Sangi");
        String userName = "" + (int) (Math.random() * Integer.MAX_VALUE);  //Create random username
        String emailID = "User" + userName + "@example.com";   //Create random email Id
        sendTextToElement(eMail, emailID);
        selectByValueFromDropDown(day, "5");
        selectByValueFromDropDown(month, "4");
        selectByValueFromDropDown(year, "1995");
        sendTextToElement(password, "Ankita@1995");
        sendTextToElement(confirmPassword, "Ankita@1995");
    }

    public void clickOnRegisterButton() {
        clickOnElement(button);
    }

    public String verifyRegisterMessage() {
        return getTextFromElement(yourRegistration);
    }

    public void clickOnNextContinue() {
        clickOnElement(button1);
    }

    public String textShoppingCart() {
        return getTextFromElement(cart);
    }

    public void checkOutFields() {
        selectByValueFromDropDown(country, "133");
        sendTextToElement(city, "Delhi");
        sendTextToElement(address, "A 47");
        sendTextToElement(zipCode, "110006");
        sendTextToElement(phoneNumber, "07424365789");
    }

    public void clickContinue() {
        clickOnElement(button3);
    }

    public void clickOnRadioButton() {
        clickOnElement(button4);
    }

    public void clickOnNextstepContinue() {
        clickOnElement(button5);
    }

    public void clickOnRadioButtonCreditCard() {
        clickOnElement(button6);
    }

    public void clickOnRadioButtonSelectCredit() {
        clickOnElement(button7);
    }

    public void selectVisa() {
        selectByValueFromDropDown(visa, "visa");
    }

    public void fillPaymentDetails() {
        sendTextToElement(cardHolderName, "Ankita sangi");
        sendTextToElement(cardNumber, "5413330089010640");
        selectByValueFromDropDown(expireYear, "2028");
        sendTextToElement(code, "828");
    }

    public void clickOnAfterPaymentContinue() {
        clickOnElement(button8);
    }

    public String verifyPaymentMethod() {
        return getTextFromElement(creditCard);
    }

    public String verifyShippingMethod() {
        return getTextFromElement(shipping);
    }

    public String verifyTotalPayment() {
        return getTextFromElement(totalPayment);
    }

    public void clickOnConfirm() {
        clickOnElement(button9);
    }

    public String verifyTextThankYou() {
        return getTextFromElement(thankYou);
    }

    public String verifySuccessfullyOrderMessage() {
        return getTextFromElement(orderMessage);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public String verifyWelcomeToOurStore() {
        return getTextFromElement(welcome);
    }

    public void clickOnLogOutLink() {
        clickOnElement(link);
    }

    public String verifyTheURL() {
        return driver.getCurrentUrl();
    }


}
