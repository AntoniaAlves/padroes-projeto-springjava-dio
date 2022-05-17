# Explorando Padrões de Projetos na Prática com Java e Spring #


## Digital Innovation One: Labs

O projeto foi desenvolvido com instruções do https://github.com/falvojr  realizado no Lab da Digital Innovation One. 
Como base foi utilizado o repositório [digitalinnovationone/lab-padroes-projetos-spring](url). 
Para esse desenvolvimento foi utilizado o repositório https://github.com/digitalinnovationone/lab-padroes-projeto-spring 
e foi apresentando também padrões de projeto Singleton, Strategy e Facade em Java puro.

_____________________________________________________________________________________________________________________________________
Padrões e conceitos apresentados no Lab:

Singleton: Padrão Criacional que permite a criação de uma única instância de uma classe e fornecer um modo para recuperá-la;
Strategy: Padrão Comportamental com objetivo de simplificar a variação de algoritmos para a resolução de um mesmo problema;
Facade: Padrão Estrutural que visa prover uma interface que reduza a complexidade nas integrações com subsistemas.
A relação entre Padrões de Projetos com Java e o spring framework pode-se ser percebida em:

Annotations *@Bean e @Autowired* como padrão criacional **Singleton**;

Annotations *@Service e @Repository* como padrão comportamental **Strategy**;

Annotation *@RestController* como padrão estrutural **Facade**.
___________________________________________________________________________________________________________________________________
Utilizamos para este projeto o https://start.spring.io/ utilizando as opções:

Project: Maven Project;
Language: Java 11;
Spring Boot: 2.6.0;
Dependencies: Spring Web, Spring Data JPA, H2 Database e OpenFeign.

Dependência adicionada manualmente no pom.xml: Springdoc https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-ui/1.5.12
__________________________________________________________________________________________________________________________________

Swagger: http://127.0.0.1:8080/swagger-ui.html

Minimun Payload in POST:

````
{
  "id": 0,
  "nome": "string",
  "endereco": {
    "cep": "string",
    "logradouro": "string",
    "complemento": "string",
    "bairro": "string",
    "localidade": "string",
    "uf": "string",
    "ibge": "string",
    "gia": "string",
    "ddd": "string",
    "siafi": "string"
  }
}
````




Example:



````
{
  "id": 1,
  "nome": "Maria",
  "endereco": { 
    "cep": "02132-035",
    "logradouro": "Rua Alexandre Rontini",
    "complemento": "",
    "bairro": "Jardim Japão",
    "localidade": "São Paulo",
    "uf": "SP",
    "ibge": "3550308",
    "gia": "1004",
    "ddd": "11",
    "siafi": "7107"
  }
}
````

__________________________________________________________________________________________________________________________________________
**Links Interessantes**:

IDE:https://www.eclipse.org/downloads/

https://www.jsonschema2pojo.org/

https://viacep.com.br/

