package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaDireccionPersonal {

    public static final Target CITY = Target.the("Ciudad de ubicacion")
            .located(By.id("city"));

    public static final Target ZIP= Target.the("Codigo postal de ubicacion")
            .located(By.id("zip"));

    public static final Target INPUT_COUNTRY= Target.the("Listado de paises")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));

    public static final Target COUNTRY = Target.the("Pais de ubicacion")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));

    public static final Target BUTTON_DEVICES = Target.the("Boton de siguiente dispositivo")
            .located(By.xpath("//a[@class='btn btn-blue pull-right']"));
}
