package questions;

import models.DatosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static userinterface.ProductStorePage.*;

public class Verificar implements Question<Boolean> {

    private DatosProductos datosProductos;
    public Verificar(DatosProductos datosProductos) {
        this.datosProductos = datosProductos;
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String nombreMonitor = BrowseTheWeb.as(actor).find(TXTMONITOR).getText().trim();
        String precio =  BrowseTheWeb.as(actor).find(PRICEMONITOR).getText().trim();

        if (nombreMonitor.equals(datosProductos.nombre()) ){
            return true;
        }else return precio.equals(datosProductos.valor());

    }

    public static Verificar monitores(DatosProductos datosProductos){
        return new Verificar(datosProductos);
    }
}
