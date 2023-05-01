package api.clinica.saude.profissional;

import api.clinica.saude.complementos.DadosEndereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroProfissional(
        @NotBlank
        String nome,
        String cns,
        @Pattern(regexp = "\\d{11}")
        String cpf,
        @Pattern(regexp = "\\d{4,6}")
        String cr,
        @NotBlank
        @Email
        String email,
        @NotNull
        @Valid
        DadosEndereco endereco ) {
}
