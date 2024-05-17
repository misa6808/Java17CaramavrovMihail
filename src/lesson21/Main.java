package lesson21;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        // Exemplu listă cu duplicate
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 3, 4);

        // 1. Găsirea valorii medii a numerelor din listă folosind metoda average().
        double average = list.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);
        System.out.println("Valoarea medie: " + average);

        // 2. Obținerea unei noi liste, constând din elementele listei inițiale, multiplicate cu un număr dat, folosind metoda map().
        int multiplier = 2;
        List<Integer> multipliedList = list.stream()
                .map(n -> n * multiplier)
                .toList();
        System.out.println("Lista multiplicată cu " + multiplier + ": " + multipliedList);

        // 3. Filtrarea listei pentru a obține un nou list folosind metoda filter().
        List<Integer> filteredList = list.stream()
                .filter(n -> n % 2 == 0) // Condiție: numere pare
                .toList();
        System.out.println("Lista filtrată (numere pare): " + filteredList);

        // 4. Obținerea primului element din listă care satisface o condiție dată folosind metoda findFirst().
        Optional<Integer> firstElement = list.stream()
                .filter(n -> n > 5)
                .findFirst();
        System.out.println("Primul element mai mare de 5: " + firstElement.orElse(null));

        // 5. Eliminarea tuturor duplicatelor din listă folosind metoda distinct().
        List<Integer> distinctList = list.stream()
                .distinct()
                .toList();
        System.out.println("Lista fără duplicate: " + distinctList);

        // 6. Obținerea elementului maxim din listă folosind metoda max().
        Integer maxElement = list.stream()
                .max(Integer::compareTo)
                .orElse(null);
        System.out.println("Elementul maxim: " + maxElement);

        // 7. Sortarea listei în ordine descrescătoare folosind metoda sorted().
        List<Integer> sortedList = list.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Lista sortată în ordine descrescătoare: " + sortedList);

        // 8. Numărarea elementelor din listă care satisfac o condiție dată folosind metoda count().
        long count = list.stream()
                .filter(n -> n > 5)
                .count();
        System.out.println("Numărul de elemente mai mari de 5: " + count);
    }
}
