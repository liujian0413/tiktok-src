package com.bytedance.android.p109c.p110a.p111a;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.bytedance.android.c.a.a.c */
final class C2266c extends C2268a {

    /* renamed from: a */
    private final InputStream f7543a;

    /* renamed from: b */
    private final int f7544b;

    /* renamed from: b */
    public final byte mo8050b() throws IOException {
        return (byte) this.f7543a.read();
    }

    /* renamed from: a */
    public final boolean mo8049a() throws IOException {
        if (this.f7543a.available() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo8048a(long j) throws IOException {
        this.f7543a.skip(j);
    }

    C2266c(InputStream inputStream) {
        int i;
        this.f7543a = inputStream;
        try {
            i = inputStream.available();
        } catch (IOException unused) {
            i = -1;
        }
        this.f7544b = i;
    }

    /* renamed from: b */
    public final byte[] mo8051b(long j) throws IOException {
        byte[] bArr = new byte[((int) j)];
        this.f7543a.read(bArr);
        return bArr;
    }

    /* renamed from: c */
    public final String mo8052c(long j) throws IOException {
        return new String(mo8051b(j));
    }
}
