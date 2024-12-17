## Dokumentacja klasy Service.java

**1. Podsumowanie**

Klasa `Service` zawiera dwie metody: `isEven` i `highComplexityMethod`. Metoda `isEven` określa, czy podany liczb całkowita jest parzysta, a metoda `highComplexityMethod` analizuje znaki trzech liczb całkowitych i wyświetla szereg wiadomości w zależności od ich kombinacji.

**2. Nazwa pakietu/modułu:**

`org.example`

**3. Nazwa klasy/pliku:**

`Service.java`

**4. Dokumentacja szczegółowa**

* **Klasa `Service`**

    * **Metoda `isEven(int input)`**
        * **Opis:** Sprawdza, czy podana liczba całkowita jest parzysta.
        * **Parametry:**
            * `input`: Liczba całkowita do sprawdzenia.
        * **Wartości zwracane:** `true` jeśli liczba jest parzysta, `false` w przeciwnym razie.
        * **Ważna logika:** Korzysta z operatora modulo (`%`) aby sprawdzić, czy reszta z dzielenia `input` przez 2 jest równa 0. Jeśli tak, liczba jest parzysta i metoda zwraca `true`; w przeciwnym razie zwraca `false`.

    * **Metoda `highComplexityMethod(int a, int b, int c)`**
        * **Opis:** Analizuje znaki trzech liczb całkowitych (`a`, `b` i `c`) i wyświetla wiadomości w zależności od ich kombinacji.
        * **Parametry:**
            * `a`: Pierwsza liczba całkowita.
            * `b`: Druga liczba całkowita.
            * `c`: Trzecia liczba całkowita.
        * **Wartości zwracane:** None.
        * **Ważna logika:**
            * Metoda najpierw sprawdza znak `a`.
            * Jeśli `a` jest równe 0, sprawdza znaki `b` i `c`.
            * Jeśli `a` jest dodatni, sprawdza znaki `b` i `c`.
            * Jeśli `a` jest ujemny, sprawdza znaki `b` i `c`.
            * Dla każdej kombinacji znaków, wyświetla odpowiednią wiadomość.

**5. Pseudo kod**

```
// Klasa: Service

// Metoda: isEven(input)
  1. Oblicz resztę z dzielenia input przez 2.
  2. Jeśli reszta jest równa 0, zwróć true.
  3. W przeciwnym razie, zwróć false.

// Metoda: highComplexityMethod(a, b, c)
  1. Sprawdź znak 'a':
    - Jeśli 'a' jest równe 0:
      - Sprawdź znak 'b':
        - Jeśli 'b' jest dodatni:
          - Sprawdź znak 'c':
            - Jeśli 'c' jest dodatni: Wyświetl "a jest dodatni, b jest dodatni, c jest dodatni"
            - W przeciwnym razie: Wyświetl "a jest dodatni, b jest dodatni, c jest nie dodatni"
        - W przeciwnym razie:
          - Sprawdź znak 'c':
            - Jeśli 'c' jest dodatni: Wyświetl "a jest dodatni, b jest nie dodatni, c jest dodatni"
            - W przeciwnym razie: Wyświetl "a jest dodatni, b jest nie dodatni, c jest nie dodatni"
    - Jeśli 'a' jest dodatni:
      - Sprawdź znak 'b':
        - Jeśli 'b' jest dodatni:
          - Sprawdź znak 'c':
            - Jeśli 'c' jest dodatni: Wyświetl "a jest dodatni, b jest dodatni, c jest dodatni"
            - W przeciwnym razie: Wyświetl "a jest dodatni, b jest dodatni, c jest nie dodatni"
        - W przeciwnym razie:
          - Sprawdź znak 'c':
            - Jeśli 'c' jest dodatni: Wyświetl "a jest dodatni, b jest nie dodatni, c jest dodatni"
            - W przeciwnym razie: Wyświetl "a jest dodatni, b jest nie dodatni, c jest nie dodatni"
    - Jeśli 'a' jest ujemny:
      - Sprawdź znak 'b':
        - Jeśli 'b' jest dodatni:
          - Sprawdź znak 'c':
            - Jeśli 'c' jest dodatni: Wyświetl "a jest nie dodatni, b jest dodatni, c jest dodatni"
            - W przeciwnym razie: Wyświetl "a jest nie dodatni, b jest dodatni, c jest nie dodatni"
        - W przeciwnym razie:
          - Sprawdź znak 'c':
            - Jeśli 'c' jest dodatni: Wyświetl "a jest nie dodatni, b jest nie dodatni, c jest dodatni"
            - W przeciwnym razie: Wyświetl "a jest nie dodatni, b jest nie dodatni, c jest nie dodatni"



```



**Zależności i biblioteki:**

* Ten kod nie korzysta z żadnych zewnętrznych bibliotek. Korzysta tylko z standardowych funkcjonalności Java.

* **Równoważne biblioteki:**

    * **Python:** Nie są potrzebne żadne specjalne biblioteki.
    * **C++:** Nie są potrzebne żadne specjalne biblioteki.



