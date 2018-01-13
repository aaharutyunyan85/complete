package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

    @RequestMapping(value="/register", method= RequestMethod.GET)
    public String register() {
        return "register";
    }

    @RequestMapping(value="/reg", method= RequestMethod.POST)
    public String reg(@RequestParam("username") String username, @RequestParam("password") String password) {
        return "redirect:greeting";
    }
    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", required=false, defaultValue="World") String name,  Model model) {
        model.addAttribute("name", name);
        return "greeting";
    }

}
