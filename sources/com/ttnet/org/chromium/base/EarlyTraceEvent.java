package com.ttnet.org.chromium.base;

import android.os.Build.VERSION;
import android.os.Process;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JNINamespace("base::android")
public class EarlyTraceEvent {
    static List<AsyncEvent> sAsyncEvents;
    private static boolean sCachedBackgroundStartupTracingFlag;
    static List<Event> sCompletedEvents;
    private static final Object sLock = new Object();
    static List<String> sPendingAsyncEvents;
    static Map<String, Event> sPendingEventByKey;
    static volatile int sState = 0;

    static final class AsyncEvent {
        final long mId;
        final boolean mIsStart;
        final String mName;
        final long mTimestampNanos = Event.elapsedRealtimeNanos();

        AsyncEvent(String str, long j, boolean z) {
            this.mName = str;
            this.mId = j;
            this.mIsStart = z;
        }
    }

    static final class Event {
        static final /* synthetic */ boolean $assertionsDisabled = false;
        final long mBeginThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        final long mBeginTimeNanos = elapsedRealtimeNanos();
        long mEndThreadTimeMillis;
        long mEndTimeNanos;
        final String mName;
        final int mThreadId = Process.myTid();

        static {
            Class<EarlyTraceEvent> cls = EarlyTraceEvent.class;
        }

        /* access modifiers changed from: 0000 */
        public final void end() {
            this.mEndTimeNanos = elapsedRealtimeNanos();
            this.mEndThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        }

        static long elapsedRealtimeNanos() {
            if (VERSION.SDK_INT >= 17) {
                return SystemClock.elapsedRealtimeNanos();
            }
            return SystemClock.elapsedRealtime() * 1000000;
        }

        Event(String str) {
            this.mName = str;
        }
    }

    public static boolean getBackgroundStartupTracingFlag() {
        return sCachedBackgroundStartupTracingFlag;
    }

    private static native void nativeRecordEarlyEvent(String str, long j, long j2, int i, long j3);

    private static native void nativeRecordEarlyFinishAsyncEvent(String str, long j, long j2);

    private static native void nativeRecordEarlyStartAsyncEvent(String str, long j, long j2);

    static boolean enabled() {
        if (sState == 1) {
            return true;
        }
        return false;
    }

    private static long getOffsetNanos() {
        return (TimeUtils.nativeGetTimeTicksNowUs() * 1000) - Event.elapsedRealtimeNanos();
    }

    static boolean isActive() {
        int i = sState;
        if (i == 1 || i == 2) {
            return true;
        }
        return false;
    }

    static void disable() {
        synchronized (sLock) {
            if (enabled()) {
                sState = 2;
                maybeFinishLocked();
            }
        }
    }

    static void resetForTesting() {
        synchronized (sLock) {
            sState = 0;
            sCompletedEvents = null;
            sPendingEventByKey = null;
            sAsyncEvents = null;
            sPendingAsyncEvents = null;
        }
    }

    static void enable() {
        synchronized (sLock) {
            if (sState == 0) {
                sCompletedEvents = new ArrayList();
                sPendingEventByKey = new HashMap();
                sAsyncEvents = new ArrayList();
                sPendingAsyncEvents = new ArrayList();
                sState = 1;
            }
        }
    }

