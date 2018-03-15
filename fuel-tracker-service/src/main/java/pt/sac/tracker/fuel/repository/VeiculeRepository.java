package pt.sac.tracker.fuel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pt.sac.tracker.fuel.domain.veicule.Veicule;

@RepositoryRestResource(collectionResourceRel = "veicules", path = "veicules")
public interface VeiculeRepository extends MongoRepository<Veicule, Integer> {
}
