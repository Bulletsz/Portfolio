package UncleBob.Clean_Archicteture.core.ports;

import UncleBob.Clean_Archicteture.core.exception.BusinessException;
import UncleBob.Clean_Archicteture.core.exception.NotFoundException;
import UncleBob.Clean_Archicteture.domain.Condomino;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class CondominoRepositoryImpl implements CondominoRepository {

    @Autowired
    private JpaCondominoRepository repository;

    @Override
    public Condomino cadastrarCondomino(final Condomino novoCondomino) {

        if (repository.findByGmail(novoCondomino.getGmail()).isPresent()) {
            throw new BusinessException("E-mail já cadastrado");
        }

        if (repository.findByCpf(novoCondomino.getCpf()).isPresent()) {
            throw new BusinessException("CPF já cadastrado");
        }

        if (repository.findByCelular(novoCondomino.getNumCelular()).isPresent()) {
            throw new BusinessException("Número já cadastrado");
        }

        return repository.save(novoCondomino);
    }

    @Override
    public Condomino editarCondomino(final Condomino condominoEditado) {

        Optional<Condomino> idCadastro = repository.findById(condominoEditado.getId());

        if (idCadastro.isEmpty()) {
            throw new NotFoundException("Nenhum condomino foi encontrado");
        }

        Optional<Condomino> gmailCadastrado = repository.findByGmail(condominoEditado.getGmail());
        if (gmailCadastrado.isPresent() && !gmailCadastrado.get().getId().equals(condominoEditado.getId())) {
            throw new BusinessException("E-mail já cadastrado");
        }

        Optional<Condomino> celularCadastrado = repository.findByCelular(condominoEditado.getNumCelular());
        if (celularCadastrado.isPresent() && !celularCadastrado.get().getId().equals(condominoEditado.getId())) {
            throw new BusinessException("Número de celular já cadastrado");
        }

        Optional<Condomino> cpfCadastrado = repository.findByCpf(condominoEditado.getCpf());
        if (cpfCadastrado.isPresent() && !cpfCadastrado.get().getId().equals(condominoEditado.getId())) {
            throw new BusinessException("CPF já cadastrado");
        }

        return repository.save(condominoEditado);
    }

    @Override
    public void deletarCondomino(final Long id) {
        Optional<Condomino> idDeletar = repository.findById(id);

        if (idDeletar.isEmpty()) {
            throw new NotFoundException("Nenhum condomino foi encontrado");
        }
        repository.deleteById(id);
    }
}