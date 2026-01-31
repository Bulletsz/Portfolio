package UncleBob.Clean_Archicteture.entrypoint.adapter;

import UncleBob.Clean_Archicteture.domain.Condomino;
import UncleBob.Clean_Archicteture.entrypoint.controller.dto.CondominoEntradaDto;
import UncleBob.Clean_Archicteture.entrypoint.controller.dto.CondominoSaidaDto;
import org.hibernate.metamodel.model.domain.MapPersistentAttribute;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.mapstruct.Mapping;

import java.lang.annotation.Target;

@Mapper
public interface CondominoAdapter {
    CondominoAdapter INSTANCE = Mappers.getMapper(CondominoAdapter.class);

    @Mapping(target = "dddCelular", source = "dddCelular")
    @Mapping(target = "numCelular", source = "celular")
    @Mapping(target = "nome", source = "nome")
    @Mapping(target = "cpf", source = "cpf")
    @Mapping(target = "gmail", source = "gmail")
    Condomino toDomain(CondominoEntradaDto dto);
    CondominoSaidaDto toSaidaDto(Condomino condomino);
}
