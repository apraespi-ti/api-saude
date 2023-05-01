package api.clinica.saude.complementos;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EstadoCivil {
    private Long id;
    private String estadoCivil;

    public EstadoCivil(DadosEstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil.estadoCivil();
    }
}
