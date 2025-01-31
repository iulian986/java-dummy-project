## Documentação do arquivo pom.xml

**1. Visão Geral:**

Este arquivo `pom.xml` é um arquivo de configuração para a ferramenta de build Maven, definindo como construir e gerenciar um projeto Java chamado "dummy-java-project". Ele especifica metadados do projeto, dependências, configurações de plugins e outras configurações necessárias para compilar, testar e empacotar o projeto.

**2. Ferramenta de Build:** Maven

**3. Nome do Script/Arquivo:** pom.xml

**4. Documentação Detalhada:**

   - **Metadados do Projeto:**
     - **`<groupId>`**: `org.example` - Identifica o grupo ou organização que possui este projeto.
     - **`<artifactId>`**: `dummy-java-project` - Identificador único para este projeto específico dentro do grupo.
     - **`<version>`**: `1.0-SNAPSHOT` - Versão atual do projeto (o sufixo "SNAPSHOT" indica que não é um lançamento final).

   - **Propriedades:**
     - **`<maven.compiler.source>`**: `17` - Especifica a versão do código fonte Java a ser usada para compilação (Java 17).
     - **`<maven.compiler.target>`**: `17` - Especifica a versão alvo de bytecode Java (também Java 17).
     - **`<project.build.sourceEncoding>`**: `UTF-8` - Define a codificação de caracteres para arquivos de origem como UTF-8.
     - **`<junit.jupiter.version>`**: `5.10.0` - Define a versão do JUnit Jupiter usada para testes.

   - **Dependências:**
     - **Mockito (`org.mockito:mockito-core`)**: Uma framework de mockagem para testes unitários, versão 5.6.0 (escopo de teste).
     - **AssertJ (`org.assertj:assertj-core`)**: Uma biblioteca para escrever asserções em testes, versão 3.24.2 (escopo de teste).
     - **JUnit Jupiter Engine (`org.junit.jupiter:junit-jupiter-engine`)**: O motor principal para executar testes JUnit Jupiter, versão especificada por `junit.jupiter.version`.
     - **JUnit Jupiter API (`org.junit.jupiter:junit-jupiter-api`)**: Fornece a API para escrever testes JUnit Jupiter, versão especificada por `junit.jupiter.version`.
     - **Mockito JUnit 5 Adapter (`org.mockito:mockito-junit-jupiter`)**: Adapta o Mockito para funcionar com o JUnit Jupiter, versão 5.6.0 (escopo de teste).

   - **Plugins:**
     - **Maven Surefire Plugin (`org.apache.maven.plugins:maven-surefire-plugin`)**: Executa testes definidos no projeto, versão 3.0.0.


**5. Versão da Linguagem:** Java 17

**6. Versões das Dependências:**

* Mockito: 5.6.0
* AssertJ: 3.24.2
* JUnit Jupiter Engine: 5.10.0
* JUnit Jupiter API: 5.10.0
* Mockito JUnit 5 Adapter: 5.6.0

**7. Código Falso:**


```
// Fase de Configuração do Projeto

  1. Leia o arquivo 'pom.xml'.
  2. Extraia os metadados do projeto (groupId, artifactId, version).
  3. Defina as propriedades (versão do código fonte, versão alvo, codificação).
  4. Identifique as dependências e suas versões.
  5. Determine os plugins e suas configurações.


// Fase de Build

  1. Compile o código-fonte Java usando as versões de origem e alvo especificadas.
  2. Resolva todas as dependências do projeto com base nas versões declaradas.
  3. Execute os testes definidos no projeto usando o Maven Surefire Plugin.



```

**8. Equivalentes de Dependências e Plugins:**

* **Maven:** 
    * Gradle: Usa o bloco `buildscript` para definir plugins e repositórios, semelhante à seção `<dependencies>` do Maven.
    * npm (Node.js): Utiliza gerenciadores de pacotes como `npm` ou `yarn` para gerenciar dependências declaradas em um arquivo `package.json`.



