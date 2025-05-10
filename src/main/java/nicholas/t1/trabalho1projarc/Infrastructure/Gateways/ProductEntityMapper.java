package nicholas.t1.trabalho1projarc.Infrastructure.Gateways;

import nicholas.t1.trabalho1projarc.Domain.Entity.Product;
import nicholas.t1.trabalho1projarc.Infrastructure.Persistence.ProductEntity;

public class ProductEntityMapper {
    ProductEntity toEntity(Product productDomainObj){
        return new ProductEntity(productDomainObj.getDescription(), productDomainObj.getPrice(), productDomainObj.getSKU());
    }

    Product toDomainObj(ProductEntity productEntity){
        return new Product(productEntity.getId(), productEntity.getDescription(), productEntity.getPrice(), productEntity.getSKU(), productEntity.getCreatedAt(), productEntity.isActive());
    }
}
