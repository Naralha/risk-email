package io.sld.riskemailservice.domain.entity;

import java.io.Serializable;

import javax.validation.constraints.*;

import lombok.*;


/**
 * A EmailDetails.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor

// Class
public class EmailDetails {

    // Class data members
    private String recipient;
    private String msgBody;
    private String subject;
    private String attachment;
}

