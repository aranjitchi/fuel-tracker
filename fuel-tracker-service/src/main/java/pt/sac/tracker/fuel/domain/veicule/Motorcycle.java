package pt.sac.tracker.fuel.domain.veicule;

import lombok.Data;
import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "veicules")
@TypeAlias("motorcycle")
public class Motorcycle extends Veicule {

    public Motorcycle(String manufacturer) {
        super(2, 1, manufacturer);
    }

    @Override
    public VeiculeType type() {
        return VeiculeType.MOTORCYCLE;
    }

    @Override
    public String getId() {
        return id;
    }
}
