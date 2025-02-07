## Documentação de Service.java

**1. Visão Geral:**

Esta classe Java `Service` fornece dois métodos: `isEven` para determinar se um inteiro dado é par e `highComplexityMethod` que realiza uma série de verificações condicionais com base em três inteiros de entrada. 

**2. Nome do Pacote/Módulo:**

org.example

**3. Nome da Classe/Arquivo:**

Service.java

**4. Documentação Detalhada:**

   - **Função/Método: `isEven(int input)`**
     - **Descrição:** Este método recebe um inteiro como entrada e retorna `true` se a entrada for par (divisivel por 2), caso contrário, retorna `false`.
     - **Parâmetros:**
       - `input`: Um valor inteiro.
     - **Valores de Retorno:**
       - Um valor booleano (`true` ou `false`) indicando se a entrada é par.
     - **Lógica Importante:** O método utiliza o operador módulo (`%`) para verificar se o resto da divisão da entrada por 2 é igual a 0. Se for, a entrada é par e o método retorna `true`; caso contrário, retorna `false`.

   - **Função/Método: `highComplexityMethod(int a, int b, int c)`**
     - **Descrição:** Este método recebe três inteiros como entrada (`a`, `b` e `c`) e imprime diversas mensagens para o console com base nos sinais desses inteiros. Utiliza sentenças if-else aninhadas para verificar todas as combinações possíveis de valores positivos e não positivos para `a`, `b` e `c`.
     - **Parâmetros:**
       - `a`: Um valor inteiro.
       - `b`: Um valor inteiro.
       - `c`: Um valor inteiro.
     - **Valores de Retorno:**
       - Este método não retorna nenhum valor (void).
     - **Lógica Importante:** O método primeiro verifica o sinal de `a`. Com base em seu sinal, entra em diferentes ramos de sentenças if-else para verificar os sinais de `b` e `c`, imprimindo mensagens conforme necessário.

**5. Código Pseudo:**


```
// Classe: Service

// Método: isEven(input)
  1. Calcule o resto quando input é dividido por 2 (input % 2).
  2. Se o resto for igual a 0, retorne true (input é par).
  3. Caso contrário, retorne false (input é ímpar).

// Método: highComplexityMethod(a, b, c)
  1. Verifique o sinal de 'a':
     - Se 'a' for positivo:
        - Verifique o sinal de 'b':
           - Se 'b' for positivo:
              - Verifique o sinal de 'c':
                 - Se 'c' for positivo, imprima "a, b e c são positivos".
                 - Caso contrário, imprima "a e b são positivos, c é não positivo".
           - Caso contrário (b é não positivo):
              - Verifique o sinal de 'c':
                 - Se 'c' for positivo, imprima "a é positivo, b é não positivo e c é positivo".
                 - Caso contrário, imprima "a e b são não positivos, c é não positivo".
     - Se 'a' for não positivo:
        - Verifique o sinal de 'b':
           - Se 'b' for positivo:
              - Verifique o sinal de 'c':
                 - Se 'c' for positivo, imprima "a é não positivo, b é positivo e c é positivo".
                 - Caso contrário, imprima "a é não positivo, b é positivo e c é não positivo".
           - Caso contrário (b é não positivo):
              - Verifique o sinal de 'c':
                 - Se 'c' for positivo, imprima "a e b são não positivos, c é positivo".
                 - Caso contrário, imprima "a e b são não positivos, c é não positivo".



```

**Dependências e Bibliotecas:**


Este código não depende de bibliotecas externas. Utiliza funcionalidades embutidas do Java padrão. 




