package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.questions.RespuestaRegistro;
import co.com.choucair.certification.proyectobase.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class UtestStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^Hector desea registrarse en Utest\\.com$")
    public void hectorDeseaRegistrarseEnUtestCom() throws Exception {
        OnStage.theActorCalled("Hector").wasAbleTo(Abrir.Pagina());
    }


    @When("^el usuario ingresa los datos requeridos por el sistema$")
    public void elUsuarioIngresaLosDatosRequeridosPorElSistema(List<UtestDatos> datos) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(Ingresar.Pagina(datos), IngresarDireccion.Pagina(datos), IngresarDispositivo.Pagina(datos),
                IngresarContrasena.Pagina(datos));
    }

    @Then("^el registro muestra la notificacion de completado la configuracion en pantalla$")
    public void elRegistroMuestraLaNotificacionDeCompletadoLaConfiguracionEnPantalla(List<UtestDatos> datos) throws Exception  {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(RespuestaRegistro.de(datos)));
    }
}
