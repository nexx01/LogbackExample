package com.example.logbackexample.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LoggingRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
       log.info("Starting........");
       log.info("--------------------------------sample logging");
    }
}
