package com.ttnet.org.chromium.net1;

import java.util.concurrent.RejectedExecutionException;

public final class InlineExecutionProhibitedException extends RejectedExecutionException {
    public InlineExecutionProhibitedException() {
        super("Inline execution is prohibited for this request");
    }
}
