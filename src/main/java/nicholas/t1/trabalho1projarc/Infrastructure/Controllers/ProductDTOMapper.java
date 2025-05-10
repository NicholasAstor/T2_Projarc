package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

import nicholas.t1.trabalho1projarc.Domain.Entity.Product;

public class ProductDTOMapper {
    CreateProductResponse toResponseCreate(Product product){
        return new CreateProductResponse(product.getDescription(),product.getPrice(), product.getSKU());
    }

    public Product toProduct(CreateProductRequest request){
        return new Product(request.getDescription(), request.getPrice(), request.getSKU());
    }

    ListProductResponse toResponseList(Product product){
        return new ListProductResponse(product.getId(),product.getDescription(),product.getPrice(), product.getSKU(),  product.isActive(), product.getCreatedAt());
    }
}
