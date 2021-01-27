package page;

import org.openqa.selenium.WebDriver;
import utils.DSL;

public class HomeShoestock{


    private final DSL dsl;

    public HomeShoestock(WebDriver driver) {
        dsl = new DSL(driver);
    }

    //Quando iniciar a pagina da Shoestock insere o nome do produto para realizar a busca
    public void insereTextoCampoBusca() throws InterruptedException {
        Thread.sleep(2000);
        dsl.sendTextById("search-input","Tenis");
    }

    //Clica no botão lupa para buscar os produtos
    public void clicaBtnLupa() throws InterruptedException {
        Thread.sleep(1000);
        dsl.enterClick("search-input");
    }

    //Valida o campo de busca
    public void validaCampoBusca() throws InterruptedException {
        Thread.sleep(2000);
        dsl.validateById("search-input");
    }





}
