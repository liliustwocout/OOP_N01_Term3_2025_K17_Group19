package com.example.servingwebcontent.model;

import jakarta.persistence.*;

@Entity
@Table(name = "enemies")
public class Enemy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private int level;

    private int damage;

    // getters/setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }
    public int getDamage() { return damage; }
    public void setDamage(int damage) { this.damage = damage; }
} 