package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

public class CreateProductResponse {
    private String description;
    private Double price;

    public CreateProductResponse(String description, Double price){
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
