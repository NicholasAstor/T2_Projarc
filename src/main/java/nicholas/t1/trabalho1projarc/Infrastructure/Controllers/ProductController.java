package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nicholas.t1.trabalho1projarc.Application.Usecases.CreateProductInteractor;
import nicholas.t1.trabalho1projarc.Domain.Entity.Product;

@RestController
@RequestMapping("products")
public class ProductController {
    private final CreateProductInteractor createProductInteractor;
    private final ProductDTOMapper productDTOMapper;

    public ProductController(CreateProductInteractor createProductInteractor, ProductDTOMapper productDTOMapper){
        this.createProductInteractor = createProductInteractor;

        this.productDTOMapper = productDTOMapper;
    }

    @PostMapping
    public CreateProductResponse createProduct(@RequestBody CreateProductRequest request){
        Product productBusinessObj = productDTOMapper.toProduct(request);
        Product product = createProductInteractor.createProduct(productBusinessObj);
        return productDTOMapper.toResponse(product);
    }
}
