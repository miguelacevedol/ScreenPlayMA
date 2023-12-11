package com.demoblaze.stepDefinitions;

import com.demoblaze.questions.ValidacionAlertQuestion;
import com.demoblaze.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class CarritoCompraStepDefinitions {
    @Before
    public void setupActor() {
        WebDriverManager.chromedriver().setup();
        setTheStage(new OnlineCast());
    }
    @Dado("que el usuario ingresa a la página de DemoBlaze y selecciona un producto")
    public void queElUsuarioIngresaALaPáginaDeDemoBlazeYSeleccionaUnProducto() {
        theActorCalled("user").wasAbleTo(
                AbrirNavegadorTask.on(),
                SeleccionarProdTask.on()
        );
    }
    @Cuando("el usuario da click en el producto para agregarlo al carrito de compras")
    public void elUsuarioDaClickEnElProductoParaAgregarloAlCarritoDeCompras() {
        theActorInTheSpotlight().attemptsTo(
                AgregarProdCarritoTask.on()
        );
    }
    @Entonces("el usuario puede ver la alerta que confirma el producto dentro del carrito")
    public void elUsuarioPuedeVerLaAlertaQueConfirmaElProductoDentroDelCarrito() {
        theActorInTheSpotlight().should(
                seeThat(
                        ValidacionAlertQuestion.from()
                )
        );
    }

}
