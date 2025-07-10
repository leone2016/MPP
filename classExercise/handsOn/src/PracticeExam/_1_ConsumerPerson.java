package PracticeExam;

import PracticeExam.model.Person;
import PracticeExam.model.PersonRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class _1_ConsumerPerson {
    static Consumer<Person> c1 = (p) -> {
        System.out.println("Hello " + p.getName().toUpperCase());
    };

    static Consumer<Person> c2 = (p) -> System.out.println("Hello c2 : " + p.getName().toLowerCase());

    static Consumer<Person> c3 = (p) -> System.out.println(p.getHobbies());
    static List<Person> personList = PersonRepository.personList();

    static void printNameAndHobbie(){
        personList.forEach(c1.andThen(c2));
    }

    static void printWithCondition(){
        personList.forEach( p -> {
            if(p.getGender().equals("Male") && p.getHeight() >=140 ){
                c2.andThen(c3).accept(p);
            }
        });
    }
    public static void main(String[] args) {
//        List<Person> people = PersonRepository.personList();
        c1.accept(PersonRepository.getPerson());
        c2.accept(PersonRepository.getPerson());

        c1.andThen(c2).accept(PersonRepository.getPerson());
        System.out.println(" ------------------------------------ ");
        printNameAndHobbie();
        System.out.println("  ------------------------------------  ");
        printWithCondition();


    }

}
