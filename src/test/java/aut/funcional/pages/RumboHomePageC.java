package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboHomePageC extends SeleniumWrapper {
    public RumboHomePageC(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By btnCookiesLoc = By.xpath("//*[@id=\"iubenda-cs-banner\"]//button[2]");
    By btnVerMasLoc = By.xpath("(//div[contains(@class,'display-iu1hq3-MenuLink evvzyi81')])[10]");
    By btnCrucerosLoc = By.xpath("//ul[contains(@class,'dropdown-list display-9kg9gw-DropdownList e12exe0f1')]//a[contains(@title,'Cruceros')][normalize-space()='Cruceros']");
    By cruceroDestinoLoc = By.xpath("//div[@class='ng-tns-c52-3 p-multiselect-trigger']");
    By imputCruceroLoc = By.xpath(" //input[@role='textbox']");
    By opcionEmiratosLoc = By.xpath("//li[@aria-label='Dubái y Emiratos Árabes']");
    By btnBuscar = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted']");
    By elegirPrimerCruceroLoc = By.xpath("//div[@id='package88011']//div[@class='crs-card-link']");
    By deluxeAreaLoc = By.xpath("//article[4]//section[1]//crs-cabin-list-carousel[1]//div[1]//div[1]//div[1]//article[1]//footer[1]//crs-btn[1]//button[1]");
    By btnSolicitarPreLoc = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted']");
    By warningLoc = By.xpath("//span[@crstextresource='generic.do_not_worry']");
    By imputNombreFinalLoc = By.xpath("//input[@id='firstname_1667481360735']");
    By imputApellidoFinalLoc = By.xpath("//input[@id='lastname_1667481360735']");
    By imputTelefonoFinalLoc = By.xpath("//input[@type='tel']");
    By imputCorreoFinalLoc = By.xpath("//input[@id='email_1667481360735']");
    By imputComentarioFinalLoc = By.xpath("//textarea[@id='notes_1667480086864']");
    By checkTerminosLoc = By.xpath("//div[@class='col-md-12']//span[@class='check']");
    By checkVipLoc = By.xpath("//div[@class='crs_ancillary__title']//span[@class='check']");
    By btnConfirmarPreLoc = By.xpath("//span[@crstextresource='LABEL_CTA_CONFIRM']");




    public void acceptCookies() {
        waitClick(btnCookiesLoc);
        click(btnCookiesLoc);
    }
    public void cruceros(){
        waitClick(btnVerMasLoc);
        click(btnVerMasLoc);
        waitDisplayclick(btnCrucerosLoc);
    }
    public void agregarDestino(){
        waitClick(cruceroDestinoLoc);
        click(cruceroDestinoLoc);
        write("dubai", imputCruceroLoc);
        waitDisplayclick(opcionEmiratosLoc);
        waitClick(btnBuscar);
        click(btnBuscar);
    }

    public void cotizacionCrucero(){
        waitClick(elegirPrimerCruceroLoc);
        click(elegirPrimerCruceroLoc);
        changeTab();
        scrollDown();
        scrollDown();
        waitDisplayclick(deluxeAreaLoc);
        waitClick(btnSolicitarPreLoc);
        click(btnSolicitarPreLoc);

    }
    public String alertaFinal(){
        return getText(warningLoc);
    }
    public void finalTest15(){
        write("Sebastian",imputNombreFinalLoc);
        write("Herrera",imputApellidoFinalLoc);
        write("9999999", imputTelefonoFinalLoc);
        write("Sebastian.@gmail.com", imputCorreoFinalLoc);
        write("hola a que hora sale el crucero?", imputComentarioFinalLoc);
        waitDisplayclick(checkTerminosLoc);
        waitClick(checkVipLoc);
        click(checkVipLoc);
        waitDisplayclick(btnConfirmarPreLoc);
    }

}
