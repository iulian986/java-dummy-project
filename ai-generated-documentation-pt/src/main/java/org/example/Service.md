## Documentação do Service.java

**1. Visão Geral:**

Este código Java define uma classe simples chamada `Service` contendo dois métodos: `isEven` e `highComplexityMethod`. 

* O método `isEven` recebe um inteiro como entrada e retorna `true` se o número for par, caso contrário, retorna `false`.
* O método `highComplexityMethod` recebe três inteiros como entrada e imprime diversas mensagens para o console com base nos sinais dos valores de entrada. Ele apresenta um alto grau de repetição de código para diferentes combinações de entradas positivas e não-positivas.

**2. Nome do pacote/módulo:**

org.example

**3. Nome da classe/arquivo:**

Service.java

**4. Documentação Detalhada:**

   - **Função: `isEven(int input)`**
     - **Descrição:** Este método determina se um inteiro dado é par.
     - **Parâmetros:**
       - `input`: Um valor inteiro a ser verificado para paridade.
     - **Valores de Retorno:**
       - `true`: Se o número de entrada for divisível por 2 (par).
       - `false`: Se o número de entrada não for divisível por 2 (ímpar).
     - **Lógica Importante:** O método utiliza o operador módulo (`%`) para verificar se o resto da divisão do input por 2 é igual a 0. Se for, o número é par e o método retorna `true`; caso contrário, retorna `false`.

   - **Função: `highComplexityMethod(int a, int b, int c)`**
     - **Descrição:** Este método imprime mensagens para o console com base nos sinais de três inteiros de entrada. Possui uma estrutura complexa com sentenças if aninhadas que levam a lógica repetitiva.
     - **Parâmetros:**
       - `a`: O primeiro valor inteiro.
       - `b`: O segundo valor inteiro.
       - `c`: O terceiro valor inteiro.
     - **Valores de Retorno:** Este método não retorna nenhum valor (void).
     - **Lógica Importante:** 
         * Verifica o sinal de 'a' usando sentenças if-else.
         * Para cada possível sinal de 'a', verifica os sinais de 'b' e 'c' usando sentenças if-else aninhadas.
         * Com base na combinação dos sinais, imprime mensagens para o console indicando se 'b' e 'c' são positivos ou não-positivos.

**5. Código Falso:**


```
// Classe: Service

// Método: isEven(input)
  1. Calcule o resto quando input for dividido por 2 (input % 2).
  2. Se o resto for igual a 0, retorne true.
  3. Caso contrário, retorne false.

// Método: highComplexityMethod(a, b, c)
  1. Verifique o sinal de 'a':
     - Se 'a' for 0:
       - Verifique o sinal de 'b':
         - Se 'b' for positivo:
           - Verifique o sinal de 'c':
             - Se 'c' for positivo, imprima "a é positivo, b é positivo, c é positivo".
             - Caso contrário, imprima "a é positivo, b é positivo, c é não-positivo".
         - Caso contrário, imprima "a é positivo, b é não-positivo".
     - Se 'a' for negativo:
       - Verifique o sinal de 'b':
         - Se 'b' for positivo:
           - Verifique o sinal de 'c':
             - Se 'c' for positivo, imprima "a é negativo, b é positivo, c é positivo".
             - Caso contrário, imprima "a é negativo, b é positivo, c é não-positivo".
         - Caso contrário, imprima "a é negativo, b é não-positivo".
     - Caso contrário (se 'a' não for 0 nem positivo nem negativo):
       - Imprima uma mensagem de erro indicando um valor inesperado para 'a'.



```

**Observação:** O código falso não inclui tratamento de erros específico ou gerenciamento de exceções.




