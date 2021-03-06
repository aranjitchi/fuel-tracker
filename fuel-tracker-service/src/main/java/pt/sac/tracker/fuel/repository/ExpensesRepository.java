package pt.sac.tracker.fuel.repository;

import org.springframework.data.annotation.TypeAlias;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;
import pt.sac.tracker.fuel.domain.expenses.Expenses;

@Repository
@RepositoryRestResource(collectionResourceRel = "expenses", path = "expenses")
@TypeAlias("expense")
@CrossOrigin
public interface ExpensesRepository extends MongoRepository<Expenses, String> {
}
