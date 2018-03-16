package pt.sac.tracker.fuel.domain.veicule;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "veicules")
@TypeAlias("car")
public class Car extends Veicule {

    public Car(Integer passengers, String manufacturer) {
        super(4, passengers, manufacturer);
    }

    @Override
    public VeiculeType type() {
        return VeiculeType.CAR;
    }

    @Override
    public String getId() {
        return this.id;
    }
}
