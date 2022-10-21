package io.sld.riskemailservice.domain.service.dto;

import io.sld.riskemailservice.domain.entity.EmailDetails;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Objects;
import javax.validation.constraints.*;

/**
 * A DTO for the {@link EmailDetails} entity.
 */
@Getter
@Setter
@ToString(callSuper = true)
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class EmailDTO implements Serializable {

    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;

}
