package arifjehoh.expensify.rest.repository.impl;

import arifjehoh.expensify.rest.model.dao.ExpenseDAO;
import arifjehoh.expensify.rest.repository.ExpenseRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

@Repository
public class ExpenseRepositoryImpl implements ExpenseRepository {
    private final Collection<ExpenseDAO> expenses;

    public ExpenseRepositoryImpl() {
        expenses = new ArrayList<>();
    }

    @Override
    public Optional<Collection<ExpenseDAO>> findAll() {
        return Optional.ofNullable(expenses);
    }
}
