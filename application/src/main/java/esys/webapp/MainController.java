package esys.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String  mainView(Model model, @RequestParam(value="name", defaultValue="someone") String name) {
        model.addAttribute("title", "Test");
        model.addAttribute("name", name);
        return "main";
    }
}
