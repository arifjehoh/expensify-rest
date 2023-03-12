package arifjehoh.expensify.rest.controller;

import arifjehoh.expensify.rest.model.dao.ExpenseDAO;
import arifjehoh.expensify.rest.model.dto.ExpenseDTO;
import arifjehoh.expensify.rest.repository.impl.ExpenseRepositoryImpl;
import arifjehoh.expensify.rest.service.ExpenseService;
import org.assertj.core.api.Assertions;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.Mockito.when;


@ExtendWith(SpringExtension.class)
@SpringBootTest
class ExpenseControllerTest {

    private ExpenseController expenseController;
    @Mock
    private ExpenseRepositoryImpl expenseRepository;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        ExpenseService expenseService = new ExpenseService(expenseRepository);
        expenseController = new ExpenseController(expenseService);
    }

    @Test
    void findAll_No_Content() {
        List<ExpenseDAO> emptyList = Collections.emptyList();
        when(expenseRepository.findAll()).thenReturn(emptyList);
        ResponseEntity<Collection<ExpenseDTO>> actual = expenseController.findAll();
        Assertions.assertThat(actual.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
    }

    @Test
    void findAll_Ok() {
        List<ExpenseDAO> expenses = new ArrayList<>(List.of(ExpenseDAO.builder()
                                                                      .id(9999L)
                                                                      .amount(100.0)
                                                                      .build()));
        when(expenseRepository.findAll()).thenReturn(expenses);
        ResponseEntity<Collection<ExpenseDTO>> actual = expenseController.findAll();
        Assertions.assertThat(actual.getStatusCode()).isEqualTo(HttpStatus.OK);
        Assertions.assertThat(actual.getBody().size()).isEqualTo(1);
        Assertions.assertThat(actual.getBody())
                  .extracting(ExpenseDTO::getId, ExpenseDTO::getAmount)
                  .containsOnly(Tuple.tuple(9999L, 100.0));
    }

    @Test
    void findById() {
        fail();
    }

    @Test
    void save() {
        fail();
    }

    @Test
    void update() {
        fail();
    }

    @Test
    void delete() {
        fail();
    }
}