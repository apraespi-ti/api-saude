package api.clinica.saude.profissional;

import api.clinica.saude.complementos.DadosEndereco;

public record DadosListagemProfissional(String nome, String cns,String cpf, String cr, String email)
{
    public DadosListagemProfissional(Profissional profissional) {
        this(profissional.getNome(), profissional.getCns(), profissional.getCpf(), profissional.getCr(), profissional.getEmail());
    }
}
