package io.sld.riskemailservice.property;

import lombok.Getter;
import lombok.Setter;

/**
 * Stores application.yml 'application.logging' properties
 */
@Getter
@Setter
public class LoggingProperties {

    private boolean useJsonFormat = false;

}