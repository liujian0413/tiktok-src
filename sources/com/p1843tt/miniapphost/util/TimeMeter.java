package com.p1843tt.miniapphost.util;

import android.os.SystemClock;
import com.p1843tt.miniapphost.AppBrandLogger;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.tt.miniapphost.util.TimeMeter */
public class TimeMeter {
    private AtomicLong mLeftPoint = new AtomicLong(-1);
    private AtomicLong mLength = new AtomicLong(0);
    private volatile long mStartPoint = this.mLeftPoint.get();

    public static long currentMillis() {
        return SystemClock.uptimeMillis();
    }

    public static TimeMeter newAndStart() {
        return newAndStart(currentMillis());
    }

    public long start() {
        return start(currentMillis());
    }

    public long getMillisAfterStart() {
        if (this.mStartPoint == -1) {
            return 0;
        }
        return currentMillis() - this.mStartPoint;
    }

    public boolean isRunning() {
        if (-1 == this.mLeftPoint.addAndGet(0) || 0 != this.mLength.addAndGet(0)) {
            return false;
        }
        return true;
    }

    public long stop() {
        long j;
        long j2 = this.mLeftPoint.get();
        if (-1 != j2) {
            j = currentMillis() - j2;
        } else {
            j = 0;
        }
        if (this.mLength.compareAndSet(0, j)) {
            this.mLeftPoint.set(-1);
            StringBuilder sb = new StringBuilder("stop: success ");
            sb.append(this.mLength);
            AppBrandLogger.m146382d("TimeMeter", sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("stop: fail ");
            sb2.append(this.mLength);
            AppBrandLogger.m146382d("TimeMeter", sb2.toString());
        }
        return this.mLength.get();
    }

    public static long nowDiff(long j) {
        return currentMillis() - j;
    }

    public static long nowAfterStart(TimeMeter timeMeter) {
        if (timeMeter == null) {
            return 0;
        }
        return timeMeter.getMillisAfterStart();
    }

    public static long stop(TimeMeter timeMeter) {
        if (timeMeter == null) {
            return 0;
        }
        return timeMeter.stop();
    }

    public static TimeMeter newAndStart(long j) {
        TimeMeter timeMeter = new TimeMeter();
        timeMeter.start(j);
        return timeMeter;
    }

    private long start(long j) {
        if (this.mLeftPoint.compareAndSet(-1, j)) {
            this.mLength.set(0);
            this.mStartPoint = this.mLeftPoint.get();
            StringBuilder sb = new StringBuilder("start: success ");
            sb.append(this.mLeftPoint);
            AppBrandLogger.m146382d("TimeMeter", sb.toString());
        } else {
            StringBuilder sb2 = new StringBuilder("start: fail ");
            sb2.append(this.mLeftPoint);
            AppBrandLogger.m146382d("TimeMeter", sb2.toString());
        }
        return this.mLeftPoint.get();
    }
}
