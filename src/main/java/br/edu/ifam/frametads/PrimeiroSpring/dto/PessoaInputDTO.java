package br.edu.ifam.frametads.PrimeiroSpring.dto;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class PessoaInputDTO {

    private Integer id;
    private String nome;
    private String telefone;
    private String email;

    public Pessoa() {
    }

    public Pessoa(String nome, String telefone, String email) {
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
        }
}
