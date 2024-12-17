## Dokumentacja pliku Service.java

**1. Podsumowanie**

Klasa `Service` zawiera dwie metody: `isEven` i `highComplexityMethod`. Metoda `isEven` sprawdza, czy podany liczb całkowita jest parzysta, zwracając `true` jeśli jest, a `false` w przeciwnym razie. Metoda `highComplexityMethod` analizuje trzy liczby całkowite (`a`, `b` i `c`) i wyświetla szereg wiadomości na konsoli w zależności od ich wartości dodatnich lub nieujemnych.

**2. Nazwa pakietu/modułu:**

`org.example`

**3. Nazwa klasy/pliku:**

`Service.java`

**4. Szczegółowa dokumentacja**

**- Metoda `isEven(int input)`**

   - **Opis:** Sprawdza, czy podana liczba całkowita `input` jest parzysta.
   - **Parametry:**
     - `input`: Liczba całkowita do sprawdzenia.
   - **Wartości zwracane:**
     - `boolean`: Zwraca `true` jeśli `input` jest parzysta, `false` w przeciwnym razie.
   - **Ważna logika:**
     - Korzysta z operatora modulo (`%`) do obliczenia reszty z dzielenia `input` przez 2.
     - Zwraca `true` jeśli reszta jest równa 0 (wskazując na liczbę parzystą), `false` w przeciwnym razie.

**- Metoda `highComplexityMethod(int a, int b, int c)`**

   - **Opis:** Analizuje trzy liczby całkowite (`a`, `b` i `c`) i wyświetla wiadomości na konsoli w zależności od ich wartości dodatnich lub nieujemnych.
   - **Parametry:**
     - `a`: Pierwsza liczba całkowita.
     - `b`: Druga liczba całkowita.
     - `c`: Trzecia liczba całkowita.
   - **Wartości zwracane:**
     - Brak.
   - **Ważna logika:**
     - Korzysta z zagnieżdżonych instrukcji `if` do sprawdzania wartości `a`, `b` i `c`.
     - Wyświetla wiadomości wskazujące, czy każda liczba całkowita jest dodatnia lub nieujemna.
     - Logika jest skonstruowana w celu obsługi wszystkich możliwych kombinacji wartości dodatnich i nieujemnych dla `a`, `b` i `c`.

**5. Schemat pętli**

```
// Klasa: Service

// Metoda: isEven(input)
  1. Oblicz resztę z dzielenia input przez 2 (input % 2).
  2. Jeśli reszta jest równa 0, zwróć true (input jest parzysta).
  3. W przeciwnym razie, zwróć false (input jest nieparzysta).

// Metoda: highComplexityMethod(a, b, c)
  1. Sprawdź wartość a:
    - Jeśli a jest równe 0:
      - Sprawdź wartość b:
        - Jeśli b jest dodatni:
          - Sprawdź wartość c:
            - Jeśli c jest dodatni, wyświetl "c jest dodatni".
            - W przeciwnym razie, wyświetl "c jest nieujemny".
        - W przeciwnym razie (b jest nieujemny):
          - Sprawdź wartość c:
            - Jeśli c jest dodatni, wyświetl "c jest dodatni".
            - W przeciwnym razie, wyświetl "c jest nieujemny".
    - Jeśli a jest nieujemny:
      - Sprawdź wartość b:
        - Jeśli b jest dodatni:
          - Sprawdź wartość c:
            - Jeśli c jest dodatni, wyświetl "c jest dodatni".
            - W przeciwnym razie, wyświetl "c jest nieujemny".
        - W przeciwnym razie (b jest nieujemny):
          - Sprawdź wartość c:
            - Jeśli c jest dodatni, wyświetl "c jest dodatni".
            - W przeciwnym razie, wyświetl "c jest nieujemny".
    - W przeciwnym razie (a jest dodatni):
      - Sprawdź wartość b:
        - Jeśli b jest dodatni:
          - Sprawdź wartość c:
            - Jeśli c jest dodatni, wyświetl "c jest dodatni".
            - W przeciwnym razie, wyświetl "c jest nieujemny".
        - W przeciwnym razie (b jest nieujemny):
          - Sprawdź wartość c:
            - Jeśli c jest dodatni, wyświetl "c jest dodatni".
            - W przeciwnym razie, wyświetl "c jest nieujemny".



```



**Zależności i biblioteki:**

- Ten kod nie korzysta z żadnych zewnętrznych bibliotek. Jest to prosta klasa z podstawowymi operacjami arytmetycznymi.



