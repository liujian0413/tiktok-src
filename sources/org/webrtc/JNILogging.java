package org.webrtc;

import org.webrtc.Logging.Severity;

class JNILogging {
    private final Loggable loggable;

    public JNILogging(Loggable loggable2) {
        this.loggable = loggable2;
    }

    public void logToInjectable(String str, Integer num, String str2) {
        this.loggable.onLogMessage(str, Severity.values()[num.intValue()], str2);
    }
}
