package api.clinica.saude.paciente;

import api.clinica.saude.complementos.*;
import api.clinica.saude.complementos.DadosEndereco;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosCadastrarPaciente(
        @NotBlank
        String nome,
        @NotNull
        @Future
        @JsonFormat(pattern = "dd/MM/yyyy HH:mm")
        @JsonAlias("Data__Nascimento")
        LocalDate dataDeNascimento,
        @NotNull
        String cpf,
        String rg,
        String cns,
        DadosEstadoCivil estadoCivil,
        DadosEndereco endereco
//        DadosGrauDeInstrucao grauDeInstrucao,
//        DadosSexo sexo,
//        DadosRaca raca,

//        DadosStatus status,
//        DadosTelefone telefone
)
         {

         }
