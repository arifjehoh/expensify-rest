package arifjehoh.expensify.rest.repository;

import arifjehoh.expensify.rest.model.dao.ExpenseDAO;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface ExpenseRepository {
    Collection<ExpenseDAO> findAll();
}
