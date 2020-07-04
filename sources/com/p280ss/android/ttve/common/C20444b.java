package com.p280ss.android.ttve.common;

import android.opengl.GLES20;

/* renamed from: com.ss.android.ttve.common.b */
public final class C20444b {

    /* renamed from: a */
    public static final float[] f55206a = {-1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f};

    /* renamed from: a */
    public static void m67836a(String str) {
        int glGetError = GLES20.glGetError();
        for (int i = 0; i < 32 && glGetError != 0; i++) {
            glGetError = GLES20.glGetError();
        }
    }
}
