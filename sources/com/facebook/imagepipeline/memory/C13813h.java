package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13307g;
import java.io.Closeable;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.h */
public final class C13813h implements C13826s, Closeable {

    /* renamed from: a */
    private ByteBuffer f36662a;

    /* renamed from: b */
    private final int f36663b;

    /* renamed from: c */
    private final long f36664c = ((long) System.identityHashCode(this));

    public final int getSize() {
        return this.f36663b;
    }

    public final long getUniqueId() {
        return this.f36664c;
    }

    public final synchronized ByteBuffer getByteBuffer() {
        return this.f36662a;
    }

    public final long getNativePtr() {
        throw new UnsupportedOperationException("Cannot get the pointer of a BufferMemoryChunk");
    }

    public final synchronized void close() {
        this.f36662a = null;
    }

    public final synchronized boolean isClosed() {
        boolean z;
        if (this.f36662a == null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public C13813h(int i) {
        this.f36662a = ByteBuffer.allocateDirect(i);
        this.f36663b = i;
    }

    public final synchronized byte read(int i) {
        boolean z;
        C13307g.m38947b(!isClosed());
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i < this.f36663b) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        return this.f36662a.get(i);
    }

    public final void copy(int i, C13826s sVar, int i2, int i3) {
        C13307g.m38940a(sVar);
        if (sVar.getUniqueId() == getUniqueId()) {
            C13307g.m38943a(false);
        }
        if (sVar.getUniqueId() < getUniqueId()) {
            synchronized (sVar) {
                synchronized (this) {
                    m40780a(i, sVar, i2, i3);
                }
            }
            return;
        }
        synchronized (this) {
            synchronized (sVar) {
                m40780a(i, sVar, i2, i3);
            }
        }
    }

    public final synchronized int write(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13307g.m38940a(bArr);
        C13307g.m38947b(!isClosed());
        a = C13828u.m40832a(i, i3, this.f36663b);
        C13828u.m40833a(i, bArr.length, i2, a, this.f36663b);
        this.f36662a.position(i);
        this.f36662a.put(bArr, i2, a);
        return a;
    }

    /* renamed from: a */
    private void m40780a(int i, C13826s sVar, int i2, int i3) {
        if (sVar instanceof C13813h) {
            C13307g.m38947b(!isClosed());
            C13307g.m38947b(!sVar.isClosed());
            C13828u.m40833a(i, sVar.getSize(), i2, i3, this.f36663b);
            this.f36662a.position(i);
            sVar.getByteBuffer().position(i2);
            byte[] bArr = new byte[i3];
            this.f36662a.get(bArr, 0, i3);
            sVar.getByteBuffer().put(bArr, 0, i3);
            return;
        }
        throw new IllegalArgumentException("Cannot copy two incompatible MemoryChunks");
    }

    public final synchronized int read(int i, byte[] bArr, int i2, int i3) {
        int a;
        C13307g.m38940a(bArr);
        C13307g.m38947b(!isClosed());
        a = C13828u.m40832a(i, i3, this.f36663b);
        C13828u.m40833a(i, bArr.length, i2, a, this.f36663b);
        this.f36662a.position(i);
        this.f36662a.get(bArr, i2, a);
        return a;
    }
}
