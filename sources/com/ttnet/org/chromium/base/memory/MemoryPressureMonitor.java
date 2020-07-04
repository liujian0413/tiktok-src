package com.ttnet.org.chromium.base.memory;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.ttnet.org.chromium.base.ContextUtils;
import com.ttnet.org.chromium.base.Supplier;
import com.ttnet.org.chromium.base.ThreadUtils;
import com.ttnet.org.chromium.base.metrics.CachedMetrics.Count1MHistogramSample;
import java.util.concurrent.TimeUnit;

public class MemoryPressureMonitor {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final MemoryPressureMonitor INSTANCE = new MemoryPressureMonitor(60000);
    private static final Count1MHistogramSample sGetMyMemoryStateFailedTime = new Count1MHistogramSample("Android.MemoryPressureMonitor.GetMyMemoryState.Failed.Time");
    private static final Count1MHistogramSample sGetMyMemoryStateSucceededTime = new Count1MHistogramSample("Android.MemoryPressureMonitor.GetMyMemoryState.Succeeded.Time");
    private Supplier<Integer> mCurrentPressureSupplier = MemoryPressureMonitor$$Lambda$0.$instance;
    private boolean mIsInsideThrottlingInterval;
    private int mLastReportedPressure;
    private boolean mPollingEnabled;
    private MemoryPressureCallback mReportingCallback = MemoryPressureMonitor$$Lambda$1.$instance;
    private Integer mThrottledPressure;
    private final int mThrottlingIntervalMs;
    private final Runnable mThrottlingIntervalTask = new MemoryPressureMonitor$$Lambda$2(this);

    public int getLastReportedPressure() {
        ThreadUtils.assertOnUiThread();
        return this.mLastReportedPressure;
    }

    private void startThrottlingInterval() {
        ThreadUtils.postOnUiThreadDelayed(this.mThrottlingIntervalTask, (long) this.mThrottlingIntervalMs);
        this.mIsInsideThrottlingInterval = true;
    }

    public void disablePolling() {
        ThreadUtils.assertOnUiThread();
        if (this.mPollingEnabled) {
            this.mPollingEnabled = false;
        }
    }

    public void registerComponentCallbacks() {
        ThreadUtils.assertOnUiThread();
        ContextUtils.getApplicationContext().registerComponentCallbacks(new ComponentCallbacks2() {
            public void onConfigurationChanged(Configuration configuration) {
            }

            public void onLowMemory() {
                MemoryPressureMonitor.this.notifyPressure(2);
            }

            public void onTrimMemory(int i) {
                Integer memoryPressureFromTrimLevel = MemoryPressureMonitor.memoryPressureFromTrimLevel(i);
                if (memoryPressureFromTrimLevel != null) {
                    MemoryPressureMonitor.this.notifyPressure(memoryPressureFromTrimLevel.intValue());
                }
            }
        });
    }

    private static long elapsedRealtimeNanos() {
        if (VERSION.SDK_INT >= 17) {
            return SystemClock.elapsedRealtimeNanos();
        }
        return SystemClock.elapsedRealtime() * 1000000;
    }

    /* access modifiers changed from: private */
    public static Integer getCurrentMemoryPressure() {
        long elapsedRealtimeNanos = elapsedRealtimeNanos();
        try {
            RunningAppProcessInfo runningAppProcessInfo = new RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            recordRealtimeNanosDuration(sGetMyMemoryStateSucceededTime, elapsedRealtimeNanos);
            return memoryPressureFromTrimLevel(runningAppProcessInfo.lastTrimLevel);
        } catch (Exception unused) {
            recordRealtimeNanosDuration(sGetMyMemoryStateFailedTime, elapsedRealtimeNanos);
            return null;
        }
    }

    private void reportCurrentPressure() {
        Integer num = (Integer) this.mCurrentPressureSupplier.get();
        if (num != null) {
            reportPressure(num.intValue());
        }
    }

    public void enablePolling() {
        ThreadUtils.assertOnUiThread();
        if (!this.mPollingEnabled) {
            this.mPollingEnabled = true;
            if (!this.mIsInsideThrottlingInterval) {
                reportCurrentPressure();
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: onThrottlingIntervalFinished */
    public void bridge$lambda$1$MemoryPressureMonitor() {
        this.mIsInsideThrottlingInterval = false;
        if (this.mThrottledPressure == null || this.mLastReportedPressure == this.mThrottledPressure.intValue()) {
            if (this.mPollingEnabled && this.mLastReportedPressure == 2) {
                reportCurrentPressure();
            }
            return;
        }
        int intValue = this.mThrottledPressure.intValue();
        this.mThrottledPressure = null;
        reportPressure(intValue);
    }

    public void setCurrentPressureSupplierForTesting(Supplier<Integer> supplier) {
        this.mCurrentPressureSupplier = supplier;
    }

    public void setReportingCallbackForTesting(MemoryPressureCallback memoryPressureCallback) {
        this.mReportingCallback = memoryPressureCallback;
    }

    private void reportPressure(int i) {
        startThrottlingInterval();
        this.mLastReportedPressure = i;
        this.mReportingCallback.onPressure(i);
    }

    protected MemoryPressureMonitor(int i) {
        this.mThrottlingIntervalMs = i;
    }

    public static Integer memoryPressureFromTrimLevel(int i) {
        if (i >= 80 || i == 15) {
            return Integer.valueOf(2);
        }
        if (i >= 40) {
            return Integer.valueOf(1);
        }
        return null;
    }

    public void notifyPressure(int i) {
        ThreadUtils.assertOnUiThread();
        if (this.mIsInsideThrottlingInterval) {
            this.mThrottledPressure = Integer.valueOf(i);
        } else {
            reportPressure(i);
        }
    }

    private static void recordRealtimeNanosDuration(Count1MHistogramSample count1MHistogramSample, long j) {
        count1MHistogramSample.record((int) Math.min(TimeUnit.NANOSECONDS.toMicros(elapsedRealtimeNanos() - j), 2147483647L));
    }
}
