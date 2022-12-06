package io.sld.riskemailservice.email;

import com.sendgrid.*;
import org.springframework.beans.factory.annotation.Value;

import java.io.IOException;

public class Example {
    private static String apiKey = "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";

    public static void main(String[] args) throws IOException {
        Email from = new Email("riskemailtests@gmail.com");
        String subject = "Sending with SendGrid is Fun";
        Email to = new Email("riskemailtests@gmail.com");
        Content content = new Content("text/plain", "and easy to do anywhere, even with Java");
        Mail mail = new Mail(from, subject, to, content);

        SendGrid sg = new SendGrid(apiKey);
        Request request = new Request();
        try {
            request.setMethod(Method.POST);
            request.setEndpoint("mail/send");
            request.setBody(mail.build());
            Response response = sg.api(request);
            System.out.println(response.getStatusCode());
            System.out.println(response.getBody());
            System.out.println(response.getHeaders());
        } catch (IOException ex) {
            throw ex;
        }
    }
}
