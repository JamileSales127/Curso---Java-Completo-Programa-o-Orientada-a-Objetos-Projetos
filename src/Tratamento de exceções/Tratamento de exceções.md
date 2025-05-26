# 💻 Tratamento de exceções

🌸 **Exceções em Java** 🌸

✨ Uma exceção é qualquer situação de erro ou comportamento inesperado que aparece enquanto o programa está rodando.  
✨ Em Java, uma exceção é um objeto super especial que vem das classes:  
- 🎀 `java.lang.Exception` — O compilador pede pra você tratar ou avisar sobre ela!  
- 🎀 `java.lang.RuntimeException` — O compilador não exige que você trate, mas é bom ficar de olho!  

Quando uma exceção aparece, ela vai subindo na pilha de chamadas dos métodos até alguém cuidar dela (capturar/tratar) ou até o programa acabar.  

---

🌺 **Hierarquia de exceções do Java** 🌺

Imagina uma árvore genealógica das exceções!  
No topo, temos a mãe de todas: `Throwable`.  
Abaixo dela, duas filhas principais:  
- 🌸 `Exception` (para errinhos que podemos tratar!)
  - 🌼 `IOException` (quando dá ruim com arquivos, leitura ou escrita de dados!)
  - 🌼 `RuntimeException` (para erros que podem acontecer em tempo de execução e o compilador não obriga tratar)
- 🌸 `Error` (para problemas sérios que normalmente não conseguimos resolver 😱)

Dentro de `Exception`, temos a subclasse `RuntimeException`, que representa exceções que podem acontecer durante a execução, mas que o compilador não obriga a tratar.
Já a `IOException` é outra subclasse de `Exception` e aparece quando dá algum problema com arquivos, leitura ou escrita de dados (tipo quando não encontra um arquivo ou não consegue ler um texto). Como ela é uma exceção verificada, o compilador exige que você trate ou declare ela no seu código, para garantir que tudo vai funcionar!✨

```
Throwable
 ├── Exception
 │    ├── IOException
 │    └── RuntimeException
 └── Error
```


---
🌷 **Por que usar exceções?** 🌷

✨ O modelo de tratamento de exceções deixa tudo mais organizado e flexível, sempre seguindo boas práticas!  
✨ Olha só as vantagens:

- 🎀 Delega a lógica do erro para quem realmente entende das regras (cada classe cuida do seu jeitinho!)
- 🎀 Organiza as exceções de vários tipos, até em hierarquia, pra ninguém se perder!
- 🎀 A exceção pode carregar qualquer informação importante pra te ajudar a resolver o problema! 💌

---
🌟 **Estrutura try-catch** 🌟

- 💖 **Bloco `try`**  
  Aqui você coloca o código que vai rodar normalmente, mas que pode dar algum errinho inesperado!

- 💖 **Bloco `catch`**  
  Se acontecer uma exceção, esse bloco entra em ação para resolver o problema!  
  Você precisa dizer qual tipo de exceção quer tratar (pode usar upcasting, tá?).

Exemplo:
```java
try {
    // Código que pode dar ruim 💥
} catch (TipoDaExcecao e) {
    // Código para cuidar do erro  💅
}
```
---

🌈 **Bloco finally** 🌈

Às vezes, você quer garantir que um código especial seja executado, mesmo se der tudo certo ou se acontecer um erro. Pra isso existe o bloco `finally`! ✨

Exemplo:
```java
try {
    // Código principal 🌟
} catch (ExceptionType e) {
    // Tratamento do erro 💅
} finally {
    // Código que SEMPRE vai rodar! 
}
```

- 💡 O bloco `finally` é perfeito pra fechar arquivos, conexões de banco de dados ou liberar recursos importantes no final do processamento, não importa o que aconteça!