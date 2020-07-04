package com.ttnet.org.chromium.base.metrics;

import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ttnet.org.chromium.base.annotations.JNINamespace;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@JNINamespace("base::android")
public class RecordHistogram {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static Map<String, Long> sCache = Collections.synchronizedMap(new HashMap());
    private static Throwable sDisabledBy;

    private static int clampToInt(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    private static native int nativeGetHistogramTotalCountForTesting(String str);

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);

    public static int getHistogramTotalCountForTesting(String str) {
        return nativeGetHistogramTotalCountForTesting(str);
    }

    private static long getCachedHistogramKey(String str) {
        Long l = (Long) sCache.get(str);
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public static void setDisabledForTests(boolean z) {
        Throwable th;
        if (!z || sDisabledBy == null) {
            if (z) {
                th = new Throwable();
            } else {
                th = null;
            }
            sDisabledBy = th;
            return;
        }
        throw new IllegalStateException("Histograms are already disabled.", sDisabledBy);
    }

    public static int getHistogramValueCountForTesting(String str, int i) {
        return nativeGetHistogramValueCountForTesting(str, i);
    }

    public static void recordCount1000Histogram(String str, int i) {
        recordCustomCountHistogram(str, i, 1, 1000, 50);
    }

    public static void recordCount100Histogram(String str, int i) {
        recordCustomCountHistogram(str, i, 1, 100, 50);
    }

    public static void recordCountHistogram(String str, int i) {
        recordCustomCountHistogram(str, i, 1, C28539a.f75176k, 50);
    }

    public static void recordLongTimesHistogram(String str, long j) {
        recordCustomTimesHistogramMilliseconds(str, j, 1, 3600000, 50);
    }

    public static void recordLongTimesHistogram100(String str, long j) {
        recordCustomTimesHistogramMilliseconds(str, j, 1, 3600000, 100);
    }

    public static void recordMediumTimesHistogram(String str, long j) {
        recordCustomTimesHistogramMilliseconds(str, j, 10, 180000, 50);
    }

    public static void recordMemoryKBHistogram(String str, int i) {
        recordCustomCountHistogram(str, i, 1000, 500000, 50);
    }

    public static void recordTimesHistogram(String str, long j) {
        recordCustomTimesHistogramMilliseconds(str, j, 1, 10000, 50);
    }

    public static void recordBooleanHistogram(String str, boolean z) {
        if (sDisabledBy == null) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, cachedHistogramKey, z);
            if (nativeRecordBooleanHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordBooleanHistogram));
            }
        }
    }

    public static void recordPercentageHistogram(String str, int i) {
        if (sDisabledBy == null) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordEnumeratedHistogram = nativeRecordEnumeratedHistogram(str, cachedHistogramKey, i, BaseNotice.HASHTAG);
            if (nativeRecordEnumeratedHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordEnumeratedHistogram));
            }
        }
    }

    public static void recordSparseHistogram(String str, int i) {
        if (sDisabledBy == null) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordSparseHistogram = nativeRecordSparseHistogram(str, cachedHistogramKey, i);
            if (nativeRecordSparseHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordSparseHistogram));
            }
        }
    }

    public static void recordEnumeratedHistogram(String str, int i, int i2) {
        if (sDisabledBy == null) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordEnumeratedHistogram = nativeRecordEnumeratedHistogram(str, cachedHistogramKey, i, i2);
            if (nativeRecordEnumeratedHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordEnumeratedHistogram));
            }
        }
    }

    public static void recordCustomTimesHistogram(String str, long j, long j2, long j3, int i) {
        recordCustomTimesHistogramMilliseconds(str, j, j2, j3, i);
    }

    public static void recordCustomCountHistogram(String str, int i, int i2, int i3, int i4) {
        if (sDisabledBy == null) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordCustomCountHistogram = nativeRecordCustomCountHistogram(str, cachedHistogramKey, i, i2, i3, i4);
            if (nativeRecordCustomCountHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordCustomCountHistogram));
            }
        }
    }

    private static void recordCustomTimesHistogramMilliseconds(String str, long j, long j2, long j3, int i) {
        if (sDisabledBy == null) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordCustomTimesHistogramMilliseconds = nativeRecordCustomTimesHistogramMilliseconds(str, cachedHistogramKey, clampToInt(j), clampToInt(j2), clampToInt(j3), i);
            if (nativeRecordCustomTimesHistogramMilliseconds != cachedHistogramKey) {
                String str2 = str;
                sCache.put(str, Long.valueOf(nativeRecordCustomTimesHistogramMilliseconds));
            }
        }
    }

    public static void recordLinearCountHistogram(String str, int i, int i2, int i3, int i4) {
        if (sDisabledBy == null) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordLinearCountHistogram = nativeRecordLinearCountHistogram(str, cachedHistogramKey, i, i2, i3, i4);
            if (nativeRecordLinearCountHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordLinearCountHistogram));
            }
        }
    }
}
