package UncleBob.Clean_Archicteture.entrypoint.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CondominoEntradaDto {

    private Long dddCelular, celular;
    private String nome, cpf, gmail, nomeMae, nomePai;
    private LocalDateTime horaRetorno;
}
