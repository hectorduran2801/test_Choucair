package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.PaginaDireccionPersonal;
import co.com.choucair.certification.proyectobase.userinterface.PaginaDispositivoPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

import java.util.List;

public class IngresarDispositivo implements Task {

    private List<UtestDatos> datos;

    public IngresarDispositivo(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static IngresarDispositivo Pagina(List<UtestDatos> datos) {

        return Tasks.instrumented(IngresarDispositivo.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(PaginaDispositivoPersonal.INPUT_DEVICE),
                Enter.theValue(datos.get(0).getCelular()).into(PaginaDispositivoPersonal.DEVICE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(PaginaDispositivoPersonal.INPUT_MODEL_DEVICE),
                Enter.theValue(datos.get(0).getModelo()).into(PaginaDispositivoPersonal.MODEL_DEVICE).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(PaginaDispositivoPersonal.INPUT_OPERATING_SYSTEM),
                Enter.theValue(datos.get(0).getSistemaOperativo()).into(PaginaDispositivoPersonal.OPERATING_SYSTEM).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(PaginaDispositivoPersonal.BUTTON_NEXT_STEP)
        );
    }
}
