package co.odin.springjpa.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categorys")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
}
