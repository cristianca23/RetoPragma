package interactions;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class Articulos {

    public static Target adicionarProducto(int producto){
        return PageElement.located(By.xpath("(//*[@class='hrefch'])["+producto+"]"));
    }
}
