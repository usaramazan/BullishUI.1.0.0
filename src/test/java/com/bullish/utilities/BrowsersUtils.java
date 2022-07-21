package com.bullish.utilities;

import com.bullish.pages.TestBase;
import com.bullish.stepDef.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class BrowsersUtils extends Driver {


    public static void staticWait(int second){
        try {
            Thread.sleep(1000 * second);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void setWaitTime(){
        driver.manage().timeouts();
    }


    /**
     * This method is scrolling a specific element.
     **/
    public void scrollToElement(WebElement element){

        JavascriptExecutor js = ((JavascriptExecutor) Driver.getDriver());
        js.executeScript("arguments[0].scrollIntoView(true);", element);

    }


    /**
     * This method is switch Iframe.
     **/

    public void switchFrame(String frameXpath) {
        Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath(frameXpath)));
    }


    public static void selectFromDropDown(WebElement element,String text){

        Select select = new Select(element);
        select.selectByVisibleText(text);
        try {
            Thread.sleep(1000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void switchWindow(String title){
        Set<String> windowHandles = Driver.getDriver().getWindowHandles();
        for(String window : windowHandles){
            Driver.getDriver().switchTo().window(window);
            if(Driver.getDriver().getTitle().equals(title)){
                break;
            }
        }
    }
}
