package com.example.turbofilterexample.runner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.Marker;
import org.slf4j.helpers.BasicMarker;
import org.slf4j.helpers.BasicMarkerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class LoggingRunner implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(LoggingRunner.class);

    @Override
    public void run(String... args) throws Exception {
        var sample = new BasicMarkerFactory().getMarker("sample");
        log.info(sample,"Starting........");
       log.info("--------------------------------sample logging");
    }
}
