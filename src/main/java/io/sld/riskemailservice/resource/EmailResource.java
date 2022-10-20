package io.sld.riskemailservice.resource;

import io.sld.riskemailservice.domain.entity.Email;

import io.sld.riskemailservice.domain.service.EmailService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing {@link Email}.
 */
@RestController
@RequestMapping("/api")
public class EmailResource {

    private final Logger log = LoggerFactory.getLogger(EmailResource.class);

    private static final String ENTITY_NAME = "riskcomplianceserviceEmpresa";

    @Value("${spring.application.name}")
    private String applicationName;

    private final EmailService emailService;

    public EmailResource(EmailService emailService) {
        this.emailService = emailService;
    }


    /**
     * {@code GET  /empresas/:id} : get the "id" empresa.
     *
     * @param id the id of the empresaDTO to retrieve.
     * @return the {@link ResponseEntity} with status {@code 200 (OK)} and with body the empresaDTO, or with status {@code 404 (Not Found)}.
     */
//    @GetMapping("/empresas/{id}")
//    public ResponseEntity<EmailDTO> getEmpresa(@PathVariable Long id) {
//        log.debug("REST request to get Email : {}", id);
//        Optional<EmailDTO> empresaDTO = empresaService.findOne(id);
//        return ResponseUtil.wrapOrNotFound(empresaDTO);
//    }


}
