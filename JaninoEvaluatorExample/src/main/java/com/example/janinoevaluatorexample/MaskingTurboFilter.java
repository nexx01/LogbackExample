package com.example.janinoevaluatorexample;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.core.spi.FilterReply;
import org.slf4j.Marker;

public class MaskingTurboFilter extends TurboFilter {

    @Override
    public FilterReply decide(Marker marker,
                              Logger logger,
                              Level level,
                              String format,
                              Object[] params, Throwable t) {
//        if (event.getLevel().equals(Level.INFO)) {
//            String message = event.getMessage();
//            if (message.contains("password")) {
//                event.setMessage(maskPassword(message));
//            }
//        }
        return FilterReply.NEUTRAL;
    }
}
