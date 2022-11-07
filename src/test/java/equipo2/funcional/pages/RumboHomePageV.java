package equipo2.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboHomePageV extends SeleniumWrapper {

    public RumboHomePageV(WebDriver driver) {
        super(driver);
    }

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
    By dropViajerosLoc = By.xpath("//span[normalize-space()='1 viajero']");
    By btnMasViajerosLoc = By.xpath("//button[@aria-label='Aumentar el número de adultos']//*[name()='svg']");
    By btnMenosViajerosLoc = By.xpath("//button[@aria-label='Reducir el número de adultos']//*[name()='svg']");
    By dropClaseLoc = By.xpath("//span[normalize-space()='Cualquier clase']");
    By vuelaOfertasEUR = By.xpath("//h4[normalize-space()='Vuela a Europa']");
    By vueloLisboa = By.xpath("//span[contains(text(),'desde 44€')]");
    By btnMasBrato = By.xpath("//div[@class='content-layout-view__column-right col-md-9']//li[2]");
    By vueloPlus = By.xpath("//div[@class='trip-collection-view__trips-container-top']//div[@class='FullTripCard__SelectedPriceContainer-sc-z8znd4-4 fpDjbd']");
    By serviciosFlex = By.xpath("//button[@class='Button-sc-1bbve8d-0 hFahzb']");
    By vueloBaratoTxt = By.xpath("//div[contains(@class,'container layer-1')]//li[2]//div[2]");
    By equisborrar = By.xpath("//div[@aria-label='Clear']//*[name()='svg']");
    By primeraOpcionO = By.xpath("//li[@id='mui-1-option-0']//span[@class='display-1okygcz-Autocompleter-styled']");
    By primeraOpcionD = By.id("mui-2-listbox");
    By primeraClase = By.xpath("//form[1]//div[2]//div[4]//div[1]//div[1]//div[1]//div[1]//section[1]//div[1]//div[5]");
    By btnSeccionNormal = By.xpath("//div[@class='trip-collection-view__trips-container-top']//div[@class='FullTripCard__AvailablePricesContainer-sc-z8znd4-6 bKeGHm']");
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
    By btnCookiesLoc = By.xpath("//button[normalize-space()='Aceptar todo']");
    By btnVuelosLoc = By.xpath("//div[@class='display-1dpcy4y-HubNavigationMenu-styled e10w470p3']//a[@title='Vuelos'][normalize-space()='Vuelos']");
    By inputOriginLoc = By.xpath("//input[@id='mui-1']");
    By inputDestinoLoc = By.xpath("//input[@id='mui-2']");
    By btnBuscarLoc = By.xpath("//button[normalize-space()='Buscar']");
    By fechaDespegableLoc = By.xpath("//label[normalize-space()='Fecha de ida']");
    By primeraOpcionLoc = By.xpath("//li[@id='mui-1-option-0']");
    By precioNormalLoc = By.xpath("//div[@class='trip-collection-view__trips-container-top']//div[@class='FullTripCard__AvailablePricesContainer-sc-z8znd4-6 bKeGHm']");
    By nombreQuienLoc = By.xpath("//input[@name='name']");
    By apellidoQuienLoc = By.xpath("//input[@name='surname']");
    By emailQuienLoc = By.xpath("//input[@id='contact-email']");
    By telefonoQuienLoc = By.xpath("//input[@name='phone']");
    By srCheckLock = By.xpath("//label[@id='radio-groups.1.travellers.1.title-MALE-label']//span[@class='check']");
    By nombreViajeroLock = By.xpath("//input[@name='groups.1.travellers.1.name']");
    By apellidoViajeroLock = By.xpath("//input[@name='groups.1.travellers.1.surname']");
    By diaNacimientoLoc = By.xpath("//input[@placeholder='DD']");
    By mesNacimientoLoc = By.xpath("//select[@aria-label='Selecciona el mes']");
    By mayoMesLoc = By.xpath("//option[@value='5']");
    By anioNaciemientoLoc = By.xpath("//input[@placeholder='AAAA']");
    By protegeMaletasLoc = By.xpath("//div[@class='panel brb brb-container']");
    By btnSiguienteLoc = By.xpath("//button[normalize-space()='Siguiente']");
    By tarifaSinDsctoLoc = By.xpath("//span[@data-test='radio-membershipProposal-STD-custom-radio']//span[@class='check']");
    By btnSiguiente2Loc = By.xpath("//button[normalize-space()='Siguiente']");
    By checkTerminosLoc = By.xpath("//span[@data-test='privacyPolicy-check']");



    // Test 1

    public void acceptCookie() {
        waitDisplayclick(btnCookiesLoc);
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

    public void vueloBarato() {
        waitDisplayclick(btnMasBrato);
    }

    public void vueloPlusPer() {
        //waitDisplayclick(vueloPlus);
        waitClick(vueloPlus);
        click(vueloPlus);

    }

    public void serviciosFlexibles() {
        waitClick(serviciosFlex);
        click(serviciosFlex);
    }

    public String txtvueloEco() {
        return getText(vueloBaratoTxt);
    }

    //Test 2 y 3
    public void acceptarCookies () {
        waitClick(btnCookiesLoc);
        click(btnCookiesLoc);
    }
<<<<<<< HEAD:src/test/java/equipo2/funcional/pages/RumboHomePageV.java
    public void pagarViaje2() {
        waitClick(btnSiguiente2Loc);
        click(btnSiguiente2Loc);
=======
    public void pagarViaje2(){
        waitDisplayclick(btnSiguiente2Loc);

>>>>>>> b932ca32982a9580d8df9027dce8d4ccb27f6430:src/test/java/aut/funcional/pages/RumboHomePageV.java

    }
    public void agregarPasajero (){
        write("Sebastian", nombreQuienLoc);
        write("Herrera", apellidoQuienLoc);
        write("sherrerapinto@gmail.com", emailQuienLoc);
        write("999999999", telefonoQuienLoc);
        waitDisplayclick(srCheckLock);
        write("",nombreViajeroLock);
        write("",apellidoViajeroLock);
        write("10", diaNacimientoLoc);
        click(anioNaciemientoLoc);
        waitDisplayclick(mayoMesLoc);
        write("1990", anioNaciemientoLoc);
        waitDisplayclick(protegeMaletasLoc);
        waitDisplayclick(btnSiguienteLoc);

    }
    public void clase () {
        waitClick(btnClaseLoc);
        click(btnClaseLoc);
    }
    public void destino () {
        write("Londres", inputDestinoLoc);
        click(primeraOpcionLoc);
    }
    public void miRumbo () {
        waitClick(btnMiRumbo);
        click(btnMiRumbo);
    }
    public void precioNormal(){
        waitClick(precioNormalLoc);
        actionsS(precioNormalLoc);
       // click(precioNormalLoc);
    }
    public void opcionClassic(){
        waitClick(btnOpcionClassic);
        actionsS(btnOpcionClassic);
    }
    public void login () {
        waitDisplayclick(loginCorreoLoc);
        write("duymrima@gmail.com", loginCorreoLoc);
        write("rumbobc10", loginPasswordLoc);
        click(btnLoginLoc);

    }
    public void viajeros () {
        waitClick(btnViajeroLoc);
        click(btnViajeroLoc);
    }
    public String alertaNinio () {
        return getText(alertaNiniosLoc);
    }
    public String alertaVuelo () {
        waitClick(alertabtnBuscarLoc);
        return getText(alertabtnBuscarLoc);
    }
    public void agregarNinios () {
        waitClick(btnAgregarNiniosLoc);
        click(btnAgregarNiniosLoc);
        click(opcion1NiniosLoc);
        click(btnAgregarNiniosLoc);
        click(opcion1NiniosLoc);
    }
    public void clickbucar () {
        click(btnBuscarLoc);
    }
    public void clickVuelos () {
        waitClick(btnVuelosLoc);
        click(btnVuelosLoc);
    }

    //Test 4

    public void origeninputClick() {
        /*waitClick(equisborrar);
        click(equisborrar);*/
        waitDisplayclick(equisborrar);
        waitClick(inputOriginLoc);
        write("Chile", inputOriginLoc);
        click(primeraOpcionO);
    }

    public void destinoInputClick() {
        write("Madrid", inputDestinoLoc);
        click(primeraOpcionD);
    }

    public void pasajeros() {
        click(dropViajerosLoc);
        click(btnMasViajerosLoc);
    }

    public void claseCabina() {
        click(dropClaseLoc);
        waitDisplayclick(primeraClase);
    }

    public void fechaDeIdaVuelta() {
        click(fechaDespegableLoc);
        click(fechaIda);
        click(fechaVuelta);
    }

    public void buscarVuelo() {
        click(btnBuscarLoc);
    }

    public void primeraOpcionNormal() {

        click(btnSeccionNormal);
    }

    public void opcionServiciosClassc() {
        waitClick(btnOpcionClassic);
        click(btnOpcionClassic);
    }

    public void asistenciaEspecial() {
        click(checkboxAsistenciaE);
        click(dropAsistencia);
        click(reduceMovility);
        click(childdropAsist);

    }
    //validaciones asistencia especial


    public String textoAsistencia1() {
        return getText(asistenciaOp1);
    }

    public String textoAsistencia2() {
        return getText(asistenciaOp2);
    }

    public String textoAsistencia3() {
        return getText(asistenciaOp3);

    }




}