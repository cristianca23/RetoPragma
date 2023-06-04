package tasks;

import interactions.Articulos;
import interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static userinterface.ProductStorePage.BOTTONADDTOCART;
import static userinterface.ProductStorePage.BUTTONHOME;

public class Escoger implements Task {
    private  int productos;

    public Escoger(int productos) {
        this.productos = productos;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        int i= 1;
        while (i<= productos) {
            actor.attemptsTo(
                    Esperar.unMomento(2),
                    Click.on(Articulos.adicionarProducto(i)),
                    WaitUntil.the(BOTTONADDTOCART, WebElementStateMatchers.isClickable()),
                    Click.on(BOTTONADDTOCART.waitingForNoMoreThan(Duration.ofSeconds(5))),
                    Esperar.unMomento(3),
                    Switch.toAlert().andAccept(),
                    Click.on(BUTTONHOME)
            );
            i++;
        }
    }

    public static Escoger productos(int productos){
        return Tasks.instrumented(Escoger.class, productos);
    }
}
