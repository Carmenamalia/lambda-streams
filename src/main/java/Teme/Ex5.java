package Teme;

import Teme.Ex2.Person;

import java.util.*;
import java.util.stream.Collectors;

public class Ex5 {
    //Sterge persoanele care nu pot vota
    //Avand o lista de persoane, sterge din lista persoanele care au varsta mai mica decat 18 ani, folosind expresii lambda.
    public static void main(String[] args) {
        Person person1 = new Person("Laura", 17);
        Person person2 = new Person("George", 16);
        Person person3 = new Person("Mihaela", 19);
        Person person4 = new Person("Cezar", 18);
        Person person5 = new Person("Sonia", 20);

        List<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);


        System.out.println(personList);//afisez lista initiala

        List<Person> newList = personList.stream()
                .filter(person -> person.getAge() >= 18)
                .collect(Collectors.toList());
        System.out.println(newList);//afisez noua lista

//        getOnlyAdultPeople(personList); //apelul metodei sugerate de chatgpt
//        for (Person person:personList){
//            System.out.println(person.getName()+ " " + person.getAge());
//        }
        System.out.println(getAdultPeople(personList));
    }

    //metoda clasica:
    public static List<Person> getAdultPeople(List<Person> people){
        //parcurg lista de persoane
        //daca au sub 18 ani le sterg din  lista
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getAge()<18){
                people.remove(i);//aici e posibil sa apara exceptie
            }
        }
        return people;
    }
    //metoda sugerata de chatgpt
//    public static void getOnlyAdultPeople(List<Person> personList) {
//        Iterator<Person> adultPeople = personList.iterator();
//        while (adultPeople.hasNext()) {
//            Person person = adultPeople.next();
//            if (person.getAge() < 18) {
//                adultPeople.remove();
//            }
//        }
//    }

}
