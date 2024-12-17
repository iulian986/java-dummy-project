## Dokumentation zu pom.xml

**1. Überblick**

Die Datei `pom.xml` ist eine Konfigurationsdatei für ein Java-Projekt namens "dummy-java-project" im Maven-Format. Sie definiert die Projektstruktur, Abhängigkeiten, den Build-Prozess und andere wichtige Informationen.

**2. Build-Tool:** Maven

**3. Skript/Datei Name:** pom.xml

**4. Detaillierte Dokumentation**

* **Projekt-Informationen:**
    - **groupId:** `org.example` - Identifiziert die Gruppe oder Organisation des Projekts.
    - **artifactId:** `dummy-java-project` - Ein eindeutiger Bezeichner für das Projekt innerhalb der Gruppe.
    - **version:** `1.0-SNAPSHOT` - Aktuelle Version des Projekts. "SNAPSHOT" zeigt an, dass es sich um eine Entwicklungsversion handelt.

* **Eigenschaften:**
    - **maven.compiler.source:** `17` - Gibt die Java-Quellcode-Version an, die für die Kompilierung verwendet wird.
    - **maven.compiler.target:** `17` - Gibt die Java-Zielversion für den kompilierten Code an.
    - **project.build.sourceEncoding:** `UTF-8` - Legt die Zeichenkodierung für Quellcode-Dateien fest.
    - **junit.jupiter.version:** `5.10.0` - Version von JUnit Jupiter, die für Tests verwendet wird.

* **Abhängigkeiten:**
    - **mockito-core:** `5.6.0` (test scope) - Mocking-Framework für Unit-Tests.
    - **assertj-core:** `3.24.2` (test scope) - Assertionsbibliothek für Tests.
    - **junit-jupiter-engine:** `5.10.0` (test scope) - Engine zum Ausführen von JUnit Jupiter-Tests.
    - **junit-jupiter-api:** `5.10.0` (test scope) - API zum Schreiben von JUnit Jupiter-Tests.
    - **mockito-junit-jupiter:** `5.6.0` (test scope) - Brücke zwischen Mockito und JUnit Jupiter.

* **Plugins:**
    - **maven-surefire-plugin:** `3.0.0` - Plugin, das für die Ausführung von Tests verantwortlich ist.

**5. Sprachversion:** Java 17

**6. Versionsangaben der Abhängigkeiten:**
    - Mockito: 5.6.0
    - AssertJ: 3.24.2
    - JUnit Jupiter: 5.10.0

**7. Pseudo Code:**

1. **Projektinitialisierung:**
    - Lies die `pom.xml`-Datei ein.
    - Setze Projekt-Eigenschaften (groupId, artifactId, version, etc.).
    - Definiere Quell- und Ziel-Java-Versionen.
    - Definiere die Zeichenkodierung für Quellcode-Dateien.

2. **Abhängigkeitsauflösung:**
    - Lade und löse Abhängigkeiten basierend auf den in `pom.xml` angegebenen Versionen herunter.
    - Stelle sicher, dass alle Abhängigkeiten miteinander kompatibel sind und zur Java-Version des Projekts passen.

3. **Kompilierung:**
    - Kompiliere den Java-Quellcode mit dem angegebenen Java-Compiler (Version 17).
    - Generiere Klassen-Dateien für das Projekt.

4. **Testdurchführung:**
    - Verwende den `maven-surefire-plugin`, um die im Projekt definierten Tests auszuführen.
    - Führe Tests mit dem JUnit Jupiter-Framework aus.
    - Berichtige Testergebnisse (Erfolg/Fehler) und auftretende Ausnahmen.

5. **Build-Abschluss:**
    - Packe den kompilierten Code in ein verteilbares Format (z. B. JAR).
    - Generiere Projektdokumentation (falls konfiguriert).
    - Gib Build-Artefakte im angegebenen Verzeichnis aus.

**8. Abhängigkeiten und Plugin-Äquivalente:**

- **Maven:**
    - **Gradle:** Ähnliches Funktionale kann mit Gradle's Abhängigkeitsverwaltung und Plugin-System erreicht werden.
    - **npm:** npm wird hauptsächlich für JavaScript-Projekte verwendet und unterstützt Java-Build-Prozesse nicht direkt.



