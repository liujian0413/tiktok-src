package org.webrtc;

import org.webrtc.Logging.Severity;

public interface Loggable {
    void onLogMessage(String str, Severity severity, String str2);
}
