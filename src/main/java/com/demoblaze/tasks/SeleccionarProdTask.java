package com.demoblaze.tasks;

import com.demoblaze.interactions.SelectRandom;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.demoblaze.UI.AgregarProdCarritoUI.BTN_AGREGAR_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarProdTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SelectRandom.click()
        );
    }
    public static SeleccionarProdTask on(){
        return instrumented(SeleccionarProdTask.class);
    }
}
