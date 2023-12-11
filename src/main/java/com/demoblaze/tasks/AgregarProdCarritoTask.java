package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.demoblaze.UI.AgregarProdCarritoUI.BTN_AGREGAR_PRODUCTO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProdCarritoTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_AGREGAR_PRODUCTO)
        );
    }
    public static AgregarProdCarritoTask on(){
        return instrumented(AgregarProdCarritoTask.class);
    }
}
