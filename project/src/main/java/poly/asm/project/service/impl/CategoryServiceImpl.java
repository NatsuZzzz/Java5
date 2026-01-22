package poly.asm.project.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import poly.asm.project.entity.Category;
import poly.asm.project.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Override
    public List<Category> findAll() {
        return List.of(
            new Category(1, "Áo"),
            new Category(2, "Quần"),
            new Category(3, "Giày")
        );
    }
}
