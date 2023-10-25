package br.com.fiap.domain.entity.transportavel;

import br.com.fiap.infra.security.entity.PessoaFisica;
import jakarta.persistence.*;



public class Passageiro extends Transportavel {

      private PessoaFisica pessoa;

    public Passageiro() {
        super(null, "PASSAGEIRO");
    }

    public Passageiro(Long id, PessoaFisica pessoa) {
        super(id, "PASSAGEIRO");
        this.pessoa = pessoa;
    }

    public PessoaFisica getPessoa() {
        return pessoa;
    }

    public Passageiro setPessoa(PessoaFisica pessoa) {
        this.pessoa = pessoa;
        return this;
    }

    @Override
    public String toString() {
        return "Passageiro{" +
                "pessoa=" + pessoa +
                "} " + super.toString();
    }
}
