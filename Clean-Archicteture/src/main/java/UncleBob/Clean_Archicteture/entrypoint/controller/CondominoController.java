package UncleBob.Clean_Archicteture.entrypoint.controller;


import UncleBob.Clean_Archicteture.core.ports.CondominoRepository;
import UncleBob.Clean_Archicteture.domain.Condomino;
import UncleBob.Clean_Archicteture.entrypoint.adapter.CondominoAdapter;
import UncleBob.Clean_Archicteture.entrypoint.controller.dto.CondominoEntradaDto;
import UncleBob.Clean_Archicteture.entrypoint.controller.dto.CondominoSaidaDto;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/condominos")
public class CondominoController {

    @Autowired
    private CondominoRepository condominoRepository;

    private CondominoAdapter condominoEntrypointAdapter = CondominoAdapter.INSTANCE;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CondominoSaidaDto criarCondomino(@RequestBody @Valid CondominoEntradaDto dto)
        {
            Condomino condomino = condominoEntrypointAdapter.toDomain(dto);

            return condominoEntrypointAdapter.toSaidaDto(
                    condominoRepository.cadastrarCondomino(condomino)
                    );
        }
}
