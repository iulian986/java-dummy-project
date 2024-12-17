## Documentação de pom.xml

**1. Visão Geral**

Este arquivo `pom.xml` é um arquivo de configuração para a ferramenta de construção Maven. Ele define a estrutura do projeto, as dependências, o processo de construção e outros metadados para um projeto Java chamado "dummy-java-project".

**2. Ferramenta de Construção:** Maven

**3. Nome do Script/Arquivo:** pom.xml

**4. Documentação Detalhada**

* **Metadados do Projeto:**
    - **`<groupId>`:** `org.example` - Identifica o grupo ou organização do projeto.
    - **`<artifactId>`:** `dummy-java-project` - Identificador único para o projeto dentro do grupo.
    - **`<version>`:** `1.0-SNAPSHOT` - Versão atual do projeto. "SNAPSHOT" indica que é uma versão de desenvolvimento.

* **Propriedades:**
    - **`<maven.compiler.source>`:** `17` - Especifica a versão do código-fonte Java utilizada (Java 17).
    - **`<maven.compiler.target>`:** `17` - Especifica a versão alvo do Java para compilação (Java 17).
    - **`<project.build.sourceEncoding>`:** `UTF-8` - Define a codificação de caracteres para os arquivos de origem.
    - **`<junit.jupiter.version>`:** `5.10.0` - Versão do JUnit Jupiter utilizada para testes.

* **Dependências:**
    - **`mockito-core`:** Framework de teste para simulação de objetos.
    - **`assertj-core`:** Biblioteca de asserções para escrever testes concisos e legíveis.
    - **`junit-jupiter-engine`:** Motor principal para testes JUnit Jupiter.
    - **`junit-jupiter-api`:** API para escrever testes JUnit Jupiter.
    - **`mockito-junit-jupiter`:** Ponte entre Mockito e JUnit Jupiter.

* **Plugins de Construção:**
    - **`maven-surefire-plugin`:** Executa os testes definidos no projeto.

**5. Versão da Linguagem:** Java 17

**6. Versões das Dependências:**
    - `mockito-core`: 5.6.0
    - `assertj-core`: 3.24.2
    - `junit-jupiter-engine`: 5.10.0
    - `junit-jupiter-api`: 5.10.0
    - `mockito-junit-jupiter`: 5.6.0
    - `maven-surefire-plugin`: 3.0.0

**7. Código Pseudo:**

1. **Carregar Metadados do Projeto:**
    - Ler o `<groupId>`, `<artifactId>`, `<version>`, e outros metadados do `pom.xml`.
2. **Definir Propriedades:**
    - Definir as versões de origem e alvo do Java (Java 17) com base em `<maven.compiler.source>` e `<maven.compiler.target>`.
    - Definir a codificação de caracteres como UTF-8 usando `<project.build.sourceEncoding>`.
3. **Resolver Dependências:**
    - Baixar e instalar todas as dependências listadas na seção `<dependencies>`.
    - Assegurar que as versões especificadas no `pom.xml` sejam utilizadas.
4. **Configurar Plugins de Construção:**
    - Configurar o `maven-surefire-plugin` para execução de testes.
5. **Compilar Código-Fonte:**
    - Compilar arquivos de código-fonte Java usando a versão do Java especificada (Java 17).
6. **Executar Testes:**
    - Executar os testes definidos no projeto usando o `maven-surefire-plugin`.
    - Reportar os resultados dos testes e lidar com quaisquer falhas.
7. **Empacotar Projeto:**
    - Criar um arquivo distribuível (por exemplo, JAR) contendo código compilado e dependências.
8. **Implantar Artefatos:**
    - Opcionalmente, implantar os artefatos empacotados em um repositório (por exemplo, Maven Central).

**8. Dependências e Equivalentes de Plugins:**

* **Maven:**
    - **Gradle:** Gradle usa uma sintaxe de script de construção semelhante e o conceito de dependências.
    - **npm:** npm é usado para projetos JavaScript e gerencia dependências usando `package.json`.

* **Plugins:**
    - **`maven-surefire-plugin`:**
        - **Gradle:** tarefa `test`
        - **npm:** `jest`, `mocha`, ou outras estruturas de teste.



