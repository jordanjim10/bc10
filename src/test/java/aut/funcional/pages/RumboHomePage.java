package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    By btnMasBrato = By.xpath("//div[@class='content-layout-view__column-right col-md-9']//li[2]");
    By vueloPlus = By.xpath("//div[@class='trip-collection-view__trips-container-top']//div[@class='FullTripCard__SelectedPriceContainer-sc-z8znd4-4 fpDjbd']");
    By serviciosFlex = By.xpath("//button[@class='Button-sc-1bbve8d-0 hFahzb']");
    By vueloBaratoTxt = By.xpath("//div[contains(@class,'container layer-1')]//li[2]//div[2]");

    By equisborrar =  By.xpath("//div[@aria-label='Clear']//*[name()='svg']");
    By primeraOpcionO = By.xpath("//li[@id='mui-1-option-0']//span[@class='display-1okygcz-Autocompleter-styled']");
    By primeraOpcionD = By.id("mui-2-listbox");
    By primeraClase = By.xpath("//div[normalize-space()='Primera']//div[contains(@class,'display-1q5nlab-Radio-styled')]");
    By elMejorPrecio = By.xpath("//div[@class='listing-sorting-container']//div[@class='sorting-tabs-view__label'][normalize-space()='El mejor']");
    By btnVariasComp = By.xpath("//span[@class='desc']");
    By btnSeccionNormal = By.xpath("//div[@class='trip-collection-view__trips-container-top']//div[@class='FullTripCard__AvailablePricesContainer-sc-z8znd4-6 ciYfDV']");
    By btnOpcionClassic = By.xpath("//button[@class='Button-sc-1bbve8d-0 jlNCZl']");
    By checkboxAsistenciaE = By.xpath("//label[@data-test='lmn-checkbox']//span[@class='check']");
    By dropAsistencia = By.xpath("//select[@name='REQUEST_TYPE']");
    By reduceMovility = By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[9]/div/div/div[2]/div[2]/div[1]/div/div/select/option[2]");
    By childdropAsist = By.xpath("//label[@for='traveller_1']//span[@class='check']");
    By fechaIda = By.xpath("//button[contains(@class,'display-4sxi84-Day-styled-Day-styled-Day-styled')][normalize-space()='1']");
    By fechaVuelta = By.xpath("//button[contains(@class,'display-4sxi84-Day-styled-Day-styled-Day-styled')][normalize-space()='3']");
    By asistenciaOp1 = By.xpath("//*[@id=\"special-requests-structured-requirements_1\"]/option[1]");
    By asistenciaOp2 = By.xpath("//*[@id=\"special-requests-structured-requirements_1\"]/option[2]");
    By asistenciaOp3 = By.xpath("//*[@id=\"special-requests-structured-requirements_1\"]/option[3]");



    // Test 1
    public void acceptCookie() {
        waitClick(btnCookiesLoc);
        click(btnCookiesLoc);
    }

    public void clickMenuVuelo() {
        click(btnVuelosLoc);
    }

    public void vuelaEuro() {
        waitClick(vuelaOfertasEUR);
        click(vuelaOfertasEUR);
    }

    public void vuelaLisboa() {
        waitClick(vueloLisboa);
        click(vueloLisboa);
    }

    public void vueloBarato(){
        waitDisplayclick(btnMasBrato);
    }

    public void vueloPlusPer(){
        //waitDisplayclick(vueloPlus);
        waitClick(vueloPlus);
        click(vueloPlus);

    }

    public void serviciosFlexibles(){
        waitClick(serviciosFlex);
        click(serviciosFlex);
    }

    public String txtvueloEco(){
        return getText(vueloBaratoTxt);
    }



    //Test 4

    public void origeninputClick(){
        waitClick(equisborrar);
        click(equisborrar);
        write("Chile",inputOriginLoc);
        click(primeraOpcionO);
    }

    public void destinoInputClick(){
        write("Madrid", inputDestinoLoc);
        click(primeraOpcionD);
    }

    public void pasajeros(){
        click(dropViajerosLoc);
        click(btnMasViajerosLoc);
    }

    public void claseCabina(){
        click(dropClaseLoc);
        waitDisplayclick(primeraClase);
    }

    public void fechaDeIdaVuelta(){
        click(fechaDespegableLoc);
        click(fechaIda);
        click(fechaVuelta);
    }

    public void buscarVuelo(){
        click(btnBuscarLoc);
    }

    public void primeraOpcionNormal(){
        click(btnSeccionNormal);
    }

    public void opcionServiciosClassc(){
        waitClick(btnOpcionClassic);
        click(btnOpcionClassic);
    }

    public void asistenciaEspecial(){
        click(checkboxAsistenciaE);
        click(dropAsistencia);
        click(reduceMovility);
        click(childdropAsist);

    }
    //validaciones asistencia especial


    public String textoAsistencia1(){
        return getText(asistenciaOp1);
    }

    public String textoAsistencia2(){
        return getText(asistenciaOp2);
    }
    public String textoAsistencia3(){
        return getText(asistenciaOp3);
    }

}
