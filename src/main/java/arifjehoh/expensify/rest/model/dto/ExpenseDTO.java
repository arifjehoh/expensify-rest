package arifjehoh.expensify.rest.model.dto;

import lombok.*;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class ExpenseDTO {
    private Long id;
    private String description;
    private Double amount;
    private Date updatedAt;
}
