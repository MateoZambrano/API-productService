package com.DS3.productService.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "productService")
@Builder
public class ProductService {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is requested")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Description is requested")
    @Column(nullable = false)
    private String description;

    @NotNull(message = "Price is requested")
    @Column(nullable = false)
    private BigDecimal price;

    @NotNull(message = "Stock is requested")
    @Column(nullable = false)
    private Integer stock;
}
