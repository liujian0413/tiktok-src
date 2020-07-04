package com.p280ss.avframework.livestreamv2.effectcamera.utils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.util.Locale;

/* renamed from: com.ss.avframework.livestreamv2.effectcamera.utils.OpenGLUtils */
public class OpenGLUtils {
    private static final String FAIL_RES = C1642a.m8035a(Locale.US, "{%s: false}", new Object[]{RES});
    private static final String HEIGHT = "\"height\"";
    public static final int NOT_INIT = -1;
    public static final int NO_TEXTURE = -1;
    public static final int ON_DRAWN = 1;
    private static final String RES = "\"res\"";
    private static final String TEXTURE_ID = "\"textureId\"";
    private static final String WIDTH = "\"width\"";

    public static int getExternalOESTextureID() {
        int[] iArr = new int[1];
        checkGlError("genTexture pre");
        GLES20.glGenTextures(1, iArr, 0);
        checkGlError("genTexture end");
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static Bitmap loadBitmap(String str) {
        return BitmapFactory.decodeFile(str);
    }

    public static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": glError 0x");
            sb.append(Integer.toHexString(glGetError));
            LogUtils.m143680e("GLES", sb.toString(), new Object[0]);
        }
    }

    public static String loadTexture(String str) {
        Bitmap decodeFile = BitmapFactory.decodeFile(str);
        if (decodeFile == null) {
            return FAIL_RES;
        }
        return C1642a.m8035a(Locale.US, "{%s: true, %s: %d, %s: %d, %s: %d}", new Object[]{RES, WIDTH, Integer.valueOf(decodeFile.getWidth()), HEIGHT, Integer.valueOf(decodeFile.getHeight()), TEXTURE_ID, Integer.valueOf(loadTexture(decodeFile, -1, false))});
    }

    public static int loadTexture(Bitmap bitmap, int i) {
        return loadTexture(bitmap, i, false);
    }

    private static int loadShader(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder("Compilation\n");
        sb.append(GLES20.glGetShaderInfoLog(glCreateShader));
        LogUtils.m143680e("Load Shader Failed", sb.toString(), new Object[0]);
        return 0;
    }

    public static int loadProgram(String str, String str2) {
        int[] iArr = new int[1];
        int loadShader = loadShader(str, 35633);
        if (loadShader == 0) {
            LogUtils.m143677d("Load Program", "Vertex Shader Failed", new Object[0]);
            return 0;
        }
        int loadShader2 = loadShader(str2, 35632);
        if (loadShader2 == 0) {
            LogUtils.m143677d("Load Program", "Fragment Shader Failed", new Object[0]);
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            LogUtils.m143677d("Load Program", "Linking Failed", new Object[0]);
            return 0;
        }
        GLES20.glDeleteShader(loadShader);
        GLES20.glDeleteShader(loadShader2);
        return glCreateProgram;
    }

    public static int loadTexture(Bitmap bitmap, int i, boolean z) {
        if (bitmap == null) {
            return -1;
        }
        int[] iArr = new int[1];
        if (i == -1) {
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
        } else {
            GLES20.glBindTexture(3553, i);
            GLUtils.texImage2D(3553, 0, bitmap, 0);
            iArr[0] = i;
        }
        if (z) {
            bitmap.recycle();
        }
        return iArr[0];
    }

    public static int initEffectTexture(int i, int i2, int[] iArr, int i3) {
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(i3, iArr[0]);
        GLES20.glTexParameterf(i3, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameterf(i3, 10241, 9729.0f);
        GLES20.glTexParameterf(i3, 10242, 33071.0f);
        GLES20.glTexParameterf(i3, 10243, 33071.0f);
        GLES20.glTexImage2D(i3, 0, 6408, i, i2, 0, 6408, 5121, null);
        return iArr[0];
    }
}
