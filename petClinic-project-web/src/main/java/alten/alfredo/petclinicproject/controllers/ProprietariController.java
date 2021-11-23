package alten.alfredo.petclinicproject.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProprietariController {

    @RequestMapping({"/ownersIndex", "/ownersIndex.html"})
    public String proprietari(){
        return "ownersIndex";
    }
}
