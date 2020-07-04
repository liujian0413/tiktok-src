package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13307g;
import com.facebook.imagepipeline.nativecode.C13835a;
import java.io.Closeable;
import java.nio.ByteBuffer;

public class NativeMemoryChunk implements C13826s, Closeable {
    private boolean mIsClosed;
    private final long mNativePtr;
    private final int mSize;

    static {
        C13835a.m40859a();
    }

    private static native long nativeAllocate(int i);

    private static native void nativeCopyFromByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeCopyToByteArray(long j, byte[] bArr, int i, int i2);

    private static native void nativeFree(long j);

    private static native void nativeMemcpy(long j, long j2, int i);

    private static native byte nativeReadByte(long j);

    public ByteBuffer getByteBuffer() {
        return null;
    }

    public long getNativePtr() {
        return this.mNativePtr;
    }

    public int getSize() {
        return this.mSize;
    }

    public long getUniqueId() {
        return this.mNativePtr;
    }

    public NativeMemoryChunk() {
        this.mIsClosed = true;
    }

    public synchronized boolean isClosed() {
        return this.mIsClosed;
    }

    public synchronized void close() {
        if (!this.mIsClosed) {
            this.mIsClosed = true;
            nativeFree(this.mNativePtr);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        if (!isClosed()) {
            try {
                close();
            } finally {
                super.finalize();
            }
        }
    }

    public NativeMemoryChunk(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        this.mSize = i;
        this.mNativePtr = nativeAllocate(this.mSize);
        this.mIsClosed = false;
    }

    public synchronized byte read(int i) {
        boolean z;
        C13307g.m38947b(!isClosed());
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i < this.mSize) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        return nativeReadByte(this.mNativePtr + ((long) i));
    }

    private void doCopy(int i, C13826s sVar, int i2, int i3) {
        if (sVar instanceof NativeMemoryChunk) {
            C13307g.m38947b(!isClosed());
            C13307g.m38947b(!sVar.isClosed());
            C13828u.m40833a(i, sVar.getSize(), i2, i3, this.mSize);
            nativeMemcpy(sVar.getNativePtr() + ((long) i2), this.mNativePtr + ((long) i), i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public void copy(int i, C13826s sVar, int i2, int i3) {
        C13307g.m38940a(sVar);
        if (sVar.getUniqueId() == getUniqueId()) {
            C13307g.m38943a(false);
        }
        if (sVar.getUniqueId() < getUniqueId()) {
            synchronized (sVar) {
                synchronized (this) {
                    doCopy(i, sVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (sVar) {
                doCopy(i, sVar, i2, i3);
            }
        }
    }

    public synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13307g.m38940a(bArr);
        C13307g.m38947b(!isClosed());
        a = C13828u.m40832a(i, i3, this.mSize);
        C13828u.m40833a(i, bArr.length, i2, a, this.mSize);
        nativeCopyFromByteArray(this.mNativePtr + ((long) i), bArr, i2, a);
        return a;
    }

    public synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13307g.m38940a(bArr);
        C13307g.m38947b(!isClosed());
        a = C13828u.m40832a(i, i3, this.mSize);
        C13828u.m40833a(i, bArr.length, i2, a, this.mSize);
        nativeCopyToByteArray(this.mNativePtr + ((long) i), bArr, i2, a);
        return a;
    }
}
