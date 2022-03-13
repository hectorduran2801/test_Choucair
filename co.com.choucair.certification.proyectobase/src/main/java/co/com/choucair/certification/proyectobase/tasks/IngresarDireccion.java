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

        import java.security.Key;
        import java.util.List;

public class IngresarDireccion implements Task {

    private List<UtestDatos> datos;

    public IngresarDireccion(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static IngresarDireccion Pagina(List<UtestDatos> datos) {

        return Tasks.instrumented(IngresarDireccion.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datos.get(0).getCiudad()).into(PaginaDireccionPersonal.CITY),
                Hit.the(Keys.ARROW_DOWN).into(PaginaDireccionPersonal.CITY),
                Hit.the(Keys.ENTER).into(PaginaDireccionPersonal.CITY),

                Enter.theValue(datos.get(0).getZip()).into(PaginaDireccionPersonal.ZIP),

                Click.on(PaginaDireccionPersonal.INPUT_COUNTRY),
                Enter.theValue(datos.get(0).getPais()).into(PaginaDireccionPersonal.COUNTRY).thenHit(Keys.ARROW_DOWN, Keys.ENTER),

                Click.on(PaginaDireccionPersonal.BUTTON_DEVICES)
        );
    }
}
