package com.example.inventorymanagementapplication.inventory.dto;


import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CategoryDto {
    private Long id;
    @NotBlank
    private String name;
}
