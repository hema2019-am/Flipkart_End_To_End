package com.ReuseableFunction;

import com.Baseclass.Library;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class SeleniumReusable extends Library {
    Actions action;

   public SeleniumReusable (WebDriver driver){
       this.driver=driver;
   }

   public void EnterValue(WebElement element, String value){
       try{
           element.sendKeys(value);
          // logger.info("Entered value: ");

       }catch(Exception e){
           System.out.println("Element not found");
       }
   }

   public void click(WebElement element){
       try{
           element.click();
          // logger.info("Clicked element");

       }catch(Exception e){
           System.out.println("Element not found");
       }
   }

   public void getTitle(){
       try{
           System.out.println(driver.getTitle());
       }catch (Exception e){
           System.out.println("Title not found");
       }
   }

   public void screenShot(String path){
       TakesScreenshot ts  = (TakesScreenshot)driver;
       File Src= ts.getScreenshotAs(OutputType.FILE);
       try{
           FileUtils.copyFile(Src,new File(path));
       } catch (IOException e) {
           System.out.println("Screenshot Error");
       }
   }
    public void getMultipleText(List<WebElement> element){
        List<WebElement> textElement = element;
        System.out.println(textElement.size());

        for(WebElement element1 : textElement){
            String totalText = element1.getText();
            System.out.println(totalText);
            System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        }
    }

    public void getMultipleTextFromMultipleElement(List<WebElement> oneElement, List<WebElement> twoElement){
        List<WebElement> oneList = oneElement;
        List<WebElement> twoList = twoElement;

        System.out.println(oneList.size());
        for(int i = 0; i < oneList.size(); i++){
            String oneElementText = oneList.get(i).getText();
            String twoElementText = twoList.get(i).getText();
            System.out.println(oneElementText + " " +  twoElementText);
        }
    }

    public void get3Result(List<WebElement> element){
        List<WebElement> textElement = element;
        System.out.println(textElement.size());
        if(textElement.size()>0){
            System.out.println(textElement.get(3).getText());

        }

    }

    public void dropdown(WebElement element, String text){
       Select drop = new Select(element);
       drop.selectByValue(text);

    }

    public void scrolldown(WebElement element){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        //js.executeScript("argument[0].click()",element);
    }

    public void waitSleep() throws InterruptedException {
       Thread.sleep(2000);
    }

    public void mouseHover(WebElement element){
         action = new Actions(driver);
        action.moveToElement(element).build().perform();


    }

    public void mouseClick(WebElement element){
       action =new Actions(driver);
       action.moveToElement(element).click().build().perform();
    }

    public void  windowHandle(WebElement element){
       String parentWindow = driver.getWindowHandle();
       //element.click();
        System.out.println(parentWindow);

        Set<String> AllWindow = driver.getWindowHandles();
        System.out.println("AllWindow:"+AllWindow.size());
        for(String child : AllWindow){
            driver.switchTo().window(child);
            System.out.println(child);
        }
    }

    public void AfterScreenshot(Scenario CucumberScenario){
       final byte[]  screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
       // CucumberScenario.attach(screenshot,"image/png",driver.getPageSource());
    }

    public void navigationBack(){
       driver.navigate().back();
    }
}
