package arifjehoh.expensify.rest.controller;

import arifjehoh.expensify.rest.model.dto.ExpenseDTO;
import arifjehoh.expensify.rest.service.ExpenseService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping(name = "Expenses", value = "/api/v1/expenses")
public class ExpenseController {

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping(value = "", name = "Find all", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Collection<ExpenseDTO>> findAll() {
        Collection<ExpenseDTO> expenses = expenseService.findAll();
        if (expenses.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(expenses);
    }

    @GetMapping(value = "/{id}", name = "Find by ID", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExpenseDTO> findById(@PathVariable(value = "id") Long id) {
        return ResponseEntity.internalServerError().build();
    }

    @PostMapping(value = "", name = "Create a new expense", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExpenseDTO> save(@RequestBody ExpenseDTO expense) {
        return ResponseEntity.internalServerError().build();
    }

    @PutMapping(value = "/{id}", name = "Updating expense by ID", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExpenseDTO> update(@PathVariable(value = "id") Long id, @RequestBody ExpenseDTO expense) {
        return ResponseEntity.internalServerError().build();
    }

    @DeleteMapping(value = "/{id}", name = "Delete expense by ID", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<ExpenseDTO> delete(@PathVariable(value = "id") Long id, @RequestBody ExpenseDTO expense) {
        return ResponseEntity.internalServerError().build();
    }

}
