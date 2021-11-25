package alten.alfredo.petclinicproject.controllers;

import alten.alfredo.petclinicproject.services.ProprietarioService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProprietariController {

    private final ProprietarioService proprietarioService;

    public ProprietariController(ProprietarioService proprietarioService) {
        this.proprietarioService = proprietarioService;
    }

    @RequestMapping({"/ownersIndex", "/ownersIndex.html"})
    public String proprietari(Model model){
        model.addAttribute("proprietari", proprietarioService.findAll());
        return "ownersIndex";
    }
}
