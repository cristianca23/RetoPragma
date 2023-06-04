package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.ProductStorePage.TEXTMACBOOK;

public class Examinar implements Question<Boolean> {

    private final String mensaje;

    public Examinar(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String a = BrowseTheWeb.as(actor).find(TEXTMACBOOK).getText().trim();


        return a.equals(mensaje);
    }

    public static Examinar laptops(String mensaje) {

        return new Examinar(mensaje);
    }
}
