package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public class bch extends bcj implements aan {

    /* renamed from: f */
    private abo f41446f;

    /* renamed from: g */
    private String f41447g;

    /* renamed from: h */
    private boolean f41448h;

    /* renamed from: i */
    private long f41449i;

    public bch(String str) {
        this.f41447g = str;
    }

    /* renamed from: a */
    public final void mo39058a(abo abo) {
        this.f41446f = abo;
    }

    /* renamed from: a */
    public final String mo39057a() {
        return this.f41447g;
    }

    /* renamed from: a */
    public final void mo39059a(bcl bcl, ByteBuffer byteBuffer, long j, C16169xm xmVar) throws IOException {
        this.f41449i = bcl.mo39637b() - ((long) byteBuffer.remaining());
        this.f41448h = byteBuffer.remaining() == 16;
        mo40492a(bcl, j, xmVar);
    }

    /* renamed from: a */
    public final void mo40492a(bcl bcl, long j, C16169xm xmVar) throws IOException {
        this.f41455b = bcl;
        this.f41456c = bcl.mo39637b();
        this.f41457d = this.f41456c - ((long) ((this.f41448h || 8 + j >= 4294967296L) ? 16 : 8));
        bcl.mo39636a(bcl.mo39637b() + j);
        this.f41458e = bcl.mo39637b();
        this.f41454a = xmVar;
    }
}
