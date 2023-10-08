package Teme;

import java.util.*;
import java.util.stream.Collectors;


public class Ex8 {
    // Sorteaza numerele dintr-un array
    //Scrie o metoda care sa sorteze numerele dintr-o lista de Integer-uri, dar inainte de asta sa le transforme in valori pozitive
    //(HINT: map pentru a transforma fiecare numar din negativ in pozitiv, apoi sorted() ca si operatie finala.
    // Foloseste Math.abs() pentru a transforma un numar din negativ in pozitiv)
    //Rezolva problema si fara expresii lambda. (HINT: foloseste metoda sort din arraylist)
    public static void main(String[] args) {
        List<Integer> numbersList = Arrays.asList(-3, 4, -1, 2, -5);

        System.out.println(getSortedList(numbersList));//apelez metoda cu lambda

        getSortedNumbers(numbersList);//apelez metoda clasica
    }

    public static List<Integer> getSortedList(List<Integer> numbers) {
        return numbers.stream()
                .map(number -> Math.abs(number))//transform nr negative in pozitive
                .sorted()//sortez nr
                .collect(Collectors.toList());
    }
    public static void getSortedNumbers(List<Integer> numbers) {
        List<Integer> sortedNumbers = new ArrayList<>();
        for (int number : numbers) {//parcurg lista
            if (number < 0) {//daca nr sunt negative
                number = Math.abs(number);//le transform in pozitive
            }
            sortedNumbers.add(number);//adaug toate nr(cele deja pozitive si cele transformate)  in noua lista
            Collections.sort(sortedNumbers);//sortez noua lista
        }
        System.out.println(sortedNumbers);
    }
}
