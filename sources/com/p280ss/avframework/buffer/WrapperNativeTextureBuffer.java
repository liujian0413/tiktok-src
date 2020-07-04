package com.p280ss.avframework.buffer;

import android.graphics.Matrix;
import android.util.AndroidRuntimeException;
import com.p280ss.avframework.buffer.TextureBufferImpl.ToI420Interface;
import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer;
import com.p280ss.avframework.buffer.VideoFrame.TextureBuffer.Type;
import com.p280ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.buffer.WrapperNativeTextureBuffer */
public class WrapperNativeTextureBuffer extends TextureBufferImpl implements TextureBuffer {
    private long mNativeObj;

    private native void nativeRelease(long j);

    private native void nativeRetain(long j);

    private native I420Buffer nativeToI420(long j);

    public void retain() {
        nativeRetain(this.mNativeObj);
    }

    public I420Buffer toI420() {
        return nativeToI420(this.mNativeObj);
    }

    public synchronized void release() {
        nativeRelease(this.mNativeObj);
    }

    private static long isWrapperNativeFrame(VideoFrame videoFrame) {
        if (!(videoFrame.getBuffer() instanceof WrapperNativeTextureBuffer)) {
            return 0;
        }
        WrapperNativeTextureBuffer wrapperNativeTextureBuffer = (WrapperNativeTextureBuffer) videoFrame.getBuffer();
        if (wrapperNativeTextureBuffer.mNativeObj != 0) {
            return wrapperNativeTextureBuffer.mNativeObj;
        }
        throw new AndroidRuntimeException("Wrapper texture buffer is null!, What happen!");
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, long j) {
        this(i, i2, i3, new Matrix(), j);
        this.mNativeObj = j;
    }

    public WrapperNativeTextureBuffer(int i, int i2, int i3, Matrix matrix, long j) {
        super(i, i2, Type.RGB, i3, matrix, (ToI420Interface) null, (Runnable) null);
        this.mNativeObj = j;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        throw new AndroidRuntimeException("Please support matrix transcat and see construct method");
    }
}
