package nicholas.t1.trabalho1projarc.Infrastructure.Gateways;

import nicholas.t1.trabalho1projarc.Application.Gateways.ProductGateway;
import nicholas.t1.trabalho1projarc.Domain.Entity.Product;
import nicholas.t1.trabalho1projarc.Infrastructure.Persistence.ProductEntity;
import nicholas.t1.trabalho1projarc.Infrastructure.Persistence.ProductRepository;

public class ProductRepositoryGateway implements ProductGateway{
    private final ProductRepository productRepository;
    private final ProductEntityMapper productEntityMapper;

    public ProductRepositoryGateway(ProductRepository productRepository, ProductEntityMapper productEntityMapper){
        this.productRepository = productRepository;
        this.productEntityMapper = productEntityMapper;
    }

    @Override
    public Product createProduct(Product productDomainObj){
        ProductEntity productEntity = productEntityMapper.toEntity(productDomainObj);
        ProductEntity savedEntity = productRepository.save(productEntity);

        return productEntityMapper.toDomainObj(savedEntity);
    }
}
