package esys.webapp.controllers;

import esys.webapp.db.Local;
import esys.webapp.db.LocalRepository;
import esys.webapp.utilities.UserChecker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class UserController {

    @Autowired
    private LocalRepository localRepository;
    @Autowired
    private UserChecker userChecker;

    @RequestMapping(value = "/user/")
    public String userView(Model model) throws Exception {

        if (!userChecker.isLoged())
            return "redirect:/";

        model.addAttribute("locals", localRepository.findByOwnerId(userChecker.getId()));
        model.addAttribute("newLocal", new Local());

        return "user";
    }

    @RequestMapping(value = "/user/addLocal/", method = RequestMethod.POST)
    public String userAddLocalView(Model model, @ModelAttribute("newLocal") Local l) throws Exception {

        if (!userChecker.isLoged())
            return "redirect:/";

        l.setOwnerId(userChecker.getId());
        localRepository.save(l);

        return "redirect:/user/";
    }

}
