# Person API - Spring Boot

Bem-vindo à Person API! Este é um projeto de API desenvolvido com Spring Boot, utilizando Spring Data JPA, Actuator, H2 Database, Lombok, DevTools e UnitTests. Este projeto fornece uma API para gerenciar informações de pessoas.

## Tecnologias Utilizadas

- **Spring Boot**: Um framework Java para facilitar a criação de aplicativos web e API RESTful.
- **Spring Data JPA**: Uma abstração do Spring Framework que facilita a interação com bancos de dados relacionais.
- **Actuator**: Um conjunto de ferramentas para monitoramento e gerenciamento de aplicativos Spring Boot em execução.
- **H2 Database**: Um banco de dados SQL de código aberto, leve e rápido, que pode ser executado em memória.
- **Lombok**: Uma biblioteca Java que automatiza a geração de código boilerplate, como getters, setters e construtores.
- **DevTools**: Um conjunto de ferramentas que agiliza o desenvolvimento, incluindo reinicialização automática do aplicativo.
- **UnitTests**: Testes unitários escritos para garantir a qualidade e o funcionamento correto da API.

## Funcionalidades

- CRUD (Create, Read, Update, Delete) de informações de pessoas.
- Endpoints RESTful para manipular dados de pessoas.
- Monitoramento de métricas e informações de saúde da aplicação usando o Actuator.
- Banco de dados H2 em memória para armazenamento temporário de dados.

## Como Utilizar

Para utilizar este projeto, siga estas etapas:

1. Clone ou faça o download deste repositório.
2. Importe o projeto em sua IDE preferida.
3. Certifique-se de ter o Java e o Maven instalados em sua máquina.
4. Execute o projeto Spring Boot utilizando o Maven: `mvn spring-boot:run`.
5. Acesse a API através do URL fornecido pela aplicação.
6. Explore os endpoints disponíveis para gerenciar informações de pessoas.

## Testes

Para executar os testes unitários, você pode usar o seguinte comando Maven:

```bash
mvn test
```

Isso garantirá que os testes estejam passando corretamente e que a API esteja funcionando conforme o esperado.

## Contribuições

Contribuições para este projeto são bem-vindas! Se você tiver sugestões, melhorias ou correções a fazer, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE), o que significa que você tem a liberdade de usar, modificar e distribuir o código conforme desejar.
