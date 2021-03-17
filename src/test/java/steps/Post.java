package steps;

import cucumber.api.PendingException;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.awt.*;

import static org.junit.Assert.assertTrue;


public class Post extends Base{
    private Base base;

    public Post(Base base) {
        this.base = base;
    }

    @Dado("^que acesso a Wikipedia em Portugues$")
    public void queAcessoAWikipediaEmPortugues() {
        base.driver.get(base.url); // abre o navegador no site alvo(extendendo a base)

    }

    @Quando("^pesquiso por \"([^\"]*)\"$")
    public void pesquisoPor(String produto)  {
        base.driver.findElement(By.id("searchInput")).sendKeys(produto + Keys.ENTER);

    }

    @Entao("^exibe a expressao \"([^\"]*)\" no titulo da guia$")
    public void exibe_a_expressao_no_titulo_da_guia(String produto) {
        assertTrue(base.driver.getTitle().contains(produto));
    }
}


