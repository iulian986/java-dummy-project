##  Documentation of Maven Build Script (pom.xml)

**1. Overview:**

This Maven build script (`pom.xml`) defines the configuration for a Java project named "dummy-java-project". It specifies project metadata, dependencies, and build plugins. The primary purpose is to automate the compilation, testing, and packaging of the project using Maven's standard lifecycle phases.

**2. Build Tool:** Maven

**3. Script/File Name:** pom.xml

**4. Detailed Documentation:**

   - **Project Metadata:**
     -  **Description:** Defines basic information about the project, including its group ID (`org.example`), artifact ID (`dummy-java-project`), and version (`1.0-SNAPSHOT`).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the project's organization.
         - `artifactId`: Name of the project within the organization.
         - `version`: Current version of the project.

   - **Properties:**
     -  **Description:** Sets various properties used throughout the build process, such as Java source and target versions (`maven.compiler.source`, `maven.compiler.target`), source encoding (`project.build.sourceEncoding`), and dependency versions (e.g., `junit.jupiter.version`).
     -  **Parameters:** 
         - Property names are defined within the `<properties>` section, followed by their values.

   - **Dependencies:**
     -  **Description:** Lists external libraries required for the project to function correctly. Each dependency includes its group ID, artifact ID, version, and scope (e.g., `test` for testing dependencies).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the library's provider.
         - `artifactId`: Name of the library within the organization.
         - `version`: Specific version of the library to use.
         - `scope`: Defines the dependency's usage context (e.g., `compile`, `test`).

   - **Plugins:**
     -  **Description:** Configures plugins that extend Maven's functionality. In this case, it includes the `maven-surefire-plugin` for running unit tests.
     -  **Parameters:** 
         - `groupId`: Unique identifier for the plugin provider.
         - `artifactId`: Name of the plugin within the organization.
         - `version`: Specific version of the plugin to use.

**5. Language Version:** Java 17 (specified by `<maven.compiler.source>` and `<maven.compiler.target>`)

**6. Dependency Versions:**

   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine: 5.10.0
   - JUnit Jupiter API: 5.10.0
   - Mockito JUnit Jupiter: 5.6.0

**7. Pseudo Code:**

```
// Project Setup Phase
  - Define project metadata (groupId, artifactId, version)
  - Set properties (source/target Java versions, encoding, dependency versions)
  - Declare dependencies (libraries required for the project)

// Build Phase
  - Compile source code using specified Java version
  - Run unit tests using Maven Surefire Plugin
    - Execute test classes defined in dependencies
    - Generate test reports

// Package Phase
  - Create a distributable archive (e.g., JAR file) containing compiled code and resources
```

**8. Dependencies and Plugins Equivalents:**

   - **Maven Surefire Plugin:** Gradle's `Test` task, npm's Jest or Mocha frameworks.



