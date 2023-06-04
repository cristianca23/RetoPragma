package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

import static util.Helpers.URL_STORE;

public class Abrir implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.url(URL_STORE));
    }

   public static Abrir store (){
        return Tasks.instrumented(Abrir.class);
   }
}
