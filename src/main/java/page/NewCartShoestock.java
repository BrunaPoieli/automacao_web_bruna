package page;

import org.openqa.selenium.WebDriver;
import utils.DSL;

public class NewCartShoestock {

    private final DSL dsl;

    public NewCartShoestock(WebDriver driver){
        dsl = new DSL(driver);
    }


    //Valida os produtos adicionados no carrinho
    public void validaCompraProduto() throws InterruptedException {
        Thread.sleep(2000);
        dsl.fielValidateByList("cart__title","Meu carrinho");
        dsl.validateByClassName("product-items");

    }

}
