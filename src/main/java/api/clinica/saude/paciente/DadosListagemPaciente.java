package api.clinica.saude.paciente;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record DadosListagemPaciente(String nome, LocalDate dataDeNascimento, String cpf ) {
    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getDataDeNascimento(), paciente.getCpf());
    }
}
