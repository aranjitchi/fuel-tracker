package pt.sac.tracker.fuel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pt.sac.tracker.fuel.domain.veicule.Veicule;

@Repository
@RepositoryRestResource(path = "veicules", collectionResourceRel = "veicules", itemResourceRel = "veicule")
@CrossOrigin
public interface VeiculeRepository extends MongoRepository<Veicule, String> {
}
