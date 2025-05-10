package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

public class CreateProductResponse {
    private String description;
    private Double price;
    private String SKU;

    public CreateProductResponse(String description, Double price, String SKU) {
        this.description = description;
        this.price = price;
        this.SKU = SKU;
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

    public void setSKU(String SKU) {
        this.SKU = SKU;
    }
}
