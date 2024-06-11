package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class HomePage extends Utility {

    By topElement = By.xpath("//ul[@class='top-menu notmobile']/child::li"); // Store elements is WebElement list


    //Select Menu method
    public void selectMenu(String menu) {
        //Store elements is WebElement list
        List<WebElement> topMenu = getMultipleElements(topElement);
        //Click on element according to parameter
        for (WebElement e : topMenu) {
            if (e.getText().equalsIgnoreCase(menu)) {
                e.click();
                break;
            }
        }
    }

    //Get text from all menu tab method
    public List<String> getTextFromAllMenu() {
        List<WebElement> topMenuElement = getMultipleElements(topElement);

        List<String> printAllMenuNames = new ArrayList<>();
        for (WebElement e : topMenuElement) {
            printAllMenuNames.add(e.getText());
        }
        List<String> pageHeadingList = new ArrayList<>();
        //Navigating to each element one by one
        for (int i = 0; i < printAllMenuNames.size(); i++) {
            selectMenu(printAllMenuNames.get(i));
            pageHeadingList.add(getTextFromElement(By.xpath("//h1[contains(text(),'" + printAllMenuNames.get(i) + "')]")));
        }
        return pageHeadingList;
    }

}
