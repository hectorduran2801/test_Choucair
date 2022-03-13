package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaContrasenaPersonal {

    public static final Target PASSWORD = Target.the("Contraseña de cuenta")
            .located(By.id("password"));

    public static final Target CONFIRM_PASSWORD = Target.the("confirmar Contraseña de cuenta")
            .located(By.id("confirmPassword"));

    public static final Target STAY_INFORMED = Target.the("Mantener informadoa usuario")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));

    public static final Target ACCEPT_TERMS = Target.the("El usuario acepta los terminos")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target PRIVACY_POLICIES = Target.the("confirmar Contraseña de cuenta")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE_SETUP = Target.the("Boton de formulario de registro final")
            .located(By.xpath("//a[@class='btn btn-blue']"));

}
