package framework.engine.selenium;

import groovyjarjarasm.asm.ByteVector;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.io.File;
import java.io.IOException;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SeleniumWrapper {

    private final WebDriver driver;

    //Constructor Base
    public SeleniumWrapper(WebDriver driver){
        this.driver = driver;
    }

    //Wrappers Selenium
    public WebElement findElement(By locator){
        return driver.findElement(locator);
    }

    public List<WebElement> findElements (By locator){
        return driver.findElements(locator);
    }

    public String getText (By locator){
        return driver.findElement(locator).getText();
    }

    public void write(String inputText, By locator){
        isDisplayed(locator);
        driver.findElement(locator).sendKeys(inputText);
    }
    public void sendKeys(Keys key, By locator){
        driver.findElement(locator).sendKeys(key);
    }

    public void click(By locator){
        driver.findElement(locator).click();
    }

    public Boolean isDisplayed(By locator) {
        try {
            return driver.findElement(locator).isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }
    public Boolean isEnabled(By locator) {
        try {
            return driver.findElement(locator).isEnabled();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public Boolean isSelected(By locator) {
        try {
            return driver.findElement(locator).isSelected();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public void navigateTo(String url){
        driver.navigate().to(url);

    }
    public void changeTab(){
        driver.getWindowHandles().forEach(tab->driver.switchTo().window(tab));
    }


    public void waitClick(By locator){
        WebDriverWait waitme = new WebDriverWait(driver, Duration.ofSeconds(20));
        waitme.until(ExpectedConditions.elementToBeClickable(locator));
    }


    public void waitDisplayclick(By locator){
        WebDriverWait waitD = new WebDriverWait(driver,Duration.ofSeconds(10));

    public void modal(){

    }
    public void waitDisplayclick(By locator){
        WebDriverWait waitD = new WebDriverWait(driver,Duration.ofSeconds(25));

        waitD.until(ExpectedConditions.visibilityOfElementLocated(locator)).click();
    }

    public void scrollDown(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,800)","");

    }

    public void scrollup(){
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,-100)","");
    }

    public void summit (By locator){
        driver.findElement(locator).click();
    }

    public void screenShotP (String FileName) throws IOException {
        File File = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(File, new File("src\\test\\java\\aut\\funcional\\testcases\\hoteles\\imagenes\\" + FileName + ".jpeg"));
    }

    public void implicitwait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    public void actionsS(By locator){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(locator);
        action.moveToElement(element).click().perform();

        js.executeScript("window.scrollBy(0,-350)","");
    }
    public void actionmouse(By locator){
        Actions action = new Actions(driver);
        WebElement accion = findElement(locator);
        action.moveToElement(accion).click().perform();

    }

    public String getUrlTitle(){
        return driver.getTitle();
    }



}
