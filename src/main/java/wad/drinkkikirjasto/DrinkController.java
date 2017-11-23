package wad.drinkkikirjasto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DrinkController {

    @Autowired
    private DrinkRepository drinkRepository;

    @GetMapping("*")
    public String list(Model model) {
        model.addAttribute("drinks", drinkRepository.findAll());
        return "drinks";
    }
    
    @PostMapping("/")
    public String add(@RequestParam String name) {
        Drink drink = new Drink();
        drink.setName(name);
        drinkRepository.save(drink);
        
        return "redirect:/";
    }
}
