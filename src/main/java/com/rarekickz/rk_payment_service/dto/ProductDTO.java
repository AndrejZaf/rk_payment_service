package com.rarekickz.rk_payment_service.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductDTO {

    private Long id;
    private String name;
    private Double price;
}
