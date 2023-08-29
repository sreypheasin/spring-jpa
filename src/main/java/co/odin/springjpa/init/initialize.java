package co.odin.springjpa.init;

import co.odin.springjpa.entity.Category;
import co.odin.springjpa.entity.Product;
import co.odin.springjpa.repository.CategoryRepository;
import co.odin.springjpa.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class initialize {
    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    @PostConstruct
    void init(){
        Product product1 = Product.builder()
                .uuid(UUID.randomUUID().toString())
                .name("Coca")
                .description("Energy Drink")
                .price(BigDecimal.valueOf(2))
                .build();
        Product product2 = Product.builder()
                .uuid(UUID.randomUUID().toString())
                .name("String")
                .description("Energy Drink")
                .price(BigDecimal.valueOf(3))
                .build();
        Product product3 = Product.builder()
                .uuid(UUID.randomUUID().toString())
                .name("Water")
                .description("Energy Drink")
                .price(BigDecimal.valueOf(4))
                .build();

        Category category = Category.builder()
                .name("drink")
                .build();

        productRepository.saveAll(List.of(product1,product2,product3));
        categoryRepository.saveAll(List.of(category));

    }

}
