## Documentação de Client.java

**1. Visão Geral**

A classe `Client` demonstra uma interação simples com um objeto `Service`. Ela recebe uma instância de `Service` em seu construtor e fornece um método `greeting` que gera uma saudação personalizada com base em um nome fornecido. A saudação é formatada de forma diferente dependendo se o comprimento do nome é par ou ímpar.

**2. Nome do pacote/módulo:**

`org.example`

**3. Nome da classe/arquivo:**

`Client.java`

**4. Documentação Detalhada**

   - **Construtor `Client(Service service)`**
     - **Descrição:** Inicializa uma nova instância de `Client` com um objeto `Service` fornecido.
     - **Parâmetros:**
       - `service`: Um objeto `Service` responsável por fornecer a funcionalidade `isEven`.
     - **Valores de retorno:** Nenhum.
     - **Lógica importante:** Armazena o objeto `service` fornecido na variável de instância `this.service`.

   - **Método `greeting(String name)`**
     - **Descrição:** Gera uma saudação personalizada com base no nome fornecido.
     - **Parâmetros:**
       - `name`: Uma string representando o nome a ser usado na saudação.
     - **Valores de retorno:** Uma string contendo a saudação formatada.
     - **Lógica importante:**
       - **Validação de entrada:** Verifica se o `name` é nulo ou vazio. Se for, lança uma `IllegalArgumentException` com a mensagem "'name' must not be null or empty".
       - **Verificação par/ímpar:** Chama o método `isEven` do objeto `service` para determinar se o comprimento do `name` é par.
       - **Formatação da saudação:**
         - Se o comprimento for par, a saudação é retornada em maiúsculas.
         - Caso contrário, a saudação é retornada em seu caso original.

**5. Código Pseudo**

```
// Classe: Client

// Construtor: Client(Service service)
  1. Defina a variável de instância 'service' para o objeto 'service' fornecido.

// Método: greeting(String name)
  1. Verifique se o 'name' é nulo ou vazio:
    - Se verdadeiro, lance uma "IllegalArgumentException" com a mensagem "'name' must not be null or empty".
  2. Chame o método 'isEven' do objeto 'service', passando o comprimento do 'name' como argumento.
  3. Se o método 'isEven' retornar verdadeiro:
    - Formate a string de saudação usando o 'name' e converta-a para maiúsculas.
  4. Caso contrário:
    - Formate a string de saudação usando o 'name'.
  5. Retorne a string de saudação formatada.
```



**Dependências e Bibliotecas:**

- O código assume a existência de uma interface ou classe `Service` com um método `isEven`. Este método provavelmente verifica se um inteiro dado é par.

- **Bibliotecas equivalentes:**

  - **Java:** Nenhuma dependência de biblioteca específica. A funcionalidade `isEven` poderia ser implementada usando métodos Java integrados.
  - **Python:** A funcionalidade `isEven` poderia ser implementada usando o operador módulo (`%`).
  - **C++:** A funcionalidade `isEven` poderia ser implementada usando o operador módulo (`%`).



