package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.C13307g;
import com.facebook.common.memory.C13324i;
import com.facebook.common.references.C13326a;
import java.io.IOException;

public final class MemoryPooledByteBufferOutputStream extends C13324i {

    /* renamed from: a */
    private final C13827t f36600a;

    /* renamed from: b */
    private C13326a<C13826s> f36601b;

    /* renamed from: c */
    private int f36602c;

    public static class InvalidStreamException extends RuntimeException {
        public InvalidStreamException() {
            super("OutputStream no longer valid");
        }
    }

    /* renamed from: b */
    public final int mo32603b() {
        return this.f36602c;
    }

    /* renamed from: d */
    private void m40716d() {
        if (!C13326a.m38999a(this.f36601b)) {
            throw new InvalidStreamException();
        }
    }

    /* renamed from: c */
    public final C13829v mo32602a() {
        m40716d();
        return new C13829v(this.f36601b, this.f36602c);
    }

    public final void close() {
        C13326a.m39001c(this.f36601b);
        this.f36601b = null;
        this.f36602c = -1;
        super.close();
    }

    public MemoryPooledByteBufferOutputStream(C13827t tVar) {
        this(tVar, tVar.mo33449b());
    }

    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    /* renamed from: a */
    private void m40715a(int i) {
        m40716d();
        if (i > ((C13826s) this.f36601b.mo32609a()).getSize()) {
            C13826s sVar = (C13826s) this.f36600a.mo32581a(i);
            ((C13826s) this.f36601b.mo32609a()).copy(0, sVar, 0, this.f36602c);
            this.f36601b.close();
            this.f36601b = C13326a.m38996a(sVar, this.f36600a);
        }
    }

    public MemoryPooledByteBufferOutputStream(C13827t tVar, int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        C13307g.m38943a(z);
        this.f36600a = (C13827t) C13307g.m38940a(tVar);
        this.f36602c = 0;
        this.f36601b = C13326a.m38996a(this.f36600a.mo32581a(i), this.f36600a);
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        if (i < 0 || i2 < 0 || i + i2 > bArr.length) {
            StringBuilder sb = new StringBuilder("length=");
            sb.append(bArr.length);
            sb.append("; regionStart=");
            sb.append(i);
            sb.append("; regionLength=");
            sb.append(i2);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        m40716d();
        m40715a(this.f36602c + i2);
        ((C13826s) this.f36601b.mo32609a()).write(this.f36602c, bArr, i, i2);
        this.f36602c += i2;
    }
}
