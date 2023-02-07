package my.com.prasarana.SpringBootWalkTru.controller;

import my.com.prasarana.SpringBootWalkTru.dto.ProductDto;
import my.com.prasarana.SpringBootWalkTru.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/product")
    public void setProduct(@RequestBody ProductDto productDto) {
        productService.saveProduct(productDto);
    }

    @GetMapping("/products")
    public List<ProductDto> getAllProducts() {
        return productService.getProducts();
    }
}
