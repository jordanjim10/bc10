package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboHomePage extends SeleniumWrapper {

    public RumboHomePage(WebDriver driver) {
        super(driver);
    }

    //localizadores vuelos
    By btnVuelosLoc = By.xpath("//div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]//a[contains(@title,'Vuelos')][normalize-space()='Vuelos']");
    By btnBuscarLoc = By.xpath("//button[normalize-space()='Buscar']");
    By inputOriginLoc = By.xpath("//input[@id='mui-1']");
    By inputDestinoLoc = By.xpath("//input[@id='mui-2']");
    By primeraOpcionLoc = By.xpath("//li[@id='mui-2-option-0']");
    By btnCookiesLoc = By.xpath("//*[@id=\"iubenda-cs-banner\"]//button[2]");
    By fechaDespegableLoc = By.xpath("//span[@class='display-1p2c5n2-textOverflowEllipsis']");
    By btnAgregarNiniosLoc = By.xpath("//div[contains(@class,'display-a693ho-ChildPicker-styled')]//*[name()='svg']");
    By btnClaseLoc = By.xpath("//div[normalize-space()='Cualquier clase']");
    By btnViajeroLoc = By.xpath("//div[@class='display-uq0tvk']//button[@type='button']//div[2]//*[name()='svg']");
    By opcion1NiniosLoc = By.xpath("//li[normalize-space()='Bebé, 0-11 meses']");
    By alertaNiniosLoc = By.xpath("//span[contains(text(),'El número de bebés (edad 0-1) no puede ser superio')]");
    By alertabtnBuscarLoc = By.xpath("//span[normalize-space()='Introduce ciudad o aeropuerto de destino']");
    By loginCorreoLoc = By.xpath("//input[@id='lmn_login_widget_modal__email-input']");
    By loginPasswordLoc = By.xpath("//input[@id='lmn_login_widget_modal__password-input']");
    By btnLoginLoc = By.xpath("//button[normalize-space()='Iniciar sesión']");
    By btnMiRumbo = By.xpath("(//button[@class='display-1kl1c3w-HubNavigationProfile-styled esa6j1t10'])[1]");
    public void acceptarCookies(){
        waitClick(btnCookiesLoc);
        click(btnCookiesLoc);
    }

    public void clase(){
        waitClick(btnClaseLoc);
        click(btnClaseLoc);
    }
    public void destino() {
        write("Londres", inputDestinoLoc);
        click(primeraOpcionLoc);
    }
    public void miRumbo(){
        waitClick(btnMiRumbo);
        click(btnMiRumbo);
    }
    public void login(){
        waitDisplayclick(loginCorreoLoc);
        write("duymrima@gmail.com", loginCorreoLoc);
        write("rumbobc10", loginPasswordLoc);
        click(btnLoginLoc);

    }
    public void viajeros(){
        waitClick(btnViajeroLoc);
        click(btnViajeroLoc);
    }
    public String alertaNinio(){
       return getText(alertaNiniosLoc);
    }
    public String alertaVuelo(){
        waitClick(alertabtnBuscarLoc);
        return getText(alertabtnBuscarLoc);
    }
    public void agregarNinios(){
        waitClick(btnAgregarNiniosLoc);
        click(btnAgregarNiniosLoc);
        click(opcion1NiniosLoc);
        click(btnAgregarNiniosLoc);
        click(opcion1NiniosLoc);
    }
    public void clickbucar(){
        click(btnBuscarLoc);
    }
    public void clickVuelos(){
        waitClick(btnVuelosLoc);
        click(btnVuelosLoc);
    }

}
