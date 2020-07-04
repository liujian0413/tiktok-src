package com.google.api.client.http;

import com.google.api.client.util.C17347ab;
import com.google.api.client.util.C17361f;
import com.google.api.client.util.C17372l;
import com.google.api.client.util.C17376q;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.GZIPInputStream;

/* renamed from: com.google.api.client.http.r */
public final class C17269r {

    /* renamed from: a */
    public final String f48122a;

    /* renamed from: b */
    public final String f48123b;

    /* renamed from: c */
    public final C17265n f48124c;

    /* renamed from: d */
    C17276y f48125d;

    /* renamed from: e */
    public final int f48126e;

    /* renamed from: f */
    public final String f48127f;

    /* renamed from: g */
    public final C17266o f48128g;

    /* renamed from: h */
    public int f48129h;

    /* renamed from: i */
    public boolean f48130i;

    /* renamed from: j */
    private InputStream f48131j;

    /* renamed from: k */
    private boolean f48132k;

    /* renamed from: a */
    public final C17261l mo44656a() {
        return this.f48128g.f48098c;
    }

    /* renamed from: b */
    public final boolean mo44658b() {
        return C17271t.m57459a(this.f48126e);
    }

    /* renamed from: d */
    public final void mo44660d() throws IOException {
        InputStream c = mo44659c();
        if (c != null) {
            c.close();
        }
    }

    /* renamed from: e */
    public final void mo44661e() throws IOException {
        mo44660d();
        this.f48125d.mo44580h();
    }

    /* renamed from: f */
    public final String mo44662f() throws IOException {
        InputStream c = mo44659c();
        if (c == null) {
            return "";
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C17372l.m57834a(c, byteArrayOutputStream);
        return byteArrayOutputStream.toString(mo44663g().name());
    }

    /* renamed from: g */
    public final Charset mo44663g() {
        if (this.f48124c == null || this.f48124c.mo44638b() == null) {
            return C17361f.f48276b;
        }
        return this.f48124c.mo44638b();
    }

    /* renamed from: h */
    private boolean m57449h() throws IOException {
        int i = this.f48126e;
        if (!this.f48128g.f48105j.equals("HEAD") && i / 100 != 1 && i != 204 && i != 304) {
            return true;
        }
        mo44660d();
        return false;
    }

    /* renamed from: c */
    public final InputStream mo44659c() throws IOException {
        if (!this.f48132k) {
            InputStream a = this.f48125d.mo44571a();
            if (a != null) {
                try {
                    String str = this.f48122a;
                    if (str != null && str.contains("gzip")) {
                        a = new GZIPInputStream(a);
                    }
                    Logger logger = C17272u.f48133a;
                    if (this.f48130i && logger.isLoggable(Level.CONFIG)) {
                        a = new C17376q(a, logger, Level.CONFIG, this.f48129h);
                    }
                    this.f48131j = a;
                } catch (EOFException unused) {
                    a.close();
                } catch (Throwable th) {
                    a.close();
                    throw th;
                }
            }
            this.f48132k = true;
        }
        return this.f48131j;
    }

    /* renamed from: a */
    public final <T> T mo44657a(Class<T> cls) throws IOException {
        if (!m57449h()) {
            return null;
        }
        return this.f48128g.f48112q.mo44592a(mo44659c(), mo44663g(), cls);
    }

    C17269r(C17266o oVar, C17276y yVar) throws IOException {
        StringBuilder sb;
        StringBuilder sb2;
        this.f48128g = oVar;
        this.f48129h = oVar.f48100e;
        this.f48130i = oVar.f48101f;
        this.f48125d = yVar;
        this.f48122a = yVar.mo44573b();
        int e = yVar.mo44577e();
        boolean z = false;
        if (e < 0) {
            e = 0;
        }
        this.f48126e = e;
        String f = yVar.mo44578f();
        this.f48127f = f;
        Logger logger = C17272u.f48133a;
        if (this.f48130i && logger.isLoggable(Level.CONFIG)) {
            z = true;
        }
        C17265n nVar = null;
        if (z) {
            sb = new StringBuilder();
            sb.append("-------------- RESPONSE --------------");
            sb.append(C17347ab.f48262a);
            String d = yVar.mo44576d();
            if (d != null) {
                sb.append(d);
            } else {
                sb.append(this.f48126e);
                if (f != null) {
                    sb.append(' ');
                    sb.append(f);
                }
            }
            sb.append(C17347ab.f48262a);
        } else {
            sb = null;
        }
        C17261l lVar = oVar.f48098c;
        if (z) {
            sb2 = sb;
        } else {
            sb2 = null;
        }
        lVar.mo44618a(yVar, sb2);
        String c = yVar.mo44575c();
        if (c == null) {
            c = oVar.f48098c.mo44616a();
        }
        this.f48123b = c;
        if (c != null) {
            nVar = new C17265n(c);
        }
        this.f48124c = nVar;
        if (z) {
            logger.config(sb.toString());
        }
    }
}
