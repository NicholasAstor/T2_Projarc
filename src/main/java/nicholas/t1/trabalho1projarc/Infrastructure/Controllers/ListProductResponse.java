package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

import java.time.Instant;

public class ListProductResponse {
    private Long id;
    private String description;
    private Double price;
    private String SKU;
    private Boolean isActive;
    private Instant createdAt;
    
    public ListProductResponse(Long id, String description, Double price, String SKU, Boolean isActive, Instant createdAt){
        this.id = id;
        this.description = description;
        this.price = price;
        this.SKU = SKU;
        this.isActive = isActive;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getSKU() {
        return SKU;
    }

    public void setSKU(String sKU) {
        SKU = sKU;
    }

    public Boolean isActive() {
        return isActive;
    }

    public void setActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Instant createdAt) {
        this.createdAt = createdAt;
    }

    
}
