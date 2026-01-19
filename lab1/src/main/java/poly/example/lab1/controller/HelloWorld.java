package poly.example.lab1.controller;  
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;

@Controller
 
public class HelloWorld {
   @GetMapping("/index")
    public String index(Model model) {
        model.addAttribute("name", "Natsu");
        return "index";
    }
}
