package assignment12.session1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import java.util.Locale;

@Controller
public class MyController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(Locale locale, Model model){ 
        return "home";
    }

}