## Documentação do arquivo pom.xml

**1. Visão Geral**

Este arquivo `pom.xml` é um arquivo de configuração para a ferramenta de construção Maven. Ele define a estrutura do projeto, dependências, processo de construção e outras metadados para um projeto Java chamado "dummy-java-project".

**2. Ferramenta de Construção:** Maven

**3. Nome do Script/Arquivo:** pom.xml

**4. Documentação Detalhada**

* **Metadados do Projeto:**
    - **Descrição:** Define informações básicas sobre o projeto, incluindo o ID do grupo (`org.example`), o ID do artefato (`dummy-java-project`) e a versão (`1.0-SNAPSHOT`).
    - **Parâmetros:**
        - `groupId`: Identificador único para o projeto dentro de um grupo de projetos relacionados.
        - `artifactId`: Identificador único para o projeto dentro do seu grupo.
        - `version`: Versão atual do projeto.
    - **Logica Importante:** Esses metadados são usados pelo Maven para identificar e gerenciar o projeto.

* **Propriedades:**
    - **Descrição:** Define propriedades específicas do projeto que podem ser usadas em todo o arquivo `pom.xml`.
    - **Parâmetros:**
        - `maven.compiler.source`: Especifica a versão do código-fonte Java a ser compilada (Java 17 neste caso).
        - `maven.compiler.target`: Especifica a versão Java de destino para o código compilado (Java 17).
        - `project.build.sourceEncoding`: Especifica a codificação de caracteres para arquivos de origem (UTF-8).
        - `junit.jupiter.version`: Define a versão do JUnit Jupiter a ser usada.
    - **Logica Importante:** As propriedades fornecem uma maneira centralizada de configurar as configurações do projeto.

* **Dependências:**
    - **Descrição:** Lista as bibliotecas externas e módulos necessários para o projeto.
    - **Parâmetros:**
        - `groupId`: Identificador único para o projeto da dependência.
        - `artifactId`: Identificador único para a dependência dentro do seu grupo.
        - `version`: Versão específica da dependência a ser usada.
        - `scope`: Especifica o uso da dependência (por exemplo, `compile`, `test`).
    - **Logica Importante:** As dependências são cruciais para que os projetos funcionem corretamente, fornecendo código e funcionalidade necessários.
    - **Dependências:**
        - **Mockito:** Uma estrutura de simulação para testes unitários.
        - **AssertJ:** Uma biblioteca para escrever assertivas em testes.
        - **JUnit Jupiter:** Uma estrutura de teste moderna para Java.
        - **Mockito JUnit Jupiter:** Uma ponte entre Mockito e JUnit Jupiter.
    - **Casos de Borda:** O atributo `scope` determina a visibilidade e o uso da dependência dentro do projeto. Dependências `test` são usadas apenas durante os testes.

* **Plugins:**
    - **Descrição:** Extende a funcionalidade do Maven adicionando tarefas e capacidades específicas.
    - **Parâmetros:**
        - `groupId`: Identificador único para o projeto do plugin.
        - `artifactId`: Identificador único para o plugin dentro do seu grupo.
        - `version`: Versão específica do plugin a ser usada.
    - **Logica Importante:** Os plugins permitem a personalização e automação de vários processos de construção.
    - **Plugin:**
        - **Maven Surefire Plugin:** Executa os testes definidos no projeto.

**5. Versão da Linguagem:** Java 17

**6. Versões das Dependências:**
    - Mockito: 5.6.0
    - AssertJ: 3.24.2
    - JUnit Jupiter: 5.10.0

**7. Código Pseudo:**

1. **Inicialização do Projeto:**
    - Leia o arquivo `pom.xml`.
    - Defina os metadados do projeto (groupId, artifactId, version).
    - Defina as propriedades do projeto (source, target, encoding, JUnit version).
2. **Resolução de Dependências:**
    - Identifique as dependências declaradas na seção `dependencies`.
    - Baixe e resolva as dependências com base em seus group ID, artifact ID e versão.
3. **Execução de Plugins:**
    - Identifique os plugins declarados na seção `plugins`.
    - Execute o Maven Surefire Plugin para executar os testes definidos no projeto.
4. **Processo de Construção:**
    - Compile o código-fonte Java usando as versões de origem e destino especificadas.
    - Empacote o código compilado em um artefato distribuível (por exemplo, JAR).
5. **Geração de Saída:**
    - Gere relatórios e artefatos com base no processo de construção (por exemplo, relatórios de teste, documentação).

**8. Equivalentes de Dependências e Plugins:**

- **Maven:**
    - **Gradle:** arquivo `build.gradle`, estrutura e conceitos semelhantes.
    - **npm:** arquivo `package.json`, gerencia dependências e scripts.



