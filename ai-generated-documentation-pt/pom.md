## Documentação do Script de Construção:

**1. Visão Geral:**

Este arquivo `pom.xml` define um projeto Maven chamado "dummy-java-project". Ele especifica a estrutura do projeto, dependências, processo de construção e configuração de testes. O script se concentra principalmente na configuração de um projeto Java com capacidades de teste unitário usando JUnit Jupiter e Mockito. 

**2. Ferramenta de Construção:** Maven

**3. Nome do Script/Arquivo:** pom.xml

**4. Documentação Detalhada:**

   - **Informações do Projeto:**
     -  **Descrição:** Define metadados básicos do projeto, como ID do grupo, ID do artefato, versão e versão do modelo.
     -  **Parâmetros:** 
         - `groupId`: Identificador único para o grupo do projeto (org.example).
         - `artifactId`: Identificador único para o projeto dentro de seu grupo (dummy-java-project).
         - `version`: Versão atual do projeto (1.0-SNAPSHOT).
     -  **Logica Importante:** Nenhuma

   - **Propriedades:**
     -  **Descrição:** Define propriedades em todo o projeto usadas durante todo o processo de construção.
     -  **Parâmetros:** 
         - `maven.compiler.source`: Versão do código fonte Java (17).
         - `maven.compiler.target`: Versão de bytecode alvo Java (17).
         - `project.build.sourceEncoding`: Codificação do código fonte (UTF-8).
         - `junit.jupiter.version`: Versão do JUnit Jupiter usada para testes (5.10.0).
     -  **Logica Importante:** Nenhuma

   - **Dependências:**
     -  **Descrição:** Lista as bibliotecas externas necessárias pelo projeto. 
     -  **Parâmetros:** Cada dependência possui:
         - `groupId`: ID do grupo da biblioteca.
         - `artifactId`: ID do artefato da biblioteca.
         - `version`: Versão da biblioteca.
         - `scope`: Especifica o uso da dependência (test para dependências de teste).
     -  **Logica Importante:** O script inclui dependências para:
         - Mockito (para simulação): versão 5.6.0, escopo test.
         - AssertJ (para asserções): versão 3.24.2, escopo test.
         - JUnit Jupiter Engine e API: versão especificada por `junit.jupiter.version`, escopo test.
         - Mockito JUnit Jupiter Adapter: versão 5.6.0, escopo test.

   - **Plugins de Construção:**
     -  **Descrição:** Define plugins usados para estender a funcionalidade do Maven durante o processo de construção.
     -  **Parâmetros:** Cada plugin possui:
         - `groupId`: ID do grupo do plugin.
         - `artifactId`: ID do artefato do plugin.
         - `version`: Versão do plugin.
     -  **Logica Importante:** O script inclui o Maven Surefire Plugin (versão 3.0.0) para executar testes unitários.

**5. Versão da Linguagem:** Java 17 (baseado em `maven.compiler.source` e `maven.compiler.target`)

**6. Versões de Dependências:**
   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine e API: 5.10.0 (ou a versão especificada por `junit.jupiter.version`)
   - Maven Surefire Plugin: 3.0.0

**7. Código Falso:**

```
// Fase de Configuração do Projeto
  - Definir metadados do projeto (groupId, artifactId, version)
  - Definir propriedades do projeto (versões de código fonte e bytecode alvo, codificação)
  - Especificar a versão do JUnit Jupiter

// Fase de Gerenciamento de Dependências
  - Adicionar dependências para:
    - Mockito (para simulação)
    - AssertJ (para asserções)
    - JUnit Jupiter Engine e API
    - Adaptador Mockito JUnit Jupiter

// Fase de Configuração da Construção
  - Configurar o Maven Surefire Plugin para executar testes unitários


```



**8. Equivalentes de Dependências e Plugins:**

* **Maven:** 
   - Gradle: Usa o bloco `buildscript` para definir plugins e dependências, semelhante à seção `plugins` do Maven.
   - npm: Não aplicável, pois o Maven é uma ferramenta de construção Java.



