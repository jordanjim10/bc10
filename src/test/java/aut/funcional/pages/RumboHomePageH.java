package aut.funcional.pages;

import framework.engine.selenium.SeleniumWrapper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RumboHomePageH extends SeleniumWrapper {


    public RumboHomePageH(WebDriver driver) {
        super(driver);

    }

    //Localizadores Rumbo.es Hoteles

    //Boton Aceptar Cookies
    By btnCookiesLoc = By.xpath("//*[@id=\"iubenda-cs-banner\"]//button[2]");
    //Boton Hoteles NavMenu
    By btnHotelesNav = By.xpath("//div[@class='display-1dpcy4y-HubNavigationMenu-styled e10w470p3']//a[@title='Hoteles'][normalize-space()='Hoteles']");
    //Imput del destino
    By imputDestino = By.xpath("//input[@id='mui-1']");
    // Cualquier Destino
    By cualquierDestino = By.xpath("//span[normalize-space()='Cualquier destino']");
    //Selector Fecha
    By fecha1 = By.xpath("//*[@id=\"hub-csw-container\"]/div[2]/div/form/div/div[2]/div[1]/div/div[3]/div/div/section/div/div/div[2]/div[2]/button[2]");
    By fecha2 = By.xpath("/html[1]/body[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[5]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/div[1]/div[1]/section[1]/div[1]/div[1]/div[3]/div[2]/button[30]");
    By errorFecha = By.xpath("//span[contains(@role,'alert')]");
    By btnBuscar = By.xpath("//button[@type='submit']");
    By btnCancelacionG = By.xpath("//div[contains(text(),'Cancelación gratuita')]");
    By wifiGratis = By.xpath("//div[contains(text(),'Wifi gratis')]");
    By valoracionH = By.xpath("//span[normalize-space()='Valoración']");
    By vExcelente = By.xpath("//body/div[contains(@class,'sc-dmRaPn goosly custom-overlay-portal')]/div[@class='sc-kgflAQ jwIVQL']/div[1]//*[name()='svg']//*[name()='rect' and contains(@width,'20')]");
    By aplicarV = By.xpath("//button[@class='sc-fEOsli jzgnBo']");
    //By box1 = By.xpath("//div[@class='sc-GVOUr elqapB openx-ui-card-content']");
    //alternativa box1
    By box1 = By.xpath("//div[@class='sc-GVOUr dECEAl openx-ui-card-content']//div[@class='openx-ui-card-details-right']");
    By primeraCartaH = By.xpath("//span[normalize-space()='Walnut Shell Hotel']");
    //

    By comentariosH = By.xpath("//span[normalize-space()='Comentarios']");
    By serviciosH = By.xpath("//span[normalize-space()='Servicios']");
    By serviciowifi = By.xpath("//*[@id=\"amenity-content-INTERNET\"]/div[3]");
    By despliegueS = By.xpath("//*[@id=\"amenity-INTERNET\"]");
    //Login pendiente only debug
    By miRumbo = By.xpath("//button[@class='display-1kl1c3w-HubNavigationProfile-styled esa6j1t10']//div[@class='display-oht1wq-HubNavigationProfile-styled-HubNavigationProfile-styled esa6j1t7']//*[name()='svg']");
    By correoElec = By.xpath("//input[@id='lmn_login_widget_modal__email-input']");
    By contraseñaR = By.xpath("//input[@id='lmn_login_widget_modal__password-input']");
    By hotelesConSpa = By.xpath("//p[contains(text(),'Con las ofertas que hemos seleccionado para ti, cu')]");
    //posiblemente variable
    By hotelespa5es = By.xpath("//span[normalize-space()='Senator Granada Spa']");
    By habitacionAyD = By.xpath("//body/div[@id='__next']/div[@class='BrandedPageLayout___StyledDiv-sc-1x8t0fu-2 iGBmhN']/section[@id='rooms']/div/div/div/div/div[1]/div[2]/div[1]/div[1]/div[2]/span[1]");
    By paraOtraPersona = By.xpath("//span[@class='Switchstyles__LabelText-sc-1ym8u79-6 dabJy']");
    By nombreAdicional = By.xpath("//input[@name='groups.1.travellers.1.name']");
    By apellidoAdicional = By.xpath("//input[@name='groups.1.travellers.1.surname']");
    By viajeDetalleTxt = By.xpath("//span[@class='hotel-summary__mealplan']");
    By agregarviajero = By.xpath("//*[name()='path' and contains(@d,'M10 18L26 ')]");
    By agregarHabitacion = By.xpath("//button[normalize-space()='Añadir habitación']");
    By masAdultos = By.xpath("//section[2]//div[1]//div[2]//div[2]//button[2]//*[name()='svg']//*[name()='path' and contains(@d,'M19 13H13V')]");
    By fechaFlexible = By.xpath("//button[normalize-space()='Fechas flexibles']");
    By fechadesplegable = By.xpath("//label[normalize-space()='Fecha de entrada']");
    By flex7a10 = By.xpath("//button[normalize-space()='7-10 noches']");
    By flexdic22 = By.xpath("//section[contains(@class,'display-11ni3xq-Overlay-styled')]//button[4]//*[name()='svg']");
    By btnEstrellas = By.xpath("//div[@id='container_full_width']//div[3]//div[1]//*[name()='svg']");
    By checkBox5estrellas = By.xpath("//body/div[@class='sc-dmRaPn goosly custom-overlay-portal ']/div[@class='sc-kgflAQ jwIVQL']/div[1]/div[1]//*[name()='svg'][3]/*[name()='path'][1]");
    By aplicarEstrellas = By.xpath("//button[@class='sc-fEOsli jzgnBo']");
    //Variable dependiendo de la fecha
    By primerHotel5estrellas = By.xpath("//div[@class='sc-GVOUr dWFxXe openx-ui-card-content']");
    By primeraOpcionsierra = By.xpath("//span[normalize-space()='Hospes Palacio De Los Patos']");
    By soloAlojamientos = By.id("check_svg__filled");
    By terminosycondiciones = By.xpath("//span[contains(@data-test,'privacyPolicy-check')]");


    // metodos generales
    public void acceptCookie() {
        waitClick(btnCookiesLoc);
        click(btnCookiesLoc);
    }

    public void clickNavMenuHoteles(){
        click(btnHotelesNav);
    }

    public void botonBuscarAlo(){
        click(btnBuscar);
    }

    public void agregarViajerosyHabitaciones(){
        waitDisplayclick(agregarviajero);
        waitDisplayclick(agregarHabitacion);
    }

    // Test Case 008

    public void destinoAlo(){
        click(imputDestino);
        click(cualquierDestino);
    }


    public void fechaEntradaSalida(){
        click(fecha1);
        click(fecha2);
    }

    public String textErrorFecha(){
        return getText(errorFecha);
    }

    //Test Case 007

    public void filtros(){
        click(btnCancelacionG);
        click(wifiGratis);
        click(valoracionH);
        click(vExcelente);
        click(aplicarV);

    }

    public void box1buscar(){
        waitDisplayclick(box1);
        waitDisplayclick(primeraCartaH);

    }

    public void serviciosM(){
        click(serviciosH);
    }

    public void despli(){
        click(despliegueS);
    }


    public String wifiValid(){
        return getText(serviciowifi);
    }

    public void comentarioshoteles(){
        click(comentariosH);
    }

    //Test Case 9
    //Pending BotoM login
    public void loginRumbo() {
    }

    public void hotelesConespa(){
        click(hotelesConSpa);
        changeTab();
        click(hotelespa5es);
        changeTab();
        click(habitacionAyD);
    }

    public void agregarOtraPersona(){
        waitClick(paraOtraPersona);
        click(paraOtraPersona);
        write("Daniel",nombreAdicional);
        write("Gonzales",apellidoAdicional);
    }

    public String detalleviaje(){
        return getText(viajeDetalleTxt);
    }

    //Test Case 10 , 6 viajeros
    public void viajeroyHabitacion(){
        waitDisplayclick(agregarviajero);
        waitDisplayclick(agregarHabitacion);
        waitDisplayclick(agregarHabitacion);
        click(masAdultos);
        click(masAdultos);

    }

    //Test Case 11
    public void fechasFlexible(){
        click(fechadesplegable);
        click(fechaFlexible);
        waitDisplayclick(flex7a10);
        click(flexdic22);
    }

    public void estrellasyValoracion(){
        waitDisplayclick(valoracionH);
        click(vExcelente);
        click(aplicarV);
        click(btnEstrellas);
        click(checkBox5estrellas);
        click(aplicarEstrellas);
        waitDisplayclick(primerHotel5estrellas);
        waitDisplayclick(primeraOpcionsierra);
    }

    public void soloAlojamiento(){
        waitDisplayclick(soloAlojamientos);
    }

    public void termycondic(){
        waitDisplayclick(terminosycondiciones);
    }









}
