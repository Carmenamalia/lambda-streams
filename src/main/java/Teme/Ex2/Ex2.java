package Teme.Ex2;



import java.util.*;

public class Ex2 {
    public static void main(String[] args) {
        //Sorteaza o o lista de persoane dupa nume, utilizand un comparator
        //Comparatorul nu va fi definit printr-o clasa care sa implementeze interfata Comparator

        Person person1 = new Person("Andrei", 23);
        Person person2 = new Person("Gary", 23);
        Person person3 = new Person("Paula", 23);
        Person person4 = new Person("Marianne", 23);

        List<Person> people = List.of(person1, person2, person3, person4);

        List<Person> sortedPerson = people.stream()
                .sorted(Comparator.comparing(person -> person.getName()))//sortez persoanele dupa nume
                .toList();
        sortedPerson.forEach(person -> System.out.println(person.getName()));//afisez lista

        System.out.println(getSortedSet(people));//apelez metoda de sortare

    }
    public static List<String> getSortedSet(List<Person> people) {
        List<String> sortedList = new ArrayList<>();
        for (Person person : people) {//pentru fiecare persoana
            sortedList.add(person.getName());//adaug in lista sortata numele persoanei
        }
        Collections.sort(sortedList);//sortez numele in ordine
        return sortedList;
    }
}
