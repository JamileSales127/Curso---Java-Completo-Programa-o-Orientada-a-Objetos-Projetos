## Construtor

- Um construtor é uma operação especial da classe que é executada no momento da instanciação do objeto. Quando utilizamos `new`, o construtor é iniciado.
- Usos comuns:
  - Inicializar valores dos atributos
  - Permitir ou obrigar que o objeto receba dados/dependências no momento de sua instanciação (injeção de dependência)
  - Se um construtor customizado não for especificado, a classe disponibiliza o construtor padrão:
    ```java
    Product p = new Product();
    ```
  - É possível especificar mais de um construtor na mesma classe (sobrecarga)

## Palavra this
- É uma referẽncia para o próprio objeto
- Usos comuns:
  - Diferenciar atributos de variáveis locais
  - Passar o próprio objeto como argumento na chamada de um método ou construtor

## Sobrecarga
- É um recurso que uma classe possui de oferecer mais de uma
  operação com o mesmo nome, porém com diferentes listas de
  parâmetros.
- Ex: Class Product com 3 construtores diferentes:
  ```java
  public Product(String name, double price) {
    this.name = name;
    this.price = price;
  }

  public Product(String name) {
    this.name = name;
  }

  public Product() {
  }
  ```
## Encapsulamento

 - É um princípio que consiste em 
esconder detalhes de implementação 
de uma classe, expondo apenas 
operações seguras e que mantenham 
os objetos em um estado consistente.
 - Regra de ouro: o objeto deve sempre 
estar em um estado consistente, e a 
própria classe deve garantir isso

#### Regra geral básica
- um objeto NÃO deve expor nenhum atributo (modificador de acesso private)
- os atributos devem ser acessados por métodos (getters e setters)

## Modificadore de acesso
 - PRIVATE: somente a própria classe pode acessar;
 - (NADA): acessível para todas as classes do mesmo pacote;
 - PROTECTED: acessível para todas as classes do mesmo pacote e subclasses;
 - PUBLIC: acessível para todas as classes de todos os pacotes.