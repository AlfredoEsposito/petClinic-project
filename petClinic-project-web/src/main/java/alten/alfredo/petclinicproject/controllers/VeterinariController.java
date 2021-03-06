package alten.alfredo.petclinicproject.controllers;

import alten.alfredo.petclinicproject.services.VeterinarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/veterinari")
@Controller
public class VeterinariController {

    private final VeterinarioService veterinarioService;

    public VeterinariController(VeterinarioService veterinarioService) {
        this.veterinarioService = veterinarioService;
    }

    @RequestMapping({ "/vetsIndex", "/vetsIndex.html"})
    public String veterinari(Model model){
        model.addAttribute("veterinari", veterinarioService.findAll());
        return "veterinari/vetsIndex";
    }
}
