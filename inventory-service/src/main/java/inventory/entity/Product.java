package inventory.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Data                           // Lombok: generates getters, setters, toString, equals
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    @NotBlank(message = "Product name is required")
    private String name;

    @Column(nullable = false, length = 500)
    @NotBlank(message = "Description is required")
    private String description;

    @Column(nullable = false)
    @Nullable
    @DecimalMin(value = "0.0")
    private BigDecimal price;

    @Column(nullable = false)
    @Min(value = 0, message = "Stock is required")
    private Integer stock;

    @Column(nullable = false, length = 100)
    private String category;

    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at")
    private LocalDateTime updatedAt;

    @PrePersist
    private void onCreate() {
        createdAt = LocalDateTime.now();
        updatedAt = LocalDateTime.now();
    }

    @PreUpdate
    private void OnUpdate() {
        updatedAt = LocalDateTime.now();
    }

}