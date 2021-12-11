package br.edu.ifam.frametads.PrimeiroSpring.repository;
//SpringData

import br.edu.ifam.frametads.PrimeiroSpring.model.Cidade;
import br.edu.ifam.frametads.PrimeiroSpring.model.Pessoa;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CidadeRepository extends CrudRepository<Cidade, Integer> {

    @Query("select c from Cidade c")
    public List<Cidade> list();
}
