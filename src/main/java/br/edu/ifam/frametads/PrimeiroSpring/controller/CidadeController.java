package br.edu.ifam.frametads.PrimeiroSpring.controller;

import br.edu.ifam.frametads.PrimeiroSpring.model.Cidade;
import org.apache.tomcat.util.http.parser.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.awt.*;

@Controller
public class CidadeController {
    @ResponseBody
    @GetMapping(value="/api/cidade/popular",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public String PopularCidade(){
        Cidade cidade1 =  new Cidade();
        cidade1.setNome("Manaus");
        Cidade cidade2 =  new Cidade();
        cidade1.setNome("Florianopolis");

        cidadeRepository.save(cidade1);
        cidadeRepository.save(cidade2);

        return "Cidades inseridas com sucesso";
    }

}
