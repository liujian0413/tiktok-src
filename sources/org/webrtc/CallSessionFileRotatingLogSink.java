package org.webrtc;

import org.webrtc.Logging.Severity;

public class CallSessionFileRotatingLogSink {
    private long nativeSink;

    private static native long nativeAddSink(String str, int i, int i2);

    private static native void nativeDeleteSink(long j);

    private static native byte[] nativeGetLogData(String str);

    public void dispose() {
        if (this.nativeSink != 0) {
            nativeDeleteSink(this.nativeSink);
            this.nativeSink = 0;
        }
    }

    public static byte[] getLogData(String str) {
        if (str != null) {
            return nativeGetLogData(str);
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }

    public CallSessionFileRotatingLogSink(String str, int i, Severity severity) {
        if (str != null) {
            this.nativeSink = nativeAddSink(str, i, severity.ordinal());
            return;
        }
        throw new IllegalArgumentException("dirPath may not be null.");
    }
}
