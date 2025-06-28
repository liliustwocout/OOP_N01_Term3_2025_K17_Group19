package com.example.servingwebcontent.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AccountRepository extends JpaRepository<Account, Long> {
    Account findByUsername(String username);
    boolean existsByUsername(String username);
    void deleteByUsername(String username);
    
    // Tìm kiếm tài khoản theo tên đăng nhập
    @Query("SELECT a FROM Account a WHERE LOWER(a.username) LIKE LOWER(CONCAT('%', :searchTerm, '%'))")
    List<Account> findByUsernameContainingIgnoreCase(@Param("searchTerm") String searchTerm);
}