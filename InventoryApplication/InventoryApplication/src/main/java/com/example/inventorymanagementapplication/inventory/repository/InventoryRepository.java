package com.example.inventorymanagementapplication.inventory.repository;

import com.example.inventorymanagementapplication.inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    List<Inventory> findByQuantityLessThan(int threshold);
}
