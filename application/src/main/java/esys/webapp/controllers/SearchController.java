package esys.webapp.controllers;

import esys.webapp.db.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SearchController {

    @Autowired
    private LocalRepository localRepository;

    @RequestMapping(value = "/search/", method = RequestMethod.GET)
    public String emptySearchView(Model model) {

        String defaultSearchText = "Wrocław";

        model.addAttribute("searchingText", defaultSearchText);
        model.addAttribute("localsByName", localRepository.findByName(defaultSearchText));
        model.addAttribute("localsByCity", localRepository.findByCity(defaultSearchText));

        return "search";
    }

    @RequestMapping(value = "/search/", method = RequestMethod.POST)
    public String searchView(Model model, @RequestParam("text") String searchingText) {

        model.addAttribute("searchingText", searchingText);
        model.addAttribute("localsByName", localRepository.findByName(searchingText));
        model.addAttribute("localsByCity", localRepository.findByCity(searchingText));

        return "search";
    }

}
