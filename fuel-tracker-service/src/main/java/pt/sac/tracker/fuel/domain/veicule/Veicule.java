package pt.sac.tracker.fuel.domain.veicule;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import pt.sac.tracker.fuel.domain.Identifiable;

import java.time.LocalDateTime;

@Document
public abstract class Veicule implements Identifiable<Integer> {

    public enum VeiculeType {
        CAR,
        MOTORCYCLE;
    }

    @Id
    Integer id;
    Integer wheels;
    Integer passengers;

    Double distanceInKm;

    String color;
    String manufacturer;
    String model;
    String registry;

    LocalDateTime registryDate;

    LocalDateTime createdDate;

    public Veicule(Integer wheels, Integer passengers, String manufacturer) {
        this.wheels = wheels;
        this.passengers = passengers;
        this.manufacturer = manufacturer;
        this.createdDate = LocalDateTime.now();
    }

    abstract public VeiculeType type();
}
