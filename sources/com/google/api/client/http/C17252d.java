package com.google.api.client.http;

import com.google.api.client.util.C17384w;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

/* renamed from: com.google.api.client.http.d */
public final class C17252d extends C17241b {

    /* renamed from: b */
    private final byte[] f48069b;

    /* renamed from: c */
    private final int f48070c;

    /* renamed from: d */
    private final int f48071d;

    /* renamed from: a */
    public final long mo44564a() {
        return (long) this.f48071d;
    }

    /* renamed from: d */
    public final boolean mo44567d() {
        return true;
    }

    /* renamed from: b */
    public final InputStream mo44595b() {
        return new ByteArrayInputStream(this.f48069b, this.f48070c, this.f48071d);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17252d mo44593a(String str) {
        return (C17252d) super.mo44593a(str);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C17252d mo44594a(boolean z) {
        return (C17252d) super.mo44594a(z);
    }

    public C17252d(String str, byte[] bArr, int i, int i2) {
        boolean z;
        super(str);
        this.f48069b = (byte[]) C17384w.m57847a(bArr);
        if (i2 < 0 || i2 + 0 > bArr.length) {
            z = false;
        } else {
            z = true;
        }
        C17384w.m57852a(z, "offset %s, length %s, array length %s", Integer.valueOf(0), Integer.valueOf(i2), Integer.valueOf(bArr.length));
        this.f48070c = 0;
        this.f48071d = i2;
    }
}
