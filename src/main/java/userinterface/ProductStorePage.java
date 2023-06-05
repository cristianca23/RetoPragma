package userinterface;


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

    public static final Target BUTTONCART = PageElement.located(By.id("cartur"));

    public static final Target TXTTITLE = PageElement.located(By.xpath("//td[normalize-space()='Iphone 6 32gb']"));

    public static final Target BUTTONMONITORS = PageElement.located(By.xpath("//a[4]"));

    public static final Target MONITORAPPLE = PageElement.located(By.xpath("//a[normalize-space()='Apple monitor 24']"));

    public static final Target TXTMONITOR = PageElement.located(By.xpath("//td[normalize-space()='Apple monitor 24']"));

    public static final Target PRICEMONITOR = PageElement.located(By.xpath("//td[normalize-space()='400']"));

    public static final Target BUTTONLAPTOPS = PageElement.located(By.xpath("//button[@id='next2']"));


    public static final Target PRODUCTMACBOOK = PageElement.located(By.xpath("//*[@id='tbodyid']/div[2]/div/div/h4/a"));

    public static final Target TEXTMACBOOK = PageElement.located(By.xpath("//td[normalize-space()='MacBook air']"));

    public static final Target BUTTONPLACEORDER = PageElement.located(By.xpath("//button[normalize-space()='Place Order']"));

    public static final Target TXTNAME = PageElement.located(By.id("name"));

    public static final Target TXTPAIS = PageElement.located(By.id("country"));

    public static final Target TXTCITY = PageElement.located(By.id("city"));

    public static final Target TXTCARD = PageElement.located(By.id("card"));

    public static final Target TXTMONTH = PageElement.located(By.id("month"));

    public static final Target TXTYEAR = PageElement.located(By.id("year"));

    public static final Target BUTTONPURCHASE = PageElement.located(By.xpath("//button[normalize-space()='Purchase']"));

    public static final Target TXTTHANKS = PageElement.located(By.xpath("//h2[normalize-space()='Thank you for your purchase!']"));

    public static final Target BUTTONHOME = PageElement.located(By.xpath("//li[@class='nav-item active']//a[@class='nav-link']"));
}
