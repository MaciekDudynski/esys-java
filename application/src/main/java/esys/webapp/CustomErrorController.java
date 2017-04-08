package esys.webapp;

import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CustomErrorController implements ErrorController {

    @RequestMapping(value = "/error")
    public String errorView(Model model, HttpServletRequest request, HttpServletResponse response) {

        return "error";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
