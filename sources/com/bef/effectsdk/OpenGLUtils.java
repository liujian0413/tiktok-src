package com.bef.effectsdk;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Build.VERSION;
import android.os.ParcelFileDescriptor;
import com.C1642a;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Locale;

public class OpenGLUtils {
    private static final String FAIL_RES = C1642a.m8035a(Locale.US, "{%s: false}", new Object[]{RES});
    private static final String HEIGHT = "\"height\"";
    public static final int NOT_INIT = -1;
    public static final int NO_TEXTURE = -1;
    public static final int ON_DRAWN = 1;
    private static final String RES = "\"res\"";
    private static final String TEXTURE_ID = "\"textureId\"";
    private static final String WIDTH = "\"width\"";

    public static void saveBitmap(Bitmap bitmap, String str) {
    }

    public static int getExternalOESTextureID() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        GLES20.glBindTexture(36197, iArr[0]);
        GLES20.glTexParameterf(36197, 10241, 9729.0f);
        GLES20.glTexParameterf(36197, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        return iArr[0];
    }

    public static void checkGlError(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": glError 0x");
            sb.append(Integer.toHexString(glGetError));
            throw new RuntimeException(sb.toString());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[SYNTHETIC, Splitter:B:13:0x0019] */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0020 A[SYNTHETIC, Splitter:B:21:0x0020] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap loadBitmap(java.lang.String r3) {
        /*
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ Exception -> 0x001d, all -> 0x0016 }
            java.io.File r2 = new java.io.File     // Catch:{ Exception -> 0x001d, all -> 0x0016 }
            r2.<init>(r3)     // Catch:{ Exception -> 0x001d, all -> 0x0016 }
            r1.<init>(r2)     // Catch:{ Exception -> 0x001d, all -> 0x0016 }
            android.graphics.Bitmap r3 = android.graphics.BitmapFactory.decodeStream(r1)     // Catch:{ Exception -> 0x001e, all -> 0x0013 }
            r1.close()     // Catch:{ IOException -> 0x0012 }
        L_0x0012:
            return r3
        L_0x0013:
            r3 = move-exception
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r3 = move-exception
        L_0x0017:
            if (r0 == 0) goto L_0x001c
            r0.close()     // Catch:{ IOException -> 0x001c }
        L_0x001c:
            throw r3
        L_0x001d:
            r1 = r0
        L_0x001e:
            if (r1 == 0) goto L_0x0023
            r1.close()     // Catch:{ IOException -> 0x0023 }
        L_0x0023:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bef.effectsdk.OpenGLUtils.loadBitmap(java.lang.String):android.graphics.Bitmap");
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

    public static int loadShader(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        return glCreateShader;
    }

    private static int loadShader(String str, int i) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            return 0;
        }
        return glCreateShader;
    }

    public static int loadProgram(String str, String str2) {
        int[] iArr = new int[1];
        int loadShader = loadShader(str, 35633);
        if (loadShader == 0) {
            return 0;
        }
        int loadShader2 = loadShader(str2, 35632);
        if (loadShader2 == 0) {
            return 0;
        }
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, loadShader);
        GLES20.glAttachShader(glCreateProgram, loadShader2);
        GLES20.glLinkProgram(glCreateProgram);
        GLES20.glGetProgramiv(glCreateProgram, 35714, iArr, 0);
        if (iArr[0] <= 0) {
            return 0;
        }
        GLES20.glDeleteShader(loadShader);
        GLES20.glDeleteShader(loadShader2);
        return glCreateProgram;
    }

    static Bitmap loadBitmap(FileDescriptor fileDescriptor, long j, long j2) throws IOException {
        AssetFileDescriptor assetFileDescriptor = new AssetFileDescriptor(ParcelFileDescriptor.dup(fileDescriptor), j, j2);
        FileInputStream createInputStream = assetFileDescriptor.createInputStream();
        try {
            return BitmapFactory.decodeStream(createInputStream);
        } finally {
            createInputStream.close();
        }
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

    public static void byte2Bitmap(byte[] bArr, int i, int i2, String str) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Config.ARGB_8888);
        createBitmap.eraseColor(-16776961);
        createBitmap.copyPixelsFromBuffer(ByteBuffer.wrap(bArr));
        saveBitmap(createBitmap, str);
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

    public static Bitmap loadBitmap(byte[] bArr, int i, int i2, boolean z) {
        Options options = new Options();
        if (VERSION.SDK_INT >= 19) {
            options.inPremultiplied = z;
        }
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, i, i2, options);
        if (decodeByteArray == null || decodeByteArray.getConfig() == Config.ARGB_8888) {
            return decodeByteArray;
        }
        return decodeByteArray.copy(Config.ARGB_8888, true);
    }
}