    static void maybeEnable() {
        boolean z;
        ThreadUtils.assertOnUiThread();
        if (sState == 0) {
            ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
            try {
                if (CommandLine.getInstance().hasSwitch("trace-startup")) {
                    z = true;
                } else {
                    try {
                        z = new File("/data/local/chrome-trace-config.json").exists();
                    } catch (SecurityException unused) {
                        z = false;
                    }
                }
                if (ContextUtils.getAppSharedPreferences().getBoolean("bg_startup_tracing", false)) {
                    if (z) {
                        setBackgroundStartupTracingFlag(false);
                        sCachedBackgroundStartupTracingFlag = false;
                    } else {
                        sCachedBackgroundStartupTracingFlag = true;
                        z = true;
                    }
                }
                if (z) {
                    enable();
                }
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskReads);
            }
        }
    }

    private static void maybeFinishLocked() {
        if (!sCompletedEvents.isEmpty()) {
            dumpEvents(sCompletedEvents);
            sCompletedEvents.clear();
        }
        if (!sAsyncEvents.isEmpty()) {
            dumpAsyncEvents(sAsyncEvents);
            sAsyncEvents.clear();
        }
        if (sPendingEventByKey.isEmpty() && sPendingAsyncEvents.isEmpty()) {
            sState = 3;
            sPendingEventByKey = null;
            sCompletedEvents = null;
            sPendingAsyncEvents = null;
            sAsyncEvents = null;
        }
    }

    static String makeEventKeyForCurrentThread(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("@");
        sb.append(Process.myTid());
        return sb.toString();
    }

    static void setBackgroundStartupTracingFlag(boolean z) {
        ContextUtils.getAppSharedPreferences().edit().putBoolean("bg_startup_tracing", z).apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        if (r0 != null) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r1 = new java.lang.StringBuilder("Multiple pending trace events can't have the same name: ");
        r1.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        throw new java.lang.IllegalArgumentException(r1.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void begin(java.lang.String r4) {
        /*
            boolean r0 = enabled()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ttnet.org.chromium.base.EarlyTraceEvent$Event r0 = new com.ttnet.org.chromium.base.EarlyTraceEvent$Event
            r0.<init>(r4)
            java.lang.Object r1 = sLock
            monitor-enter(r1)
            boolean r2 = enabled()     // Catch:{ all -> 0x003b }
            if (r2 != 0) goto L_0x0017
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            return
        L_0x0017:
            java.util.Map<java.lang.String, com.ttnet.org.chromium.base.EarlyTraceEvent$Event> r2 = sPendingEventByKey     // Catch:{ all -> 0x003b }
            java.lang.String r3 = makeEventKeyForCurrentThread(r4)     // Catch:{ all -> 0x003b }
            java.lang.Object r0 = r2.put(r3, r0)     // Catch:{ all -> 0x003b }
            com.ttnet.org.chromium.base.EarlyTraceEvent$Event r0 = (com.ttnet.org.chromium.base.EarlyTraceEvent.Event) r0     // Catch:{ all -> 0x003b }
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            if (r0 != 0) goto L_0x0027
            return
        L_0x0027:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Multiple pending trace events can't have the same name: "
            r1.<init>(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L_0x003b:
            r4 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x003b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.EarlyTraceEvent.begin(java.lang.String):void");
    }

    private static void dumpAsyncEvents(List<AsyncEvent> list) {
        long offsetNanos = getOffsetNanos();
        for (AsyncEvent asyncEvent : list) {
            if (asyncEvent.mIsStart) {
                nativeRecordEarlyStartAsyncEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimestampNanos + offsetNanos);
            } else {
                nativeRecordEarlyFinishAsyncEvent(asyncEvent.mName, asyncEvent.mId, asyncEvent.mTimestampNanos + offsetNanos);
            }
        }
    }

    private static void dumpEvents(List<Event> list) {
        long offsetNanos = getOffsetNanos();
        for (Event event : list) {
            nativeRecordEarlyEvent(event.mName, event.mBeginTimeNanos + offsetNanos, event.mEndTimeNanos + offsetNanos, event.mThreadId, event.mEndThreadTimeMillis - event.mBeginThreadTimeMillis);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void end(java.lang.String r2) {
        /*
            boolean r0 = isActive()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            java.lang.Object r0 = sLock
            monitor-enter(r0)
            boolean r1 = isActive()     // Catch:{ all -> 0x0034 }
            if (r1 != 0) goto L_0x0012
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0012:
            java.util.Map<java.lang.String, com.ttnet.org.chromium.base.EarlyTraceEvent$Event> r1 = sPendingEventByKey     // Catch:{ all -> 0x0034 }
            java.lang.String r2 = makeEventKeyForCurrentThread(r2)     // Catch:{ all -> 0x0034 }
            java.lang.Object r2 = r1.remove(r2)     // Catch:{ all -> 0x0034 }
            com.ttnet.org.chromium.base.EarlyTraceEvent$Event r2 = (com.ttnet.org.chromium.base.EarlyTraceEvent.Event) r2     // Catch:{ all -> 0x0034 }
            if (r2 != 0) goto L_0x0022
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0022:
            r2.end()     // Catch:{ all -> 0x0034 }
            java.util.List<com.ttnet.org.chromium.base.EarlyTraceEvent$Event> r1 = sCompletedEvents     // Catch:{ all -> 0x0034 }
            r1.add(r2)     // Catch:{ all -> 0x0034 }
            int r2 = sState     // Catch:{ all -> 0x0034 }
            r1 = 2
            if (r2 != r1) goto L_0x0032
            maybeFinishLocked()     // Catch:{ all -> 0x0034 }
        L_0x0032:
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            return
        L_0x0034:
            r2 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0034 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.EarlyTraceEvent.end(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0030, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void finishAsync(java.lang.String r2, long r3) {
        /*
            boolean r0 = isActive()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ttnet.org.chromium.base.EarlyTraceEvent$AsyncEvent r0 = new com.ttnet.org.chromium.base.EarlyTraceEvent$AsyncEvent
            r1 = 0
            r0.<init>(r2, r3, r1)
            java.lang.Object r3 = sLock
            monitor-enter(r3)
            boolean r4 = isActive()     // Catch:{ all -> 0x0031 }
            if (r4 != 0) goto L_0x0018
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0018:
            java.util.List<java.lang.String> r4 = sPendingAsyncEvents     // Catch:{ all -> 0x0031 }
            boolean r2 = r4.remove(r2)     // Catch:{ all -> 0x0031 }
            if (r2 != 0) goto L_0x0022
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0022:
            java.util.List<com.ttnet.org.chromium.base.EarlyTraceEvent$AsyncEvent> r2 = sAsyncEvents     // Catch:{ all -> 0x0031 }
            r2.add(r0)     // Catch:{ all -> 0x0031 }
            int r2 = sState     // Catch:{ all -> 0x0031 }
            r4 = 2
            if (r2 != r4) goto L_0x002f
            maybeFinishLocked()     // Catch:{ all -> 0x0031 }
        L_0x002f:
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r2 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0031 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ttnet.org.chromium.base.EarlyTraceEvent.finishAsync(java.lang.String, long):void");
    }

    public static void startAsync(String str, long j) {
        if (enabled()) {
            AsyncEvent asyncEvent = new AsyncEvent(str, j, true);
            synchronized (sLock) {
                if (enabled()) {
                    sAsyncEvents.add(asyncEvent);
                    sPendingAsyncEvents.add(str);
                }
            }
        }
    }
}
