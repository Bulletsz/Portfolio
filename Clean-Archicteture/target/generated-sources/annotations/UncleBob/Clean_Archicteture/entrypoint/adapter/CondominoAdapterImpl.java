package UncleBob.Clean_Archicteture.entrypoint.adapter;

import UncleBob.Clean_Archicteture.domain.Condomino;
import UncleBob.Clean_Archicteture.entrypoint.controller.dto.CondominoEntradaDto;
import UncleBob.Clean_Archicteture.entrypoint.controller.dto.CondominoSaidaDto;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2026-01-31T19:51:27-0300",
    comments = "version: 1.6.3, compiler: javac, environment: Java 24 (Oracle Corporation)"
)
public class CondominoAdapterImpl implements CondominoAdapter {

    @Override
    public Condomino toDomain(CondominoEntradaDto dto) {
        if ( dto == null ) {
            return null;
        }

        Condomino condomino = new Condomino();

        condomino.setDddCelular( dto.getDddCelular() );
        condomino.setNumCelular( dto.getCelular() );
        condomino.setNome( dto.getNome() );
        condomino.setCpf( dto.getCpf() );
        condomino.setGmail( dto.getGmail() );

        return condomino;
    }

    @Override
    public CondominoSaidaDto toSaidaDto(Condomino condomino) {
        if ( condomino == null ) {
            return null;
        }

        CondominoSaidaDto condominoSaidaDto = new CondominoSaidaDto();

        condominoSaidaDto.setDddCelular( condomino.getDddCelular() );
        condominoSaidaDto.setCpf( condomino.getCpf() );
        condominoSaidaDto.setGmail( condomino.getGmail() );

        return condominoSaidaDto;
    }
}
