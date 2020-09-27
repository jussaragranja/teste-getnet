package br.com.getnet.teste.page;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static br.com.getnet.teste.support.Driver.driver;
import static org.junit.Assert.fail;

/**
 * @author jussaragranja
 * Classe com ações genericas para as páginas
 */

public class BasePage {

    private static final int LOAD_TIMEOUT = 60;

    public BasePage(){
		PageFactory.initElements(driver, this);
    }

    public void aguardarElementoVisivel(WebElement element){
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, LOAD_TIMEOUT);
            driverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            fail("Tempo excedido para aguardar elemento: "+element);
        }
    }
    public void click(WebElement element){
        try {
            aguardarElementoVisivel(element);
            element.click();
        } catch (Exception e) {
            fail("Nao foi possivel encontrar o elemento para clicar: "+element +". Pagina: " +driver.getTitle()+"\n "+e.getMessage());
        }
    }

    public void preencherCampo(WebElement element, String keysToSend){
        try {
            aguardarElementoVisivel(element);
            element.clear();
            element.sendKeys(keysToSend);
        } catch (WebDriverException e) {
            fail("Nao foi possivel encontrar o elemento para preencher: "+element +". Pagina: " +driver.getTitle()+"\n "+e.getMessage());

        }
    }

    public boolean isVisibility(WebElement element){
        try {
            return element.isDisplayed();
        } catch (NoSuchElementException e){
            return false;
        }
    }

    public void selectElementByVisibleText(WebElement element, String textVisible){
        try {
            new Select(element).selectByVisibleText(textVisible);
        } catch (NoSuchElementException e){
            fail("Erro ao selecionar no elemento: ["+element.getTagName()+ "] com o o valor: "+textVisible);
        }
    }

}
