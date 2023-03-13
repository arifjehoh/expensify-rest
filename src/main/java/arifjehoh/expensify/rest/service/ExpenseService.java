package arifjehoh.expensify.rest.service;

import arifjehoh.expensify.rest.model.dto.ExpenseDTO;
import arifjehoh.expensify.rest.repository.ExpenseRepository;
import arifjehoh.expensify.rest.repository.impl.ExpenseRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ExpenseService {
    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepositoryImpl expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public Optional<Collection<ExpenseDTO>> findAll() {
        return expenseRepository.findAll()
                                .map(collection -> collection.stream()
                                                             .map(dao -> ExpenseDTO.builder()
                                                                                   .id(dao.getId())
                                                                                   .description(dao.getDescription())
                                                                                   .amount(dao.getAmount())
                                                                                   .updatedAt(dao.getUpdatedAt())
                                                                                   .build())
                                                             .collect(Collectors.toList()));
    }
}
