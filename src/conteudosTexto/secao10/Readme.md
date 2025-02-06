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

## For Each
# Diferença entre Iteração com Índice e Iteração com For-Each

No código `src/Main.java`, existem duas formas de iterar sobre os elementos do array `vect`:

# Iteração com Índice
```java
for (int i = 0; i < vect.length; i++) {
  System.out.println(vect[i]);
}
```

Iteração com For-Each
```java
for (String obj : vect) {
System.out.println(obj);
}
```
 - Utiliza um índice (i) para acessar cada elemento do array.
Permite acessar o índice atual, o que pode ser útil se você precisar saber a posição do elemento no array.

 - Utiliza a sintaxe do for-each para iterar diretamente sobre os elementos do array.
É mais concisa e legível quando você não precisa do índice, apenas dos elementos.

Ambas as formas são válidas, mas a escolha entre elas depende do contexto e da necessidade de acessar o índice dos elementos.

## Listas

 - Lista é uma estrutura de dados:
   - Homogênea: dados do mesmo tipo
   - Ordenada: elementos são acessados por meio de posições
   - Inicia vazia, e seus elementos são alocados sob demanda
   - Cada elemento ocupa um nó (ou nodo) da lista
# Tipo (interface) List
 - Classes que implementam: ArrayList, LinkedList, etc.

### Vantagens:
 - Tamanho variável
 - Facilidade para realizar inserções e deleções
### Desvantagens:
 - Acesso sequencial aos elementos*

#Demo
 - Tamanho da lista: size()
 - Insere elemento na lista: add(obj), add(int, obj)
 - Remove elementos da lista: remove(obj), remove(int), removeIf(predicate)
 - Encontrar posição de um elemento: indexOf(obj), lastIndexOf(obj)
 - Filtrar lista com base em predicado: List<Interger> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());
 - Encontrar primeira ocorrência com base em predicado: Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

```java
public static void main(String[] args) {
    List<String> list = new ArrayList<>();

    list.add("Maria");
    list.add("José");
    list.add("Alfredo");
    list.add("Mario");
    list.add("Cézar");
    list.add(2, "Lucas");
    list.add("Laura");

    System.out.println(list.size());
    for(String name : list){
      System.out.println(name);
    }

    System.out.println("------------------------------");
    list.removeIf(x -> x.charAt(0) == 'M');

    for(String name : list){
      System.out.println(name);
    }
    System.out.println("------------------------------");
    System.out.println("Index of Cézar: " + list.indexOf("Cézar"));
    System.out.println("-----------------------------");
    //primeiro convertemos pra stream, faço a operação que desejo, e converto de novo para ser uma lista
    List<String> result = list.stream().filter(x -> x.charAt(0) == 'L').collect(Collectors.toList());
    for(String name : result){
      System.out.println(name);
    }
  }
```