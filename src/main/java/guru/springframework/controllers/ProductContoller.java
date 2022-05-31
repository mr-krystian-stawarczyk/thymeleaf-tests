package guru.springframework.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class  ProductContoller {
    @RequestMapping("/product")
public String getProduct() {
    return "product";
}

    
}
