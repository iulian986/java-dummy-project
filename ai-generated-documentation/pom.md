##  Build Script Documentation: 

**1. Overview:**

This Maven build script (`pom.xml`) defines the configuration for a Java project named "dummy-java-project". It specifies project metadata, dependencies, and plugins required for building and testing the project. The script utilizes JUnit Jupiter for testing and Mockito for mocking dependencies.

**2. Build Tool:** Maven

**3. Script/File Name:** `pom.xml`

**4. Detailed Documentation:**

   - **Project Metadata:**
     -  **Description:** Defines basic information about the project, including its group ID (`org.example`), artifact ID (`dummy-java-project`), and version (`1.0-SNAPSHOT`).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the project's group.
         - `artifactId`: Unique identifier for the project within its group.
         - `version`: Current version of the project.

   - **Properties:**
     -  **Description:** Sets various properties used throughout the build process, such as Java source and target versions (`maven.compiler.source`, `maven.compiler.target`), source encoding (`project.build.sourceEncoding`), and JUnit Jupiter version (`junit.jupiter.version`).
     -  **Parameters:** 
         - Each property name (e.g., `maven.compiler.source`) followed by its value.

   - **Dependencies:**
     -  **Description:** Lists external libraries required for the project's functionality and testing. Dependencies include Mockito (`mockito-core`), AssertJ (`assertj-core`), JUnit Jupiter engine and API (`junit-jupiter-engine`, `junit-jupiter-api`), and Mockito integration with JUnit Jupiter (`mockito-junit-jupiter`).
     -  **Parameters:** 
         - `groupId`: Unique identifier for the dependency's group.
         - `artifactId`: Unique identifier for the dependency within its group.
         - `version`: Specific version of the dependency to use.
         - `scope`: Specifies the dependency's usage (e.g., `test` for testing dependencies).

   - **Plugins:**
     -  **Description:** Defines plugins used during the build process. In this case, it includes the Maven Surefire plugin (`maven-surefire-plugin`) responsible for executing tests.
     -  **Parameters:** 
         - `groupId`: Unique identifier for the plugin's group.
         - `artifactId`: Unique identifier for the plugin within its group.
         - `version`: Specific version of the plugin to use.

**5. Language Version:** Java 17 (specified by `maven.compiler.source` and `maven.compiler.target`)

**6. Dependency Versions:**

   - Mockito: 5.6.0
   - AssertJ: 3.24.2
   - JUnit Jupiter: 5.10.0

**7. Pseudo Code:**

1. **Read Project Metadata:** Retrieve project information from `pom.xml`, including group ID, artifact ID, version, etc.
2. **Set Properties:** Configure build properties based on values defined in `pom.xml`, such as Java source and target versions, encoding, and JUnit Jupiter version.
3. **Resolve Dependencies:** Download and include required libraries specified in the `dependencies` section of `pom.xml`.
4. **Execute Plugins:** 
   -  **Maven Surefire Plugin:** Configure and execute tests defined within the project using JUnit Jupiter framework.

5. **Build Artifacts:** Generate compiled Java classes and other necessary artifacts based on project source code.


**8. Dependencies and Plugins Equivalents:**

* **Maven:** Gradle, npm (for JavaScript projects)
* **maven-surefire-plugin:** 
    * Gradle: `test` task with appropriate configuration
    * npm: Jest, Mocha, Jasmine



