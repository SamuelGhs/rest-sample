package ro.samuel.pronto.service;

import org.springframework.stereotype.Service;
import ro.samuel.pronto.model.Pizza;
import ro.samuel.pronto.repository.PizzaRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;

    public PizzaService(PizzaRepository pizzaRepository) {
        this.pizzaRepository = pizzaRepository;
    }

    public Optional<Pizza> findById(Integer id) {
        return pizzaRepository.findById(id);
    }

    public List<Pizza> findAll() {
        return pizzaRepository.findAll();
    }
}
