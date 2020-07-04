package com.fasterxml.jackson.core.p735b;

import com.fasterxml.jackson.core.C14668d;
import com.fasterxml.jackson.core.C14670f;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator.Feature;
import com.fasterxml.jackson.core.p737io.C14673b;
import com.fasterxml.jackson.core.p737io.C14674c;
import java.io.IOException;
import java.io.Writer;

/* renamed from: com.fasterxml.jackson.core.b.i */
public final class C14660i extends C14654c {

    /* renamed from: m */
    protected static final char[] f37873m = C14673b.m42440d();

    /* renamed from: n */
    protected final Writer f37874n;

    /* renamed from: o */
    protected char[] f37875o;

    /* renamed from: p */
    protected int f37876p;

    /* renamed from: q */
    protected int f37877q;

    /* renamed from: r */
    protected int f37878r = this.f37875o.length;

    /* renamed from: a */
    public final void mo37149a() {
        char[] cArr = this.f37875o;
        if (cArr != null) {
            this.f37875o = null;
            this.f37837h.mo37198b(cArr);
        }
    }

    /* renamed from: d */
    private void m42405d() throws IOException {
        int i = this.f37877q - this.f37876p;
        if (i > 0) {
            int i2 = this.f37876p;
            this.f37876p = 0;
            this.f37877q = 0;
            this.f37874n.write(this.f37875o, i2, i);
        }
    }

    public final void flush() throws IOException {
        m42405d();
        if (this.f37874n != null && mo37138a(Feature.FLUSH_PASSED_TO_STREAM)) {
            this.f37874n.flush();
        }
    }

    /* renamed from: b */
    private void m42402b() throws IOException, JsonGenerationException {
        if (!this.f37806e.mo37151a()) {
            StringBuilder sb = new StringBuilder("Current context not an ARRAY but ");
            sb.append(this.f37806e.mo37153c());
            m42362b(sb.toString());
        }
        if (this.f37796a != null) {
            this.f37796a.writeEndArray(this, this.f37806e.mo37154d());
        } else {
            if (this.f37877q >= this.f37878r) {
                m42405d();
            }
            char[] cArr = this.f37875o;
            int i = this.f37877q;
            this.f37877q = i + 1;
            cArr[i] = ']';
        }
        this.f37806e = this.f37806e.f37846c;
    }

    /* renamed from: c */
    private void m42403c() throws IOException, JsonGenerationException {
        if (!this.f37806e.mo37152b()) {
            StringBuilder sb = new StringBuilder("Current context not an object but ");
            sb.append(this.f37806e.mo37153c());
            m42362b(sb.toString());
        }
        if (this.f37796a != null) {
            this.f37796a.writeEndObject(this, this.f37806e.mo37154d());
        } else {
            if (this.f37877q >= this.f37878r) {
                m42405d();
            }
            char[] cArr = this.f37875o;
            int i = this.f37877q;
            this.f37877q = i + 1;
            cArr[i] = '}';
        }
        this.f37806e = this.f37806e.f37846c;
    }

    public final void close() throws IOException {
        super.close();
        if (this.f37875o != null && mo37138a(Feature.AUTO_CLOSE_JSON_CONTENT)) {
            while (true) {
                C14656e eVar = this.f37806e;
                if (!eVar.mo37151a()) {
                    if (!eVar.mo37152b()) {
                        break;
                    }
                    m42403c();
                } else {
                    m42402b();
                }
            }
        }
        m42405d();
        if (this.f37874n != null) {
            if (this.f37837h.f37935c || mo37138a(Feature.AUTO_CLOSE_TARGET)) {
                this.f37874n.close();
            } else if (mo37138a(Feature.FLUSH_PASSED_TO_STREAM)) {
                this.f37874n.flush();
            }
        }
        mo37149a();
    }

    /* renamed from: b */
    public final void mo37102b(C14670f fVar) throws IOException, JsonGenerationException {
        mo37100a(fVar.getValue());
    }

    /* renamed from: a */
    public final void mo37099a(char c) throws IOException, JsonGenerationException {
        if (this.f37877q >= this.f37878r) {
            m42405d();
        }
        char[] cArr = this.f37875o;
        int i = this.f37877q;
        this.f37877q = i + 1;
        cArr[i] = c;
    }

    /* renamed from: c */
    private void m42404c(String str) throws IOException, JsonGenerationException {
        int i = this.f37878r - this.f37877q;
        str.getChars(0, i, this.f37875o, this.f37877q);
        this.f37877q += i;
        m42405d();
        int length = str.length() - i;
        while (length > this.f37878r) {
            int i2 = this.f37878r;
            int i3 = i + i2;
            str.getChars(i, i3, this.f37875o, 0);
            this.f37876p = 0;
            this.f37877q = i2;
            m42405d();
            length -= i2;
            i = i3;
        }
        str.getChars(i, i + length, this.f37875o, 0);
        this.f37876p = 0;
        this.f37877q = length;
    }

    /* renamed from: a */
    public final void mo37100a(String str) throws IOException, JsonGenerationException {
        int length = str.length();
        int i = this.f37878r - this.f37877q;
        if (i == 0) {
            m42405d();
            i = this.f37878r - this.f37877q;
        }
        if (i >= length) {
            str.getChars(0, length, this.f37875o, this.f37877q);
            this.f37877q += length;
            return;
        }
        m42404c(str);
    }

    /* renamed from: a */
    public final void mo37101a(char[] cArr, int i, int i2) throws IOException, JsonGenerationException {
        if (i2 < 32) {
            if (i2 > this.f37878r - this.f37877q) {
                m42405d();
            }
            System.arraycopy(cArr, 0, this.f37875o, this.f37877q, i2);
            this.f37877q += i2;
            return;
        }
        m42405d();
        this.f37874n.write(cArr, 0, i2);
    }

    public C14660i(C14674c cVar, int i, C14668d dVar, Writer writer) {
        super(cVar, i, dVar);
        this.f37874n = writer;
        this.f37875o = cVar.mo37203e();
    }
}
