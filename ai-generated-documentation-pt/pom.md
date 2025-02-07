## Documentação do Script de Build pom.xml

**1. Visão Geral:**

Este arquivo `pom.xml` define a configuração de build para um projeto Java usando o Maven. Ele especifica metadados do projeto, dependências e plugins necessários para compilar, testar e empacotar o aplicativo. 

**2. Ferramenta de Build:** Maven

**3. Nome do Script/Arquivo:** pom.xml

**4. Documentação Detalhada:**

   - **Metadados do Projeto:**
     -  **Descrição:** Define informações básicas sobre o projeto, incluindo seu ID de grupo (`org.example`), ID de artefato (`dummy-java-project`) e versão (`1.0-SNAPSHOT`).
     -  **Parâmetros:** 
         - `groupId`: Identificador único para a organização do projeto.
         - `artifactId`: Nome do projeto dentro da organização.
         - `version`: Versão atual do projeto.

   - **Propriedades:**
     -  **Descrição:** Define várias propriedades usadas durante todo o processo de build, como as versões de origem e destino Java (`maven.compiler.source`, `maven.compiler.target`), codificação de origem (`project.build.sourceEncoding`) e versões de dependência (por exemplo, `junit.jupiter.version`).
     -  **Parâmetros:** 
         - Cada nome de propriedade é seguido por seu valor, por exemplo, `maven.compiler.source=17`.

   - **Dependências:**
     -  **Descrição:** Lista as bibliotecas externas necessárias para o projeto funcionar. As dependências são especificadas com seu ID de grupo, ID de artefato, versão e escopo (por exemplo, `test` para dependências de teste).
     -  **Parâmetros:** 
         - `groupId`: Identificador único para o provedor da dependência.
         - `artifactId`: Nome da dependência dentro do provedor.
         - `version`: Versão específica da dependência a ser usada.
         - `scope`: Define o contexto em que a dependência é usada (por exemplo, `compile`, `test`).

   - **Plugins de Build:**
     -  **Descrição:** Configura plugins que estendem a funcionalidade do Maven. Neste caso, inclui o `maven-surefire-plugin` para executar testes unitários.
     -  **Parâmetros:** 
         - `groupId`: Identificador único para o provedor do plugin.
         - `artifactId`: Nome do plugin dentro do provedor.
         - `version`: Versão específica do plugin a ser usada.

**5. Versão da Linguagem:** Java 17 (especificada por `maven.compiler.source` e `maven.compiler.target`)

**6. Versões de Dependência:**

   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine: 5.10.0
   - JUnit Jupiter API: 5.10.0
   - Mockito JUnit Jupiter: 5.6.0

**7. Código Falso:**

1. **Leia o arquivo `pom.xml`.**
2. **Extraia os metadados do projeto:**
    - ID de grupo, ID de artefato, Versão
3. **Extraia as propriedades:**
    - Versões de origem e destino Java
    - Codificação de origem
    - Versões de dependência (por exemplo, JUnit Jupiter)
4. **Itere pelas dependências:**
    - Para cada dependência:
        - Extraia o ID de grupo, ID de artefato, versão e escopo.
        - Faça o download da dependência com base em suas informações.
5. **Configure os plugins de build:**
    - Encontre o `maven-surefire-plugin`.
    - Configure-o para executar testes unitários.
6. **Compile o código fonte:**
    - Use o compilador Java com as versões de origem e destino especificadas.
7. **Execute os testes unitários:**
    - Execute os testes usando o `maven-surefire-plugin` configurado.
8. **Empacote o projeto:**
    - Crie um arquivo distribuível (por exemplo, JAR) com base na configuração do projeto.

**8. Equivalentes de Dependências e Plugins:**

   - Maven: Gradle, npm (para projetos JavaScript)



