package com.fasterxml.jackson.core.p735b;

import com.fasterxml.jackson.core.C14668d;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.p734a.C14648b;
import com.fasterxml.jackson.core.p736c.C14662a;
import com.fasterxml.jackson.core.p737io.C14673b;
import com.fasterxml.jackson.core.p737io.C14674c;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.fasterxml.jackson.core.b.h */
public final class C14659h extends C14648b {

    /* renamed from: y */
    private static final int[] f37865y = C14673b.m42438b();

    /* renamed from: z */
    private static final int[] f37866z = C14673b.m42437a();

    /* renamed from: s */
    protected C14668d f37867s;

    /* renamed from: t */
    protected final C14662a f37868t;

    /* renamed from: u */
    protected int[] f37869u = new int[16];

    /* renamed from: v */
    protected InputStream f37870v;

    /* renamed from: w */
    protected byte[] f37871w;

    /* renamed from: x */
    protected boolean f37872x;

    public final void close() throws IOException {
        super.close();
        this.f37868t.mo37157b();
    }

    /* renamed from: a */
    public final void mo37140a() throws IOException {
        if (this.f37870v != null) {
            if (this.f37816b.f37935c || mo37113a(Feature.AUTO_CLOSE_SOURCE)) {
                this.f37870v.close();
            }
            this.f37870v = null;
        }
    }

    /* renamed from: b */
    public final void mo37141b() throws IOException {
        super.mo37141b();
        if (this.f37872x) {
            byte[] bArr = this.f37871w;
            if (bArr != null) {
                this.f37871w = null;
                this.f37816b.mo37195a(bArr);
            }
        }
    }

    public C14659h(C14674c cVar, int i, InputStream inputStream, C14668d dVar, C14662a aVar, byte[] bArr, int i2, int i3, boolean z) {
        super(cVar, i);
        this.f37870v = inputStream;
        this.f37867s = dVar;
        this.f37868t = aVar;
        this.f37871w = bArr;
        this.f37818d = i2;
        this.f37819e = i3;
        this.f37872x = z;
    }
}
