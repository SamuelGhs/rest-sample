package ro.samuel.restsample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ro.samuel.restsample.model.Pizza;

@Repository
public interface PizzaRepository extends JpaRepository<Pizza, Integer> {


}
