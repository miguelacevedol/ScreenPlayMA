package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.demoblaze.UI.AgregarProdCarritoUI.BTN_VER_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class VerCarritoTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_VER_CARRITO)
        );
    }
    public static VerCarritoTask on(){
        return instrumented(VerCarritoTask.class);
    }
}
