package org.webrtc;

import java.util.IdentityHashMap;
import org.webrtc.Logging.Severity;

public class LoggingExtend extends Logging {
    private static final IdentityHashMap<LogSink, Long> sinks = new IdentityHashMap<>();

    private static native void nativeAddSink(int i, long j);

    private static native void nativeFreeSink(long j);

    private static native void nativeRemoveSink(long j);

    private static native long nativeWrapSink(LogSink logSink);

    public static void dispose() {
        for (Long longValue : sinks.values()) {
            long longValue2 = longValue.longValue();
            nativeRemoveSink(longValue2);
            nativeFreeSink(longValue2);
        }
        sinks.clear();
    }

    public static void removeSink(LogSink logSink) {
        Long l = (Long) sinks.remove(logSink);
        if (l != null) {
            nativeRemoveSink(l.longValue());
            nativeFreeSink(l.longValue());
        }
    }

    public static void addSink(Severity severity, LogSink logSink) {
        long nativeWrapSink = nativeWrapSink(logSink);
        sinks.put(logSink, Long.valueOf(nativeWrapSink));
        nativeAddSink(severity.ordinal(), nativeWrapSink);
    }
}
