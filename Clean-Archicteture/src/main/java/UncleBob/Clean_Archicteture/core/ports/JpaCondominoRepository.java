package UncleBob.Clean_Archicteture.core.ports;

import UncleBob.Clean_Archicteture.domain.Condomino;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface JpaCondominoRepository extends JpaRepository<Condomino, Long> {

    Optional<Condomino> findById(Long id);

    Optional<Condomino> findByCpf(String cpf);

    Optional<Condomino> findByCelular(Long celular);

    Optional<Condomino> findByGmail(String gmail);
}
