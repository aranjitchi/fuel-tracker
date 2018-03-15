package pt.sac.tracker.fuel.domain.veicule;

import lombok.Data;

@Data
public class Car extends Veicule {

    public Car(Integer passengers, String manufacturer) {
        super(4, passengers, manufacturer);
    }

    @Override
    public VeiculeType type() {
        return VeiculeType.CAR;
    }

    @Override
    public Integer getId() {
        return this.id;
    }
}
