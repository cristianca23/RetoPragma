package questions;

import interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.ProductStorePage.TEXTWELCOME;

public class Validar implements Question<Boolean> {
    private final String mensaje;

    public Validar(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String textoAComparar = BrowseTheWeb.as(actor).find(TEXTWELCOME).getText().trim();

        return textoAComparar.equals(mensaje);

    }

    public static Question<Boolean> mensaje(String mensaje){
        return new Validar(mensaje);
    }
}
