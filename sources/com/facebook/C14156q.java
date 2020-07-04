package com.facebook;

import android.os.Handler;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.q */
final class C14156q extends OutputStream implements C14477s {

    /* renamed from: a */
    public final Map<GraphRequest, C14635t> f37407a = new HashMap();

    /* renamed from: b */
    public int f37408b;

    /* renamed from: c */
    private final Handler f37409c;

    /* renamed from: d */
    private GraphRequest f37410d;

    /* renamed from: e */
    private C14635t f37411e;

    public final void write(int i) {
        mo33917a(1);
    }

    C14156q(Handler handler) {
        this.f37409c = handler;
    }

    public final void write(byte[] bArr) {
        mo33917a((long) bArr.length);
    }

    /* renamed from: a */
    public final void mo33918a(GraphRequest graphRequest) {
        C14635t tVar;
        this.f37410d = graphRequest;
        if (graphRequest != null) {
            tVar = (C14635t) this.f37407a.get(graphRequest);
        } else {
            tVar = null;
        }
        this.f37411e = tVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo33917a(long j) {
        if (this.f37411e == null) {
            this.f37411e = new C14635t(this.f37409c, this.f37410d);
            this.f37407a.put(this.f37410d, this.f37411e);
        }
        this.f37411e.mo36871b(j);
        this.f37408b = (int) (((long) this.f37408b) + j);
    }

    public final void write(byte[] bArr, int i, int i2) {
        mo33917a((long) i2);
    }
}
