package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import io.cucumber.java8.De;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class RumboHomePage extends SeleniumWrapper {

    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    //loc
    By buscar = By.xpath("//button[normalize-space()='Buscar']");
    By acookies = By.xpath("//*[@id=\"iubenda-cs-banner\"]//button[2]");
    By destino = By.xpath("//input[@id='mui-2']");
    By primeraOpcion = By.xpath("//li[@id='mui-2-option-0']");



    public void okCookies(){
        click(acookies);
    }

    public void DestinoE() {
        write("Londres",destino);
        click(primeraOpcion);
    }

    public void clickvuelo(){

        click(buscar);
    }

}
