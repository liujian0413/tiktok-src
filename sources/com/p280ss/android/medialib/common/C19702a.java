package com.p280ss.android.medialib.common;

import android.opengl.GLES20;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;

/* renamed from: com.ss.android.medialib.common.a */
public final class C19702a {

    /* renamed from: a */
    public static final float[] f53434a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: com.ss.android.medialib.common.a$a */
    public interface C19703a {
        /* renamed from: a */
        void mo52265a();

        /* renamed from: b */
        void mo52266b();

        /* renamed from: c */
        int mo52267c();
    }

    /* renamed from: com.ss.android.medialib.common.a$b */
    public interface C19704b {
        /* renamed from: a */
        void mo52404a(int i);
    }

    /* renamed from: a */
    public static int m64955a() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        m64957a(36197, 9729, 33071);
        return iArr[0];
    }

    /* renamed from: a */
    public static void m64956a(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    /* renamed from: a */
    public static void m64958a(String str) {
        int glGetError = GLES20.glGetError();
        for (int i = 0; i < 32 && glGetError != 0; i++) {
            glGetError = GLES20.glGetError();
        }
    }

    /* renamed from: a */
    private static void m64957a(int i, int i2, int i3) {
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, VideoPreloadSizeExperiment.DEFAULT, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
    }
}
