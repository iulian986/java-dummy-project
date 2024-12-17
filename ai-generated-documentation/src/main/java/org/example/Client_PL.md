## Dokumentacja pliku Client.java

**1. Podsumowanie**

Klasa `Client` demonstruje proste interakcje z obiektem `Service`. W konstruktorze przyjmuje instancje `Service` i oferuje metodę `greeting`, która generuje spersonalizowane powitanie na podstawie podanego imienia. Format powitania różni się w zależności od parzystości lub nieparzystości długości imienia.

**2. Nazwa pakietu/modułu:**

`org.example`

**3. Nazwa klasy/pliku:**

`Client.java`

**4. Dokumentacja szczegółowa**

* **Klasa `Client`**

    * **Konstruktor `Client(Service service)`**
        * **Opis:** Inicjalizuje nowy obiekt `Client` z podanym obiektem `Service`.
        * **Parametry:**
            * `service`: Obiekt `Service` odpowiedzialny za obsługę sprawdzania parzystości/nieparzystości.
        * **Wartości zwracane:** Brak.
        * **Ważna logika:** Przechowuje podany obiekt `Service` w polu `service` do późniejszego użycia.

    * **Metoda `greeting(String name)`**
        * **Opis:** Generuje spersonalizowane powitanie na podstawie podanego `name`. Format powitania różni się w zależności od parzystości lub nieparzystości długości imienia.
        * **Parametry:**
            * `name`: String reprezentujący imię używane w powitaniu.
        * **Wartości zwracane:** String zawierający sformatowane powitanie.
        * **Ważna logika:**
            * **Walidacja wejścia:** Sprawdza, czy parametr `name` jest null lub pusty. Jeśli tak, wyrzuca `IllegalArgumentException` z wiadomością "'name' must not be null or empty".
            * **Sprawdzenie parzystości/nieparzystości:** Wywołuje metodę `isEven` obiektu `service`, przekazując długość `name` jako argument.
            * **Formatowanie powitania:**
                * Jeśli długość jest parzysta, powitanie jest konwertowane na duże litery za pomocą `toUpperCase()`.
                * W przeciwnym razie powitanie jest zwracane bez zmian.

**5. Pseudo kod**

```
// Klasa: Client
// Metoda: greeting(name)

  1. Sprawdź, czy parametr 'name' jest null lub pusty:
     - Jeśli tak, wyrzuć "IllegalArgumentException" z wiadomością "'name' must not be null or empty".
  2. Wywołaj metodę 'isEven' obiektu 'service', przekazując długość 'name' jako argument.
  3. Jeśli metoda 'isEven' zwraca wartość true:
     - Sformatuj ciąg powitania używając 'name' i przekonwertuj na duże litery.
     - Zwróć sformatowany ciąg powitania w formacie dużych liter.
  4. W przeciwnym razie:
     - Sformatuj ciąg powitania używając 'name'.
     - Zwróć sformatowany ciąg powitania.
```



**Zależności i biblioteki:**

* Kod zakłada istnienie interfejsu lub klasy `Service` z metodą `isEven(int length)`.

* **Równoważne biblioteki:**

    * **Java:** Nie używa się żadnych zewnętrznych bibliotek. Interfejs `Service` można zrealizować za pomocą wbudowanych funkcji Java.
    * **Python:** Nie używa się żadnych zewnętrznych bibliotek. Interfejs `Service` można zrealizować za pomocą wbudowanych funkcji Python.
    * **C++:** Nie używa się żadnych zewnętrznych bibliotek. Interfejs `Service` można zrealizować za pomocą wbudowanych funkcji C++.



