package com.google.common.cache;

import com.google.common.base.C17404c;
import com.google.common.base.C17430i;
import com.google.common.base.C17430i.C17432a;
import com.google.common.base.C17439m;
import com.google.common.base.C17457s;
import com.google.common.base.C17458t;
import com.google.common.base.C17463v;
import com.google.common.base.Equivalence;
import com.google.common.cache.C17470a.C17471a;
import com.google.common.cache.C17470a.C17472b;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.common.cache.c */
public final class C17474c<K, V> {

    /* renamed from: a */
    static final C17457s<? extends C17472b> f48434a = C17458t.m58016a(new C17472b() {
        /* renamed from: a */
        public final void mo44958a() {
        }

        /* renamed from: a */
        public final void mo44959a(int i) {
        }

        /* renamed from: a */
        public final void mo44960a(long j) {
        }

        /* renamed from: b */
        public final void mo44961b(int i) {
        }

        /* renamed from: b */
        public final void mo44962b(long j) {
        }
    });

    /* renamed from: b */
    static final C17480d f48435b;

    /* renamed from: c */
    static final C17457s<C17472b> f48436c = new C17457s<C17472b>() {
        /* renamed from: b */
        private static C17472b m58085b() {
            return new C17471a();
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo44946a() {
            return m58085b();
        }
    };

    /* renamed from: d */
    static final C17463v f48437d = new C17463v() {
        /* renamed from: a */
        public final long mo44952a() {
            return 0;
        }
    };

    /* renamed from: u */
    private static final Logger f48438u = Logger.getLogger(C17474c.class.getName());

    /* renamed from: e */
    boolean f48439e = true;

    /* renamed from: f */
    int f48440f = -1;

    /* renamed from: g */
    int f48441g = -1;

    /* renamed from: h */
    long f48442h = -1;

    /* renamed from: i */
    long f48443i = -1;

    /* renamed from: j */
    C17548m<? super K, ? super V> f48444j;

    /* renamed from: k */
    C17523p f48445k;

    /* renamed from: l */
    C17523p f48446l;

    /* renamed from: m */
    long f48447m = -1;

    /* renamed from: n */
    long f48448n = -1;

    /* renamed from: o */
    long f48449o = -1;

    /* renamed from: p */
    Equivalence<Object> f48450p;

    /* renamed from: q */
    Equivalence<Object> f48451q;

    /* renamed from: r */
    C17544k<? super K, ? super V> f48452r;

    /* renamed from: s */
    C17463v f48453s;

    /* renamed from: t */
    public C17457s<? extends C17472b> f48454t = f48434a;

    /* renamed from: com.google.common.cache.c$a */
    enum C17478a implements C17544k<Object, Object> {
        INSTANCE;

        /* renamed from: a */
        public final void mo44996a(RemovalNotification<Object, Object> removalNotification) {
        }
    }

    /* renamed from: com.google.common.cache.c$b */
    enum C17479b implements C17548m<Object, Object> {
        INSTANCE
    }

    /* renamed from: a */
    public final <K1 extends K, V1 extends V> C17474c<K1, V1> mo44976a(C17548m<? super K1, ? super V1> mVar) {
        boolean z = false;
        C17439m.m57981b(this.f48444j == null);
        if (this.f48439e) {
            if (this.f48442h == -1) {
                z = true;
            }
            C17439m.m57984b(z, "weigher can not be combined with maximum size", this.f48442h);
        }
        this.f48444j = (C17548m) C17439m.m57962a(mVar);
        return this;
    }

    /* renamed from: a */
    public final <K1 extends K, V1 extends V> C17474c<K1, V1> mo44975a(C17544k<? super K1, ? super V1> kVar) {
        C17439m.m57981b(this.f48452r == null);
        this.f48452r = (C17544k) C17439m.m57962a(kVar);
        return this;
    }

    /* renamed from: a */
    public static C17474c<Object, Object> m58050a() {
        return new C17474c<>();
    }

    /* renamed from: i */
    public final C17474c<K, V> mo44988i() {
        return mo44981b(C17523p.WEAK);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final int mo44983d() {
        if (this.f48440f == -1) {
            return 16;
        }
        return this.f48440f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final int mo44984e() {
        if (this.f48441g == -1) {
            return 4;
        }
        return this.f48441g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final <K1 extends K, V1 extends V> C17548m<K1, V1> mo44986g() {
        return (C17548m) C17430i.m57945a(this.f48444j, C17479b.INSTANCE);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final C17523p mo44987h() {
        return (C17523p) C17430i.m57945a(this.f48445k, C17523p.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final C17523p mo44989j() {
        return (C17523p) C17430i.m57945a(this.f48446l, C17523p.STRONG);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final long mo44990k() {
        if (this.f48447m == -1) {
            return 0;
        }
        return this.f48447m;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final long mo44991l() {
        if (this.f48448n == -1) {
            return 0;
        }
        return this.f48448n;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final long mo44992m() {
        if (this.f48449o == -1) {
            return 0;
        }
        return this.f48449o;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final <K1 extends K, V1 extends V> C17544k<K1, V1> mo44993n() {
        return (C17544k) C17430i.m57945a(this.f48452r, C17478a.INSTANCE);
    }

    /* renamed from: o */
    public final <K1 extends K, V1 extends V> C17473b<K1, V1> mo44994o() {
        m58052q();
        m58051p();
        return new C17516k(this);
    }

    private C17474c() {
    }

    /* renamed from: p */
    private void m58051p() {
        boolean z;
        if (this.f48449o == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57982b(z, (Object) "refreshAfterWrite requires a LoadingCache");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final Equivalence<Object> mo44977b() {
        return (Equivalence) C17430i.m57945a(this.f48450p, mo44987h().mo45128a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final Equivalence<Object> mo44982c() {
        return (Equivalence) C17430i.m57945a(this.f48451q, mo44989j().mo45128a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final long mo44985f() {
        if (this.f48447m == 0 || this.f48448n == 0) {
            return 0;
        }
        if (this.f48444j == null) {
            return this.f48442h;
        }
        return this.f48443i;
    }

    static {
        C17480d dVar = new C17480d(0, 0, 0, 0, 0, 0);
        f48435b = dVar;
    }

    /* renamed from: q */
    private void m58052q() {
        boolean z = false;
        if (this.f48444j == null) {
            if (this.f48443i == -1) {
                z = true;
            }
            C17439m.m57982b(z, (Object) "maximumWeight requires weigher");
        } else if (this.f48439e) {
            if (this.f48443i != -1) {
                z = true;
            }
            C17439m.m57982b(z, (Object) "weigher requires maximumWeight");
        } else {
            if (this.f48443i == -1) {
                f48438u.log(Level.WARNING, "ignoring weigher specified without maximumWeight");
            }
        }
    }

    public final String toString() {
        C17432a a = C17430i.m57944a(this);
        if (this.f48440f != -1) {
            a.mo44921a("initialCapacity", this.f48440f);
        }
        if (this.f48441g != -1) {
            a.mo44921a("concurrencyLevel", this.f48441g);
        }
        if (this.f48442h != -1) {
            a.mo44922a("maximumSize", this.f48442h);
        }
        if (this.f48443i != -1) {
            a.mo44922a("maximumWeight", this.f48443i);
        }
        if (this.f48447m != -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f48447m);
            sb.append("ns");
            a.mo44923a("expireAfterWrite", (Object) sb.toString());
        }
        if (this.f48448n != -1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f48448n);
            sb2.append("ns");
            a.mo44923a("expireAfterAccess", (Object) sb2.toString());
        }
        if (this.f48445k != null) {
            a.mo44923a("keyStrength", (Object) C17404c.m57886a(this.f48445k.toString()));
        }
        if (this.f48446l != null) {
            a.mo44923a("valueStrength", (Object) C17404c.m57886a(this.f48446l.toString()));
        }
        if (this.f48450p != null) {
            a.mo44919a("keyEquivalence");
        }
        if (this.f48451q != null) {
            a.mo44919a("valueEquivalence");
        }
        if (this.f48452r != null) {
            a.mo44919a("removalListener");
        }
        return a.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17463v mo44968a(boolean z) {
        if (this.f48453s != null) {
            return this.f48453s;
        }
        if (z) {
            return C17463v.m58030b();
        }
        return f48437d;
    }

    /* renamed from: a */
    public final C17474c<K, V> mo44969a(int i) {
        boolean z;
        boolean z2 = false;
        if (this.f48441g == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57983b(z, "concurrency level was already set to %s", this.f48441g);
        if (i > 0) {
            z2 = true;
        }
        C17439m.m57968a(z2);
        this.f48441g = i;
        return this;
    }

    /* renamed from: b */
    public final C17474c<K, V> mo44978b(long j) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.f48443i == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57984b(z, "maximum weight was already set to %s", this.f48443i);
        if (this.f48442h == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17439m.m57984b(z2, "maximum size was already set to %s", this.f48442h);
        this.f48443i = j;
        if (j >= 0) {
            z3 = true;
        }
        C17439m.m57969a(z3, (Object) "maximum weight must not be negative");
        return this;
    }

    /* renamed from: a */
    public final C17474c<K, V> mo44970a(long j) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f48442h == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57984b(z, "maximum size was already set to %s", this.f48442h);
        if (this.f48443i == -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        C17439m.m57984b(z2, "maximum weight was already set to %s", this.f48443i);
        if (this.f48444j == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        C17439m.m57982b(z3, (Object) "maximum size can not be combined with weigher");
        if (j >= 0) {
            z4 = true;
        }
        C17439m.m57969a(z4, (Object) "maximum size must not be negative");
        this.f48442h = j;
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17474c<K, V> mo44980b(Equivalence<Object> equivalence) {
        boolean z;
        if (this.f48451q == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "value equivalence was already set to %s", (Object) this.f48451q);
        this.f48451q = (Equivalence) C17439m.m57962a(equivalence);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17474c<K, V> mo44972a(Equivalence<Object> equivalence) {
        boolean z;
        if (this.f48450p == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "key equivalence was already set to %s", (Object) this.f48450p);
        this.f48450p = (Equivalence) C17439m.m57962a(equivalence);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C17474c<K, V> mo44981b(C17523p pVar) {
        boolean z;
        if (this.f48446l == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "Value strength was already set to %s", (Object) this.f48446l);
        this.f48446l = (C17523p) C17439m.m57962a(pVar);
        return this;
    }

    /* renamed from: a */
    public final C17474c<K, V> mo44973a(C17463v vVar) {
        boolean z;
        if (this.f48453s == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57981b(z);
        this.f48453s = (C17463v) C17439m.m57962a(vVar);
        return this;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17474c<K, V> mo44974a(C17523p pVar) {
        boolean z;
        if (this.f48445k == null) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57985b(z, "Key strength was already set to %s", (Object) this.f48445k);
        this.f48445k = (C17523p) C17439m.m57962a(pVar);
        return this;
    }

    /* renamed from: b */
    public final C17474c<K, V> mo44979b(long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2 = false;
        if (this.f48448n == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57984b(z, "expireAfterAccess was already set to %s ns", this.f48448n);
        if (j >= 0) {
            z2 = true;
        }
        C17439m.m57975a(z2, "duration cannot be negative: %s %s", j, (Object) timeUnit);
        this.f48448n = timeUnit.toNanos(j);
        return this;
    }

    /* renamed from: a */
    public final C17474c<K, V> mo44971a(long j, TimeUnit timeUnit) {
        boolean z;
        boolean z2 = false;
        if (this.f48447m == -1) {
            z = true;
        } else {
            z = false;
        }
        C17439m.m57984b(z, "expireAfterWrite was already set to %s ns", this.f48447m);
        if (j >= 0) {
            z2 = true;
        }
        C17439m.m57975a(z2, "duration cannot be negative: %s %s", j, (Object) timeUnit);
        this.f48447m = timeUnit.toNanos(j);
        return this;
    }
}
