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
public class EmailDetails {

    // Class data members
    private Personalizations personalizations = new Personalizations();
    private Content content = new Content();
    private GenericEmailName from = new GenericEmailName();
    private GenericEmailName reply_to = new GenericEmailName();

    @Data
    public class Personalizations {
        private GenericEmailName to = new GenericEmailName();
        private String subject;
    }
    @Data
    public class GenericEmailName {
        private String email;
        private String name;
    }
    @Data
    public class Content {
        private String type;
        private String value;
    }
}


