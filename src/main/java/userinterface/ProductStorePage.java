package userinterface;

import com.gargoylesoftware.htmlunit.Page;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class ProductStorePage {

    public static final Target BUTTONLOGIN = PageElement.located(By.id("login2"));

    public static final Target INPUTUSERNAME = PageElement.located(By.id("loginusername"));

    public static final Target INPUTPASSWORD = PageElement.located(By.id("loginpassword"));

    public static final Target BUTTONLOGIN2 = PageElement.located(By.xpath("//button[normalize-space()='Log in']"));

    public static final Target TEXTWELCOME = PageElement.located(By.id("nameofuser"));

    public static final Target BOTONPRODUCTO = PageElement.located(By.xpath("//a[normalize-space()='Iphone 6 32gb']"));

    public static final Target BOTTONADDTOCART = PageElement.located(By.xpath("//*[@class='btn btn-success btn-lg']"));

    public static final Target PRODUCTNAME = Target.the("Nombre Producto").located(By.className("name"));

    public static final Target CONTACTO = PageElement.located(By.xpath("//a[normalize-space()='Contact']"));

    public static final Target INPUTEMAIL = PageElement.located(By.className("form-control"));

    public static final Target INPUTNAME = PageElement.located(By.id("recipient-name"));

    public static final Target INPUTMESSAGE = PageElement.located(By.id("message-text"));

    public static final Target BUTTONSENDMESSAGE = PageElement.located(By.xpath("(//button[normalize-space()='Send message'])[1]"));

}
