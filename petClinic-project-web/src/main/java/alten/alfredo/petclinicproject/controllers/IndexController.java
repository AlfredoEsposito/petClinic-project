package alten.alfredo.petclinicproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping({"", "/","index", "index.html"}) //quando arriva una request tutti questi parametri sono matchabili con questo request mapping
    public String index(){
        return "index";
    }
}
