package tasks;


import interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;


import java.time.Duration;

import static userinterface.ProductStorePage.*;

public class Seleccionar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                WaitUntil.the(BOTONPRODUCTO, WebElementStateMatchers.isClickable()),
                Click.on(BOTONPRODUCTO.waitingForNoMoreThan(Duration.ofSeconds(5))),
                WaitUntil.the(BOTTONADDTOCART, WebElementStateMatchers.isClickable()),
                Click.on(BOTTONADDTOCART.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Esperar.unMomento(3),
                Switch.toAlert().andAccept(),
                WaitUntil.the(BUTTONCART, WebElementStateMatchers.isClickable()),
                Click.on(BUTTONCART)
                );


    }



    public static Seleccionar producto(){
        return Tasks.instrumented(Seleccionar.class);
    }
}
