package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.ProductStorePage.*;

public class Contactar implements Task {
    private String email;
    private String nombre;
    private String mensaje;

    public Contactar(String email, String nombre, String mensaje) {
        this.email = email;
        this.nombre = nombre;
        this.mensaje = mensaje;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CONTACTO, WebElementStateMatchers.isClickable()),
                Click.on(CONTACTO),
                Enter.theValue(email).into(INPUTEMAIL),
                Enter.theValue(nombre).into(INPUTNAME),
                Enter.theValue(mensaje).into(INPUTMESSAGE),
                Click.on(BUTTONSENDMESSAGE)
                );
    }

    public static Contactar store(String email, String nombre, String mensaje){
        return Tasks.instrumented(Contactar.class, email, nombre, mensaje);
    }
}
