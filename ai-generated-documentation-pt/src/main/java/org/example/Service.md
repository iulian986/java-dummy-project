## Documentação do Service.java

**1. Visão Geral:**

Este código Java define uma classe `Service` que fornece dois métodos: `isEven()` para verificar se um número é par e `highComplexityMethod()` para analisar os sinais de três inteiros. 

**2. Nome do pacote/módulo:**

org.example

**3. Nome da classe/arquivo:**

Service.java

**4. Documentação Detalhada:**

   - **Classe `Service`**:
     - **Descrição:** Uma classe utilitária contendo métodos para verificar números pares e analisar os sinais de inteiros.

     - **Método `isEven(int input)`**:
       - **Descrição:** Determina se um inteiro dado é par.
       - **Parâmetros:**
         - `input`: Um inteiro a ser verificado.
       - **Valor de retorno:** Um valor booleano (`true` se for par, `false` caso contrário).
       - **Lógica importante:** Utiliza o operador módulo (%) para verificar se o resto da divisão do input por 2 é zero. Se for, o número é par e `true` é retornado; caso contrário, `false` é retornado.

     - **Método `highComplexityMethod(int a, int b, int c)`**:
       - **Descrição:** Imprime mensagens com base nos sinais de três inteiros (`a`, `b` e `c`). Possui instruções condicionais aninhadas para cobrir todas as combinações possíveis de valores positivos e não positivos.
       - **Parâmetros:**
         - `a`: Um inteiro.
         - `b`: Um inteiro.
         - `c`: Um inteiro.
       - **Valor de retorno:** Nenhum (imprime mensagens no console).
       - **Lógica importante:** 
         - Utiliza uma série de instruções if-else aninhadas para analisar os sinais de `a`, `b` e `c`.
         - Imprime mensagens indicando se cada variável é positiva ou não positiva.

**5. Código Falso:**



```
// Classe: Service
// Método: isEven(input)

  1. Calcule o resto quando 'input' for dividido por 2 usando o operador módulo (%).
  2. Se o resto for igual a 0, retorne true (o número é par).
  3. Caso contrário, retorne false (o número é ímpar).


// Método: highComplexityMethod(a, b, c)

  1. Verifique o sinal de 'a':
     - Se 'a' for 0:
       - Verifique o sinal de 'b':
         - Se 'b' for positivo:
           - Verifique o sinal de 'c':
             - Se 'c' for positivo: Imprima "a, b e c são positivos".
             - Caso contrário: Imprima "a e b são positivos, c é não positivo".
         - Caso contrário: 
           - Imprima "b é não positivo".
     - Se 'a' for negativo:
       - Verifique o sinal de 'b':
         - Se 'b' for positivo:
           - Verifique o sinal de 'c':
             - Se 'c' for positivo: Imprima "a é não positivo, b e c são positivos".
             - Caso contrário: Imprima "a é não positivo, b é positivo, c é não positivo".
         - Caso contrário: 
           - Imprima "a e b são não positivos".
     - Caso contrário:
       - Verifique o sinal de 'b':
         - Se 'b' for positivo:
           - Verifique o sinal de 'c':
             - Se 'c' for positivo: Imprima "a é não positivo, b e c são positivos".
             - Caso contrário: Imprima "a é não positivo, b é positivo, c é não positivo".
         - Caso contrário: 
           - Imprima "a e b são não positivos".



```

**Dependências e Bibliotecas:**

* Este código não depende de bibliotecas externas. Utiliza funcionalidades embutidas do Java para operações aritméticas e saída para o console.




