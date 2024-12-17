## Documentação de Service.java

**1. Visão Geral**

A classe `Service` fornece dois métodos: `isEven` e `highComplexityMethod`. O método `isEven` determina se um inteiro dado é par, retornando `true` se for e `false` caso contrário. O método `highComplexityMethod` analisa três inteiros (`a`, `b` e `c`) e imprime uma série de mensagens com base em seus valores positivos ou não positivos.

**2. Nome do pacote/módulo:**

`org.example`

**3. Nome da classe/arquivo:**

`Service.java`

**4. Documentação Detalhada**

* **Método `isEven(int input)`**

    * **Descrição:** Verifica se o inteiro dado `input` é par.
    * **Parâmetros:**
        * `input`: Um inteiro a ser verificado.
    * **Valores de retorno:**
        * `boolean`: Retorna `true` se o `input` for par, `false` caso contrário.
    * **Lógica importante:**
        * Utiliza o operador módulo (`%`) para determinar o resto da divisão de `input` por 2. Se o resto for 0, o número é par e o método retorna `true`; caso contrário, retorna `false`.

* **Método `highComplexityMethod(int a, int b, int c)`**

    * **Descrição:** Analisa três inteiros (`a`, `b` e `c`) e imprime mensagens com base em seus valores positivos ou não positivos.
    * **Parâmetros:**
        * `a`: O primeiro inteiro.
        * `b`: O segundo inteiro.
        * `c`: O terceiro inteiro.
    * **Valores de retorno:**
        * Nenhum.
    * **Lógica importante:**
        * Utiliza sentenças `if` aninhadas para verificar os valores de `a`, `b` e `c`.
        * Imprime mensagens indicando se cada inteiro é positivo ou não positivo.
        * A lógica está estruturada para lidar com todas as combinações possíveis de valores positivos e não positivos para `a`, `b` e `c`.

**5. Código Pseudo**

```
// Classe: Service

// Método: isEven(input)
  1. Calcule o resto quando input é dividido por 2 (input % 2).
  2. Se o resto for 0, retorne true (input é par).
  3. Caso contrário, retorne false (input é ímpar).

// Método: highComplexityMethod(a, b, c)
  1. Verifique o valor de 'a':
    - Se 'a' for 0:
      - Verifique o valor de 'b':
        - Se 'b' for positivo:
          - Verifique o valor de 'c':
            - Se 'c' for positivo, imprima "c é positivo".
            - Caso contrário, imprima "c é não positivo".
        - Caso contrário, imprima "b é não positivo".
    - Se 'a' for negativo:
      - Verifique o valor de 'b':
        - Se 'b' for positivo:
          - Verifique o valor de 'c':
            - Se 'c' for positivo, imprima "c é positivo".
            - Caso contrário, imprima "c é não positivo".
        - Caso contrário, imprima "b é não positivo".
    - Caso contrário, imprima "a é não positivo".



```

**Dependências e Bibliotecas:**

* Este código não depende de nenhuma biblioteca externa. É uma classe simples com operações aritméticas básicas.



