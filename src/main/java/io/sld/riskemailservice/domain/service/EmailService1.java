package io.sld.riskemailservice.domain.service;

import io.sld.riskemailservice.domain.entity.EmailDetails;


import io.sld.riskemailservice.domain.service.mapper.EmailMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Service Implementation for managing {@link EmailDetails}.
 */
@Service
public class EmailService1 {

    private final Logger log = LoggerFactory.getLogger(EmailService1.class);

    private final EmailMapper emailMapper;

    public EmailService1(EmailMapper emailMapper) {
        this.emailMapper = emailMapper;
    }


    /**
     * Get one empresa by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
//    @Transactional(readOnly = true)
//    public Optional<EmailDTO> findOne(Long id) {
//        log.debug("Request to get EmailDetails : {}", id);
//        return empresaRepository.findById(id).map(emailMapper::toDto);
//    }



}
