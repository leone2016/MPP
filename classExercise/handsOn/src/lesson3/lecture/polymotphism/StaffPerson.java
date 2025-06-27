package lesson3.lecture.polymotphism;

public abstract class StaffPerson {
    private String name;
    private String address;//bad design always separate from street, zip code city etc
    private String phoneNumber;
    private VehicleType drivesVehicle;

    public StaffPerson(String name, String address, String phoneNumber, VehicleType drivesVehicle) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.drivesVehicle = drivesVehicle;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public VehicleType getDrivesVehicle() {
        return drivesVehicle;
    }

    public void setDrivesVehicle(VehicleType drivesVehicle) {
        this.drivesVehicle = drivesVehicle;
    }

    abstract double computeStipend();

}
