## Documentação do Client.java

**1. Visão Geral:**

Este código Java define uma classe `Client` que interage com um objeto `Service` para gerar saudações. O cliente recebe um nome como entrada, verifica se ele é válido, determina se o comprimento do nome é par e, em seguida, gera uma saudação de acordo (maiúscula se for par, minúscula caso contrário).

**2. Nome do Pacote/Módulo:**

org.example

**3. Nome da Classe/Arquivo:**

Client.java

**4. Documentação Detalhada:**

* **Classe `Client`**:
    - **Descrição:** Esta classe encapsula a lógica para gerar saudações com base em um nome fornecido e interação com um objeto `Service`.
    - **Construtor `Client(Service service)`**:
        - **Descrição:** Inicializa uma nova instância de `Client`, associando-a a um objeto `Service` dado.
        - **Parâmetros:**
            - `service`: Um objeto `Service` responsável por fornecer a funcionalidade de verificação de número par.
        - **Valores de Retorno:** Nenhum

* **Método `greeting(String name)`**:
    - **Descrição:** Gera uma string de saudação com base no nome fornecido e seu comprimento.
    - **Parâmetros:**
        - `name`: Uma String representando o nome do destinatário.
    - **Valores de Retorno:**
        - Uma String contendo a saudação gerada, em maiúsculas se o comprimento do nome for par, caso contrário, em minúsculas.
    - **Lógica Importante:**
        1. **Validação de Entrada:** Verifica se o `name` fornecido é nulo ou vazio. Se sim, lança uma `IllegalArgumentException`.
        2. **Verificação de Comprimento Par:** Chama o método `isEven()` do objeto `Service` associado para determinar se o comprimento do nome é par.
        3. **Geração da Saudação:** Formata uma string de saudação usando o `name` fornecido.
        4. **Tratamento de Caso:** Se o comprimento do nome for par, converte a string de saudação para maiúsculas; caso contrário, retorna-a em minúsculas.

**5. Código Falso:**


```
// Classe: Client

// Método: greeting(name)
  1. Verifique se 'name' é nulo ou vazio:
    - Se verdadeiro, lance uma "IllegalArgumentException" com a mensagem "'name' não pode ser nulo ou vazio".
  2. Chame o método 'isEven()' do objeto 'Service' associado com o comprimento de 'name'. 
     - Armazene o resultado (booleano) em uma variável chamada 'even'.
  3. Formate uma string de saudação usando o 'name' fornecido.
  4. Se 'even' for verdadeiro:
    - Converta a string de saudação para maiúsculas.
  5. Retorne a string de saudação formatada.

```



**Dependências e Bibliotecas:**


* **Interface Service:** O código assume a existência de uma interface chamada `Service` com um método chamado `isEven()`. Esta interface provavelmente define o contrato para verificar se um número dado é par. 

* **Bibliotecas Equivalentes em Outras Linguagens:**
    - Java: Nenhuma biblioteca externa específica é usada.
    - Python: Você pode usar funções embutidas como `len()` e `str.upper()` para funcionalidade semelhante.
    - C++: Use funções da biblioteca padrão como `strlen()` e `toupper()`.








