package ro.samuel.restsample.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ro.samuel.restsample.model.Pizza;
import ro.samuel.restsample.repository.PizzaRepository;

import java.util.List;

@RestController
@RequestMapping("/pizzas")
public class PizzaController {

    private final PizzaRepository pizzaRepository;

    public PizzaController(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    @GetMapping(value = "/{id}")
    public Pizza findById(@PathVariable("id") Integer id) {
        return pizzaRepository.findById(id).orElse(null);
    }

    @PostMapping
    public Pizza save(@RequestBody Pizza pizza) {
        return pizzaRepository.save(pizza);
    }

    @GetMapping
    public List<Pizza> getAll() {
        return pizzaRepository.findAll();
    }

    @DeleteMapping(value = "/{id}")
    public void deletePizzaById(@PathVariable("id") Integer id) {
        pizzaRepository.deleteById(id);
    }
}
