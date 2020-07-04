package com.fasterxml.jackson.core.p735b;

import com.fasterxml.jackson.core.C14668d;
import com.fasterxml.jackson.core.JsonParser.Feature;
import com.fasterxml.jackson.core.p734a.C14648b;
import com.fasterxml.jackson.core.p736c.C14665b;
import com.fasterxml.jackson.core.p737io.C14674c;
import java.io.IOException;
import java.io.Reader;

/* renamed from: com.fasterxml.jackson.core.b.f */
public final class C14657f extends C14648b {

    /* renamed from: s */
    protected Reader f37848s;

    /* renamed from: t */
    protected char[] f37849t;

    /* renamed from: u */
    protected C14668d f37850u;

    /* renamed from: v */
    protected final C14665b f37851v;

    /* renamed from: w */
    protected final int f37852w;

    /* renamed from: b */
    public final void mo37141b() throws IOException {
        super.mo37141b();
        char[] cArr = this.f37849t;
        if (cArr != null) {
            this.f37849t = null;
            this.f37816b.mo37196a(cArr);
        }
    }

    public final void close() throws IOException {
        super.close();
        this.f37851v.mo37159b();
    }

    /* renamed from: a */
    public final void mo37140a() throws IOException {
        if (this.f37848s != null) {
            if (this.f37816b.f37935c || mo37113a(Feature.AUTO_CLOSE_SOURCE)) {
                this.f37848s.close();
            }
            this.f37848s = null;
        }
    }

    public C14657f(C14674c cVar, int i, Reader reader, C14668d dVar, C14665b bVar) {
        super(cVar, i);
        this.f37848s = reader;
        this.f37849t = cVar.mo37202d();
        this.f37850u = dVar;
        this.f37851v = bVar;
        this.f37852w = bVar.f37906c;
    }
}
