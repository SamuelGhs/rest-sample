package ro.samuel.pronto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.samuel.pronto.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {


}
