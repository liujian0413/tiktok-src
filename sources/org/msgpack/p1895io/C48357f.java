package org.msgpack.p1895io;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: org.msgpack.io.f */
public final class C48357f extends C48354c {

    /* renamed from: e */
    private LinkedList<C48358a> f123480e = new LinkedList<>();

    /* renamed from: f */
    private int f123481f;

    /* renamed from: org.msgpack.io.f$a */
    static final class C48358a {

        /* renamed from: a */
        final byte[] f123482a;

        /* renamed from: b */
        final int f123483b;

        /* renamed from: c */
        final int f123484c;

        C48358a(byte[] bArr, int i, int i2) {
            this.f123482a = bArr;
            this.f123483b = i;
            this.f123484c = i2;
        }
    }

    public final void close() {
    }

    public final /* bridge */ /* synthetic */ void flush() throws IOException {
        super.flush();
    }

    /* renamed from: a */
    public final byte[] mo121903a() {
        byte[] bArr = new byte[(this.f123481f + this.f123471b)];
        Iterator it = this.f123480e.iterator();
        int i = 0;
        while (it.hasNext()) {
            C48358a aVar = (C48358a) it.next();
            System.arraycopy(aVar.f123482a, aVar.f123483b, bArr, i, aVar.f123484c);
            i += aVar.f123484c;
        }
        if (this.f123471b > 0) {
            System.arraycopy(this.f123470a, 0, bArr, i, this.f123471b);
        }
        return bArr;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121879a(byte b) throws IOException {
        super.mo121879a(b);
    }

    public C48357f(int i) {
        super(i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121886a(ByteBuffer byteBuffer) throws IOException {
        super.mo121886a(byteBuffer);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121880a(byte b, byte b2) throws IOException {
        super.mo121880a(b, b2);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121881a(byte b, double d) throws IOException {
        super.mo121881a(b, d);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121882a(byte b, float f) throws IOException {
        super.mo121882a(b, f);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121883a(byte b, int i) throws IOException {
        super.mo121883a(b, i);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121884a(byte b, long j) throws IOException {
        super.mo121884a(b, j);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121885a(byte b, short s) throws IOException {
        super.mo121885a(b, s);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo121888b(byte[] bArr, int i, int i2) {
        this.f123480e.add(new C48358a(bArr, i, i2));
        this.f123481f += i2;
        return false;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo121887a(byte[] bArr, int i, int i2) throws IOException {
        super.mo121887a(bArr, i, i2);
    }
}
