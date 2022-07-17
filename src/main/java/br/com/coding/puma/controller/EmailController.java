package br.com.coding.puma.controller;

import br.com.coding.puma.entities.Content;
import br.com.coding.puma.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @Autowired
    EmailService emailService;

    @PostMapping("/emails")
    ResponseEntity<Void> sendEmail(@RequestBody Content obj) {
        emailService.sendEmail(obj);
        return ResponseEntity.status(201).body(null);
    }



}
