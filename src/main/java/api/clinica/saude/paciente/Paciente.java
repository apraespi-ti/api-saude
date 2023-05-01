package api.clinica.saude.paciente;

import api.clinica.saude.complementos.*;
import com.fasterxml.jackson.annotation.JsonAlias;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "idPaciente")
@Table(name = "Pacientes", schema = "public")
@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonAlias("Prontuario")
    private Long idPaciente;
    private String nome;
    private LocalDate dataDeNascimento;
    private String cpf;
    private String rg;
    private String cns;
    @Embedded
    private EstadoCivil estadoCivil;
//    private grauDeInstrucao grauDeInstrucao;
//    private DadosSexo sexo;
//    private DadosRaca raca;
//    private DadosStatus status;
//    private DadosTelefone telefone;
    @Embedded
    private Endereco endereco;

    public Paciente(DadosCadastrarPaciente dados) {
        this.nome = dados.nome();
        this.dataDeNascimento = dados.dataDeNascimento();
        this.cpf = dados.cpf();
        this.rg = dados.rg();
        this.cns = dados.cns();
        this.estadoCivil = new EstadoCivil(dados.estadoCivil());
        this.endereco = new Endereco(dados.endereco());
//        private DadosGrauDeInstrucao grauDeInstrucao;
//        private DadosSexo sexo;
//        private DadosRaca raca;
//        private DadosStatus status;
//        private DadosTelefone telefone;
    }
}
