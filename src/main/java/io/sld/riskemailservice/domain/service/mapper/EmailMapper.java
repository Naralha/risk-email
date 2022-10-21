package io.sld.riskemailservice.domain.service.mapper;

import io.sld.riskemailservice.domain.entity.EmailDetails;
import io.sld.riskemailservice.domain.service.dto.EmailDTO;
import org.mapstruct.*;

/**
 * Mapper for the entity {@link EmailDetails} and its DTO {@link EmailDTO}.
 */
@Mapper(componentModel = "spring")
public interface EmailMapper extends EntityMapper<EmailDTO, EmailDetails> {

    EmailDTO toDto(EmailDetails s);
}
