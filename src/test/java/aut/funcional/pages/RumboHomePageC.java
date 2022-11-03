package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

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
    By imputNombreFinalLoc = By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[2]/div[1]/div/input");
    By imputApellidoFinalLoc = By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[2]/div[2]/div/input");
    By imputTelefonoFinalLoc = By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[3]/div[1]/div/intltelinput/div/input");
    By imputCorreoFinalLoc = By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[3]/div[2]/div/input");
    By imputComentarioFinalLoc = By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[4]/div/div/textarea");
    By checkTerminosLoc = By.xpath("//div[@class='col-md-12']//span[@class='check']");
    By checkVipLoc = By.xpath("//div[@class='crs_ancillary__title']//span[@class='check']");
    By opcionFiordosLoc = By.xpath("//li[@aria-label='Fiordos Noruegos']");
    By btnMasPasajerosLoc = By.xpath("//div[@class='crs-field-dd-occupancy crs_field--occupancy']//div[@role='button']");
    By masPasajerosLoc = By.xpath("(//button[contains(text(),'+')])[1]");
    By btnCrucero17Loc = By.xpath("//div[@id='package83052']//h5[@class='results-box-description ng-star-inserted']");
    By btnElegirCrucero17Loc = By.xpath("(//button[@class='crs-btn crs-btn--block crs-btn--cabin ng-star-inserted'])[7]");
    By btnObtenerPresupuestoLoc = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted'][normalize-space()='Solicitar presupuesto']");
    By opcionDosLoc = By.xpath("//body[1]/crs-app[1]/crs-advanced-outlet[1]/crs-cho-page[1]/crs-page-base[1]/div[1]/main[1]/div[1]/section[1]/crs-cho-booking-method[1]/section[1]/section[2]/header[1]/div[1]/label[1]/span[2]");
    By imputNombre17Loc = By.xpath("//crs-customer-info-form[1]/form[1]/div[2]/div[1]/div[1]/input[1]");
    By imputApellido17Loc = By.xpath("//crs-customer-info-form[1]/form[1]/div[2]/div[2]/div[1]/input[1]");
    By imputCorreo17Loc = By.xpath("//crs-customer-info-form[1]/form[1]/div[3]/div[2]/div[1]/input[1]");
    By imputTelefono17Loc = By.xpath("//crs-customer-info-form[1]/form[1]/div[3]/div[1]/div[1]/intltelinput[1]/div[1]/input[1]");
    By checkTerminos17Loc = By.xpath("//span[@class='text ng-star-inserted']");
    By checkVip17Loc = By.xpath("//div[@class='crs_ancillary__title']//span[@class='check']");
    By btnContinuarLoc = By.xpath("//button[@class='btn btn-cta btn-lg btn-block']");

    public void acceptCookies() {
        waitClick(btnCookiesLoc);
        click(btnCookiesLoc);
    }
    public void cruceros(){
        waitClick(btnVerMasLoc);
        click(btnVerMasLoc);
        waitDisplayclick(btnCrucerosLoc);
    }
    //Test 15
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
    public void finalTest15() throws IOException {
        waitDisplayclick(imputNombreFinalLoc);
        write("Sebastian",imputNombreFinalLoc);
        write("Herrera",imputApellidoFinalLoc);
        write("9999999", imputTelefonoFinalLoc);
        write("sherrerapinto@gmail.com", imputCorreoFinalLoc);
        write("hola a que hora sale el crucero?", imputComentarioFinalLoc);
        waitDisplayclick(checkTerminosLoc);
        waitClick(checkVipLoc);
        click(checkVipLoc);
    }
    //Test 17
    public void agregarDestino17(){
        waitClick(cruceroDestinoLoc);
        click(cruceroDestinoLoc);
        write("fiordos noruegos", imputCruceroLoc);
        waitDisplayclick(opcionFiordosLoc);
        waitDisplayclick(btnMasPasajerosLoc);
        waitClick(masPasajerosLoc);
        click(masPasajerosLoc);
        waitClick(btnBuscar);
        click(btnBuscar);
    }
    public void cotizacionCrucero17(){
        waitClick(btnCrucero17Loc);
        click(btnCrucero17Loc);
        changeTab();
        scrollDown();
        scrollDown();
        waitDisplayclick(btnElegirCrucero17Loc);
        waitClick(btnObtenerPresupuestoLoc);
        click(btnObtenerPresupuestoLoc);
    }
    public void finalCrucero17() {
        waitClick(opcionDosLoc);
        click(opcionDosLoc);
        actionsS(checkTerminos17Loc);
        write("Sebastian",imputNombre17Loc);
        write("Herrera",imputApellido17Loc);
        write("9999999",imputTelefono17Loc);
        write("sherrerapinto@gmail.com",imputCorreo17Loc);
    }
    public void clicksFinal17() throws IOException {
        scrollDown();
        waitClick(checkVip17Loc);
        click(checkVip17Loc);
        waitClick(btnContinuarLoc);
        click(btnContinuarLoc);
        screenShotP("Test17");
    }
}
