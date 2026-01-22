package poly.asm.project.service;

import java.util.List;
import poly.asm.project.entity.Product;

public interface ProductService {
    List<Product> findNewProducts();
    List<Product> findBestSeller();
    List<Product> findSaleProducts();
}
