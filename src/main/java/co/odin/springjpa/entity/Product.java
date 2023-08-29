package co.odin.springjpa.entity;

import jakarta.persistence.*;
import lombok.*;
import java.math.BigDecimal;

@Entity
@Table(name = "products")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Product {

    @jakarta.persistence.Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true, nullable = false)
    private String uuid;
    @Column(name = "pro_name", nullable = false)
    private String name;
    @Column(columnDefinition = "text")
    private String description;
    private BigDecimal price;
}
