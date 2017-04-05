package esys.webapp;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public MainController(Facebook fb, ConnectionRepository cr) {
        this.facebook = fb;
        this.connectionRepository = cr;
    }

    @RequestMapping(value = "/")
    public String  mainView(Model model) {

        Boolean userLoged = true;

        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            userLoged = false;
        }
        else {
            String [] fields = { "id", "email", "first_name", "last_name", "name" };
            model.addAttribute("facebookProfile", facebook.fetchObject("me", User.class, fields));
        }

        model.addAttribute("userLoged", userLoged);

        return "main";
    }

}
