package aut.funcional.testcases;

import aut.funcional.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static framework.engine.utils.Constants.BASE_URL_AUT;

public class RBO_001VB extends SeleniumTestBase {


    RumboHomePage rumbo;

    @Test
    public void prueba(){
        rumbo = new RumboHomePage(DriverFactory.getDriver());
        rumbo.navigateTo(BASE_URL_AUT);
        rumbo.acceptCookie();
        rumbo.clickMenuVuelo();
        rumbo.scrollDown();
        rumbo.vuelaEuro();
        rumbo.changeTab();
        rumbo.scrollDown();
        rumbo.vuelaLisboa();
        rumbo.changeTab();
        rumbo.vueloBarato();
        //rumbo.vueloPlusPer();
       // rumbo.serviciosFlexibles();
        //Assertions.assertEquals("jue. 10 de nov. de 2022",rumbo.validacionIda());
        //Assertions.assertEquals("sáb. 12 de nov. de 2022",rumbo.fechaVuelta());
        Assertions.assertEquals("80,99 €",rumbo.txtvueloEco());











    }



}
