package nicholas.t1.trabalho1projarc.Domain.Entity;

import java.time.Instant;

public class Product {
    private Long id;
    private String description;
    private String SKU;
    private Double price;
    private Instant createdAt;
    private Boolean isActive;

    public Product(){

    }

    public Product(String description, Double price, String SKU){
        this.description = description;
        this.price = price;
        this.SKU = SKU;
    }

    public Product(Long id, String description, Double price, String SKU, Instant createdAt, Boolean isActive){
        this.id = id;
        this.description = description;
        this.price = price;
        this.SKU = SKU;
        this.createdAt = createdAt;
        this.isActive = isActive;
    }

    public String getSKU() {
        return SKU;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Boolean isActive() {
        return isActive;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }
}
