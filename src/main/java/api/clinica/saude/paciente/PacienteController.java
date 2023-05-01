package api.clinica.saude.paciente;

import api.clinica.saude.paciente.DadosCadastrarPaciente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("pacientes")
public class PacienteController {

    private PacienteRepository repository;


    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastrarPaciente dados){
        repository.save(new Paciente(dados));
    }

    @GetMapping
    public Page<DadosListagemPaciente> listar(@PageableDefault(page = 0, size = 10, sort = {"nome"})Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemPaciente::new);
    }

}
