# Expensify REST - Controller Layer

This layer is what the project is exposing to the users.
And in this README you will find tips and tricks and code snippets to help with upholding the quality of code and the
consistency of developing controllers.

## OpenAPI - Swagger API documentation

The Swagger UI page will then be available
at [http://localhost:8080/context-path/swagger-ui.html](http://loaclhost:8080/context-path/swagger-ui.html)
and the OpenAPI description will be available at the following url for json
format: [http://localhost:8080/context-path/v3/api-docs](http://localhost:8080/context-path/v3/api-docs)

- server: The server name or IP
- port: The server port
- context-path: The context path of the application

Documentation can be available in yaml format as well, on the following path : /v3/api-docs.yaml

## Creating a new controller

```java

@RestController
@RequestMapping(value = "/api/")
public class Controller {

}
```

## Creating CRUD endpoints

```java
@GetMapping("/{expenseId}")
public ResponseEntity<Expense> getExpenseById(@PathVariable("expenseId") Long id){
        Expense expense=expenseService.getExpenseById(id);
        if(expense==null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(expense,HttpStatus.OK);
        }
```

```java
@PostMapping("/create")
public ResponseEntity<Expense> createExpense(@RequestBody Expense expense){
        expenseService.createExpense(expense);
        return new ResponseEntity<>(expense,HttpStatus.CREATED);
        }
```

```java
@PutMapping("/{expenseId}")
public ResponseEntity<Expense> updateExpense(@PathVariable("expenseId") Long id,
@RequestBody Expense expense){
        Expense existingExpense=expenseService.getExpenseById(id);
        if(existingExpense==null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        expense.setId(id);
        expenseService.updateExpense(expense);
        return new ResponseEntity<>(expense,HttpStatus.OK);
        }
```

```java
@DeleteMapping("/{expenseId}")
public ResponseEntity<HttpStatus> deleteExpense(@PathVariable("expenseId") Long id){
        Expense expense=expenseService.getExpenseById(id);
        if(expense==null){
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        expenseService.deleteExpense(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
```