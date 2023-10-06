package Teme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex4 {
    //Proceseaza urmatoarea lista de nume:
    //Scrie codul astfel incat sa sortezi lista si astfel incat fiecare nume sa inceapa cu litera mare.
    //De exemplu, numele "harry" va deveni "Harry" si va fi intre "Emily" si "Isla".
    //Apoi, in loc sa sortezi lista, afla  cate nume care incep cu 'A' sunt in lista.
    public static void main(String[] args) {
        List<String> topNames2015 = Arrays.asList(
                        "Amelia",
                        "Olivia",
                        "emily",
                        "Isla",
                        "Ava",
                        "oliver",
                        "Jack",
                        "Charlie",
                        "harry",
                        "Jacob"
                );
        List<String> sortedList = topNames2015.stream()
                .map(name ->Character.toUpperCase(name.charAt(0))+name.substring(1))//transform prima litera din fiecare nume in litera mare
                .sorted()//sortez lista in ordine alfabetica
                .collect(Collectors.toList());//colectez lista rezultata
        System.out.println(sortedList);//afisez lista
        Long namesWithA = sortedList.stream()
                .filter(name ->name.startsWith("A"))//filtrez lista sortata sa obtin doar numele care incep cu "A"
                .count();//numar cate nume incep cu "A"
        System.out.println(namesWithA);//afisez lista
        System.out.println(getSortedNamesList(topNames2015));//apelez metoda de ordonare lista si capitalizare initiala
        System.out.println(getNumberOfNameBeginWithA(topNames2015));//apelez metoda de numarare nume care incep cu A
    }
    public static List<String> getSortedNamesList(List<String> names){
        List<String> sortedNames = new ArrayList<>();

        for (String name:names){
            name= Character.toUpperCase(name.charAt(0))+name.substring(1);
            sortedNames.add(name);
        }
        Collections.sort(sortedNames);
        return sortedNames;
    }
    public static int getNumberOfNameBeginWithA(List<String> names) {
        int count = 0;
        for (String name : names) {
            if (name.startsWith("A")){
                count++;
            }
        }return count;
    }
}
