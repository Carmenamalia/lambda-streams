package Teme;

import Teme.Ex2.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex9 {
    //Filtreaza persoanele care pot vota
    //O persoana este caracterizata de nume si varsta. Scrie o metoda statica numita isPersonEligibleForVoting(),
    // care accepta ca parametru o lista de persoane si returneaza o lista cu persoanele care pot vota.
    public static void main(String[] args) {
        List<Person> personList = Arrays.asList(new Person("Mihai",17),new Person("Daniela",19),new Person("Paul",16),new Person("Maria",21));

        System.out.println(isPersonEligibleForVoting(personList));//apelez metoda cu lambda

        System.out.println(isPersonEligible(personList));//apelez metoda clasica
    }
    public static List<Person> isPersonEligibleForVoting(List<Person> people){
       return people.stream()
               .filter(person -> person.getAge()>=18)//filtrez persoanele peste 18 ani
               .collect(Collectors.toList());
    }
    public static List<Person> isPersonEligible(List<Person> people){
        List<Person> eligiblePersons = new ArrayList<>();
        for (Person person:people){//parcurg lista de persoane
            if (person.getAge()>=18){//daca sunt majore
                eligiblePersons.add(person);//le adaug in noua lista
            }
        }
        return eligiblePersons;
    }
}
