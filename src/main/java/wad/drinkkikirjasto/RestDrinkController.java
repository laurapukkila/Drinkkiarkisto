package wad.drinkkikirjasto;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestDrinkController {

    @Autowired
    private DrinkRepository drinkRepository;
    
    @GetMapping("/drinks")
    public List<Drink> list(Model model) {
        return drinkRepository.findAll();
    }
    
    @PostMapping("/drinks")
    public Drink add(@RequestBody Drink drink) {
        return drinkRepository.save(drink);
        
    }    
}
