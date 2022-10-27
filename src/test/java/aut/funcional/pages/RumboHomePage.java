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
    //localizadores vuelos
    By btnVuelosLoc = By.xpath("//div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]//a[contains(@title,'Vuelos')][normalize-space()='Vuelos']");
    By btnBuscarLoc = By.xpath("//button[normalize-space()='Buscar']");
    By inputOriginLoc = By.xpath("//input[@id='mui-1']");
    By inputDestinoLoc = By.xpath("//input[@id='mui-2']");
    By primeraOpcionLoc = By.xpath("//li[@id='mui-2-option-0']");
    By btnCookiesLoc = By.xpath("//*[@id=\"iubenda-cs-banner\"]//button[2]");
    By fechaDespegableLoc = By.xpath("//span[@class='display-1p2c5n2-textOverflowEllipsis']");
    By dropViajerosLoc = By.xpath("//span[normalize-space()='1 viajero']");
    By btnMasViajerosLoc = By.xpath("//button[@aria-label='Aumentar el número de adultos']//*[name()='svg']");
    By btnMenosViajerosLoc = By.xpath("//button[@aria-label='Reducir el número de adultos']//*[name()='svg']");
    By dropClaseLoc = By.xpath("//span[normalize-space()='Cualquier clase']");
    By btnViajeSinEscalasLoc = By.xpath("//label[@for='view152']//div[@class='btn-switch__container']");
    By btnMasRapidoLoc = By.xpath("//div[contains(@class,'listing-sorting-container')]//div[@class='sorting-tabs-view__label'][normalize-space()='Más rápido']");
    By btnPlusLoc = By.xpath("//div[contains(@class,'trip-collection-view__trips-container-top')]//span[contains(@class,'MembershipBadge__MembershipBadgeIconWrapper-sc-bcdl0j-1 khkHaW')]");
    By btnFlexibleLoc = By.xpath("//button[normalize-space()='Elegir Flexible']");
    By btnClassicLoc = By.xpath("//button[normalize-space()='Elegir Classic']");
    By vuelaOfertasEUR = By.xpath("//h4[normalize-space()='Vuela a Europa']");
    By vueloLisboa = By.xpath("//span[contains(text(),'desde 44€')]");

    public void acceptCookie(){
        click(btnCookiesLoc);
    }

    public void clickMenuVuelo(){
        click(btnVuelosLoc);
    }

    public void vuelaEuro(){
        click(vuelaOfertasEUR);
    }



}
