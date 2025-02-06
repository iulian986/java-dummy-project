## Documentação do Client.java

**1. Visão Geral:**

Este código Java define uma classe `Client` que interage com um objeto `Service` para gerar saudações. O cliente recebe um nome como entrada, verifica se ele é válido, determina se o comprimento do nome é par e, em seguida, constrói uma saudação de acordo. 

**2. Nome do pacote/módulo:**

org.example

**3. Nome da classe/arquivo:**

Client.java

**4. Documentação Detalhada:**

   - **Classe `Client`**:
     - **Descrição:** Representa um cliente que interage com um serviço para gerar saudações com base em um nome fornecido.
     - **Campos:**
       - `service`: Um campo privado do tipo `Service` representando o objeto de serviço usado para verificar se um número é par.

     - **Construtor `Client(Service service)`**:
       - **Descrição:** Inicializa uma nova instância de `Client` com o objeto `service` fornecido.
       - **Parâmetros:**
         - `service`: Um objeto `Service` responsável por determinar se um número é par.
       - **Valor de retorno:** Nenhum

     - **Método `greeting(String name)`**:
       - **Descrição:** Gera uma mensagem de saudação com base no nome fornecido. Se o nome for nulo ou vazio, ele lança uma `IllegalArgumentException`. Caso contrário, verifica se o comprimento do nome é par e retorna a saudação em maiúsculas se for par, caso contrário, em minúsculas.
       - **Parâmetros:**
         - `name`: Uma String representando o nome a ser usado na saudação.
       - **Valor de retorno:** Uma String contendo a mensagem de saudação gerada.
       - **Lógica importante:**
         - Valida a entrada `name` para garantir que não seja nula ou vazia. Lança uma `IllegalArgumentException` se inválida.
         - Chama o método `isEven()` do objeto `service` para determinar se o comprimento do nome é par.
         - Constrói a mensagem de saudação usando formatação de string.
         - Retorna a saudação em maiúsculas se o comprimento do nome for par, caso contrário, retorna a saudação em minúsculas.

**5. Código Pseudo:**


```
// Classe: Client
// Método: greeting(name)

  1. Verifique se 'name' é nulo ou vazio:
     - Se verdadeiro, lance uma IllegalArgumentException com a mensagem "'name' não pode ser nulo ou vazio".
  2. Chame o método 'isEven' do objeto 'service' com o comprimento de 'name'.
     - Armazene o resultado (booleano) em uma variável chamada 'even'.
  3. Construa a mensagem de saudação usando formatação de string: "Olá, %s" formatada com 'name'.
  4. Se 'even' for verdadeiro:
     - Retorne a mensagem de saudação em maiúsculas.
  5. Caso contrário:
     - Retorne a mensagem de saudação em minúsculas. 


```



**Dependências e Bibliotecas:**

* **Interface Service:** Este código assume a existência de uma interface `Service` com um método `isEven(int)`. Em outras linguagens, você pode usar bibliotecas ou interfaces equivalentes para verificar números pares. Por exemplo:
    * **Java:** Nenhuma biblioteca específica é necessária, pois o Java possui o operador módulo (%) embutido para verificar a paridade.
    * **Python:** Você pode usar o operador módulo (%) diretamente.
    * **C++:** Use o operador módulo (%) para verificar a paridade.



