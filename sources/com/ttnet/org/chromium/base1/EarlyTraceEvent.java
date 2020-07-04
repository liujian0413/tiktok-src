package com.ttnet.org.chromium.base1;

import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.SystemClock;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JNINamespace("base::android")
public class EarlyTraceEvent {
    static List<Event> sCompletedEvents;
    private static final Object sLock = new Object();
    static Map<String, Event> sPendingEvents;
    static volatile int sState = 0;

    static final class Event {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final long mBeginTimeMs = SystemClock.elapsedRealtime();
        long mEndTimeMs;
        final String mName;
        final int mThreadId = Process.myTid();

        static {
            Class<EarlyTraceEvent> cls = EarlyTraceEvent.class;
        }

        /* access modifiers changed from: 0000 */
        public final void end() {
            this.mEndTimeMs = SystemClock.elapsedRealtime();
        }

        Event(String str) {
            this.mName = str;
        }
    }

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i);

    static void disable() {
        synchronized (sLock) {
            if (sState == 1) {
                sState = 2;
                maybeFinishLocked();
            }
        }
    }

    static void enable() {
        synchronized (sLock) {
            if (sState == 0) {
                sCompletedEvents = new ArrayList();
                sPendingEvents = new HashMap();
                sState = 1;
            }
        }
    }

    private static void maybeFinishLocked() {
        if (sPendingEvents.isEmpty()) {
            sState = 3;
            dumpEvents(sCompletedEvents);
            sCompletedEvents = null;
            sPendingEvents = null;
        }
    }

    static void maybeEnable() {
        boolean z;
        ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!CommandLine.isInitialized() || !CommandLine.getInstance().hasSwitch("trace-startup")) {
                try {
                    z = new File("/data/local/chrome-trace-config.json").exists();
                } catch (SecurityException unused) {
                    z = false;
                }
            } else {
                z = true;
            }
            if (z) {
                enable();
            }
        } finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
        if (r4 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0027, code lost:
        throw new java.lang.IllegalArgumentException("Multiple pending trace events can't have the same name");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void begin(java.lang.String r4) {
        /*
            int r0 = sState
            r1 = 1
            if (r0 == r1) goto L_0x0006
            return
        L_0x0006:
            com.ttnet.org.chromium.base1.EarlyTraceEvent$Event r0 = new com.ttnet.org.chromium.base1.EarlyTraceEvent$Event
            r0.<init>(r4)
            java.lang.Object r2 = sLock
            monitor-enter(r2)
            int r3 = sState     // Catch:{ all -> 0x0028 }
            if (r3 == r1) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            return
        L_0x0014:
            java.util.Map<java.lang.String, com.ttnet.org.chromium.base1.EarlyTraceEvent$Event> r1 = sPendingEvents     // Catch:{ all -> 0x0028 }
            java.lang.Object r4 = r1.put(r4, r0)     // Catch:{ all -> 0x0028 }
            com.ttnet.org.chromium.base1.EarlyTraceEvent$Event r4 = (com.ttnet.org.chromium.base1.EarlyTraceEvent.Event) r4     // Catch:{ all -> 0x0028 }
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            if (r4 != 0) goto L_0x0020
            return
        L_0x0020:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Multiple pending trace events can't have the same name"
            r4.<init>(r0)
            throw r4
        L_0x0028:
            r4 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0028 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.EarlyTraceEvent.begin(java.lang.String):void");
    }

    private static void dumpEvents(List<Event> list) {
        long nativeGetTimeTicksNowUs = (TimeUtils.nativeGetTimeTicksNowUs() - (SystemClock.elapsedRealtime() * 1000)) / 1000;
        for (Event event : list) {
            nativeRecordEarlyEvent(event.mName, event.mBeginTimeMs + nativeGetTimeTicksNowUs, event.mEndTimeMs + nativeGetTimeTicksNowUs, event.mThreadId);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void end(java.lang.String r4) {
        /*
            int r0 = sState
            r1 = 1
            r2 = 2
            if (r0 == r1) goto L_0x0009
            if (r0 == r2) goto L_0x0009
            return
        L_0x0009:
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            int r3 = sState     // Catch:{ all -> 0x0033 }
            if (r3 == r1) goto L_0x0016
            int r1 = sState     // Catch:{ all -> 0x0033 }
            if (r1 == r2) goto L_0x0016
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0016:
            java.util.Map<java.lang.String, com.ttnet.org.chromium.base1.EarlyTraceEvent$Event> r1 = sPendingEvents     // Catch:{ all -> 0x0033 }
            java.lang.Object r4 = r1.remove(r4)     // Catch:{ all -> 0x0033 }
            com.ttnet.org.chromium.base1.EarlyTraceEvent$Event r4 = (com.ttnet.org.chromium.base1.EarlyTraceEvent.Event) r4     // Catch:{ all -> 0x0033 }
            if (r4 != 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0022:
            r4.end()     // Catch:{ all -> 0x0033 }
            java.util.List<com.ttnet.org.chromium.base1.EarlyTraceEvent$Event> r1 = sCompletedEvents     // Catch:{ all -> 0x0033 }
            r1.add(r4)     // Catch:{ all -> 0x0033 }
            int r4 = sState     // Catch:{ all -> 0x0033 }
            if (r4 != r2) goto L_0x0031
            maybeFinishLocked()     // Catch:{ all -> 0x0033 }
        L_0x0031:
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0033 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base1.EarlyTraceEvent.end(java.lang.String):void");
    }
}
