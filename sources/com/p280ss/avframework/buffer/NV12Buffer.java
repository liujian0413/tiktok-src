package com.p280ss.avframework.buffer;

import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p280ss.avframework.utils.JNINamespace;
import java.nio.ByteBuffer;

@JNINamespace("jni")
/* renamed from: com.ss.avframework.buffer.NV12Buffer */
public class NV12Buffer implements Buffer {
    private final ByteBuffer buffer;
    private final int height;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    private static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, ByteBuffer byteBuffer, int i7, int i8, int i9, int i10, ByteBuffer byteBuffer2, int i11, ByteBuffer byteBuffer3, int i12, ByteBuffer byteBuffer4, int i13);

    public int getHeight() {
        return this.height;
    }

    public stRoiInfo getROIInfo() {
        return null;
    }

    public int getWidth() {
        return this.width;
    }

    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public void release() {
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && this.releaseCallback != null) {
                this.releaseCallback.run();
            }
        }
    }

    public I420Buffer toI420() {
        return (I420Buffer) cropAndScale(0, 0, this.width, this.height, this.width, this.height);
    }

    public NV12Buffer(int i, int i2, int i3, int i4, ByteBuffer byteBuffer, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.stride = i3;
        this.sliceHeight = i4;
        this.buffer = byteBuffer;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = i;
        int i8 = i2;
        int i9 = i3;
        int i10 = i4;
        int i11 = i5;
        int i12 = i6;
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i5, i6);
        nativeCropAndScale(i7, i8, i9, i10, i11, i12, this.buffer, this.width, this.height, this.stride, this.sliceHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }
}
