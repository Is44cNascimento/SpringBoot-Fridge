package dev.java10x.fridge.model;


import jakarta.persistence.*;
import org.springframework.beans.factory.annotation.Value;

import java.time.LocalDate;

@Entity
@Table(name = "food_table")
public class Food {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;
    private String Name;
    private LocalDate expirationDate;
    private Integer quantity;


    public Food() {
    }

    public Food(long id, LocalDate expirationDate, String name, Integer quantity) {
        Id = id;
        this.expirationDate = expirationDate;
        Name = name;
        this.quantity = quantity;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
