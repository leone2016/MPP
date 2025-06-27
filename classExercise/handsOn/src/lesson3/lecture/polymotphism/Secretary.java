package lesson3.lecture.polymotphism;

public class Secretary extends StaffPerson {
    private int yearOfService;
    public Secretary(String name, String address, String phoneNumber, VehicleType drivesVehicle, int yearOfService) {
        super(name, address, phoneNumber, drivesVehicle);
        this.yearOfService = yearOfService;
    }

    @Override
    double computeStipend() {
        return 1300;
    }

    public int getYearOfService() {
        return yearOfService;
    }
}
