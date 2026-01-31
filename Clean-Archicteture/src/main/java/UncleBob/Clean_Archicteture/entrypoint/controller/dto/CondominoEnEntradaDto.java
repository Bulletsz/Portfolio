package UncleBob.Clean_Archicteture.entrypoint.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CondominoEnEntradaDto {

        private String name;
        private Long zoneCode;
        private Long phone;
        private String email;
        private String cpf;
    }
