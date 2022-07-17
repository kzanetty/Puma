package br.com.coding.puma;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotBlank;

@RestController
public class TestController {

    @GetMapping("/test")
    ResponseEntity<String> test(@RequestParam @NotBlank String clientName) {
        var body = "my name is PUMA and yours is %s".formatted(clientName);
        return ResponseEntity.status(HttpStatus.OK).body(body);
    }
}
