package com.example.servingwebcontent.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {
    // Có thể thêm các phương thức tìm kiếm nếu cần
    java.util.List<Player> findByAccount_Username(String username);
} 