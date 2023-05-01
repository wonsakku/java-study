package com.example.designpattern.observer.code;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Slf4j
@Component
@RequiredArgsConstructor
public class StatusEmailSender implements StatusSender{

    private final JavaMailSender javaMailSender;


    @Override
    public void info(ObserverStatus status) {

        final MimeMessage message = javaMailSender.createMimeMessage();

        try {
            final MimeMessageHelper messageHelper = new MimeMessageHelper(message, true, "UTF-8");

            String target = "test@email.com";
            String subject = "test_subject";
            String content = "<h1>" + status + "</h1>";

            messageHelper.setTo(target);
            messageHelper.setSubject(subject);
            messageHelper.setText(content, true);

            log.info("send To : {}" , target);
            log.info("subject : {}" , subject);
            log.info("content : {}" , content);

//            javaMailSender.send(message);
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }

    }
}
