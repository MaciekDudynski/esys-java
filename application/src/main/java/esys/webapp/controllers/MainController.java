package esys.webapp.controllers;

import esys.webapp.db.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private LocalRepository localRepository;

    @RequestMapping(value = "/")
    public String mainView(Model model) {

        model.addAttribute("locals", localRepository.findAll());

        return "main";
    }

}
