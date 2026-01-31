package UncleBob.Clean_Archicteture.core.ports;

import UncleBob.Clean_Archicteture.domain.Condomino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface CondominoRepository {

    Condomino cadastrarCondomino(Condomino condomino);

    Condomino editarCondomino(Condomino condomino);

    void deletarCondomino(Long id);
}
