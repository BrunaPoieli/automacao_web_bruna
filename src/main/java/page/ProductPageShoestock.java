package page;

import org.openqa.selenium.WebDriver;
import utils.DSL;

public class ProductPageShoestock {

    private final DSL dsl;

    public ProductPageShoestock(WebDriver driver){
        dsl = new DSL(driver);
    }


    //Valida a pagina com os produtos buscados
    public void validaTelaBusca() throws InterruptedException {
        Thread.sleep(3000);
        dsl.validateByLinkText("tenis masculino");
    }

    //Realiza o Scrol até o produto desejado e seleciona
    public void selecionarProduto() throws InterruptedException {
        dsl.scroll();
        Thread.sleep(1000);
        dsl.clickByPositionClassName("item-card__description", 0);
    }

    //Seleciona o tamanho do produto
    public void selecionarTamanhoProduto(){
        dsl.scroll();
        dsl.clickByPositionClassName("product-item", 4);
    }

    //Apos selecionar o produto e o tamanho desejado clica no botão de compra para adicionar no carrinho
    public void clicaBotaoComprar() throws InterruptedException {
        Thread.sleep(2300);
        dsl.clickById("buy-button-now");
    }

}
