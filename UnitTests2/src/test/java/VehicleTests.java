import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;
import seminars.second.hw.*;

import java.util.ArrayList;
import java.util.List;

public class VehicleTests {
    private static final String company = "company";
    private static final String model = "model";
    private static final int year = 2023;

    private Car car;

    private Motorcycle motorcycle;

    /**
     * Перед каждым новым тестом создаются новые экземпляры Car и Motorcycle
     */
    @BeforeEach
    public void initValues() {
        this.car = new Car(company, model, year);
        this.motorcycle = new Motorcycle(company, model, year);
    }

    /**
     * Проверить, что все созданные экземпляры также является экземплярами транспортного средства
     */
    @Test
    public void isVehicle() {
        assertTrue(this.car instanceof Vehicle);
        assertTrue(this.motorcycle instanceof Vehicle);
    }

    /**
     * Проверить, что у всех экземпляров нужное число колес
     */
    @Test
    public void testNumberOfWheels(){
        assertEquals(Car.expectedNumWheels, car.getNumWheels());
        assertEquals(Motorcycle.expectedNumWheels, motorcycle.getNumWheels());
    }

    /**
     * Проверить, что все транспортные средства развивают нужную скорость в режиме тестового вождения
     */
    @Test
    public void testSpeed(){
        this.car.testDrive();
        this.motorcycle.testDrive();
        assertEquals(Car.expectedTestSpeed, car.getSpeed());
        assertEquals(Motorcycle.expectedTestSpeed, motorcycle.getSpeed());
    }

    /**
     * Проверить, что в режиме парковки транспортные средства останавливаются.
     */
    @Test
    public void testParkingSpeed(){
        this.car.testDrive();
        this.car.park();
        this.motorcycle.testDrive();
        this.motorcycle.park();
        assertEquals(Car.expectedParkingSpeed, this.car.getSpeed());
        assertEquals(Motorcycle.expectedParkingSpeed, this.motorcycle.getSpeed());
    }
}
