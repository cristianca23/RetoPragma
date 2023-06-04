package co.com.pruebapragma.stepdefinitions;

import io.cucumber.java.DataTableType;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import models.DatosProductos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Consequence;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.targets.EnsureFieldVisible;
import questions.*;
import tasks.*;

import java.util.List;
import java.util.Map;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.IsEqual.equalTo;
import static userinterface.ProductStorePage.TEXTMACBOOK;
import static userinterface.ProductStorePage.TEXTWELCOME;
import static util.Helpers.BIENVENIDA;

public class StoreDefinitions {


    public String actor;

    @Given("^(.*) quiere ingresar a Store$")
    public void unUsuarioQuiereIngresarAStore(String actor) {
        OnStage.theActor(actor).wasAbleTo(Abrir.store());
        this.actor = actor;
    }

    @When("el usuario ingresa a la parte de iniciar sesion ingresa {string} y {string}")
    public void elUsuarioIngresaALaParteDeIniciarSesionIngresaY(String correo, String clave) {
        OnStage.theActorCalled(actor).attemptsTo(Ingresar.datos(correo, clave));
    }


    @Then("Debe ver el mensaje de bienvenida {string}")
    public void debeVerElMensajeDeBienvenida(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Validar.mensaje(mensaje)));


    }

    @When("el usuario selecciona un celular")
    public void elUsuarioSeleccionaUnCelular() {

        OnStage.theActorCalled(actor).attemptsTo(Seleccionar.producto());
    }

    @Then("el usuario ve seleccionado el {string} en el carrito de compras")
    public void elUsuarioVeSeleccionadoElEnElCarritoDeCompras(String producto) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Ver.carrito(producto)));
    }

    @When("Juan Ingresa al formulario de contacto y llena los datos {string} {string} y {string}")
    public void juanIngresaAlFormularioDeContactoYLlenaLosDatosY(String email, String nombre, String mensaje) {
        OnStage.theActorInTheSpotlight().attemptsTo(Contactar.store(email, nombre, mensaje));
    }

    @Then("debe salir un mensaje de agradecimiento por el {string}")
    public void debeSalirUnMensajeDeAgradecimientoPorEl(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Comprobar.producto(mensaje)));
    }


    @When("el usuario selecciona dos Monitores")
    public void elUsuarioSeleccionaDosMonitores() {
        OnStage.theActorCalled(actor).attemptsTo(Buscar.monitores());
    }

    @DataTableType
    public DatosProductos datosProductos(Map<String, String> datosProducto) {
        return new DatosProductos(datosProducto.get("nombre"),
                datosProducto.get("valor"));
    }

    @Then("el usuario ve seleccionado el producto en el carrito de compras y su costo")
    public void elUsuarioVeSeleccionadoElProductoEnElCarritoDeComprasYSuCosto(DatosProductos productos) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.monitores(productos)));
    }

    @When("el usuario selecciona una Laptop")
    public void elUsuarioSeleccionaUnaLaptop() {
        OnStage.theActorCalled(actor).attemptsTo(Filtrar.laptops());
    }

    @Then("ve el producto agregado con el mensaje {string}")
    public void veElProductoAgregadoConElMensaje(String mensaje) {
                OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Examinar.laptops(mensaje)));
    }

    @When("ingresa al carrito para verificar su pedido")
    public void ingresaAlCarritoParaVerificarSuPedido() {
       OnStage.theActor(actor).attemptsTo();
    }
    @Then("ingresa al carrito y ingresa los datos {string} {string} {string} {string} {string} {string}")
    public void ingresaAlCarritoYIngresaLosDatos(String nombre, String pais, String ciudad, String tarjeta, String mes, String año) {
        OnStage.theActorInTheSpotlight().attemptsTo(Informacion.pedido(nombre,pais,ciudad,tarjeta,mes,año));
    }
    @Then("Debe ver un dialogo que indica {string}")
    public void debeVerUnDialogoQueIndica(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Compra.exitosa(mensaje)));
    }

    @When("el usuario selecciona {int} productos")
    public void elUsuarioSeleccionaProductos(Integer productos) {
       OnStage.theActor(actor).attemptsTo(Escoger.productos(productos));
    }
}
