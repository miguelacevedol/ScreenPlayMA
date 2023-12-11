package com.demoblaze.tasks;

import com.demoblaze.interactions.Retroceder;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RetrocederTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Retroceder.click()
        );
    }
    public static RetrocederTask on(){
        return instrumented(RetrocederTask.class);
    }

}
