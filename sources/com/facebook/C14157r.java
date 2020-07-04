package com.facebook;

import android.os.Handler;
import com.facebook.C14064l.C14065a;
import com.facebook.C14064l.C14066b;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

/* renamed from: com.facebook.r */
final class C14157r extends FilterOutputStream implements C14477s {

    /* renamed from: a */
    public final C14064l f37412a;

    /* renamed from: b */
    public long f37413b;

    /* renamed from: c */
    public long f37414c;

    /* renamed from: d */
    private final Map<GraphRequest, C14635t> f37415d;

    /* renamed from: e */
    private final long f37416e = C13499h.m39724j();

    /* renamed from: f */
    private long f37417f;

    /* renamed from: g */
    private C14635t f37418g;

    /* renamed from: a */
    private void m41782a() {
        if (this.f37413b > this.f37417f) {
            for (C14065a aVar : this.f37412a.f37146e) {
                if (aVar instanceof C14066b) {
                    Handler handler = this.f37412a.f37142a;
                    final C14066b bVar = (C14066b) aVar;
                    if (handler != null) {
                        handler.post(new Runnable() {
                            public final void run() {
                            }
                        });
                    }
                }
            }
            this.f37417f = this.f37413b;
        }
    }

    public final void close() throws IOException {
        super.close();
        for (C14635t a : this.f37415d.values()) {
            a.mo36869a();
        }
        m41782a();
    }

    /* renamed from: a */
    public final void mo33918a(GraphRequest graphRequest) {
        C14635t tVar;
        if (graphRequest != null) {
            tVar = (C14635t) this.f37415d.get(graphRequest);
        } else {
            tVar = null;
        }
        this.f37418g = tVar;
    }

    public final void write(int i) throws IOException {
        this.out.write(i);
        m41783a(1);
    }

    public final void write(byte[] bArr) throws IOException {
        this.out.write(bArr);
        m41783a((long) bArr.length);
    }

    /* renamed from: a */
    private void m41783a(long j) {
        if (this.f37418g != null) {
            this.f37418g.mo36870a(j);
        }
        this.f37413b += j;
        if (this.f37413b >= this.f37417f + this.f37416e || this.f37413b >= this.f37414c) {
            m41782a();
        }
    }

    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.out.write(bArr, i, i2);
        m41783a((long) i2);
    }

    C14157r(OutputStream outputStream, C14064l lVar, Map<GraphRequest, C14635t> map, long j) {
        super(outputStream);
        this.f37412a = lVar;
        this.f37415d = map;
        this.f37414c = j;
    }
}
