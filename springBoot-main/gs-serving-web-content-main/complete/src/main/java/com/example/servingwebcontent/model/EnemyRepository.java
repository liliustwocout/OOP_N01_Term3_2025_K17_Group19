package com.example.servingwebcontent.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EnemyRepository extends JpaRepository<Enemy, Long> {
    // Tìm kiếm quái vật theo tên
    @Query("SELECT e FROM Enemy e WHERE LOWER(e.name) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Enemy> findByNameContainingIgnoreCase(@Param("searchTerm") String searchTerm);
} 