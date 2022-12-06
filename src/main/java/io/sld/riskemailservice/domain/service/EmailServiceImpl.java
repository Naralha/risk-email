package io.sld.riskemailservice.domain.service;


import io.sld.riskemailservice.domain.entity.EmailDetails;
import io.sld.riskemailservice.resource.api.EmailSendGridApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

// Annotation
@Service
// Class
// Implementing EmailService interface
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private EmailSendGridApi emailSendGridApi;

    private String apiKey = "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";

    @Value("${spring.mail.username}") private String sender;

    // Method 1
    // To send a simple email
    public String sendSimpleMail(EmailDetails details)
    {

        // Try block to check for exceptions
        try {
            details.getPersonalizations().getTo().setEmail("vitorasr22@gmail.com");
            details.getPersonalizations().getTo().setName("vitor");
            details.getPersonalizations().setSubject("Hello World");
            details.getContent().setType("text/plain");
            details.getContent().setValue("Heya!");
            details.getFrom().setEmail("vitorasr22@gmail.com");
            details.getFrom().setName("vitor");
            details.getReply_to().setEmail("vitorasr22@gmail.com");
            details.getReply_to().setName("Vitor");

            // Creating a simple mail message
//            SimpleMailMessage mailMessage
//                    = new SimpleMailMessage();

            // Setting up necessary details
//            mailMessage.setFrom(sender);
//            mailMessage.setTo(details.getRecipient());
//            mailMessage.setText(details.getMsgBody());
//            mailMessage.setSubject(details.getSubject());

            // Sending the mail
//            javaMailSender.send(mailMessage);
//            return emailSendGridApi.sendMail(details, apiKey);
            return emailSendGridApi.sendMail(details);
//            return details;
        }

        // Catch block to handle the exceptions
        catch (Exception e) {
            e.printStackTrace();
            return "Error while Sending Mail";
        }

    }

    // Method 2
    // To send an email with attachment
    public String
    sendMailWithAttachment(EmailDetails details)
    {
//        // Creating a mime message
//        MimeMessage mimeMessage
//                = javaMailSender.createMimeMessage();
//        MimeMessageHelper mimeMessageHelper;
//
//        try {
//
//            // Setting multipart as true for attachments to
//            // be send
//            mimeMessageHelper
//                    = new MimeMessageHelper(mimeMessage, true);
//            mimeMessageHelper.setFrom(sender);
//            mimeMessageHelper.setTo(details.getRecipient());
//            mimeMessageHelper.setText(details.getMsgBody());
//            mimeMessageHelper.setSubject(
//                    details.getSubject());
//
//            // Adding the attachment
//            FileSystemResource file
//                    = new FileSystemResource(
//                    new File(details.getAttachment()));
//
//            mimeMessageHelper.addAttachment(
//                    file.getFilename(), file);
//
//            // Sending the mail
//            javaMailSender.send(mimeMessage);
//            return "Mail sent Successfully";
//        }
//
//        // Catch block to handle MessagingException
//        catch (MessagingException e) {
//
//            // Display message when exception occurred
            return "Error while sending mail!!!";
        }
//    }
}
