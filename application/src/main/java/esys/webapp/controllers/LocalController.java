package esys.webapp.controllers;

import esys.webapp.db.Local;
import esys.webapp.db.LocalRepository;
import esys.webapp.utilities.UserChecker;
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
    @Autowired
    private UserChecker userChecker;

    /// todo editing local

    /// todo adding/deleting tables

    @RequestMapping(value = "/local/{id}/", method = RequestMethod.GET)
    public String localView(Model model, @PathVariable("id") Long localId) throws Exception {

        Local local = localRepository.findById(localId);

        boolean userHasPrivileges = userChecker.isLoged() && (userChecker.isAdmin() || (userChecker.getId().equals(local.getOwnerId())));

        model.addAttribute("userHasPrivileges", userHasPrivileges);
        model.addAttribute("local", local);

        return "local";
    }

    @RequestMapping(value = "/local/{id}/delete/", method = RequestMethod.POST)
    public String userAddLocalView(Model model, @PathVariable("id") Long localId) throws Exception {

        if (!userChecker.isLoged())
            return "redirect:/local/{id}/";

        Local local = localRepository.findById(localId);

        if (userChecker.isAdmin() || (userChecker.getId() == local.getOwnerId()))
        {
            localRepository.delete(localId);
        }

        return "redirect:/user/";
    }

}
