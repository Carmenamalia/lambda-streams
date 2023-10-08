package Teme;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex6 {
    //Suma numerelor pare
    //Calculeaza suma numerelor pare dintr-o lista de Integer-uri. HINT: foloseste filter si sum sau foloseste reduce
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> sumOfEvenNumbers = numbers.stream()
                .filter(number -> number % 2 == 0)
                .reduce((sum, number) -> sum + number);
        System.out.println(sumOfEvenNumbers);

        System.out.println(sumOfEvenNumb(numbers));
    }

    public static int sumOfEvenNumb(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }
}
