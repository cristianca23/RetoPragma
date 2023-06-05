package tasks;

import interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;

import net.serenitybdd.screenplay.waits.WaitUntil;

import java.time.Duration;

import static userinterface.ProductStorePage.*;
import static userinterface.ProductStorePage.BUTTONCART;

public class Filtrar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Esperar.unMomento(2),
                Scroll.to(BUTTONLAPTOPS),
                Click.on(BUTTONLAPTOPS.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Esperar.unMomento(5),
                Click.on(PRODUCTMACBOOK),
                Esperar.unMomento(3),
                WaitUntil.the(BOTTONADDTOCART, WebElementStateMatchers.isClickable()),
                Click.on(BOTTONADDTOCART.waitingForNoMoreThan(Duration.ofSeconds(5))),
                Esperar.unMomento(4),
                Switch.toAlert().andAccept(),
                WaitUntil.the(BUTTONCART, WebElementStateMatchers.isClickable()),
                Click.on(BUTTONCART)

        );
    }

    public static Filtrar laptops(){
        return Tasks.instrumented(Filtrar.class);
    }
}
