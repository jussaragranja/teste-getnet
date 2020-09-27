package br.com.getnet.teste.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static br.com.getnet.teste.support.Driver.driver;
import static org.junit.Assert.assertEquals;

/**
 * @author jussaragranja
 * Classe representa a página web que exibe o resultado da pesquisa
 */

public class ResultadoBuscaPage extends BasePage {

    @FindBy(xpath = "//h2[@class='c-search-page__title']")
    private WebElement textoResultadosDaBusca;

    @FindBy(xpath = "//span[@class='c-search-page__title c-search-page__title--red']")
    private WebElement resultadoDaBusca;

    @FindBy(xpath = "/html/body/div[21]/div/div[2]")
    private WebElement tituloModal;


    public void assertBusca(String busca){
        assertEquals(resultadoDaBusca.getText(), busca);
    }

    public void clickLink(String textoLink){
        driver.findElement(By.xpath("//h3[contains(text(), '"+textoLink+"')]")).click();
    }

    public void assertTituloModal(String titulo) throws InterruptedException {
        Thread.sleep(2000);
        assertEquals(tituloModal.getText(), titulo);
    }

}
