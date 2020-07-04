package com.google.common.collect;

import com.google.common.base.C17404c;
import com.google.common.base.C17430i;
import com.google.common.base.C17430i.C17432a;
import com.google.common.base.C17439m;
import com.google.common.base.Equivalence;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.common.collect.bv */
public final class C17800bv {

    /* renamed from: a */
    boolean f49040a;

    /* renamed from: b */
    int f49041b = -1;

    /* renamed from: c */
    int f49042c = -1;

    /* renamed from: d */
    C17821o f49043d;

    /* renamed from: e */
    C17821o f49044e;

    /* renamed from: f */
    Equivalence<Object> f49045f;

    /* renamed from: d */
    public final C17800bv mo46020d() {
        return mo46015a(C17821o.WEAK);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo46016b() {
        if (this.f49041b == -1) {
            return 16;
        }
        return this.f49041b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo46019c() {
        if (this.f49042c == -1) {
            return 4;
        }
        return this.f49042c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final C17821o mo46021e() {
        return (C17821o) C17430i.m57945a(this.f49043d, C17821o.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final C17821o mo46022f() {
        return (C17821o) C17430i.m57945a(this.f49044e, C17821o.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final Equivalence<Object> mo46012a() {
        return (Equivalence) C17430i.m57945a(this.f49045f, mo46021e().mo46101a());
    }

    /* renamed from: g */
    public final <K, V> ConcurrentMap<K, V> mo46023g() {
        if (!this.f49040a) {
            return new ConcurrentHashMap(mo46016b(), 0.75f, mo46019c());
        }
        return C17801bw.m59173a(this);
    }

    public final String toString() {
        C17432a a = C17430i.m57944a(this);
        if (this.f49041b != -1) {
            a.mo44921a("initialCapacity", this.f49041b);
        }
        if (this.f49042c != -1) {
            a.mo44921a("concurrencyLevel", this.f49042c);
        }
        if (this.f49043d != null) {
            a.mo44923a("keyStrength", (Object) C17404c.m57886a(this.f49043d.toString()));
        }
        if (this.f49044e != null) {
            a.mo44923a("valueStrength", (Object) C17404c.m57886a(this.f49044e.toString()));
        }
        if (this.f49045f != null) {
            a.mo44919a("keyEquivalence");
        }
        return a.toString();
    }

    /* renamed from: b */
    public final C17800bv mo46017b(int i) {
        boolean z;
        boolean z2 = false;
        if (this.f49042c == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57983b(z, "concurrency level was already set to %s", this.f49042c);
        if (i > 0) {
            z2 = true;
        }
        C17439m.m57968a(z2);
        this.f49042c = i;
        return this;
    }

    /* renamed from: a */
    public final C17800bv mo46013a(int i) {
        boolean z;
        boolean z2 = false;
        if (this.f49041b == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57983b(z, "initial capacity was already set to %s", this.f49041b);
        if (i >= 0) {
            z2 = true;
        }
        C17439m.m57968a(z2);
        this.f49041b = i;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17800bv mo46018b(C17821o oVar) {
        boolean z;
        if (this.f49044e == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "Value strength was already set to %s", (Object) this.f49044e);
        this.f49044e = (C17821o) C17439m.m57962a(oVar);
        if (oVar != C17821o.STRONG) {
            this.f49040a = true;
        }
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17800bv mo46014a(Equivalence<Object> equivalence) {
        boolean z;
        if (this.f49045f == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "key equivalence was already set to %s", (Object) this.f49045f);
        this.f49045f = (Equivalence) C17439m.m57962a(equivalence);
        this.f49040a = true;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17800bv mo46015a(C17821o oVar) {
        boolean z;
        if (this.f49043d == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "Key strength was already set to %s", (Object) this.f49043d);
        this.f49043d = (C17821o) C17439m.m57962a(oVar);
        if (oVar != C17821o.STRONG) {
            this.f49040a = true;
        }
        return this;
    }
}
