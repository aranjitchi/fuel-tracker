package pt.sac.tracker.fuel.domain.veicule;

import lombok.Data;
import org.springframework.data.annotation.Id;
import pt.sac.tracker.fuel.domain.Identifiable;

import java.time.LocalDateTime;

@Data
public abstract class Veicule implements Identifiable<String> {

    @Id
    String id;
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

    public enum VeiculeType {
        CAR,
        MOTORCYCLE
    }
}
