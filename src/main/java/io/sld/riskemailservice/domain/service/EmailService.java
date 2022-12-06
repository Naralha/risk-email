package io.sld.riskemailservice.domain.service;

import io.sld.riskemailservice.domain.entity.EmailDetails;

public interface EmailService {
    // Method
    // To send a simple email
//    String sendSimpleMail(EmailDetails details);
    String sendSimpleMail(EmailDetails details);

    // Method
    // To send an email with attachment
    String sendMailWithAttachment(EmailDetails details);
}
