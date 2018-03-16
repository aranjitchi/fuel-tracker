package pt.sac.tracker.fuel.domain.expenses;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import pt.sac.tracker.fuel.domain.Identifiable;
import pt.sac.tracker.fuel.domain.veicule.Veicule;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Map;

@Data
@Document(collection = "expenses")
public class Expenses implements Identifiable<String> {

    @Id
    String id;
    Double value;
    String place;
    String notes;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;
    ExpensesType type;
    @DBRef
    Veicule veicule;
    Map<String, Object> customAttr;

    public Expenses(Double value, ExpensesType type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public String getId() {
        return id;
    }

    public enum ExpensesType {
        DEPRECIATION,
        LEASE_PAYMENTS,
        VEHICLE_REGISTRATION_FEES,
        LICENSES,
        GAS,
        INSURANCE,
        REPAIRS,
        OIL,
        GARAGE_RENT,
        VEHICLE_TITLES,
        TOLLS,
        PARKING_FEES;
    }
}
