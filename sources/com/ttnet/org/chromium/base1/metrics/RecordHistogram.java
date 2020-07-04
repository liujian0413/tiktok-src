package com.ttnet.org.chromium.base1.metrics;

import com.p280ss.android.ugc.aweme.feed.monitor.C28539a;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ttnet.org.chromium.base1.annotations.JNINamespace;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

@JNINamespace("base::android")
public class RecordHistogram {
    private static Map<String, Long> sCache = Collections.synchronizedMap(new HashMap());
    private static boolean sIsDisabledForTests;

    private static int clampToInt(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static void disableForTests() {
        sIsDisabledForTests = true;
    }

    private static native int nativeGetHistogramValueCountForTesting(String str, int i);

    private static native void nativeInitialize();

    private static native long nativeRecordBooleanHistogram(String str, long j, boolean z);

    private static native long nativeRecordCustomCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordCustomTimesHistogramMilliseconds(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordEnumeratedHistogram(String str, long j, int i, int i2);

    private static native long nativeRecordLinearCountHistogram(String str, long j, int i, int i2, int i3, int i4);

    private static native long nativeRecordSparseHistogram(String str, long j, int i);

    public static void initialize() {
        if (!sIsDisabledForTests) {
            nativeInitialize();
        }
    }

    private static long getCachedHistogramKey(String str) {
        Long l = (Long) sCache.get(str);
        if (l == null) {
            return 0;
        }
        return l.longValue();
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

    public static void recordMemoryKBHistogram(String str, int i) {
        recordCustomCountHistogram(str, i, 1000, 500000, 50);
    }

    public static void recordBooleanHistogram(String str, boolean z) {
        if (!sIsDisabledForTests) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordBooleanHistogram = nativeRecordBooleanHistogram(str, cachedHistogramKey, z);
            if (nativeRecordBooleanHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordBooleanHistogram));
            }
        }
    }

    public static void recordPercentageHistogram(String str, int i) {
        if (!sIsDisabledForTests) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordEnumeratedHistogram = nativeRecordEnumeratedHistogram(str, cachedHistogramKey, i, BaseNotice.HASHTAG);
            if (nativeRecordEnumeratedHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordEnumeratedHistogram));
            }
        }
    }

    public static void recordSparseSlowlyHistogram(String str, int i) {
        if (!sIsDisabledForTests) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordSparseHistogram = nativeRecordSparseHistogram(str, cachedHistogramKey, i);
            if (nativeRecordSparseHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordSparseHistogram));
            }
        }
    }

    public static void recordEnumeratedHistogram(String str, int i, int i2) {
        if (!sIsDisabledForTests) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordEnumeratedHistogram = nativeRecordEnumeratedHistogram(str, cachedHistogramKey, i, i2);
            if (nativeRecordEnumeratedHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordEnumeratedHistogram));
            }
        }
    }

    public static void recordLongTimesHistogram(String str, long j, TimeUnit timeUnit) {
        recordCustomTimesHistogramMilliseconds(str, timeUnit.toMillis(j), 1, TimeUnit.HOURS.toMillis(1), 50);
    }

    public static void recordMediumTimesHistogram(String str, long j, TimeUnit timeUnit) {
        recordCustomTimesHistogramMilliseconds(str, timeUnit.toMillis(j), 10, TimeUnit.MINUTES.toMillis(3), 50);
    }

    public static void recordTimesHistogram(String str, long j, TimeUnit timeUnit) {
        recordCustomTimesHistogramMilliseconds(str, timeUnit.toMillis(j), 1, TimeUnit.SECONDS.toMillis(10), 50);
    }

    public static void recordCustomCountHistogram(String str, int i, int i2, int i3, int i4) {
        if (!sIsDisabledForTests) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordCustomCountHistogram = nativeRecordCustomCountHistogram(str, cachedHistogramKey, i, i2, i3, i4);
            if (nativeRecordCustomCountHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordCustomCountHistogram));
            }
        }
    }

    private static void recordCustomTimesHistogramMilliseconds(String str, long j, long j2, long j3, int i) {
        if (!sIsDisabledForTests) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordCustomTimesHistogramMilliseconds = nativeRecordCustomTimesHistogramMilliseconds(str, cachedHistogramKey, clampToInt(j), clampToInt(j2), clampToInt(j3), i);
            if (nativeRecordCustomTimesHistogramMilliseconds != cachedHistogramKey) {
                String str2 = str;
                sCache.put(str, Long.valueOf(nativeRecordCustomTimesHistogramMilliseconds));
            }
        }
    }

    public static void recordLinearCountHistogram(String str, int i, int i2, int i3, int i4) {
        if (!sIsDisabledForTests) {
            long cachedHistogramKey = getCachedHistogramKey(str);
            long nativeRecordLinearCountHistogram = nativeRecordLinearCountHistogram(str, cachedHistogramKey, i, i2, i3, i4);
            if (nativeRecordLinearCountHistogram != cachedHistogramKey) {
                sCache.put(str, Long.valueOf(nativeRecordLinearCountHistogram));
            }
        }
    }

    public static void recordCustomTimesHistogram(String str, long j, long j2, long j3, TimeUnit timeUnit, int i) {
        recordCustomTimesHistogramMilliseconds(str, timeUnit.toMillis(j), timeUnit.toMillis(j2), timeUnit.toMillis(j3), i);
    }
}
