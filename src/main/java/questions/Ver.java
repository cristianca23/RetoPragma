package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.ProductStorePage.TXTTITLE;

public class Ver implements Question<Boolean> {

    private String producto;

    public Ver(String producto) {
        this.producto = producto;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textoAComparar = BrowseTheWeb.as(actor).find(TXTTITLE).getText().trim();
        return textoAComparar.equals(producto);
    }

    public static Ver carrito(String producto){
        return new Ver(producto);
    }
}
