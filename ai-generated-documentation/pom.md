##  Maven Build Script Documentation

**1. Overview:**

This Maven build script (`pom.xml`) defines the configuration for a Java project named "dummy-java-project". It specifies project metadata, dependencies, and build plugins. The primary purpose of this script is to automate the compilation, testing, and packaging of the project. 

**2. Build Tool:** Maven

**3. Script/File Name:** `pom.xml`

**4. Detailed Documentation:**

   - **Project Metadata:**
     -  **Description:** Defines basic information about the project, including its group ID (`org.example`), artifact ID (`dummy-java-project`), and version (`1.0-SNAPSHOT`).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the project's organization.
         - `artifactId`: Unique identifier for the project within its organization.
         - `version`: Current version of the project.

   - **Properties:**
     -  **Description:** Sets various properties used throughout the build process, such as Java source and target versions (`maven.compiler.source`, `maven.compiler.target`), source encoding (`project.build.sourceEncoding`), and dependency versions (e.g., `junit.jupiter.version`).
     -  **Parameters:** 
         - Each property has a name and value pair, e.g., `maven.compiler.source = 17`.

   - **Dependencies:**
     -  **Description:** Lists external libraries required by the project. Dependencies are specified using their group ID, artifact ID, version, and scope (e.g., `test` for testing dependencies).
     -  **Parameters:**
         - `groupId`: Unique identifier for the dependency's provider.
         - `artifactId`: Unique identifier for the dependency within its provider.
         - `version`: Specific version of the dependency to use.
         - `scope`: Defines the lifecycle stage where the dependency is used (e.g., `compile`, `test`).

   - **Build Plugins:**
     -  **Description:** Configures plugins that extend Maven's functionality. In this case, it includes the `maven-surefire-plugin` for running unit tests.
     -  **Parameters:** 
         - `groupId`: Unique identifier for the plugin provider.
         - `artifactId`: Unique identifier for the plugin within its provider.
         - `version`: Specific version of the plugin to use.

**5. Language Version:** Java 17 (specified by `maven.compiler.source` and `maven.compiler.target`)

**6. Dependency Versions:**

   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter Engine: 5.10.0
   - JUnit Jupiter API: 5.10.0
   - Mockito JUnit Jupiter: 5.6.0

**7. Pseudo Code:**

1. **Project Initialization:**
    - Read `pom.xml` file and parse its contents.
2. **Property Resolution:**
    - Resolve property values defined in the `properties` section.
3. **Dependency Management:**
    - Download required dependencies based on their group ID, artifact ID, version, and scope.
4. **Compilation:**
    - Compile Java source code using the specified Java compiler version (17).
5. **Testing:**
    - Configure and execute unit tests using the `maven-surefire-plugin`.
6. **Packaging:**
    - Create a distributable artifact (e.g., JAR file) based on project configuration.

**8. Dependencies and Plugins Equivalents:**

   - Maven: 
      - Gradle equivalent:  `buildscript { repositories { mavenCentral() } dependencies { ... } }`, `dependencies { ... }`
      - npm equivalent: Not applicable (Maven is for Java projects)



