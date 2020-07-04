package com.p280ss.android.ugc.aweme.livewallpaper.egl;

import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Build.VERSION;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.nio.ByteBuffer;

/* renamed from: com.ss.android.ugc.aweme.livewallpaper.egl.i */
public final class C32588i {

    /* renamed from: a */
    public static final float[] f84952a;

    /* renamed from: b */
    private static boolean f84953b = m105574d();

    /* renamed from: a */
    public static boolean m105570a() {
        return f84953b;
    }

    /* renamed from: b */
    public static int m105572b() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        return iArr[0];
    }

    /* renamed from: c */
    public static int m105573c() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        return iArr[0];
    }

    /* renamed from: d */
    private static boolean m105574d() {
        if (VERSION.SDK_INT < 17) {
            return false;
        }
        try {
            EGL14.eglGetCurrentContext();
            return true;
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    static {
        float[] fArr = new float[16];
        f84952a = fArr;
        Matrix.setIdentityM(fArr, 0);
    }

    /* renamed from: a */
    public static void m105569a(int i) {
        GLES20.glDeleteTextures(1, new int[]{i}, 0);
    }

    /* renamed from: a */
    public static boolean m105571a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError == 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(": glError 0x");
        sb.append(Integer.toHexString(glGetError));
        return false;
    }

    /* renamed from: a */
    private static int m105566a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        StringBuilder sb = new StringBuilder("glCreateShader type=");
        sb.append(i);
        m105571a(sb.toString());
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        GLES20.glDeleteShader(glCreateShader);
        return 0;
    }

    /* renamed from: a */
    public static int m105567a(String str, String str2) {
        int a = m105566a(35633, str);
        int i = 0;
        if (a == 0) {
            return 0;
        }
        int a2 = m105566a(35632, str2);
        if (a2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        m105571a("glCreateProgram");
        GLES20.glAttachShader(glCreateProgram, a);
        m105571a("glAttachShader");
        GLES20.glAttachShader(glCreateProgram, a2);
        m105571a("glAttachShader");
        GLES20.glLinkProgram(glCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] != 1) {
            GLES20.glDeleteProgram(glCreateProgram);
        } else {
            i = glCreateProgram;
        }
        return i;
    }

    /* renamed from: a */
    public static int m105568a(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i4 = iArr[0];
        m105571a("glGenTextures");
        GLES20.glBindTexture(3553, i4);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, VideoPreloadSizeExperiment.DEFAULT, 9729);
        GLES20.glTexParameterf(3553, 10242, 33071.0f);
        GLES20.glTexParameterf(3553, 10243, 33071.0f);
        m105571a("loadImageTexture");
        GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, null);
        m105571a("loadImageTexture");
        return i4;
    }
}
