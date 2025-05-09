package nicholas.t1.trabalho1projarc.Domain.Entity;

public class Product {
    private Long id;
    private String description;
    private Double price;

    public Product(){

    }

    public Product(String description, Double price){
        this.description = description;
        this.price = price;
    }

    public Product(Long id, String description, Double price) {
        this.id = id;
        this.description = description;
        this.price = price;
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
