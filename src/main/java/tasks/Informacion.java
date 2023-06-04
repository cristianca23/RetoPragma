package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.ProductStorePage.*;

public class Informacion implements Task {

    private String nombre;
    private String pais;
    private String ciudad;
    private String tarjeta;
    private String mes;
    private String año;

    public Informacion(String nombre, String pais, String ciudad, String tarjeta, String mes, String año) {
        this.nombre = nombre;
        this.pais = pais;
        this.ciudad = ciudad;
        this.tarjeta = tarjeta;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                WaitUntil.the(BUTTONCART, WebElementStateMatchers.isClickable()),
                Click.on(BUTTONCART),
                Click.on(BUTTONPLACEORDER),
                Enter.theValue(nombre).into(TXTNAME),
                Enter.theValue(pais).into(TXTPAIS),
                Enter.theValue(ciudad).into(TXTCITY),
                Enter.theValue(tarjeta).into(TXTCARD),
                Enter.theValue(mes).into(TXTMONTH),
                Enter.theValue(año).into(TXTYEAR),
                Click.on(BUTTONPURCHASE)

        );

    }

    public static Informacion pedido(String nombre, String pais, String ciudad, String tarjeta, String mes, String año){
        return Tasks.instrumented(Informacion.class, nombre, pais, ciudad, tarjeta, mes, año);
    }

}
