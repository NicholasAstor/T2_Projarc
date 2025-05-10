package nicholas.t1.trabalho1projarc.Infrastructure.Controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import nicholas.t1.trabalho1projarc.Application.Usecases.CreateProductInteractor;
import nicholas.t1.trabalho1projarc.Application.Usecases.ListProductByIdInteractor;
import nicholas.t1.trabalho1projarc.Application.Usecases.ListProductsInteractor;
import nicholas.t1.trabalho1projarc.Domain.Entity.Product;


@RestController
@RequestMapping("products")
public class ProductController {
    private final CreateProductInteractor createProductInteractor;
    private final ListProductsInteractor listProductsInteractor;
    private final ListProductByIdInteractor listProductByIdInteractor;
    private final ProductDTOMapper productDTOMapper;

    public ProductController(CreateProductInteractor createProductInteractor, ProductDTOMapper productDTOMapper, ListProductsInteractor listProductsInteractor, ListProductByIdInteractor listProductByIdInteractor){
        this.createProductInteractor = createProductInteractor;
        this.listProductsInteractor = listProductsInteractor;
        this.productDTOMapper = productDTOMapper;
        this.listProductByIdInteractor = listProductByIdInteractor;
    }

    @PostMapping
    public CreateProductResponse createProduct(@RequestBody CreateProductRequest request){
        Product productBusinessObj = productDTOMapper.toProduct(request);
        Product product = createProductInteractor.createProduct(productBusinessObj);
        return productDTOMapper.toResponseCreate(product);
    }

    @GetMapping
    public List<ListProductResponse> listProducts(){
        List<Product> products = listProductsInteractor.listProducts();
        
        return products.stream().map(productDTOMapper::toResponseList).toList();
    }

    @GetMapping("/{id}")
    public ListProductResponse listProductById(@PathVariable Long id) {
        Product product = listProductByIdInteractor.listProductById(id);

        return productDTOMapper.toResponseList(product);
    }
    
}
