package wad.drinkkikirjasto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DrinkController {

    @Autowired
    private DrinkRepository drinkRepository;

    @GetMapping("*")
    public String list(Model model) {
        model.addAttribute("drinks", drinkRepository.findAll());
        System.out.println(":|");
        return "drinks";
    }
}
