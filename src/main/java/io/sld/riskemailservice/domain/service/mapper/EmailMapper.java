package io.sld.riskemailservice.domain.service.mapper;

import io.sld.riskemailservice.domain.entity.Email;
import io.sld.riskemailservice.domain.service.dto.EmailDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link Email} and its DTO {@link EmailDTO}.
 */
@Mapper(componentModel = "spring")
public interface EmailMapper extends EntityMapper<EmailDTO, Email> {

    @Mapping(target = "nVarNome", source = "NVarNome")
    @Mapping(target = "nVarDescricao", source = "NVarDescricao")
    EmailDTO toDto(Email s);
}
