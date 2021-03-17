package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertTrue;


public class Post extends Base{
    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Given("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // abre o navegador no site alvo(extendendo a base)

    }

    @When("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto)  {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Then("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibe_a_expressao_no_titulo_da_guia(String produto) {
        assertTrue(base.driver.getTitle().contains(produto));
    }
}


