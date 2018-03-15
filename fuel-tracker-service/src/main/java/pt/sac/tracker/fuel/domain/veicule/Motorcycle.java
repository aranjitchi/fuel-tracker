package pt.sac.tracker.fuel.domain.veicule;

import lombok.Data;

@Data
public class Motorcycle extends Veicule {

    public Motorcycle(String manufacturer) {
        super(2, 1, manufacturer);
    }

    @Override
    public VeiculeType type() {
        return VeiculeType.MOTORCYCLE;
    }

    @Override
    public Integer getId() {
        return id;
    }
}
