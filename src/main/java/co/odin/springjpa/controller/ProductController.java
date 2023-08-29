package co.odin.springjpa.controller;

import co.odin.springjpa.entity.Product;
import co.odin.springjpa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/v1/products")
public class ProductController {
    private final ProductRepository productRepository;
    @GetMapping
    public List<Product> findAll(){
        List<Product> products = productRepository.findAll();
        return products;
    }

    @GetMapping("/{id}")
    public Product findById(@PathVariable Long id){
        var product = productRepository.findById(id).orElseThrow(()-> new ResponseStatusException(HttpStatus.NOT_FOUND,String.format("Product with id %d not found",id)));
        return product;
    }
}
