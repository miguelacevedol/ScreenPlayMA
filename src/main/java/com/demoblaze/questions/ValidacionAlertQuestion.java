package com.demoblaze.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

import static com.demoblaze.UI.AgregarProdCarritoUI.BTN_VER_CARRITO;

public class ValidacionAlertQuestion implements Question<Boolean> {
    private static WebDriver driver;

    public ValidacionAlertQuestion(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        //Click.on(BTN_VER_CARRITO);
        return null;
    }
    public static ValidacionAlertQuestion from(){
        return  new ValidacionAlertQuestion(driver);
    }

}
