package lesson3.lecture.polymotphism;

public class Faculty extends StaffPerson{

    private String title;

    public Faculty(String name, String address, String phoneNumber, VehicleType drivesVehicle, String title) {
        super(name, address, phoneNumber, drivesVehicle);
        this.title = title;
    }

    @Override
    double computeStipend() {
        return 1500;
    }

    public String getTitle() {
        return title;
    }
}
