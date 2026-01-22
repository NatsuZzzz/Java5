package poly.asm.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import poly.asm.project.entity.Product;
import poly.asm.project.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> findNewProducts() {
        return List.of(
            new Product(1, "Áo thun mới", 199.0),
            new Product(2, "Áo hoodie", 399.0)
        );
    }

    @Override
    public List<Product> findBestSeller() {
        return List.of(
            new Product(3, "Quần jean quốc dân", 499.0)
        );
    }

    @Override
    public List<Product> findSaleProducts() {
        return List.of(
            new Product(4, "Giày sale sốc", 299.0)
        );
    }
}
