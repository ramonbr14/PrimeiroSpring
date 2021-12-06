package br.edu.ifam.frametads.PrimeiroSpring.repository;
//SpringData

import java.util.List;
import br.edu.ifam.frametads.PrimeiroSpring.model.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Integer> {

    @Query("select p from Pessoa p")
    public List<Pessoa> list();
}
