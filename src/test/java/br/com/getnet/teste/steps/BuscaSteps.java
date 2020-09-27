package br.com.getnet.teste.steps;

import br.com.getnet.teste.page.BasePage;
import br.com.getnet.teste.page.HomePage;
import br.com.getnet.teste.page.ResultadoBuscaPage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class BuscaSteps extends BasePage {

    ResultadoBuscaPage resultadoBuscaPage = new ResultadoBuscaPage();
    HomePage homePage = new HomePage();

    @Dado("que estou na tela inicial")
    public void que_estou_na_tela_inicial() {
        homePage.validarPaginaHome();
    }

    @Quando("clicar no botão buscar")
    public void clicar_no_botão_buscar() throws InterruptedException {
        homePage.clickBotaoBuscar();
    }

    @Então("deve ser exibido o campo para digitar a busca")
    public void deve_ser_exibido_o_campo_para_digitar_a_busca() {
        homePage.assertElementoDePesquisaVisivel();
    }

    @Quando("for requisitada a busca por {string}")
    public void for_requisitada_a_busca_por(String string) {
        homePage.preencherBusca(string);
    }

    @Quando("clicar no botão procurar")
    public void clicar_no_botão_procurar() {
        homePage.clickBotaoProcurar();
    }

    @Então("deve ser exibido o resultado da busca {string}")
    public void deve_ser_exibido_o_resultado_da_busca(String string) {
        resultadoBuscaPage.assertBusca(string);
    }

    @Quando("clicar no link {string}")
    public void clicar_no_link(String string) {
        resultadoBuscaPage.clickLink(string);
    }

    @Então("deve ser apresentado um modal com o titulo do link clicado {string}")
    public void deve_ser_apresentado_um_modal_com_o_titulo_do_link_clicado(String string) throws InterruptedException {
        resultadoBuscaPage.assertTituloModal(string);
    }
}
