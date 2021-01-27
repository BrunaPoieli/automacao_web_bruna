package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;
import page.HomeShoestock;
import page.NewCartShoestock;
import page.ProductPageShoestock;
import utils.DSL;
import utils.DriverFactory;

public class ShoestockWebSteps {

    private WebDriver driver;
    private HomeShoestock home;
    private ProductPageShoestock productPage;
    private NewCartShoestock cart;
    private DSL dsl;


    @Before
    public void setUp() throws InterruptedException {
        driver = DriverFactory.getDriver();
        Thread.sleep(1000);
        dsl = new DSL(driver);
        home = new HomeShoestock(driver);
        productPage = new ProductPageShoestock(driver);
        cart = new NewCartShoestock(driver);
    }

    @After
    public void killDriver() {
        driver.quit();
    }

    @Given("que acessei a home da shoestock")
    public void que_acessei_a_home_da_shoestock() throws InterruptedException {
        Thread.sleep(3000);
        home.validaCampoBusca();
    }

    @When("eu realizar uma busca")
    public void eu_realizar_uma_busca() throws InterruptedException {
        home.insereTextoCampoBusca();
        home.clicaBtnLupa();
    }

    @Then("valido a busca de produtos")
    public void valido_a_busca_de_produtos() throws InterruptedException {
        productPage.validaTelaBusca();
    }

    @When("eu selecionar um produto")
    public void eu_selecionar_um_produto() throws InterruptedException {
        home.insereTextoCampoBusca();
        home.clicaBtnLupa();
        productPage.selecionarProduto();
        productPage.selecionarTamanhoProduto();
        productPage.clicaBotaoComprar();
    }

    @Then("valido a inclusao do produto no carrinho")
    public void valido_a_inclusao_do_produto_no_carrinho() throws InterruptedException {
        cart.validaCompraProduto();
    }


}
