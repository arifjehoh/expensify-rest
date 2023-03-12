package arifjehoh.expensify.rest.model.dao;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ExpenseDAO {
    private Long id;
    private String description;
    private Double amount;
    private Date createdAt;
    private Date updatedAt;
}
