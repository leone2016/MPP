package PracticeExam;

import PracticeExam.model.Person;
import PracticeExam.model.PersonRepository;

import java.util.List;
import java.util.function.BiConsumer;

public class _2_BiConsumerPerson {

    static void printPersonDetails(){
        BiConsumer<String, List<String>> pConsumer = (names, hobbies) -> System.out.println(names + " " + hobbies);
        BiConsumer<String, Double> salaryConsumer = (names, salary) -> System.out.println(names + " " + salary);
        List<Person> personList = PersonRepository.personList();
        personList.forEach(p -> pConsumer.accept(p.getName(), p.getHobbies()));
        personList.forEach(p -> {
            pConsumer.accept(p.getName(), p.getHobbies());
            salaryConsumer.accept(p.getName(), p.getSalary());
        } );

//        personListt
    }
    public static void main(String[] args) {
    printPersonDetails();
    }
}
