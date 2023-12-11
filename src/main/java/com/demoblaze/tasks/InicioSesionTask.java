package com.demoblaze.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static com.demoblaze.UI.InicioSesionUI.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class InicioSesionTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("asfdsg324@yopmail.com").into(TXT_NOMBRE_USUARIO),
                Enter.theValue("hola124").into(TXT_CONTRASENA),
                Click.on(BTN_LOGIN_ENVIO)
        );
    }
    public static InicioSesionTask on(){
        return instrumented(InicioSesionTask.class);
    }
}
