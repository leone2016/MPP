package lesson11.lecture._6_optional_examples;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //1. How to create an empty Optional object ? optional object is empty
        Optional<String> optional = Optional.empty();
        System.out.println(optional);
        //check whether the optional object is empty
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());// false because the optional object is empty
        //2. How to create an Optional object with a value?
        Optional<User> optionalWithValue = Optional.of(
                new User("John Doe")
        );

        System.out.println(optionalWithValue.isEmpty());
        System.out.println(optionalWithValue.isPresent());
        optionalWithValue.ifPresent(System.out::println);
        //OR
        if(optionalWithValue.isPresent()) {
            System.out.println(optionalWithValue.get());
        }

        String s = optional.orElse(getName());
        System.out.println(s); // will print "guess" because the optional is empty

        User myUSer = optionalWithValue.orElse(getNewUser());//orelse method is eagerly executed
        System.out.println("orElse: "+myUSer);
       // there are two execution lazy and eagerly

        //optionalWithValue.orElseGet(Main::getNewUser);
        User myUser2 = optionalWithValue.orElseGet(()->getNewUser());// this is lazy execution
        System.out.println("orElseGet: "+myUser2);

    }
//TODO: keep in mind that the orElse method is eagerly executed, while the orElseGet method is lazily executed.
    private static User getNewUser() {
        System.out.println(":: getNewUser() is called");
        return new User("New User");
    }

    static String getName(){
        System.out.println(":: getName() is called");
        return "Guest";
    }
}

class User{
    private String name;

    public User(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}