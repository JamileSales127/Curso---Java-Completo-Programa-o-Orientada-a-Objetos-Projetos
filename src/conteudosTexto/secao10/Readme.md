# Tipos Referência vs. Tipos Valor

**Tipos referência** apontam para um objeto, já os **tipos valor** são caixas que guardam um valor.

## Desalocação de Memória

### Garbage Collector e Escopo Local

- Objetos alocados dinamicamente, quando não possuem mais referência para eles, serão desalocados pelo garbage collector.
- Variáveis locais são desalocadas imediatamente assim que seu escopo local sai de execução.

## Boxing

É o processo de conversão de um objeto tipo valor para um objeto tipo referência.

```java
int x = 20;
Object obj = x; // boxing
```
## Unboxing
É o processo de conversão de um objeto tipo referência para um objeto tipo valor.
```java
int y = (int)obj; // unboxing
```
## Wrapper classes
 - São classes equivalentes aos tipos primitivos
 - Boxing e unboxing é natural da linguagem Java
 - Uso comum: campos de entidades em sistemas de informação
     - Pois tipos referência podem receber null, enquanto tipos valor não podem.
