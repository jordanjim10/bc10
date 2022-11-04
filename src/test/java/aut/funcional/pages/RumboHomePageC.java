package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RumboHomePageC  extends SeleniumWrapper {


    public RumboHomePageC(WebDriver driver) {
        super(driver);
    }

    //Localizadores
    By btnCookiesLoc = By.xpath("//*[@id=\"iubenda-cs-banner\"]//button[2]");
    By btnVermas1 = By.xpath("(//div[contains(@class,'display-iu1hq3-MenuLink evvzyi81')])[10]");
    By btnCruceros = By.xpath("//div[contains(@class,'display-1dpcy4y-HubNavigationMenu-styled e10w470p3')]//a[contains(@title,'Cruceros')][normalize-space()='Cruceros']");
    By crucerosOfertas = By.xpath("//div[@id='merchandise-5-royal-caribbean']//a[@class='more'][normalize-space()='Descubre la oferta']");
    By detallesRoyal = By.xpath("//div[@id='package-77815']//span[@class='crs-label'][normalize-space()='Detalles']");
    By itinearioRoyal = By.xpath("//div[@role='link']//span[@crstextresource='generic.itinerary'][normalize-space()='Itinerario']");
    By puertoSalidaRoyal = By.xpath("//button[@aria-label='Expand or collapse itinerary day 1']//span[@class='icon icon-arrow_down']");
    By puertollegadaRoyal = By.xpath("//button[@aria-label='Expand or collapse itinerary day 6']//span[@class='icon icon-arrow_down']");
    By itinearioR = By.xpath("//span[contains(text(),'Miami, Estados Unidos - Kralendijk, Bonaire - Cura')]");
    By btnPasajeros = By.xpath("//div[@class='crs-field-dd-occupancy crs_field--occupancy']//span[@class='p-dropdown-trigger-icon pi pi-chevron-down']");
    By btnAdulto = By.xpath("(//button[contains(text(),'+')])[1]");
    By btnJunior = By.xpath("(//button[contains(text(),'+')])[2]");
    By btnNinos = By.xpath("(//button[contains(text(),'+')])[3]");
    By btnBebes = By.xpath("(//button[contains(text(),'+')])[4]");
    By btnBuscar = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted']");
    By puertosele = By.xpath("(//div[@class='p-multiselect-label ng-tns-c52-6 p-placeholder'])[1]");
    By imputoPuerto = By.xpath("//input[@role='textbox']");
    By puertoBarcelona = By.xpath("//li[@aria-label='Barcelona']");
    By crucer27Dic = By.xpath("(//div[@class='crs-card-departure-date'])[14]");
    By camaroteExterior = By.xpath("(//button[@class='crs-btn crs-btn--block crs-btn--cabin ng-star-inserted'])[1]");
    By solicitarPresupuesto = By.xpath("//button[@class='crs-btn crs-btn--cta crs-btn--contain crs-btn--block ng-star-inserted']");
    // Elementos dinamicos xpath completos
    By nombreC = By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[2]/div[1]/div/input");
    By apellidoC =  By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[2]/div[2]/div/input");
    By telefonoC = By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[3]/div[1]/div/intltelinput/div/input");
    By emailC    =  By.xpath("/html/body/crs-app/crs-advanced-outlet/crs-cho-page/crs-page-base/div/main/div/section/crs-cho-booking-method/section/section[1]/div[1]/crs-customer-info-form/form/div[3]/div[2]/div/input");

    By comfirmar = By.xpath("//button[@class='btn btn-cta btn-lg btn-block']");
    By CiudadesC = By.xpath("//aside[@role='complementary']//span[@class='crs_value'][contains(text(),'Barcelona - Palma de Mallorca - Palermo - Civitave')]");
    //Trenes
    By botonnavTrenes = By.xpath("(//a[@title='Trenes'][normalize-space()='Trenes'])[1]");
    By origenTrenes = By.xpath("//label[normalize-space()='Origen']");
    By opcionOrigenTrenes = By.xpath("(//div[contains(@role,'option')])[1]");
    By destinoTrenes = By.xpath("//label[normalize-space()='Destino']");
    By opcionDestino = By.xpath("(//div[@role='option'])[1]");
    By pasajerosTrenes = By.xpath("(//button[contains(@class,'display-vu9q0w-Dropdown-styled')])[1]");
    By agregarPasajerosT = By.xpath("//button[@aria-label='Aumentar el número de adultos']//*[name()='svg']");
    By anadirninoTrenes = By.xpath("//button[@aria-label='Aumentar el número de niños']");
    By anadirBebe = By.xpath("//li[normalize-space()='Bebé, 0-11 meses']");
    By busquedaTrenes = By.xpath("//button[normalize-space()='Buscar']");
    By noEncontradoT = By.xpath("(//div[@class='Container__StyledContainer-sc-sb5e2u-0 fzfA-dR NoResultsPanel__Title-sc-148mow5-2 ejrcDf'])[1]");


    //Metodos Generales

    public void acceptCookie() {
        waitClick(btnCookiesLoc);
        click(btnCookiesLoc);
    }

    public void botonVerMas(){
        actionsS(btnVermas1);
        waitDisplayclick(btnCruceros);
    }


    //Test Case 0013

    public void ofertaRoyal(){
        click(crucerosOfertas);
        click(detallesRoyal);
        changeTab();


    }

    public void itinerarioDes(){
        waitDisplayclick(itinearioRoyal);
        waitDisplayclick(puertoSalidaRoyal);
        waitDisplayclick(puertollegadaRoyal);
    }

    public String textoItineario(){
        return getText(itinearioR);
    }

    //Test 0014

    public void familiaGrandes(){
        waitDisplayclick(btnPasajeros);
        click(btnAdulto);
        click(btnJunior);
        click(btnNinos);
        click(btnNinos);
        click(btnBebes);
        click(btnBebes);
    }

    public void botonBuscar(){
        click(btnBuscar);
    }


    //Test case 016
    public void puertoSeleccion(){
        click(puertosele);
        write("Barcelona",imputoPuerto);
        waitDisplayclick(puertoBarcelona);
    }

    public void seleccionDestinoC(){
        waitDisplayclick(crucer27Dic);
        changeTab();
        scrollDown();
        click(camaroteExterior);
        click(solicitarPresupuesto);
    }

    public void rellenarCampos(){
        waitDisplayclick(nombreC);
        write("Daniel",nombreC);
        write("Perez",apellidoC);
        write("96632858",telefonoC);
        write("Hola@Hotmail.com",emailC);
        waitDisplayclick(comfirmar);
    }

    public String textociudades(){
        return getText(CiudadesC);
    }


    //Test case 018 Trenes

    public void trenesBtn(){
        click(botonnavTrenes);
    }

    public void busquedaTrenes(){
        click(origenTrenes);
        click(opcionOrigenTrenes);
        click(destinoTrenes);
        click(opcionDestino);
        click(pasajerosTrenes);
        click(agregarPasajerosT);
        click(anadirninoTrenes);
        click(anadirBebe);
        click(busquedaTrenes);

    }

    public String noEncontradoTrenes(){
        return getText(noEncontradoT);
    }
}
