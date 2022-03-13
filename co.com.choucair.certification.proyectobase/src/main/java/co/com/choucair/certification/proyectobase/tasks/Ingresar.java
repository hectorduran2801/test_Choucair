package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.PaginaDireccionPersonal;
import co.com.choucair.certification.proyectobase.userinterface.PaginaRegistroPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;

import java.util.List;

public class Ingresar implements Task {

    private List<UtestDatos> datos;

    public Ingresar(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static Ingresar Pagina(List<UtestDatos> datos) {
        return Tasks.instrumented(Ingresar.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datos.get(0).getNombre()).into(PaginaRegistroPersonal.FIRST_NAME),
                Enter.theValue(datos.get(0).getApellido()).into(PaginaRegistroPersonal.LAST_NAME),
                Enter.theValue(datos.get(0).getEmail()).into(PaginaRegistroPersonal.EMAIL_ADDRESS),
                SelectFromOptions.byVisibleText(datos.get(0).getMesNacimiento()).from(PaginaRegistroPersonal.MONTH),
                SelectFromOptions.byVisibleText(datos.get(0).getDiaNacimiento()).from(PaginaRegistroPersonal.DAY),
                SelectFromOptions.byVisibleText(datos.get(0).getAnoNacimiento()).from(PaginaRegistroPersonal.YEAR),

                Enter.theValue(datos.get(0).getIdioma()).into(PaginaRegistroPersonal.LANGUAGES),
                Hit.the(Keys.ARROW_DOWN).into(PaginaRegistroPersonal.LANGUAGES),
                Hit.the(Keys.ENTER).into(PaginaRegistroPersonal.LANGUAGES),

                Click.on(PaginaRegistroPersonal.BUTTON_NEXT_LOCATION)
        );

    }
}
