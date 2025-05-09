package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

import nicholas.t1.trabalho1projarc.Domain.Entity.Product;

public class ProductDTOMapper {
    CreateProductResponse toResponse(Product product){
        return new CreateProductResponse(product.getDescription(),product.getPrice());
    }

    public Product toProduct(CreateProductRequest request){
        return new Product(request.getDescription(), request.getPrice());
    }
}
