package com.p280ss.avframework.opengl;

import android.opengl.GLES20;
import com.p280ss.android.ugc.aweme.feed.experiment.VideoPreloadSizeExperiment;
import com.p280ss.avframework.utils.JNINamespace;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.opengl.GlUtil */
public class GlUtil {
    private GlUtil() {
    }

    protected static native int nativeAttachThreadToOpenGl(long j, int i, long j2);

    public static native void nativeDetachThreadToOpenGl();

    public static native boolean nativeIsOpenGlThread();

    public static boolean nativeAttachThreadToOpenGl() {
        if (nativeAttachThreadToOpenGl(GLThreadManager.getNativeEGLContext(), 0, 0) != 0) {
            return true;
        }
        return false;
    }

    public static FloatBuffer createFloatBuffer(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static void checkNoGLES2Error(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(": GLES20 error: ");
            sb.append(glGetError);
            throw new RuntimeException(sb.toString());
        }
    }

    public static int generateTexture(int i) {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        int i2 = iArr[0];
        GLES20.glBindTexture(i, i2);
        GLES20.glTexParameterf(i, 10241, 9729.0f);
        GLES20.glTexParameterf(i, VideoPreloadSizeExperiment.DEFAULT, 9729.0f);
        GLES20.glTexParameterf(i, 10242, 33071.0f);
        GLES20.glTexParameterf(i, 10243, 33071.0f);
        checkNoGLES2Error("generateTexture");
        return i2;
    }
}
