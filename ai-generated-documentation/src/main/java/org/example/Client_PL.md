## Dokumentacja pliku Client.java

**1. Podsumowanie**

Klasa `Client` demonstruje proste interakcje z obiektem `Service`. W konstruktorze przyjmuje obiekt `Service` jako zależność i oferuje metodę `greeting`, która generuje spersonalizowane powitanie na podstawie podanego imienia. Format powitania różni się w zależności od parzystości lub nieparzystości długości imienia.

**2. Nazwa pakietu/modułu:**

`org.example`

**3. Nazwa klasy/pliku:**

`Client.java`

**4. Dokładna dokumentacja**

**- Klasa `Client`**

   - **Opis:** Ta klasa reprezentuje klienta, który wykorzystuje usługi dostarczane przez obiekt `Service`. Opakowuje logikę generowania spersonalizowanych powitań na podstawie podanego imienia i jego długości.

   - **Konstruktor `Client(Service service)`**

     - **Opis:** Inicjalizuje nowy obiekt `Client` z podanym obiektem `Service`.
     - **Parametry:**
       - `service`: Obiekt `Service` odpowiedzialny za dostarczanie metody `isEven`.
     - **Wartości zwracane:** Brak.

**- Metoda `greeting(String name)`**

   - **Opis:** Generuje spersonalizowane powitanie na podstawie podanego `name`. Format powitania różni się w zależności od parzystości lub nieparzystości długości imienia.
   - **Parametry:**
     - `name`: Zmienna typu `String` reprezentująca imię używane w powitaniu.
   - **Wartości zwracane:**
     - `String` zawierający spersonalizowane powitanie.
   - **Ważna logika:**
     - **Walidacja wejścia:** Sprawdza, czy parametr `name` jest null lub pusty. Jeśli tak, wyrzuca `IllegalArgumentException` z wiadomością "'name' must not be null or empty".
     - **Sprawdzenie długości:** Wywołuje metodę `isEven` obiektu `service`, aby określić, czy długość `name` jest parzysta.
     - **Formatowanie powitania:**
       - Jeśli długość jest parzysta, powitanie jest konwertowane na duże litery za pomocą `toUpperCase()`.
       - W przeciwnym razie powitanie jest zwracane bez zmian.

**5. Schemat pętli**

```
// Klasa: Client

// Metoda: greeting(name)
  1. Sprawdź, czy name jest null lub pusty:
    - Jeśli tak, wyrzuć IllegalArgumentException z wiadomością "'name' must not be null or empty".
  2. Wywołaj service.isEven(name.length()) aby sprawdzić, czy długość imienia jest parzysta.
  3. Uformuj ciąg powitania używając "Hello, %s".formatted(name).
  4. Jeśli długość imienia jest parzysta:
    - Przekształć ciąg powitania na duże litery używając toUpperCase().
  5. Zwróć uformowany ciąg powitania.
```



**Zależności i biblioteki:**

- Kod zakłada istnienie interfejsu lub klasy `Service` z metodą `isEven`. Ta metoda prawdopodobnie sprawdza, czy podany liczb całkowita jest parzysta.

- **Równoważne biblioteki:**

  - **Java:** Nie używa się żadnych zewnętrznych bibliotek. Interfejs `Service` można zrealizować za pomocą wbudowanych klas Java.
  - **Python:** Podobną klasę `Service` można zrealizować używając wbudowanych funkcji i klas Python.
  - **C++:** Klasę `Service` można zrealizować używając funkcji i klas standardowej biblioteki C++.



