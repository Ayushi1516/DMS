package inventory.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductRequest {

    @NotBlank(message = "Name is required")
    @Size(max = 100)
    private String name;

    @NotBlank(message = "Description is required")
    @Size(max = 500)
    private String description;

    @NotNull
    @DecimalMin(value="0.01", message = "Price must be positive")
    private BigDecimal price;

    @NotNull
    @Min(value=0, message ="stock cannot be negative")
    private Integer stock;

    @NotBlank(message = "Category is required")
    @Size(max=100)
    private String category;

}
