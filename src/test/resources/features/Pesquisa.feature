#language: pt
Funcionalidade: Pesquisa
  Realizar busca e validar mensagem

  Esquema do Cenário: Pesquisar dúvida de acesso a conta Superget
    Dado que estou na tela inicial
    Quando clicar no botão buscar
    Então deve ser exibido o campo para digitar a busca
    Quando for requisitada a busca por "<busca>"
    E clicar no botão procurar
    Então deve ser exibido o resultado da busca "<busca>"
    Quando clicar no link "<link>"
    Então deve ser apresentado um modal com o titulo do link clicado "<link>"

    Exemplos:
      |busca      |link                                 |
      |superget   |Como acesso a minha conta SuperGet?  |