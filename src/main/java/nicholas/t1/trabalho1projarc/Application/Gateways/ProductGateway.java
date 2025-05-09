package nicholas.t1.trabalho1projarc.Application.Gateways;

import java.util.List;

import nicholas.t1.trabalho1projarc.Domain.Entity.Product;

public interface ProductGateway {
    Product createProduct(Product product);
    List<Product> listProducts();
    Product listProductById(Long id);
} 
