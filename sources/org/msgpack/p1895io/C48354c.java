package org.msgpack.p1895io;

import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: org.msgpack.io.c */
abstract class C48354c implements C48359g {

    /* renamed from: a */
    protected byte[] f123470a;

    /* renamed from: b */
    protected int f123471b;

    /* renamed from: c */
    protected final int f123472c;

    /* renamed from: d */
    protected ByteBuffer f123473d;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract boolean mo121888b(byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: a */
    public void mo121887a(byte[] bArr, int i, int i2) throws IOException {
        if (this.f123470a == null) {
            if (this.f123472c < i2) {
                mo121888b(bArr, i, i2);
                return;
            }
            mo121903a();
        }
        if (i2 <= this.f123472c - this.f123471b) {
            System.arraycopy(bArr, i, this.f123470a, this.f123471b, i2);
            this.f123471b += i2;
        } else if (i2 <= this.f123472c) {
            mo121888b(this.f123470a, 0, this.f123471b);
            mo121903a();
            this.f123471b = 0;
            System.arraycopy(bArr, i, this.f123470a, 0, i2);
            this.f123471b = i2;
        } else {
            flush();
            mo121888b(bArr, i, i2);
        }
    }

    /* renamed from: a */
    public void mo121886a(ByteBuffer byteBuffer) throws IOException {
        int remaining = byteBuffer.remaining();
        if (this.f123470a == null) {
            if (this.f123472c < remaining) {
                m149962b(byteBuffer);
                return;
            }
            mo121903a();
        }
        if (remaining <= this.f123472c - this.f123471b) {
            byteBuffer.get(this.f123470a, this.f123471b, remaining);
            this.f123471b += remaining;
        } else if (remaining <= this.f123472c) {
            mo121888b(this.f123470a, 0, this.f123471b);
            mo121903a();
            this.f123471b = 0;
            byteBuffer.get(this.f123470a, 0, remaining);
            this.f123471b = remaining;
        } else {
            flush();
            m149962b(byteBuffer);
        }
    }

    /* renamed from: a */
    public void mo121885a(byte b, short s) throws IOException {
        m149961a(3);
        byte[] bArr = this.f123470a;
        int i = this.f123471b;
        this.f123471b = i + 1;
        bArr[i] = b;
        this.f123473d.putShort(this.f123471b, s);
        this.f123471b += 2;
    }

    /* renamed from: a */
    private void mo121903a() {
        this.f123470a = new byte[this.f123472c];
        this.f123473d = ByteBuffer.wrap(this.f123470a);
    }

    public void flush() throws IOException {
        if (this.f123471b > 0) {
            mo121888b(this.f123470a, 0, this.f123471b);
            this.f123470a = null;
            this.f123471b = 0;
        }
    }

    public C48354c(int i) {
        if (i < 9) {
            i = 9;
        }
        this.f123472c = i;
    }

    /* renamed from: a */
    public void mo121879a(byte b) throws IOException {
        m149961a(1);
        byte[] bArr = this.f123470a;
        int i = this.f123471b;
        this.f123471b = i + 1;
        bArr[i] = b;
    }

    /* renamed from: a */
    private void m149961a(int i) throws IOException {
        if (this.f123470a == null) {
            mo121903a();
            return;
        }
        if (this.f123472c - this.f123471b < i) {
            mo121888b(this.f123470a, 0, this.f123471b);
            this.f123470a = new byte[this.f123472c];
            this.f123473d = ByteBuffer.wrap(this.f123470a);
            this.f123471b = 0;
        }
    }

    /* renamed from: b */
    private void m149962b(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.hasArray()) {
            mo121888b(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            byteBuffer.position(byteBuffer.limit());
            return;
        }
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        mo121888b(bArr, 0, bArr.length);
    }

    /* renamed from: a */
    public void mo121880a(byte b, byte b2) throws IOException {
        m149961a(2);
        byte[] bArr = this.f123470a;
        int i = this.f123471b;
        this.f123471b = i + 1;
        bArr[i] = b;
        byte[] bArr2 = this.f123470a;
        int i2 = this.f123471b;
        this.f123471b = i2 + 1;
        bArr2[i2] = b2;
    }

    /* renamed from: a */
    public void mo121881a(byte b, double d) throws IOException {
        m149961a(9);
        byte[] bArr = this.f123470a;
        int i = this.f123471b;
        this.f123471b = i + 1;
        bArr[i] = b;
        this.f123473d.putDouble(this.f123471b, d);
        this.f123471b += 8;
    }

    /* renamed from: a */
    public void mo121882a(byte b, float f) throws IOException {
        m149961a(5);
        byte[] bArr = this.f123470a;
        int i = this.f123471b;
        this.f123471b = i + 1;
        bArr[i] = b;
        this.f123473d.putFloat(this.f123471b, f);
        this.f123471b += 4;
    }

    /* renamed from: a */
    public void mo121883a(byte b, int i) throws IOException {
        m149961a(5);
        byte[] bArr = this.f123470a;
        int i2 = this.f123471b;
        this.f123471b = i2 + 1;
        bArr[i2] = b;
        this.f123473d.putInt(this.f123471b, i);
        this.f123471b += 4;
    }

    /* renamed from: a */
    public void mo121884a(byte b, long j) throws IOException {
        m149961a(9);
        byte[] bArr = this.f123470a;
        int i = this.f123471b;
        this.f123471b = i + 1;
        bArr[i] = b;
        this.f123473d.putLong(this.f123471b, j);
        this.f123471b += 8;
    }
}
