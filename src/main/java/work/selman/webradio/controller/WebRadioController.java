package work.selman.webradio.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebRadioController {

    @GetMapping("/")
    public String index(Model model) {
        // Here you can pass data to your view
        return "index"; // This refers to the HTML template named index.html
    }
}
