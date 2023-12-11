package com.demoblaze.stepDefinitions;

import com.demoblaze.questions.ValidacionHomeQuestion;
import com.demoblaze.questions.ValidacionQuestion;
import com.demoblaze.tasks.InicioSesionTask;
import com.demoblaze.tasks.RetrocederTask;
import com.demoblaze.tasks.SeleccionarProdTask;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetrocederStepDefinitions {
    @Before
    public void setupActor() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Cuando("da click en un producto y lo selecciona")
    public void daClickEnUnProductoYLoSelecciona() {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProdTask.on(),
                RetrocederTask.on()
        );
    }
    @Entonces("el usuario puede devolverse a la ventana anterior")
    public void elUsuarioPuedeDevolverseALaVentanaAnterior() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionHomeQuestion.from(),
                        Matchers.equalTo(true)
                )
        );
    }
}
