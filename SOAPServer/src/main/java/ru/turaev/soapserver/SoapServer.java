package ru.turaev.soapserver;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@RequiredArgsConstructor
@SpringBootApplication
public class SoapServer {
    public static void main(String[] args) {
        SpringApplication.run(SoapServer.class, args);
    }
}
