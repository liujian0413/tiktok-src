package com.ttnet.org.chromium.base1;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import android.util.Printer;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;

@JNINamespace("base::android")
public class TraceEvent {
    private static volatile boolean sATraceEnabled;
    public static volatile boolean sEnabled;

    static class BasicLooperMonitor implements Printer {
        static final /* synthetic */ boolean $assertionsDisabled = false;

        static {
            Class<TraceEvent> cls = TraceEvent.class;
        }

        private BasicLooperMonitor() {
        }

        /* access modifiers changed from: 0000 */
        public void beginHandling(String str) {
            if (TraceEvent.sEnabled) {
                TraceEvent.nativeBeginToplevel();
            }
        }

        /* access modifiers changed from: 0000 */
        public void endHandling(String str) {
            if (TraceEvent.sEnabled) {
                TraceEvent.nativeEndToplevel();
            }
        }

        public void println(String str) {
            if (str.startsWith(">")) {
                beginHandling(str);
            } else {
                endHandling(str);
            }
        }
    }

    static final class IdleTracingLooperMonitor extends BasicLooperMonitor implements IdleHandler {
        private boolean mIdleMonitorAttached;
        private long mLastIdleStartedAt;
        private long mLastWorkStartedAt;
        private int mNumIdlesSeen;
        private int mNumTasksSeen;
        private int mNumTasksSinceLastIdle;

        private IdleTracingLooperMonitor() {
            super();
        }

        private final void syncIdleMonitoring() {
            if (!TraceEvent.sEnabled || this.mIdleMonitorAttached) {
                if (this.mIdleMonitorAttached && !TraceEvent.sEnabled) {
                    Looper.myQueue().removeIdleHandler(this);
                    this.mIdleMonitorAttached = false;
                }
                return;
            }
            this.mLastIdleStartedAt = SystemClock.elapsedRealtime();
            Looper.myQueue().addIdleHandler(this);
            this.mIdleMonitorAttached = true;
        }

        public final boolean queueIdle() {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (this.mLastIdleStartedAt == 0) {
                this.mLastIdleStartedAt = elapsedRealtime;
            }
            long j = elapsedRealtime - this.mLastIdleStartedAt;
            this.mNumIdlesSeen++;
            StringBuilder sb = new StringBuilder();
            sb.append(this.mNumTasksSinceLastIdle);
            sb.append(" tasks since last idle.");
            TraceEvent.begin("Looper.queueIdle", sb.toString());
            if (j > 48) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.mNumTasksSeen);
                sb2.append(" tasks and ");
                sb2.append(this.mNumIdlesSeen);
                sb2.append(" idles processed so far, ");
                sb2.append(this.mNumTasksSinceLastIdle);
                sb2.append(" tasks bursted and ");
                sb2.append(j);
                sb2.append("ms elapsed since last idle");
                traceAndLog(3, sb2.toString());
            }
            this.mLastIdleStartedAt = elapsedRealtime;
            this.mNumTasksSinceLastIdle = 0;
            return true;
        }

        /* access modifiers changed from: 0000 */
        public final void beginHandling(String str) {
            if (this.mNumTasksSinceLastIdle == 0) {
                TraceEvent.end("Looper.queueIdle");
            }
            this.mLastWorkStartedAt = SystemClock.elapsedRealtime();
            syncIdleMonitoring();
            super.beginHandling(str);
        }

        /* access modifiers changed from: 0000 */
        public final void endHandling(String str) {
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.mLastWorkStartedAt;
            if (elapsedRealtime > 16) {
                StringBuilder sb = new StringBuilder("observed a task that took ");
                sb.append(elapsedRealtime);
                sb.append("ms: ");
                sb.append(str);
                traceAndLog(5, sb.toString());
            }
            super.endHandling(str);
            syncIdleMonitoring();
            this.mNumTasksSeen++;
            this.mNumTasksSinceLastIdle++;
        }

        private static void traceAndLog(int i, String str) {
            TraceEvent.instant("TraceEvent.LooperMonitor:IdleStats", str);
        }
    }

    static final class LooperMonitorHolder {
        public static final BasicLooperMonitor sInstance;

        private LooperMonitorHolder() {
        }

        static {
            BasicLooperMonitor basicLooperMonitor;
            if (CommandLine.getInstance().hasSwitch("enable-idle-tracing")) {
                basicLooperMonitor = new IdleTracingLooperMonitor();
            } else {
                basicLooperMonitor = new BasicLooperMonitor();
            }
            sInstance = basicLooperMonitor;
        }
    }

    public static boolean enabled() {
        return sEnabled;
    }

    public static void maybeEnableEarlyTracing() {
        EarlyTraceEvent.maybeEnable();
    }

    private static native void nativeBegin(String str, String str2);

    public static native void nativeBeginToplevel();

    private static native void nativeEnd(String str, String str2);

    public static native void nativeEndToplevel();

    private static native void nativeFinishAsync(String str, long j);

    private static native void nativeInstant(String str, String str2);

    private static native void nativeRegisterEnabledObserver();

    private static native void nativeStartATrace();

    private static native void nativeStartAsync(String str, long j);

    private static native void nativeStopATrace();

    public static void registerNativeEnabledObserver() {
        nativeRegisterEnabledObserver();
    }

    public static void begin(String str) {
        begin(str, null);
    }

    public static void end(String str) {
        end(str, null);
    }

    public static void instant(String str) {
        if (sEnabled) {
            nativeInstant(str, null);
        }
    }

    public static void setATraceEnabled(boolean z) {
        if (sATraceEnabled != z) {
            sATraceEnabled = z;
            if (z) {
                nativeStartATrace();
            } else {
                nativeStopATrace();
            }
        }
    }

    public static void setEnabled(boolean z) {
        BasicLooperMonitor basicLooperMonitor;
        if (z) {
            EarlyTraceEvent.disable();
        }
        if (sEnabled != z) {
            sEnabled = z;
            if (!sATraceEnabled) {
                Looper uiThreadLooper = ThreadUtils.getUiThreadLooper();
                if (z) {
                    basicLooperMonitor = LooperMonitorHolder.sInstance;
                } else {
                    basicLooperMonitor = null;
                }
                uiThreadLooper.setMessageLogging(basicLooperMonitor);
            }
        }
    }

    public static void finishAsync(String str, long j) {
        if (sEnabled) {
            nativeFinishAsync(str, j);
        }
    }

    public static void instant(String str, String str2) {
        if (sEnabled) {
            nativeInstant(str, str2);
        }
    }

    public static void startAsync(String str, long j) {
        if (sEnabled) {
            nativeStartAsync(str, j);
        }
    }

    public static void begin(String str, String str2) {
        EarlyTraceEvent.begin(str);
        if (sEnabled) {
            nativeBegin(str, str2);
        }
    }

    public static void end(String str, String str2) {
        EarlyTraceEvent.end(str);
        if (sEnabled) {
            nativeEnd(str, str2);
        }
    }
}