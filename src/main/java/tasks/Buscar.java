package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.Switch;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import java.time.Duration;

import static userinterface.ProductStorePage.*;

public class Buscar implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BUTTONMONITORS, WebElementStateMatchers.isVisible()),
                Click.on(BUTTONMONITORS),
                Click.on(MONITORAPPLE),
                Click.on(BOTTONADDTOCART),
                WaitUntil.the(BOTTONADDTOCART, WebElementStateMatchers.isClickable()),
                WaitUntil.the(BUTTONCART, WebElementStateMatchers.isClickable()),
                Click.on(BUTTONCART.waitingForNoMoreThan(Duration.ofSeconds(10)))
        );
    }
    public static Buscar monitores(){
        return Tasks.instrumented(Buscar.class);
    }
}
