package esys.webapp;

import esys.webapp.db.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @Autowired
    private Facebook facebook;
    @Autowired
    private ConnectionRepository connectionRepository;
    @Autowired
    private LocalRepository localRepository;

    @RequestMapping(value = "/")
    public String mainView(Model model) {

        boolean userLoged = true;

        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            userLoged = false;
        }
        else {
            String [] fields = { "id", "email", "first_name", "last_name", "name" };
            model.addAttribute("facebookProfile", facebook.fetchObject("me", User.class, fields));
        }

        model.addAttribute("userLoged", userLoged);
        model.addAttribute("locals", localRepository.findAll());

        return "main";
    }

}
