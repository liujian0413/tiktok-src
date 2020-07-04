package com.p280ss.android.medialib;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.C1642a;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import java.util.Locale;

/* renamed from: com.ss.android.medialib.OpenGLUtils */
public class OpenGLUtils {
    private static final String FAIL_RES = C1642a.m8035a(Locale.US, "{%s: false}", new Object[]{RES});
    private static final String HEIGHT = "\"height\"";
    public static final int NO_TEXTURE = -1;
    private static final String RES = "\"res\"";
    private static final String TEXTURE_ID = "\"textureId\"";
    private static final String WIDTH = "\"width\"";

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
}
