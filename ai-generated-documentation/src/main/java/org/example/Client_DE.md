## Dokumentation zu Client.java

**1. Überblick**

Die Klasse `Client` demonstriert eine einfache Interaktion mit einem `Service`-Objekt. Sie nimmt im Konstruktor ein `Service`-Objekt entgegen und stellt eine Methode `greeting` bereit, die eine personalisierte Begrüßung basierend auf einem gegebenen Namen generiert. Die Begrüßung wird unterschiedlich formatiert, abhängig davon, ob die Länge des Namens gerade oder ungerade ist.

**2. Paket/Modulname:**

`org.example`

**3. Klassen-/Dateiname:**

`Client.java`

**4. Detaillierte Dokumentation**

* **Klasse `Client`**

    * **Konstruktor `Client(Service service)`**
        * **Beschreibung:** Initialisiert eine neue `Client`-Instanz mit dem bereitgestellten `Service`-Objekt.
        * **Parameter:**
            * `service`: Ein `Service`-Objekt, das für die Verarbeitung von gerade/ungerade Zahlen zuständig ist.
        * **Rückgabewerte:** Keine.
        * **Wichtige Logik:** Speichert das bereitgestellte `Service`-Objekt im Feld `service` für späteren Gebrauch.

    * **Methode `greeting(String name)`**
        * **Beschreibung:** Generiert eine personalisierte Begrüßung basierend auf dem bereitgestellten `name`. Die Begrüßung wird unterschiedlich formatiert, abhängig davon, ob die Länge des Namens gerade oder ungerade ist.
        * **Parameter:**
            * `name`: Ein `String`, der den Namen darstellt, der in der Begrüßung verwendet werden soll.
        * **Rückgabewerte:** Ein `String`, der die formatierte Begrüßung enthält.
        * **Wichtige Logik:**
            * **Eingabevalidierung:** Überprüft, ob der `name`-Parameter null oder leer ist. Wenn ja, wird ein `IllegalArgumentException` mit der Meldung "'name' darf nicht null oder leer sein" ausgelöst.
            * **Gerade/Ungerade-Prüfung:** Ruft die Methode `isEven` des `service`-Objekts auf, um festzustellen, ob die Länge des `name` gerade ist.
            * **Begrüßungsformatierung:**
                * Wenn die Länge gerade ist, wird die Begrüßung in Großbuchstaben mithilfe von `toUpperCase()` umgewandelt.
                * Andernfalls wird die Begrüßung unverändert zurückgegeben.

**5. Pseudocode**

```
// Klasse: Client
// Methode: greeting(name)

  1. Überprüfe, ob der 'name'-Parameter null oder leer ist:
     - Wenn ja, wirf einen "IllegalArgumentException" mit der Meldung "'name' darf nicht null oder leer sein" aus.
  2. Rufe die Methode 'isEven' des 'service'-Objekts auf, gib dabei die Länge des 'name' als Argument weiter.
  3. Wenn die Methode 'isEven' true zurückgibt:
     - Formatiere den Begrüßungsstring mit dem 'name' und konvertiere ihn in Großbuchstaben.
     - Gib den formatierten Begrüßungsstring in Großbuchstaben zurück.
  4. Andernfalls:
     - Formatiere den Begrüßungsstring mit dem 'name'.
     - Gib den formatierten Begrüßungsstring zurück.
```



**Abhängigkeiten und Bibliotheken:**

* Der Code geht davon aus, dass eine `Service`-Schnittstelle oder Klasse mit einer Methode `isEven(int length)` existiert.

* **Äquivalente Bibliotheken:**

    * **Java:** Es werden keine spezifischen externen Bibliotheken verwendet. Die `Service`-Schnittstelle könnte mit den eingebauten Funktionalitäten von Java implementiert werden.
    * **Python:** Es werden keine spezifischen externen Bibliotheken verwendet. Die `Service`-Schnittstelle könnte mit den eingebauten Funktionalitäten von Python implementiert werden.
    * **C++:** Es werden keine spezifischen externen Bibliotheken verwendet. Die `Service`-Schnittstelle könnte mit den eingebauten Funktionalitäten von C++ implementiert werden.



