package tasks;

import interactions.Esperar;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.Duration;

import static userinterface.ProductStorePage.*;


public class Ingresar implements Task {
    private final String correo;
    private final String clave;

    public Ingresar(String correo, String clave) {
        this.correo = correo;
        this.clave = clave;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(BUTTONLOGIN.waitingForNoMoreThan(Duration.ofSeconds(5))));
        actor.attemptsTo(Enter.theValue(correo).into(INPUTUSERNAME));
        actor.attemptsTo(Enter.theValue(clave).into(INPUTPASSWORD));
        actor.attemptsTo(Click.on(BUTTONLOGIN2.waitingForNoMoreThan(Duration.ofSeconds(5))),
        Esperar.unMomento(1)
        );


    }

    public static Ingresar datos(String correo, String clave){
        return Tasks.instrumented(Ingresar.class, correo, clave);
    }
}
