package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

/* renamed from: com.facebook.imagepipeline.memory.m */
public final class C13818m {
    /* renamed from: c */
    private static int m40791c() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return min / 2;
        }
        return (min / 4) * 3;
    }

    /* renamed from: b */
    private static int m40790b() {
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            return 3145728;
        }
        if (min < 33554432) {
            return 6291456;
        }
        return 12582912;
    }

    /* renamed from: a */
    public static C13803ad m40789a() {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(PreloadTask.BYTE_UNIT_NUMBER, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(VideoCacheReadBuffersizeExperiment.DEFAULT, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        return new C13803ad(m40790b(), m40791c(), sparseIntArray);
    }
}
