package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.ProductStorePage.TEXTWELCOME;

public class Validar implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(TEXTWELCOME).getText().trim();


    }

    public static Question<String> mensaje(){
        return new Validar();
    }
}
