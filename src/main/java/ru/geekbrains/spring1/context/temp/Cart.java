package ru.geekbrains.spring1.context.temp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.geekbrains.spring1.context.entities.Product;
import ru.geekbrains.spring1.context.services.ProductService;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Component
@Scope("prototype")
public class Cart {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    private List<Product> products;

    @PostConstruct
    public void init() {
        products = new ArrayList<>();
    }

    public void addProductById(Long id){
        products.add(productService.findById(id));
    }

    public void deleteProductByID(Long id){
        products.remove(productService.findById(id));
    }

    public List<Product> findAll(){
        return Collections.unmodifiableList(products);
    }

}
