package api.clinica.saude.profissional;

import api.clinica.saude.complementos.Endereco;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of ="idProfissional")
@Table(name = "Profissionais")
@Entity(name = "Profissional")
public class Profissional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonAlias("Id_Profissional")
    private Long idProfissional;
    private String nome;
    private String cns;
    private String cpf;
    private String cr;
    private String email;
    @Embedded
    private Endereco endereco;

    public Profissional(DadosCadastroProfissional dados) {
         this.nome = dados.nome();
         this.cns = dados.cns();
         this.cpf = dados.cpf();
         this.cr = dados.cr();
         this.email = dados.email();
         this.endereco = new Endereco(dados.endereco());

    }
}
