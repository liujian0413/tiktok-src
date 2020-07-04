package com.google.gson;

import com.google.gson.internal.C6700i;
import com.google.gson.stream.C6720b;
import java.io.IOException;
import java.io.StringWriter;

/* renamed from: com.google.gson.k */
public abstract class C6709k {
    /* renamed from: i */
    public final boolean mo16132i() {
        return this instanceof C6609h;
    }

    /* renamed from: j */
    public final boolean mo16133j() {
        return this instanceof C6711m;
    }

    /* renamed from: k */
    public final boolean mo16134k() {
        return this instanceof C6712o;
    }

    /* renamed from: l */
    public final boolean mo16135l() {
        return this instanceof C6710l;
    }

    /* renamed from: b */
    public Number mo15997b() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: c */
    public String mo15998c() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: d */
    public double mo15999d() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: e */
    public float mo16000e() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: f */
    public long mo16002f() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: g */
    public int mo16003g() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: h */
    public boolean mo16004h() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public Boolean mo16139p() {
        throw new UnsupportedOperationException(getClass().getSimpleName());
    }

    /* renamed from: m */
    public final C6711m mo16136m() {
        if (mo16133j()) {
            return (C6711m) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Object: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: n */
    public final C6609h mo16137n() {
        if (mo16132i()) {
            return (C6609h) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Array: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: o */
    public final C6712o mo16138o() {
        if (mo16134k()) {
            return (C6712o) this;
        }
        StringBuilder sb = new StringBuilder("Not a JSON Primitive: ");
        sb.append(this);
        throw new IllegalStateException(sb.toString());
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            C6720b bVar = new C6720b(stringWriter);
            bVar.f19187a = true;
            C6700i.m20727a(this, bVar);
            return stringWriter.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
