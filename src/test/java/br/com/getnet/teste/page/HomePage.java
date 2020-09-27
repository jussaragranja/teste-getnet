package br.com.getnet.teste.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertEquals;

/**
 * @author jussaragranja
 * Classe representa a página inicial da aplicação
 */

public class HomePage extends BasePage {

    @FindBy(xpath = "//div[@class='c-mobile-header-item__content icon icon-pesquisa']")
    private WebElement botaoBuscar;

    @FindBy(id = "global-search-input")
    private WebElement inputBusca;

    @FindBy(xpath = "//button[@class='o-btn o-btn--cor-roxo-borda c-search-box__button']")
    private WebElement botaoProcurar;

    @FindBy(xpath = "//strong[contains(text(), 'acessos rápidos')]")
    private WebElement acessosRapidosHome;

    public void validarPaginaHome(){
        assertEquals(acessosRapidosHome.getText(), "acessos rápidos");
    }

    public void clickBotaoBuscar() throws InterruptedException {
        Thread.sleep(3000);
        click(botaoBuscar);
    }

    public void assertElementoDePesquisaVisivel(){
        isVisibility(inputBusca);
    }

    public void preencherBusca(String link){
        preencherCampo(inputBusca, link);
    }

    public void clickBotaoProcurar(){
        click(botaoProcurar);
    }

}
