package br.edu.ifam.frametads.PrimeiroSpring.controller;

import br.edu.ifam.frametads.PrimeiroSpring.dto.PessoaInputDTO;
import br.edu.ifam.frametads.PrimeiroSpring.model.Pessoa;
import br.edu.ifam.frametads.PrimeiroSpring.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.PostRemove;
import java.util.List;

@Controller
public class PessoaController {

    @Autowired
    private PessoaRepository pessoaRepository;

    //http://localhost:8081/api/pessoa/popular

    @ResponseBody
    @GetMapping(value = "/api/pessoa/popular", produces = MediaType.APPLICATION_JSON_VALUE)
    public String PopularPessoa() {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Elsa");
        pessoa1.setEmail("Elsaarendele@gmail.com");
        pessoa1.setTelefone("1234-5678");

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("Anna");
        pessoa2.setEmail("ANNAarendele@gmail.com");
        pessoa2.setTelefone("5678-1234");

        pessoaRepository.save(pessoa1);
        pessoaRepository.save(pessoa2);

        return "Pessoas inseridas com Sucesso!";

    }
    //http://localhost:8081/api/pessoa/list
    @ResponseBody
    @GetMapping(value = "/api/pessoa/list", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Pessoa> list(){
        return pessoaRepository.list();
    }

    //http://localhost:8081/api/pessoa/list
    @PostMapping(value = "/api/pessoa/inserir",consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> create(@RequestBody PessoaInputDTO dto){
            Pessoa pessoa=dto.build(cidadeRepository);

            pessoaRepository.save(pessoa);

            return ResponseEntity.ok().build();


    }
}
