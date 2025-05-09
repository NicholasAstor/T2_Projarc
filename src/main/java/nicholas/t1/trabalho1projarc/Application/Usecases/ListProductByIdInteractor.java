package nicholas.t1.trabalho1projarc.Application.Usecases;

import nicholas.t1.trabalho1projarc.Application.Gateways.ProductGateway;
import nicholas.t1.trabalho1projarc.Domain.Entity.Product;

public class ListProductByIdInteractor {
    private final ProductGateway productGateway;

    public ListProductByIdInteractor(ProductGateway productGateway){
        this.productGateway = productGateway;
    }

    public Product listProductById(Long id){
        return productGateway.listProductById(id);
    }
}
