package arifjehoh.expensify.rest.service;

import arifjehoh.expensify.rest.repository.ExpenseRepository;
import arifjehoh.expensify.rest.repository.impl.ExpenseRepositoryImpl;
import org.springframework.stereotype.Service;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepositoryImpl expenseRepository) {
        this.expenseRepository = expenseRepository;
    }
}
