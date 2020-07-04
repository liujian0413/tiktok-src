package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;

public class JavaI420Buffer implements I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    private static native void nativeScaleAndFillI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, ByteBuffer byteBuffer4, int i6, ByteBuffer byteBuffer5, int i7, ByteBuffer byteBuffer6, int i8, int i9, int i10, int i11, int i12);

    public int getHeight() {
        return this.height;
    }

    public int getStrideU() {
        return this.strideU;
    }

    public int getStrideV() {
        return this.strideV;
    }

    public int getStrideY() {
        return this.strideY;
    }

    public int getWidth() {
        return this.width;
    }

    public I420Buffer toI420() {
        retain();
        return this;
    }

    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    public void release() {
        this.refCountDelegate.release();
    }

    public void retain() {
        this.refCountDelegate.retain();
    }

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i5 + 0;
        int i7 = i4 * i3;
        int i8 = i6 + i7;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i5 + (i4 * 2 * i3));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i6);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i6);
        nativeAllocateByteBuffer.limit(i8);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i8);
        nativeAllocateByteBuffer.limit(i8 + i7);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i, i2, slice, i, slice2, i4, nativeAllocateByteBuffer.slice(), i4, new JavaI420Buffer$$Lambda$0(nativeAllocateByteBuffer));
        return javaI420Buffer;
    }

    public Buffer scaleAndFill(int i, int i2, int i3, int i4) {
        return scaleAndFillI420(this, i, i2, i3, i4);
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i, int i2, int i3) {
        int i4 = (i3 * (i2 - 1)) + i;
        if (byteBuffer.capacity() < i4) {
            StringBuilder sb = new StringBuilder("Buffer must be at least ");
            sb.append(i4);
            sb.append(" bytes, but was ");
            sb.append(byteBuffer.capacity());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public static JavaI420Buffer allocate(int i, int i2, int i3, int i4) {
        int i5 = i3 / 2;
        int i6 = i3 * i4;
        int i7 = i6 + 0;
        int i8 = i5 * i4;
        int i9 = (i8 / 2) + i7;
        ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i6 + (i5 * 2 * i4));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i7);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i7);
        nativeAllocateByteBuffer.limit(i9);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i9);
        nativeAllocateByteBuffer.limit(i9 + i8);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i, i2, slice, i3, slice2, i5, nativeAllocateByteBuffer.slice(), i5, new JavaI420Buffer$$Lambda$1(nativeAllocateByteBuffer));
        return javaI420Buffer;
    }

    public static Buffer scaleAndFillI420(I420Buffer i420Buffer, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        int i8 = i4;
        JavaI420Buffer allocate = allocate(i, i2);
        nativeScaleAndFillI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i420Buffer.getWidth(), i420Buffer.getHeight(), allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6, i7, i8);
        return allocate;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    public static Buffer cropAndScaleI420(I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 != i5) {
            int i7 = i4;
            int i8 = i6;
        } else if (i4 == i6) {
            ByteBuffer dataY2 = i420Buffer.getDataY();
            ByteBuffer dataU2 = i420Buffer.getDataU();
            ByteBuffer dataV2 = i420Buffer.getDataV();
            dataY2.position(i + (i420Buffer.getStrideY() * i2));
            int i9 = i / 2;
            int i10 = i2 / 2;
            dataU2.position((i420Buffer.getStrideU() * i10) + i9);
            dataV2.position(i9 + (i10 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            ByteBuffer slice = dataY2.slice();
            int strideY2 = i420Buffer.getStrideY();
            ByteBuffer slice2 = dataU2.slice();
            int strideU2 = i420Buffer.getStrideU();
            ByteBuffer slice3 = dataV2.slice();
            int strideV2 = i420Buffer.getStrideV();
            i420Buffer.getClass();
            return wrap(i5, i6, slice, strideY2, slice2, strideU2, slice3, strideV2, JavaI420Buffer$$Lambda$2.get$Lambda(i420Buffer));
        }
        JavaI420Buffer allocate = allocate(i5, i6);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        return allocate;
    }

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        int i6 = i;
        int i7 = i2;
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        } else {
            ByteBuffer slice = byteBuffer.slice();
            ByteBuffer slice2 = byteBuffer2.slice();
            ByteBuffer slice3 = byteBuffer3.slice();
            int i8 = (i6 + 1) / 2;
            int i9 = (i7 + 1) / 2;
            int i10 = i3;
            checkCapacity(slice, i, i2, i3);
            checkCapacity(slice2, i8, i9, i4);
            checkCapacity(slice3, i8, i9, i5);
            JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i, i2, slice, i10, slice2, i4, slice3, i5, runnable);
            return javaI420Buffer;
        }
    }
}
