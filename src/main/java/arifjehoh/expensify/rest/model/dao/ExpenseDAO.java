package arifjehoh.expensify.rest.model.dao;

import lombok.*;

import java.sql.Date;

@Builder
@AllArgsConstructor(access = AccessLevel.PUBLIC)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class ExpenseDAO {
    private Long id;
    @Builder.Default
    private String description = "";
    @Builder.Default
    private Double amount = 0.0;
    @Builder.Default
    private Date createdAt = new Date(System.currentTimeMillis());
    @Builder.Default
    private Date updatedAt = new Date(System.currentTimeMillis());
}
