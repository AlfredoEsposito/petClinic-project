package alten.alfredo.petclinicproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VeterinariController {

    @RequestMapping({"/vetsIndex", "/vetsIndex.html"})
    public String veterinari(){
        return "vetsIndex";
    }
}
