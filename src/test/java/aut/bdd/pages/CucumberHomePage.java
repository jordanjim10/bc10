package aut.bdd.pages;


import org.openqa.selenium.By;
import static framework.engine.selenium.DriverFactory.getDriver;

public class CucumberHomePage{


    String url = "https://www.google.com";
    By barraGoogle = By.xpath("//*[@name='q']");
    By btnGoogle = By.xpath("//*[@name='btnK']");

    //funciones o acciones que podemos hacer en la web → buscar en barra google
    public void irAHomePage() {
        getDriver().navigate().to(url);
    }

    public void buscarTexto(String texto) {
        getDriver().findElement(barraGoogle).sendKeys(texto);
        getDriver().findElement(btnGoogle).click();
    }

}
