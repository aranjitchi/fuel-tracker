package pt.sac.tracker.fuel.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import pt.sac.tracker.fuel.repository.ExpensesRepository;
import pt.sac.tracker.fuel.repository.VeiculeRepository;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = {ExpensesRepository.class, VeiculeRepository.class})
//public class Application implements CommandLineRunner {
public class Application {

    @Autowired
    VeiculeRepository veiculeRepository;

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }


    /*
    @Override
    public void run(String... args) throws Exception {

        Motorcycle motorcycle = new Motorcycle("BMW");
        Car car = new Car(4, "Opel");

        veiculeRepository.save(motorcycle);
        veiculeRepository.save(car);

    }
    */

}
