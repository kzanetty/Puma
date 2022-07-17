package br.com.coding.puma.controller;

import br.com.coding.puma.entities.Content;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {

    @PostMapping("/emails")
    ResponseEntity<Void> sendEmail(@RequestBody Content obj) {
        Content content = obj;
        return ResponseEntity.status(201).body(null);
    }
}
