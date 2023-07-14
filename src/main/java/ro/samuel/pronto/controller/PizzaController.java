package ro.samuel.pronto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import ro.samuel.pronto.model.Pizza;
import ro.samuel.pronto.service.PizzaService;

import java.util.List;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

    private final PizzaService pizzaService;

    public PizzaController(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }


    @GetMapping(value = "/{id}")
    public String findById(@PathVariable("id") Integer id, Model model) {
        Pizza pizza = pizzaService.findById(id).orElse(null);
        model.addAttribute("pizza", pizza);
        return "pizza";
    }

    @GetMapping
    public String getAll(Model model) {
        List<Pizza> pizzas = pizzaService.findAll();
        model.addAttribute("pizzas", pizzas);
        return "pizzas";
    }

}
