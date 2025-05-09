package nicholas.t1.trabalho1projarc.Application.Usecases;

import nicholas.t1.trabalho1projarc.Application.Gateways.ProductGateway;
import nicholas.t1.trabalho1projarc.Domain.Entity.Product;

public class CreateProductInteractor {
    private final ProductGateway productGateway;

    public CreateProductInteractor(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public Product createProduct(Product product){
        return productGateway.createProduct(product);
    }
}
