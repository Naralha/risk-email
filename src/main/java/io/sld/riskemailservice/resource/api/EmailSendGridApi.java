package io.sld.riskemailservice.resource.api;

import feign.Headers;
import feign.Param;
import io.sld.riskemailservice.domain.entity.EmailDetails;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "jplaceholder", url = "https://api.sendgrid.com/v3/")
public interface EmailSendGridApi {

    @RequestMapping(method = RequestMethod.POST)
    @Headers({"Authorization: Bearer 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", "Content-Type: application/json"})
//    String sendMail(@RequestBody EmailDetails email, @Param("apiKey") String apiKey);
    String sendMail(@RequestBody EmailDetails email);

}
