package br.com.coding.puma.service;

import br.com.coding.puma.entities.Content;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    JavaMailSender javaMailSender;

    public void sendEmail(Content obj) {
        SimpleMailMessage smm = new SimpleMailMessage();
        smm.setFrom("pumadeploy@gmail.com");
        smm.setTo("hzanettik12@gmail.com");
        smm.setText(obj.getMessage());
        smm.setSubject(obj.getSubject());
        javaMailSender.send(smm);
    }
}
