package pt.sac.tracker.fuel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import pt.sac.tracker.fuel.domain.expenses.Expenses;

@RepositoryRestResource(collectionResourceRel = "expenses", path = "expenses")
public interface ExpensesRepository extends MongoRepository<Expenses, Integer> {
}
