package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaRegistroPersonal {
    public static final Target FIRST_NAME= Target.the("Primer nombre")
            .located(By.id("firstName"));

    public static final Target LAST_NAME= Target.the("Apellido")
            .located(By.id("lastName"));

    public static final Target EMAIL_ADDRESS= Target.the("Direccion de correo")
            .located(By.id("email"));

    public static final Target MONTH = Target.the("Mes de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[1]/select"));

    public static final Target DAY = Target.the("Dia de nacimiento")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[2]/select"));

    public static final Target YEAR = Target.the("Año de nacimiento")
        .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[4]/div[2]/div/div[3]/select"));

    public static final Target INPUT_LANGUAGES= Target.the("Listado de idiomas")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]"));

    public static final Target LANGUAGES = Target.the("Idioma hablado")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[5]/div[2]/div[1]/input"));

    public static final Target BUTTON_NEXT_LOCATION = Target.the("Boton de siguiente ubicacion")
            .located(By.xpath("//a[@class='btn btn-blue']"));
}
