package se.myola.web;

import org.slf4j.Logger
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
@RestController
class Web {
    private static final Logger LOG = LoggerFactory.getLogger(Web.class);
    
    @RequestMapping("/")
    String home() {
        [id: UUID.randomUUID().toString(), content: 'Hello World']
    }

    static void main(String[] args) {
        SpringApplication.run Web, args;
    }
}