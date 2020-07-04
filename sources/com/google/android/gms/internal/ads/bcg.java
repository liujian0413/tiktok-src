package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.nio.ByteBuffer;

public abstract class bcg implements aan {

    /* renamed from: a */
    private static bcr f41435a = bcr.m48435a(bcg.class);

    /* renamed from: b */
    private String f41436b;

    /* renamed from: c */
    boolean f41437c;

    /* renamed from: d */
    private abo f41438d;

    /* renamed from: e */
    private boolean f41439e;

    /* renamed from: f */
    private ByteBuffer f41440f;

    /* renamed from: g */
    private long f41441g;

    /* renamed from: h */
    private long f41442h;

    /* renamed from: i */
    private long f41443i = -1;

    /* renamed from: j */
    private bcl f41444j;

    /* renamed from: k */
    private ByteBuffer f41445k;

    /* renamed from: c */
    private final synchronized void mo40494c() {
        if (!this.f41439e) {
            try {
                bcr bcr = f41435a;
                String str = "mem mapping ";
                String valueOf = String.valueOf(this.f41436b);
                bcr.mo40501a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
                this.f41440f = this.f41444j.mo39635a(this.f41441g, this.f41443i);
                this.f41439e = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo39227a(ByteBuffer byteBuffer);

    protected bcg(String str) {
        this.f41436b = str;
        this.f41439e = true;
        this.f41437c = true;
    }

    /* renamed from: a */
    public final void mo39059a(bcl bcl, ByteBuffer byteBuffer, long j, C16169xm xmVar) throws IOException {
        this.f41441g = bcl.mo39637b();
        this.f41442h = this.f41441g - ((long) byteBuffer.remaining());
        this.f41443i = j;
        this.f41444j = bcl;
        bcl.mo39636a(bcl.mo39637b() + j);
        this.f41439e = false;
        this.f41437c = false;
        mo40491b();
    }

    /* renamed from: b */
    public final synchronized void mo40491b() {
        mo40494c();
        bcr bcr = f41435a;
        String str = "parsing details of ";
        String valueOf = String.valueOf(this.f41436b);
        bcr.mo40501a(valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        if (this.f41440f != null) {
            ByteBuffer byteBuffer = this.f41440f;
            this.f41437c = true;
            byteBuffer.rewind();
            mo39227a(byteBuffer);
            if (byteBuffer.remaining() > 0) {
                this.f41445k = byteBuffer.slice();
            }
            this.f41440f = null;
        }
    }

    /* renamed from: a */
    public final String mo39057a() {
        return this.f41436b;
    }

    /* renamed from: a */
    public final void mo39058a(abo abo) {
        this.f41438d = abo;
    }
}
