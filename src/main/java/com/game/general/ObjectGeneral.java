package com.game.general;

public class ObjectGeneral {
    private int id;
    private String name;

    public ObjectGeneral(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "ObjectGeneral{" +
               "id=" + id +
               ", name='" + name + '\'' +
               '}';
    }
} 