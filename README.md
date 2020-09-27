<h1 align="center">Welcome to teste-getnet 👋</h1>
<p>
  <img alt="Version" src="https://img.shields.io/badge/version-1.0.0-blue.svg?cacheSeconds=2592000" />
  <a href="https://site.getnet.com.br/" target="_blank">
    <img alt="Documentation" src="https://img.shields.io/badge/documentation-yes-brightgreen.svg" />
  </a>
  <a href="https://twitter.com/JuuhGranja" target="_blank">
    <img alt="Twitter: JuuhGranja" src="https://img.shields.io/twitter/follow/JuuhGranja.svg?style=social" />
  </a>
</p>

> Projeto de teste utilizando 

### 🏠 [Homepage](https://site.getnet.com.br/)

* Documentação do Jenkins: [Jenkins](https://www.jenkins.io/doc/tutorials/build-a-java-app-with-maven)

## Instruções de Uso
   
```sh
- O driver do chrome dentro do projeto está na versão 85,
por isso, caso o seu navegador esteja em outra versão por favor altere o driver dentro do diretório src/test/resources/driver

- Caso prefira executar dentro de um grid, favor alterar o arquivo de propriedades (config.properties)
setando a url do grid que deseja utilizar, e o navegador para cremote
```

## Run tests

```sh
mvn test
```

```sh
- Jenkins
Dentro do projeto contém um Jenkinsfile
Caso deseje executar os testes em uma pipeline, certifique-se de ter alterado a url do selenium grid dentro do config.properties

Para execução, crie uma nova pipeline, definida como "Pipeline scrit from SCM - GIT"
Informe a url do repositório do gitlab ou github, defina o Script Path como Jenkinsfile e salve.
Abra o Blue Ocean, e execute os testes no botão Run.
```


## Author

👤 **Jussara Granja**

* LinkedIn: [@jussaragranja](https://linkedin.com/in/jussaragranja)
* Github: [@jussaragranja](https://github.com/jussaragranja)
* GitLab: [@jussaragranja](https://gitlab.com/jussaragranja)
* Twitter: [@JuuhGranja](https://twitter.com/JuuhGranja)
