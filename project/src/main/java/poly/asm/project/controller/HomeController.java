package poly.asm.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import poly.asm.project.service.CategoryService;
import poly.asm.project.service.ProductService;

@Controller
public class HomeController {

    @Autowired
    ProductService productService;

    @Autowired
    CategoryService categoryService;

    @GetMapping("/home/index")
    public String index(Model model) {

        model.addAttribute("categories", categoryService.findAll());

        model.addAttribute("newProducts", productService.findNewProducts());

        model.addAttribute("bestSeller", productService.findBestSeller());

        model.addAttribute("saleProducts", productService.findSaleProducts());

        return "home/index";
    }
}
