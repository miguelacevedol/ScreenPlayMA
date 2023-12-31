package com.demoblaze.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;
import java.util.Random;

import static com.demoblaze.UI.SeleccionarProdUI.LBL_NOMBRE_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRandom implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> listProducts = LBL_NOMBRE_PRODUCTO.resolveAllFor(actor);
        Random random = new Random();
        int indexRandom=random.nextInt(listProducts.size());

        listProducts.get(indexRandom).click();
    }

    public static Performable click() {
        return instrumented(SelectRandom.class);
    }
}
