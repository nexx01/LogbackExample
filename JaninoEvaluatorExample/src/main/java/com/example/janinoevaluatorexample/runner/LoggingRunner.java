package com.example.janinoevaluatorexample.runner;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class LoggingRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        log.info("Starting................................................................");
        log.info("================================================");
        log.info("================================================billing");
        log.info("Matcher");
        log.info("Ending................................................................");
    }
}
