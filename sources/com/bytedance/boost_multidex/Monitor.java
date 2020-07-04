package com.bytedance.boost_multidex;

import android.os.Looper;
import android.os.MessageQueue.IdleHandler;
import android.os.SystemClock;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.lancet.p328b.C7110b;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.thread.C7265m;
import com.p280ss.android.ugc.aweme.thread.ThreadPoolType;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Monitor {
    private static Monitor sMonitor;
    private ScheduledExecutorService mExecutor = _lancet.m19539x62f20904(1);
    private String mProcessName;

    class _lancet {
        private _lancet() {
        }

        /* renamed from: com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool */
        static ScheduledExecutorService m19539x62f20904(int i) {
            return (ScheduledExecutorService) C7258h.m22724a(C7265m.m22758a(ThreadPoolType.SCHEDULED).mo18993a(i).mo18996a());
        }

        static void com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(String str) {
            long uptimeMillis = SystemClock.uptimeMillis();
            System.loadLibrary(str);
            C7110b.m22204a(uptimeMillis, str);
        }
    }

    static Monitor get() {
        return sMonitor;
    }

    static void init(Monitor monitor) {
        if (monitor == null) {
            monitor = new Monitor();
        }
        sMonitor = monitor;
    }

    /* access modifiers changed from: protected */
    public void doAfterInstall(final Runnable runnable) {
        Looper.myQueue().addIdleHandler(new IdleHandler() {
            public boolean queueIdle() {
                Monitor.this.getExecutor().schedule(runnable, DouPlusShareGuideExperiment.MIN_VALID_DURATION, TimeUnit.MILLISECONDS);
                return false;
            }
        });
    }

    /* access modifiers changed from: protected */
    public void doBeforeHandleOpt() {
        try {
            Thread.sleep(10000);
        } catch (InterruptedException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public ScheduledExecutorService getExecutor() {
        return this.mExecutor;
    }

    /* access modifiers changed from: protected */
    public String getProcessName() {
        return this.mProcessName;
    }

    /* access modifiers changed from: protected */
    public boolean isEnableNativeCheckSum() {
        return true;
    }

    /* access modifiers changed from: protected */
    public void loadLibrary(String str) {
        _lancet.com_ss_android_ugc_aweme_lancet_launch_LoadSoLancet_loadLibrary(str);
    }

    /* access modifiers changed from: protected */
    public void logDebug(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str) {
    }

    /* access modifiers changed from: protected */
    public void logError(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void logErrorAfterInstall(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void logInfo(String str) {
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str) {
    }

    /* access modifiers changed from: protected */
    public void logWarning(String str, Throwable th) {
    }

    /* access modifiers changed from: protected */
    public void reportAfterInstall(long j, long j2, long j3, String str) {
    }

    public Monitor setExecutor(ScheduledExecutorService scheduledExecutorService) {
        this.mExecutor = scheduledExecutorService;
        return this;
    }

    public Monitor setProcessName(String str) {
        this.mProcessName = str;
        return this;
    }
}
