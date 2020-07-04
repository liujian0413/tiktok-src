package com.google.gson.internal.bind;

import com.google.gson.C6609h;
import com.google.gson.C6709k;
import com.google.gson.C6710l;
import com.google.gson.C6711m;
import com.google.gson.C6712o;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.gson.internal.bind.d */
public final class C6641d extends C6720b {

    /* renamed from: d */
    private static final Writer f19057d = new Writer() {
        public final void close() throws IOException {
            throw new AssertionError();
        }

        public final void flush() throws IOException {
            throw new AssertionError();
        }

        public final void write(char[] cArr, int i, int i2) {
            throw new AssertionError();
        }
    };

    /* renamed from: e */
    private static final C6712o f19058e = new C6712o("closed");

    /* renamed from: f */
    private final List<C6709k> f19059f = new ArrayList();

    /* renamed from: g */
    private String f19060g;

    /* renamed from: h */
    private C6709k f19061h = C6710l.f19164a;

    public final void flush() throws IOException {
    }

    /* renamed from: f */
    public final C6720b mo16115f() throws IOException {
        m20609a((C6709k) C6710l.f19164a);
        return this;
    }

    /* renamed from: b */
    public final C6720b mo16109b() throws IOException {
        C6609h hVar = new C6609h();
        m20609a((C6709k) hVar);
        this.f19059f.add(hVar);
        return this;
    }

    /* renamed from: d */
    public final C6720b mo16113d() throws IOException {
        C6711m mVar = new C6711m();
        m20609a((C6709k) mVar);
        this.f19059f.add(mVar);
        return this;
    }

    public C6641d() {
        super(f19057d);
    }

    /* renamed from: g */
    private C6709k m20610g() {
        return (C6709k) this.f19059f.get(this.f19059f.size() - 1);
    }

    public final void close() throws IOException {
        if (this.f19059f.isEmpty()) {
            this.f19059f.add(f19058e);
            return;
        }
        throw new IOException("Incomplete document");
    }

    /* renamed from: c */
    public final C6720b mo16111c() throws IOException {
        if (this.f19059f.isEmpty() || this.f19060g != null) {
            throw new IllegalStateException();
        } else if (m20610g() instanceof C6609h) {
            this.f19059f.remove(this.f19059f.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: e */
    public final C6720b mo16114e() throws IOException {
        if (this.f19059f.isEmpty() || this.f19060g != null) {
            throw new IllegalStateException();
        } else if (m20610g() instanceof C6711m) {
            this.f19059f.remove(this.f19059f.size() - 1);
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final C6709k mo16102a() {
        if (this.f19059f.isEmpty()) {
            return this.f19061h;
        }
        StringBuilder sb = new StringBuilder("Expected one JSON element but was ");
        sb.append(this.f19059f);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final C6720b mo16104a(long j) throws IOException {
        m20609a((C6709k) new C6712o((Number) Long.valueOf(j)));
        return this;
    }

    /* renamed from: a */
    public final C6720b mo16105a(Boolean bool) throws IOException {
        if (bool == null) {
            return mo16115f();
        }
        m20609a((C6709k) new C6712o(bool));
        return this;
    }

    /* renamed from: b */
    public final C6720b mo16110b(String str) throws IOException {
        if (str == null) {
            return mo16115f();
        }
        m20609a((C6709k) new C6712o(str));
        return this;
    }

    /* renamed from: a */
    private void m20609a(C6709k kVar) {
        if (this.f19060g != null) {
            if (!kVar.mo16135l() || this.f19189c) {
                ((C6711m) m20610g()).mo16144a(this.f19060g, kVar);
            }
            this.f19060g = null;
        } else if (this.f19059f.isEmpty()) {
            this.f19061h = kVar;
        } else {
            C6709k g = m20610g();
            if (g instanceof C6609h) {
                ((C6609h) g).mo15996a(kVar);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final C6720b mo16103a(double d) throws IOException {
        if (this.f19187a || (!Double.isNaN(d) && !Double.isInfinite(d))) {
            m20609a((C6709k) new C6712o((Number) Double.valueOf(d)));
            return this;
        }
        StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
        sb.append(d);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public final C6720b mo16106a(Number number) throws IOException {
        if (number == null) {
            return mo16115f();
        }
        if (!this.f19187a) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                StringBuilder sb = new StringBuilder("JSON forbids NaN and infinities: ");
                sb.append(number);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        m20609a((C6709k) new C6712o(number));
        return this;
    }

    /* renamed from: a */
    public final C6720b mo16107a(String str) throws IOException {
        if (this.f19059f.isEmpty() || this.f19060g != null) {
            throw new IllegalStateException();
        } else if (m20610g() instanceof C6711m) {
            this.f19060g = str;
            return this;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final C6720b mo16108a(boolean z) throws IOException {
        m20609a((C6709k) new C6712o(Boolean.valueOf(z)));
        return this;
    }
}
