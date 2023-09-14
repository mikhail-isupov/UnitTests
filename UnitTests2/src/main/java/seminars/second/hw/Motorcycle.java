package seminars.second.hw;

public class Motorcycle extends Vehicle {

    public static final int expectedNumWheels = 2;
    public static final int expectedTestSpeed = 75;
    public static final int expectedParkingSpeed = 0;
    private String company;
    private String model;
    private int yearRelease;
    private int numWheels;
    private int speed;

    public Motorcycle (String company, String model, int year) {
        this.company = company;
        this.model = model;
        this.yearRelease = year;
        this.numWheels = expectedNumWheels;
        this.speed = expectedParkingSpeed;
    }
    public void testDrive() { this.speed = expectedTestSpeed; }
    public void park() { this.speed = expectedParkingSpeed; }
    public String getCompany() { return company; }
    public String getModel() { return model; }
    public int getYearRelease() { return yearRelease; }
    public int getNumWheels() { return numWheels; }
    public int getSpeed() { return speed; }
    public String toString() { return "This motorcycle is a “ + year + “ “ + make + “ “ + model + “;"; }
}