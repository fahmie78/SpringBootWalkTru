package my.com.prasarana.SpringBootWalkTru.service;

import my.com.prasarana.SpringBootWalkTru.dao.Product;
import my.com.prasarana.SpringBootWalkTru.dto.ProductDto;
import my.com.prasarana.SpringBootWalkTru.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public ProductService(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    public void saveProduct(ProductDto productDto) {
        productRepository.save(modelMapper.map(productDto, Product.class));
    }

    public List<ProductDto> getProducts() {
        List<ProductDto> productDtos = new ArrayList<>();
        productRepository.findAll().iterator().forEachRemaining(product
                -> productDtos.add(modelMapper
                .map(product,ProductDto.class)));
        return productDtos;
    }
}
