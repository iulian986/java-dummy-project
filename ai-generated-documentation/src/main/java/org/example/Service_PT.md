## Documentação de Service.java

**1. Visão Geral**

A classe `Service` fornece duas funcionalidades:

- `isEven`: Determina se um inteiro fornecido é par.
- `highComplexityMethod`: Analisa os sinais de três inteiros (a, b, c) e imprime uma série de mensagens com base em suas combinações.

**2. Nome do pacote/módulo:**

`org.example`

**3. Nome da classe/arquivo:**

`Service.java`

**4. Documentação Detalhada**

   - **Método `isEven(int input)`**
     - **Descrição:** Verifica se o inteiro fornecido `input` é par.
     - **Parâmetros:**
       - `input`: Um inteiro a ser verificado.
     - **Valores de Retorno:**
       - `boolean`: Retorna `true` se o `input` for par, `false` caso contrário.
     - **Lógica Importante:**
       - Usa o operador módulo (`%`) para verificar se o resto da divisão de `input` por 2 é igual a 0. Se for, o número é par e o método retorna `true`; caso contrário, retorna `false`.

   - **Método `highComplexityMethod(int a, int b, int c)`**
     - **Descrição:** Imprime mensagens com base nos sinais de três inteiros (`a`, `b`, `c`).
     - **Parâmetros:**
       - `a`: Um inteiro.
       - `b`: Um inteiro.
       - `c`: Um inteiro.
     - **Valores de Retorno:**
       - Nenhum.
     - **Lógica Importante:**
       - Usa uma série de instruções `if` aninhadas para analisar os sinais de `a`, `b` e `c`.
       - Imprime mensagens indicando se cada inteiro é positivo ou não positivo.
       - As mensagens são estruturadas para fornecer uma análise detalhada dos sinais de todos os três inteiros.

**5. Código Falso**

```
// Classe: Service

// Método: isEven(int input)
  1. Calcule o resto quando 'input' é dividido por 2 usando o operador módulo (%).
  2. Se o resto for igual a 0, retorne true (o número é par).
  3. Caso contrário, retorne false (o número é ímpar).

// Método: highComplexityMethod(int a, int b, int c)
  1. Verifique o sinal de 'a':
    - Se 'a' for 0:
      - Verifique o sinal de 'b':
        - Se 'b' for positivo:
          - Verifique o sinal de 'c':
            - Se 'c' for positivo: Imprima "a é positivo, b é positivo, c é positivo"
            - Se 'c' for não positivo: Imprima "a é positivo, b é positivo, c é não positivo"
        - Se 'b' for não positivo:
          - Verifique o sinal de 'c':
            - Se 'c' for positivo: Imprima "a é positivo, b é não positivo, c é positivo"
            - Se 'c' for não positivo: Imprima "a é positivo, b é não positivo, c é não positivo"
    - Se 'a' for menor que 0:
      - Verifique o sinal de 'b':
        - Se 'b' for positivo:
          - Verifique o sinal de 'c':
            - Se 'c' for positivo: Imprima "a é não positivo, b é positivo, c é positivo"
            - Se 'c' for não positivo: Imprima "a é não positivo, b é positivo, c é não positivo"
        - Se 'b' for não positivo:
          - Verifique o sinal de 'c':
            - Se 'c' for positivo: Imprima "a é não positivo, b é não positivo, c é positivo"
            - Se 'c' for não positivo: Imprima "a é não positivo, b é não positivo, c é não positivo"
    - Se 'a' não for 0 e não for menor que 0:
      - Verifique o sinal de 'b':
        - Se 'b' for positivo:
          - Verifique o sinal de 'c':
            - Se 'c' for positivo: Imprima "a é positivo, b é positivo, c é positivo"
            - Se 'c' for não positivo: Imprima "a é positivo, b é positivo, c é não positivo"
        - Se 'b' for não positivo:
          - Verifique o sinal de 'c':
            - Se 'c' for positivo: Imprima "a é positivo, b é não positivo, c é positivo"
            - Se 'c' for não positivo: Imprima "a é positivo, b é não positivo, c é não positivo"



**Dependências e Bibliotecas:**

- Este código não depende de bibliotecas externas. Ele usa funcionalidades de linguagem incorporadas para operações aritméticas e entrada/saída.



