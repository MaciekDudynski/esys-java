package esys.webapp.controllers;

import esys.webapp.db.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LocalController {

    @Autowired
    private LocalRepository localRepository;

    @RequestMapping(value = "/local/{id}", method = RequestMethod.GET)
    public String localView(Model model, @PathVariable("id") Long localId) {

        /// todo
        // model.addAttribute("userLoged", userLoged);
        model.addAttribute("local", localRepository.findById(localId));

        return "local";
    }

}
