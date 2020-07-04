package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBuffer.ClosedException;
import com.facebook.common.references.C13326a;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.imagepipeline.memory.v */
public final class C13829v implements PooledByteBuffer {

    /* renamed from: a */
    C13326a<C13826s> f36679a;

    /* renamed from: b */
    private final int f36680b;

    /* renamed from: a */
    public final synchronized int mo32575a() {
        m40834e();
        return this.f36680b;
    }

    public final synchronized void close() {
        C13326a.m39001c(this.f36679a);
        this.f36679a = null;
    }

    /* renamed from: e */
    private synchronized void m40834e() {
        if (mo32579d()) {
            throw new ClosedException();
        }
    }

    /* renamed from: b */
    public final synchronized long mo32577b() throws UnsupportedOperationException {
        m40834e();
        return ((C13826s) this.f36679a.mo32609a()).getNativePtr();
    }

    /* renamed from: c */
    public final synchronized ByteBuffer mo32578c() {
        return ((C13826s) this.f36679a.mo32609a()).getByteBuffer();
    }

    /* renamed from: d */
    public final synchronized boolean mo32579d() {
        boolean z;
        if (!C13326a.m38999a(this.f36679a)) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    /* renamed from: a */
    public final synchronized byte mo32574a(int i) {
        boolean z;
        m40834e();
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        if (i < this.f36680b) {
            z2 = true;
        }
        C13307g.m38943a(z2);
        return ((C13826s) this.f36679a.mo32609a()).read(i);
    }

    public C13829v(C13326a<C13826s> aVar, int i) {
        boolean z;
        C13307g.m38940a(aVar);
        if (i < 0 || i > ((C13826s) aVar.mo32609a()).getSize()) {
            z = false;
        } else {
            z = true;
        }
        C13307g.m38943a(z);
        this.f36679a = aVar.clone();
        this.f36680b = i;
    }

    /* renamed from: a */
    public final synchronized int mo32576a(int i, byte[] bArr, int i2, int i3) {
        boolean z;
        m40834e();
        if (i + i3 <= this.f36680b) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        return ((C13826s) this.f36679a.mo32609a()).read(i, bArr, i2, i3);
    }
}
