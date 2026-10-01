package inventory.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class StockUpdateRequest {
    @NotNull
    private Long productId;

    @NotNull
    @Min(value = 1)
    private Integer quantity;
}