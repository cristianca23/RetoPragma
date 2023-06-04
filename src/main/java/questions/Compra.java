package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.ProductStorePage.TXTTHANKS;

public class Compra implements Question<Boolean> {
    private final String mensaje;

    public Compra(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String compraExitosa= BrowseTheWeb.as(actor).find(TXTTHANKS).getText().trim();


        return compraExitosa.equals(mensaje);
    }

    public static Compra exitosa(String mensaje) {

        return new Compra(mensaje);
    }
}
