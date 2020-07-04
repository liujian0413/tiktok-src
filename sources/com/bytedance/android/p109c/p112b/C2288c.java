package com.bytedance.android.p109c.p112b;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: com.bytedance.android.c.b.c */
public final class C2288c {

    /* renamed from: a */
    private ByteBuffer f7578a;

    /* renamed from: b */
    private int f7579b;

    C2288c() {
    }

    /* renamed from: b */
    public final byte mo8092b() {
        return this.f7578a.get();
    }

    /* renamed from: a */
    public final boolean mo8091a() {
        if (this.f7579b - this.f7578a.position() <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final int mo8094c() {
        return ((this.f7578a.get() & 255) << 24) | ((this.f7578a.get() & 255) << 16) | ((this.f7578a.get() & 255) << 8) | (this.f7578a.get() & 255);
    }

    /* renamed from: d */
    public final long mo8096d() {
        return (((long) (this.f7578a.get() & 255)) << 56) | (((long) (this.f7578a.get() & 255)) << 48) | (((long) (this.f7578a.get() & 255)) << 40) | (((long) (this.f7578a.get() & 255)) << 32) | ((long) ((this.f7578a.get() & 255) << 24)) | ((long) ((this.f7578a.get() & 255) << 16)) | ((long) ((this.f7578a.get() & 255) << 8)) | ((long) (this.f7578a.get() & 255));
    }

    /* renamed from: b */
    public final byte[] mo8093b(long j) {
        byte[] bArr = new byte[((int) j)];
        this.f7578a.get(bArr);
        return bArr;
    }

    /* renamed from: c */
    public final String mo8095c(long j) {
        return new String(mo8093b(j), Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public final void mo8090a(long j) {
        this.f7578a.position((int) (((long) this.f7578a.position()) + j));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C2288c mo8089a(ByteBuffer byteBuffer, int i, int i2) {
        this.f7578a = byteBuffer;
        this.f7579b = i2 + i;
        byteBuffer.position(i);
        return this;
    }
}
