package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;

public class NV21Buffer implements Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int width;

    private static native void nativeCropAndScale(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr, int i7, int i8, ByteBuffer byteBuffer, int i9, ByteBuffer byteBuffer2, int i10, ByteBuffer byteBuffer3, int i11);

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    public void release() {
        this.refCountDelegate.release();
    }

    public void retain() {
        this.refCountDelegate.retain();
    }

    public I420Buffer toI420() {
        return (I420Buffer) cropAndScale(0, 0, this.width, this.height, this.width, this.height);
    }

    public Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return JavaI420Buffer.allocate(i, i2);
    }

    public NV21Buffer(byte[] bArr, int i, int i2, Runnable runnable) {
        this.data = bArr;
        this.width = i;
        this.height = i2;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i5, i6);
        nativeCropAndScale(i, i2, i3, i4, i5, i6, this.data, this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }
}
