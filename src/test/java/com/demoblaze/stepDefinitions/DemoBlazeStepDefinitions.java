package com.demoblaze.stepDefinitions;

import com.demoblaze.questions.ValidacionQuestion;
import com.demoblaze.tasks.AbrirNavegadorTask;
import com.demoblaze.tasks.InicioSesionTask;
import com.demoblaze.tasks.InicioTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class DemoBlazeStepDefinitions {
    @Before
    public void setupActor() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario abre el navegador e ingresa a la página de DemoBlaze")
    public void queElUsuarioAbreElNavegadorEIngresaALaPáginaDeDemoBlaze() {
        theActorCalled("user").wasAbleTo(
                AbrirNavegadorTask.on()
                //InicioTask.on()
        );
    }
    @Cuando("da click en el botón Log In e ingresa sus credenciales")
    public void daClickEnElBotónLogInEIngresaSusCredenciales() {
        theActorInTheSpotlight().attemptsTo(
                InicioSesionTask.on()
                );
    }
    @Entonces("el usuario puede ingresar al sistema")
    public void elUsuarioPuedeIngresarAlSistema() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionQuestion.from(),
                        Matchers.equalTo(true)
                )
        );
    }
}
