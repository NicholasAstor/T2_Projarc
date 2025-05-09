package nicholas.t1.trabalho1projarc.Main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import nicholas.t1.trabalho1projarc.Application.Gateways.ProductGateway;
import nicholas.t1.trabalho1projarc.Application.Usecases.CreateProductInteractor;
import nicholas.t1.trabalho1projarc.Application.Usecases.ListProductByIdInteractor;
import nicholas.t1.trabalho1projarc.Application.Usecases.ListProductsInteractor;
import nicholas.t1.trabalho1projarc.Infrastructure.Controllers.ProductDTOMapper;
import nicholas.t1.trabalho1projarc.Infrastructure.Gateways.ProductEntityMapper;
import nicholas.t1.trabalho1projarc.Infrastructure.Gateways.ProductRepositoryGateway;
import nicholas.t1.trabalho1projarc.Infrastructure.Persistence.ProductRepository;

@Configuration
public class ProductConfig {
    @Bean
    CreateProductInteractor createProductInteractor(ProductGateway productGateway){
        return new CreateProductInteractor(productGateway);
    }

    @Bean
    ListProductsInteractor listProductsInteractor(ProductGateway productGateway){
        return new ListProductsInteractor(productGateway);
    }

    @Bean
    ListProductByIdInteractor listProductByIdInteractor(ProductGateway productGateway){
        return new ListProductByIdInteractor(productGateway);
    }

    @Bean
    ProductGateway productGateway(ProductRepository productRepository, ProductEntityMapper productEntityMapper){
        return new ProductRepositoryGateway(productRepository, productEntityMapper);
    }

    @Bean
    ProductEntityMapper productEntityMapper(){
        return new ProductEntityMapper();
    }

    @Bean
    ProductDTOMapper productDTOMapper(){
        return new ProductDTOMapper();
    }
}
