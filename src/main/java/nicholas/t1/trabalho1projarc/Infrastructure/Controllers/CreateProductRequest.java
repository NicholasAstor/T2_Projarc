package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

public class CreateProductRequest {
    private String description;
    private Double price;

    public CreateProductRequest(String description, Double price){
        this.description = description;
        this.price = price;
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

    
}
