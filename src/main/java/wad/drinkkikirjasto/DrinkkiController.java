package wad.drinkkikirjasto;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DrinkkiController {

    @GetMapping("*")
    @ResponseBody
    public String home() {
        return "Koti! x 2";
    }
}
