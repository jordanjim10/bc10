package aut.funcional.testcases;

import aut.funcional.pages.RumboHomePage;
import framework.engine.selenium.DriverFactory;
import framework.engine.selenium.SeleniumTestBase;
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
        rumbo.vuelaEuro();
        rumbo.lisboaVuelos();

    }



}
