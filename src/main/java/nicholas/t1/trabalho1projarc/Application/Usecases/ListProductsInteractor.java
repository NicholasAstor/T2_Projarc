package nicholas.t1.trabalho1projarc.Application.Usecases;

import java.util.List;

import nicholas.t1.trabalho1projarc.Application.Gateways.ProductGateway;
import nicholas.t1.trabalho1projarc.Domain.Entity.Product;

public class ListProductsInteractor {
    private final ProductGateway productGateway;

    public ListProductsInteractor(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public List<Product> listProducts(){
        return productGateway.listProducts();
    }
}
