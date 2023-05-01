package api.clinica.saude.profissional;

import api.clinica.saude.paciente.DadosListagemPaciente;
import api.clinica.saude.profissional.DadosCadastroProfissional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("profissionais")
public class ProfissionalController {

    @Autowired
    private ProfissionalRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroProfissional dados){
        repository.save(new Profissional(dados));
    }
    @GetMapping
    public Page<DadosListagemProfissional> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){
        return repository.findAll(paginacao).map(DadosListagemProfissional::new);
    }

}
