package com.p280ss.avframework.buffer;

import com.p280ss.avframework.buffer.VideoFrame.Buffer;
import com.p280ss.avframework.buffer.VideoFrame.I420Buffer;
import com.p280ss.avframework.buffer.VideoFrame.stRoiInfo;
import com.p280ss.avframework.utils.JniCommon;
import java.nio.ByteBuffer;

/* renamed from: com.ss.avframework.buffer.JavaI420Buffer */
public class JavaI420Buffer implements I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    public int getHeight() {
        return this.height;
    }

    public stRoiInfo getROIInfo() {
        return null;
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

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i5 + 0;
        int i7 = i4 * i3;
        int i8 = i6 + i7;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i5 + (i4 * 2 * i3));
        nativeAllocateByteBuffer.position(0);
        nativeAllocateByteBuffer.limit(i6);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i6);
        nativeAllocateByteBuffer.limit(i8);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        nativeAllocateByteBuffer.position(i8);
        nativeAllocateByteBuffer.limit(i8 + i7);
        JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i, i2, slice, i, slice2, i4, nativeAllocateByteBuffer.slice(), i4, new Runnable() {
            public final void run() {
                JniCommon.nativeFreeByteBuffer(nativeAllocateByteBuffer);
            }
        });
        return javaI420Buffer;
    }

    public Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return VideoFrame.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
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
        this.releaseCallback = runnable;
        this.refCount = 1;
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        } else {
            ByteBuffer slice = byteBuffer.slice();
            ByteBuffer slice2 = byteBuffer2.slice();
            ByteBuffer slice3 = byteBuffer3.slice();
            int i6 = (i2 + 1) / 2;
            int i7 = i3 * i2;
            int i8 = i4 * i6;
            int i9 = i6 * i5;
            if (slice.capacity() < i7) {
                StringBuilder sb = new StringBuilder("Y-buffer must be at least ");
                sb.append(i7);
                sb.append(" bytes.");
                throw new IllegalArgumentException(sb.toString());
            } else if (slice2.capacity() < i8) {
                StringBuilder sb2 = new StringBuilder("U-buffer must be at least ");
                sb2.append(i8);
                sb2.append(" bytes.");
                throw new IllegalArgumentException(sb2.toString());
            } else if (slice3.capacity() >= i9) {
                JavaI420Buffer javaI420Buffer = new JavaI420Buffer(i, i2, slice, i3, slice2, i4, slice3, i5, runnable);
                return javaI420Buffer;
            } else {
                StringBuilder sb3 = new StringBuilder("V-buffer must be at least ");
                sb3.append(i9);
                sb3.append(" bytes.");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
    }
}
