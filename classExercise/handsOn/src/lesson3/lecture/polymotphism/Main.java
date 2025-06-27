package lesson3.lecture.polymotphism;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StaffPerson[] people = {
                new Faculty("Leonardo", "1000 N 4th", "+1(641)", VehicleType.CAR, "Ing Software Dev"),
                new Secretary("Lorena", "San Carlos", "098765", VehicleType.CAR, 2),
        };

        List<StaffPerson> people1 = List.of(
                new Faculty("Leonardo", "1000 N 4th", "+1(641)", VehicleType.CAR, "Ing Software Dev"),
                new Secretary("Lorena", "San Carlos", "098765", VehicleType.CAR, 1)
                );
        //people1.add( new Faculty("Leonardo", "1000 N 4th", "+1(641)", VehicleType.CAR, "Ing Software Dev"));

        for (StaffPerson person : people) {
            if(person instanceof Faculty faculty) {
                System.out.println(faculty.getName()+" "+faculty.getAddress() +" "+faculty.getPhoneNumber()+" "+faculty.getPhoneNumber()+" "+" SALARY: "+faculty.computeStipend());
            }
        }
        //compute the total stiped of all people
        double sum = 0;
        for(StaffPerson person : people) {
            sum += person.computeStipend();
        }
        System.out.println(sum);
    }
}
