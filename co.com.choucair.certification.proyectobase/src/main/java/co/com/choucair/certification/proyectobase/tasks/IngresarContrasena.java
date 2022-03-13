package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.PaginaContrasenaPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

public class IngresarContrasena implements Task {

    private List<UtestDatos> datos;

    public IngresarContrasena(List<UtestDatos> datos) {
        this.datos = datos;
    }
    public static IngresarContrasena Pagina(List<UtestDatos> datos) {

        return Tasks.instrumented(IngresarContrasena.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(datos.get(0).getContrasena()).into(PaginaContrasenaPersonal.PASSWORD),
                Enter.theValue(datos.get(0).getContrasena()).into(PaginaContrasenaPersonal.CONFIRM_PASSWORD),
                Click.on(PaginaContrasenaPersonal.STAY_INFORMED),
                Click.on(PaginaContrasenaPersonal.ACCEPT_TERMS),
                Click.on(PaginaContrasenaPersonal.PRIVACY_POLICIES),

                Click.on(PaginaContrasenaPersonal.BUTTON_COMPLETE_SETUP)
        );
    }
}
