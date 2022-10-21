package io.sld.riskemailservice.resource;

import io.sld.riskemailservice.domain.entity.EmailDetails;

import io.sld.riskemailservice.domain.service.EmailService;
import io.sld.riskemailservice.domain.service.EmailService1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * REST controller for managing {@link EmailDetails}.
 */
@RestController
public class EmailResource {

    @Autowired
    private EmailService emailService;

    // Sending a simple Email
    @PostMapping("/sendMail")
    public String sendMail(@RequestBody EmailDetails details){
        String status = emailService.sendSimpleMail(details);

        return status;
    }

    // Sending email with attachment
    @PostMapping("/sendMailWithAttachment")
    public String sendMailWithAttachment(@RequestBody EmailDetails details){
        String status  = emailService.sendMailWithAttachment(details);

        return status;
    }


}
