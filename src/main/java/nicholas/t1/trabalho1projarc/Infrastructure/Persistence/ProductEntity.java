package nicholas.t1.trabalho1projarc.Infrastructure.Persistence;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.beans.factory.annotation.Value;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Products")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String description;
    private Double price;
    private String SKU;
    
    private Boolean isActive = true;
    
    @CreationTimestamp
    private Instant createdAt;


    public ProductEntity(){

    }

    public ProductEntity(String description, Double price, String SKU){
        this.description = description;
        this.price = price;
        this.SKU = SKU;
    }

    public ProductEntity(Long id, String description, Double price, String SKU, Instant createdAt, Boolean isActive){
        this.id = id;
        this.description = description;
        this.price = price;
        this.SKU = SKU;
        this.createdAt = createdAt;
        this.isActive = isActive;
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
