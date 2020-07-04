package com.bytedance.jedi.model.guava.cache;

import com.bytedance.jedi.model.guava.base.C11860a;
import com.bytedance.jedi.model.guava.base.C11860a.C11862a;
import com.bytedance.jedi.model.guava.base.C11864b;
import com.bytedance.jedi.model.guava.base.C11866d;
import com.bytedance.jedi.model.guava.base.Equivalence;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.bytedance.jedi.model.guava.cache.b */
public final class C11874b<K, V> {

    /* renamed from: a */
    static final C11866d f31668a = new C11866d() {
        /* renamed from: a */
        public final long mo29396a() {
            return 0;
        }
    };

    /* renamed from: q */
    private static final Logger f31669q = Logger.getLogger(C11874b.class.getName());

    /* renamed from: b */
    boolean f31670b = true;

    /* renamed from: c */
    int f31671c = -1;

    /* renamed from: d */
    int f31672d = -1;

    /* renamed from: e */
    long f31673e = -1;

    /* renamed from: f */
    long f31674f = -1;

    /* renamed from: g */
    C11930f<? super K, ? super V> f31675g;

    /* renamed from: h */
    C11912n f31676h;

    /* renamed from: i */
    C11912n f31677i;

    /* renamed from: j */
    long f31678j = -1;

    /* renamed from: k */
    long f31679k = -1;

    /* renamed from: l */
    long f31680l = -1;

    /* renamed from: m */
    Equivalence<Object> f31681m;

    /* renamed from: n */
    Equivalence<Object> f31682n;

    /* renamed from: o */
    C11929e<? super K, ? super V> f31683o;

    /* renamed from: p */
    C11866d f31684p;

    /* renamed from: com.bytedance.jedi.model.guava.cache.b$a */
    enum C11876a implements C11929e<Object, Object> {
        INSTANCE
    }

    /* renamed from: com.bytedance.jedi.model.guava.cache.b$b */
    enum C11877b implements C11930f<Object, Object> {
        INSTANCE
    }

    /* renamed from: a */
    public static C11874b<Object, Object> m34670a() {
        return new C11874b<>();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo29409d() {
        if (this.f31671c == -1) {
            return 16;
        }
        return this.f31671c;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo29410e() {
        if (this.f31672d == -1) {
            return 4;
        }
        return this.f31672d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final <K1 extends K, V1 extends V> C11930f<K1, V1> mo29412g() {
        return (C11930f) C11860a.m34647a(this.f31675g, C11877b.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final C11912n mo29413h() {
        return (C11912n) C11860a.m34647a(this.f31676h, C11912n.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final C11912n mo29414i() {
        return (C11912n) C11860a.m34647a(this.f31677i, C11912n.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final long mo29415j() {
        if (this.f31678j == -1) {
            return 0;
        }
        return this.f31678j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final long mo29416k() {
        if (this.f31679k == -1) {
            return 0;
        }
        return this.f31679k;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final long mo29417l() {
        if (this.f31680l == -1) {
            return 0;
        }
        return this.f31680l;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final <K1 extends K, V1 extends V> C11929e<K1, V1> mo29418m() {
        return (C11929e) C11860a.m34647a(this.f31683o, C11876a.INSTANCE);
    }

    /* renamed from: n */
    public final <K1 extends K, V1 extends V> C11873a<K1, V1> mo29419n() {
        m34672p();
        m34671o();
        return new C11908j(this);
    }

    private C11874b() {
    }

    /* renamed from: o */
    private void m34671o() {
        boolean z;
        if (this.f31680l == -1) {
            z = true;
        } else {
            z = false;
        }
        C11864b.m34659b(z, "refreshAfterWrite requires a LoadingCache");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Equivalence<Object> mo29407b() {
        return (Equivalence) C11860a.m34647a(this.f31681m, mo29413h().mo29533a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Equivalence<Object> mo29408c() {
        return (Equivalence) C11860a.m34647a(this.f31682n, mo29414i().mo29533a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final long mo29411f() {
        if (this.f31678j == 0 || this.f31679k == 0) {
            return 0;
        }
        if (this.f31675g == null) {
            return this.f31673e;
        }
        return this.f31674f;
    }

    /* renamed from: p */
    private void m34672p() {
        boolean z = false;
        if (this.f31675g == null) {
            if (this.f31674f == -1) {
                z = true;
            }
            C11864b.m34659b(z, "maximumWeight requires weigher");
        } else if (this.f31670b) {
            if (this.f31674f != -1) {
                z = true;
            }
            C11864b.m34659b(z, "weigher requires maximumWeight");
        } else {
            if (this.f31674f == -1) {
                f31669q.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
            }
        }
    }

    public final String toString() {
        C11862a a = C11860a.m34646a(this);
        if (this.f31671c != -1) {
            a.mo29392a("initialCapacity", this.f31671c);
        }
        if (this.f31672d != -1) {
            a.mo29392a("concurrencyLevel", this.f31672d);
        }
        if (this.f31673e != -1) {
            a.mo29393a("maximumSize", this.f31673e);
        }
        if (this.f31674f != -1) {
            a.mo29393a("maximumWeight", this.f31674f);
        }
        if (this.f31678j != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f31678j);
            sb.append("ns");
            a.mo29394a("expireAfterWrite", (Object) sb.toString());
        }
        if (this.f31679k != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f31679k);
            sb2.append("ns");
            a.mo29394a("expireAfterAccess", (Object) sb2.toString());
        }
        if (this.f31676h != null) {
            a.mo29394a("keyStrength", (Object) this.f31676h.toString());
        }
        if (this.f31677i != null) {
            a.mo29394a("valueStrength", (Object) this.f31677i.toString());
        }
        if (this.f31681m != null) {
            a.mo29391a("keyEquivalence");
        }
        if (this.f31682n != null) {
            a.mo29391a("valueEquivalence");
        }
        if (this.f31683o != null) {
            a.mo29391a("removalListener");
        }
        return a.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C11866d mo29405a(boolean z) {
        if (this.f31684p != null) {
            return this.f31684p;
        }
        if (z) {
            return C11866d.m34662b();
        }
        return f31668a;
    }

    /* renamed from: a */
    public final C11874b<K, V> mo29406a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f31673e == -1) {
            z = true;
        } else {
            z = false;
        }
        C11864b.m34658a(z, "maximum size was already set to %s", this.f31673e);
        if (this.f31674f == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C11864b.m34658a(z2, "maximum weight was already set to %s", this.f31674f);
        if (this.f31675g == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C11864b.m34659b(z3, "maximum size can not be combined with weigher");
        if (j >= 0) {
            z4 = true;
        }
        C11864b.m34657a(z4, "maximum size must not be negative");
        this.f31673e = j;
        return this;
    }
}
