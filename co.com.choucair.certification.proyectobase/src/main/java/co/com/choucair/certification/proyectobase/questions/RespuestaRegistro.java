package co.com.choucair.certification.proyectobase.questions;

import co.com.choucair.certification.proyectobase.model.UtestDatos;
import co.com.choucair.certification.proyectobase.userinterface.PaginaContrasenaPersonal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class RespuestaRegistro implements Question<Boolean> {

    private List<UtestDatos> datos;

    public RespuestaRegistro(List<UtestDatos> datos) {
        this.datos = datos;
    }

    public static RespuestaRegistro de(List<UtestDatos> datos) {
        return new RespuestaRegistro(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String Mensaje = Text.of(PaginaContrasenaPersonal.BUTTON_COMPLETE_SETUP).viewedBy(actor).toString();
        return datos.get(0).getRespuesta().equals(Mensaje);
    }
}
