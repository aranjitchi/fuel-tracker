package pt.sac.tracker.fuel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import pt.sac.tracker.fuel.domain.veicule.Veicule;

@Repository
@RepositoryRestResource(collectionResourceRel = "veicules", path = "veicules")
public interface VeiculeRepository extends MongoRepository<Veicule, String> {
}
