package com.rollbar;

import com.rollbar.payload.Payload;

/**
 * Created by chris on 12/16/15.
 */
public interface PayloadFilter {
    boolean shouldSend(Payload p, Throwable error, String message, Object... objects);
}
