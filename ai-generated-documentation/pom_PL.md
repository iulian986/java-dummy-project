##  Dokumentacja pliku pom.xml

**1. Podsumowanie**

Plik `pom.xml` jest plikiem konfiguracyjnym narzędzia buildowego Maven. Definiuje strukturę projektu, zależności, proces build i inne metadane dla projektu Java o nazwie "dummy-java-project".

**2. Narzędzie Build:** Maven

**3. Nazwa Skryptu/Pliku:** pom.xml

**4. Szczegółowa Dokumentacja**

* **Metadane Projektu:**
    - **Opis:** Definiuje podstawowe informacje o projekcie, w tym jego ID grupy (`org.example`), ID artefaktu (`dummy-java-project`) i wersję (`1.0-SNAPSHOT`).
    - **Parametry:**
        - `groupId`: Unikalny identyfikator grupy projektu.
        - `artifactId`: Unikalny identyfikator projektu w jego grupie.
        - `version`: Obecna wersja projektu.
    - **Ważne Logika:** Ten dział dostarcza niezbędnych informacji dla Maven, aby zidentyfikować i zarządzać projektem.

* **Właściwości:**
    - **Opis:** Definiuje właściwości specyficzne dla projektu, używane w całym pliku `pom.xml`.
    - **Parametry:**
        - `maven.compiler.source`: Określa wersję kodu źródłowego Java (17 w tym przypadku).
        - `maven.compiler.target`: Określa wersję bytecode'u Java (17 w tym przypadku).
        - `project.build.sourceEncoding`: Ustawia kodowanie źródła na UTF-8.
        - `junit.jupiter.version`: Definiuje wersję JUnit Jupiter używaną do testowania.
    - **Ważne Logika:** Właściwości umożliwiają centralne konfigurowanie i łatwe modyfikowanie ustawień projektu.

* **Zależności:**
    - **Opis:** Wylicza zewnętrzne biblioteki i moduły wymagane przez projekt.
    - **Parametry:**
        - `groupId`: Unikalny identyfikator grupy zależności.
        - `artifactId`: Unikalny identyfikator zależności w jego grupie.
        - `version`: Specyficzna wersja zależności.
        - `scope`: Określa użycie zależności (np. `test` dla zależności testowych).
    - **Ważne Logika:** Zależności zapewniają, że projekt ma dostęp do niezbędnego kodu i funkcjonalności.
    - **Zależności:**
        - **Mockito:** Ramka mockowania do testowania jednostkowego.
        - **AssertJ:** Biblioteka do pisania asercji w testach.
        - **JUnit Jupiter:** Nowoczesna ramka testowa dla Java.
        - **Mockito JUnit Jupiter:** Most między Mockito a JUnit Jupiter.
    - **Ważne Logika:** Skop `test` zapewnia, że te zależności są używane tylko podczas testowania.

* **Wtyczki Build:**
    - **Opis:** Definiuje wtyczki, które rozszerzają funkcjonalność Maven.
    - **Parametry:**
        - `groupId`: Unikalny identyfikator grupy wtyczki.
        - `artifactId`: Unikalny identyfikator wtyczki w jego grupie.
        - `version`: Specyficzna wersja wtyczki.
    - **Ważne Logika:** Wtyczki umożliwiają dostosowanie i automatyzację procesu build.
    - **Wtyczka:**
        - **Maven Surefire Plugin:** Wykonuje testy zdefiniowane w projekcie.

**5. Wersja Języka:** Java 17

**6. Wersje Zależności:**
    - Mockito: 5.6.0
    - AssertJ: 3.24.2
    - JUnit Jupiter: 5.10.0

**7. Kod Pseudokodu:**

1. **Inicjalizacja Projektu:**
    - Odczytaj plik `pom.xml`.
    - Wyodrębnij metadane projektu (groupId, artifactId, wersja).
    - Wyodrębnij właściwości (source, target, encoding, wersja JUnit).
    - Zidentyfikuj zależności i ich wersje.
2. **Rozwiązywanie Zależności:**
    - Pobierz wymagane zależności na podstawie ich group ID, artifact ID i wersji.
3. **Kompilacja:**
    - Użyj kompilatora Java (wersja 17) do kompilacji plików źródłowych.
    - Ustaw wersję source i target bytecode na 17.
4. **Testowanie:**
    - Konfiguruj ramę testową JUnit Jupiter.
    - Wykonaj testy zdefiniowane w projekcie przy użyciu wtyczki Maven Surefire.
    - Zgłoś wyniki testów.
5. **Pakowanie:**
    - Utwórz dystrybuowalny artefakt (np. plik JAR) na podstawie typu pakowania projektu.
6. **Wdrożenie:**
    - Opcjonalnie, wdroż artefakt do repozytorium (np. Maven Central).

**8. Zależności i Wtyczki Równoważniki:**

- **Maven:**
    - **Gradle:** Podobne funkcjonalności można osiągnąć za pomocą systemu zarządzania zależnościami i wtyczek Gradle.
    - **npm:** npm jest głównie używany do projektów JavaScript i nie obsługuje bezpośrednio procesów build Maven.



