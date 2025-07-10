package PracticeExam;

import PracticeExam.model.Person;

import java.util.function.Consumer;

public class _1_Consumer {

    public static void main(String[] args) {

        System.out.println(" -------------------------------- ");
        Consumer<String> con2= (s)->{
            System.out.println("Hello " + s.toLowerCase());
        };
        //con2.accept("LEONARDO");
        // Example of using Consumer interface
        Consumer<String> con1= (s)->{
            System.out.println(" -> Hello " + s.toUpperCase());
        };
        //con1.accept("LeoNaRdo");

        con1.andThen(con2).accept("LeoNarDO");




    }

}
