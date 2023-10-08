package Teme;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Ex7 {
    //Suma numerelor divizibile cu x sau cu y
    //Scrie o metoda care sa calculeze suma numerelor divizibile cu x sau y (unde x si y sunt primiti ca parametri),
    // dintr-o lista de Integer-uri. HINT: foloseste filter si sum sau foloseste reduce
    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(2, 8, 6, 24, 35, 12, 67, 45, 9, 13);
        //apelez metoda cu lambda
        System.out.println(getSumOfNumbers(2, 5, numbersList));
        //apelez metoda clasica
        System.out.println(getSumOfNum(2, 5, numbersList));
    }

    public static Optional<Integer> getSumOfNumbers(int x, int y, List<Integer> numbers) {
         return numbers.stream()
                .filter(number -> number % x == 0 || number % y == 0)//filtrez nr care indeplinesc conditia
                .reduce((sum, number) -> sum + number);//fac suma nr

    }

    public static int getSumOfNum(int x, int y, List<Integer> numbers) {
        int sum = 0;
        for (Integer number : numbers) {//parcurg lista
            if (number % x == 0 || number % y == 0) {//daca nr indeplinesc conditia
                sum += number;//fac suma acelor nr
            }
        }
        return sum;
    }
}
