package inventory.service;

import inventory.dto.ProductRequest;
import inventory.dto.ProductResponse;
import inventory.entity.Product;
import inventory.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class InventoryService {

    private ProductRepository productRepository;

    public ProductResponse createProduct(ProductRequest request) {

        Product product = Product.builder()
                .name(request.getName())
                .description(request.getDescription())
                .price(request.getPrice())
                .stock(request.getStock())
                .category(request.getCategory())
                .build();

        Product saved = productRepository.save(product);
        return toResponse(saved);
    }

//Helper method
    private ProductResponse toResponse(Product p) {
        return ProductResponse.builder()
                .id(p.getId())
                .name(p.getName())
                .description(p.getDescription())
                .price(p.getPrice())
                .stock(p.getStock())
                .category(p.getCategory())
                .createdAt(p.getCreatedAt())
                .updatedAt(p.getUpdatedAt())
                .inStock(p.getStock() > 0)
                .build();
    }
}
