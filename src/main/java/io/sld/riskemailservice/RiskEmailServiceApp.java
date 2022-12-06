package io.sld.riskemailservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;


@SpringBootApplication
@EnableFeignClients
public class RiskEmailServiceApp {

    public static void main(String[] args) {
        SpringApplication.run(RiskEmailServiceApp.class, args);
    }

    @Bean
    public JavaMailSender javaMailSender() {
        return new JavaMailSenderImpl();
    }
}
