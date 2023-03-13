package arifjehoh.expensify.rest.repository;

import arifjehoh.expensify.rest.model.dao.ExpenseDAO;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.Optional;

@Repository
public interface ExpenseRepository {
    Optional<Collection<ExpenseDAO>> findAll();
}
