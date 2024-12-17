## Dokumentacja pliku pom.xml

**1. Podsumowanie**

Plik `pom.xml` jest plikiem konfiguracyjnym dla narzędzia buildowego Maven. Definiuje strukturę projektu, zależności, proces budowania oraz inne metadane dla projektu Java o nazwie "dummy-java-project".

**2. Narzędzie Build:** Maven

**3. Nazwa skryptu/pliku:** pom.xml

**4. Dokumentacja szczegółowa**

   - **Metadane projektu:**
     - **groupId:** `org.example` - Identyfikuje grupę lub organizację projektu.
     - **artifactId:** `dummy-java-project` - Unikalny identyfikator projektu w grupie.
     - **version:** `1.0-SNAPSHOT` - Aktualna wersja projektu. "SNAPSHOT" wskazuje, że jest to wersja rozwojowa.

   - **Właściwości:**
     - **maven.compiler.source:** `17` - Określa wersję kodu źródłowego Java (Java 17).
     - **maven.compiler.target:** `17` - Określa wersję docelową Java dla kompilacji (Java 17).
     - **project.build.sourceEncoding:** `UTF-8` - Ustawia kodowanie znaków dla plików źródłowych.
     - **junit.jupiter.version:** `5.10.0` - Wersja JUnit Jupiter używana do testowania.

   - **Zależności:**
     - **mockito-core:** Wersja `5.6.0`, używana do symulacji zależności w testach.
     - **assertj-core:** Wersja `3.24.2`, używana do asercji w testach.
     - **junit-jupiter-engine:** Wersja określona przez `junit.jupiter.version`, zapewnia silnik do uruchamiania testów JUnit Jupiter.
     - **junit-jupiter-api:** Wersja określona przez `junit.jupiter.version`, zapewnia API do pisania testów JUnit Jupiter.
     - **mockito-junit-jupiter:** Wersja `5.6.0`, integruje Mockito z JUnit Jupiter.

   - **Wtyczki:**
     - **maven-surefire-plugin:** Wersja `3.0.0`, odpowiedzialna za wykonywanie testów zdefiniowanych w projekcie.

**5. Wersja języka:** Java 17

**6. Wersje zależności:**

- `mockito-core`: 5.6.0
- `assertj-core`: 3.24.2
- `junit-jupiter-engine`: 5.10.0
- `junit-jupiter-api`: 5.10.0
- `mockito-junit-jupiter`: 5.6.0
- `maven-surefire-plugin`: 3.0.0

**7. Pseudo kod**

1. **Odczytaj plik `pom.xml`:**
   - Wyodrębnij metadane projektu (groupId, artifactId, version).
   - Wyodrębnij właściwości (source, target, encoding, JUnit version).
   - Zidentyfikuj zależności i ich wersje.
   - Zidentyfikuj wtyczki i ich wersje.

2. **Konfiguruj kompilator:**
   - Ustaw wersję kodu źródłowego Java na 17.
   - Ustaw wersję docelową Java na 17.
   - Ustaw kodowanie znaków na UTF-8.

3. **Rozwiąż zależności:**
   - Pobierz i zainstaluj wszystkie zależności wymienione w `pom.xml`.
   - Upewnij się, że wersje pasują do tych określonych w pliku.

4. **Wykonaj wtyczkę testowa:**
   - Użyj `maven-surefire-plugin` do uruchomienia testów zdefiniowanych w projekcie.
   - Obsłuż wyniki testów i przekaż je odpowiednio.

5. **Zbuduj artefakty:**
   - Skompiluj kod źródłowy Java do kodu bajtowego (.class files).
   - Spakuj skompilowany kod do pliku JAR (lub innego żądanego formatu artefaktu).

6. **Wyjściowe artefakty:**
   - Umieść zbudowane artefakty w wyznaczonym katalogu wyjściowym.

**8. Zależności i wtyczki równoważne:**

- **Maven:**
    - **Gradle:**
        - `maven-surefire-plugin`: `test` plugin
        - `maven-compiler-plugin`: `java` plugin
    - **npm:**
        - Brak bezpośredniego odpowiednika dla cyklu życia buildowego Maven. npm skupia się na projektach JavaScript.



