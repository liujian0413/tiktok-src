package com.bytedance.android.p109c.p110a.p111a;

import java.nio.charset.Charset;

/* renamed from: com.bytedance.android.c.a.a.a */
final class C2264a extends C2268a {

    /* renamed from: a */
    private final byte[] f7541a;

    /* renamed from: b */
    private int f7542b;

    /* renamed from: a */
    public final boolean mo8049a() {
        if (this.f7541a.length - this.f7542b > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final byte mo8050b() {
        byte[] bArr = this.f7541a;
        int i = this.f7542b;
        this.f7542b = i + 1;
        return bArr[i];
    }

    C2264a(byte[] bArr) {
        this.f7541a = bArr;
    }

    /* renamed from: a */
    public final void mo8048a(long j) {
        this.f7542b = (int) (((long) this.f7542b) + j);
    }

    /* renamed from: b */
    public final byte[] mo8051b(long j) {
        int i = (int) j;
        byte[] bArr = new byte[i];
        System.arraycopy(this.f7541a, this.f7542b, bArr, 0, i);
        this.f7542b += i;
        return bArr;
    }

    /* renamed from: c */
    public final String mo8052c(long j) {
        String str = new String(this.f7541a, this.f7542b, (int) j, Charset.forName("UTF-8"));
        this.f7542b = (int) (((long) this.f7542b) + j);
        return str;
    }
}
