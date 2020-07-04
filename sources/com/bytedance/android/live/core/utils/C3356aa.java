package com.bytedance.android.live.core.utils;

import android.os.Debug;
import android.os.Debug.MemoryInfo;
import android.os.SystemClock;
import com.bytedance.android.live.core.performance.C3221a;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.bytedance.android.live.core.utils.aa */
public final class C3356aa {

    /* renamed from: a */
    private static final int[] f10169a = {0, 192, 290, 512, PreloadTask.BYTE_UNIT_NUMBER, 1536, 2048};

    /* renamed from: b */
    private static final int[] f10170b = {0, 528, 620, 1020, 1220, 1520, 2020};

    /* renamed from: c */
    private static long f10171c = -1;

    /* renamed from: d */
    private static String f10172d = "";

    /* renamed from: a */
    public static long m12507a() {
        MemoryInfo memoryInfo = new MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        return (long) memoryInfo.getTotalPss();
    }

    /* renamed from: a */
    public static String m12508a(String str) {
        if (SystemClock.elapsedRealtime() - f10171c > DouPlusShareGuideExperiment.MIN_VALID_DURATION) {
            f10172d = String.valueOf(C3221a.m12210a());
            f10171c = SystemClock.elapsedRealtime();
        }
        return f10172d;
    }
}
