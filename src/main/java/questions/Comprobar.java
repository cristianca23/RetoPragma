package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class Comprobar implements Question<Boolean> {
    private String texto;

    public Comprobar(String texto) {
        this.texto = texto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String a = BrowseTheWeb.as(actor).getAlert().getText();


          return a.equals(texto);
    }

    public static Comprobar producto(String texto) {

        return new Comprobar(texto);
    }
}
