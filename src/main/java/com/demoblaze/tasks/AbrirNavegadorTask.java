package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static com.demoblaze.UI.InicioUI.BTN_LOGIN;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AbrirNavegadorTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://www.demoblaze.com/")
        );
    }
    public static AbrirNavegadorTask on(){
        return instrumented(AbrirNavegadorTask.class);
    }

}
