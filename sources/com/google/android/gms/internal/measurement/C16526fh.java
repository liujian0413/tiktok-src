package com.google.android.gms.internal.measurement;

import android.content.Context;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.measurement.fh */
public abstract class C16526fh<T> {

    /* renamed from: b */
    private static final Object f46304b = new Object();

    /* renamed from: c */
    private static Context f46305c = null;

    /* renamed from: d */
    private static boolean f46306d = false;

    /* renamed from: g */
    private static final AtomicInteger f46307g = new AtomicInteger();

    /* renamed from: a */
    public final T f46308a;

    /* renamed from: e */
    private final C16532fn f46309e;

    /* renamed from: f */
    private final String f46310f;

    /* renamed from: h */
    private volatile int f46311h;

    /* renamed from: i */
    private volatile T f46312i;

    /* renamed from: a */
    public static void m53855a(Context context) {
        synchronized (f46304b) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
            if (f46305c != context) {
                synchronized (C16514ew.class) {
                    C16514ew.f46288a.clear();
                }
                synchronized (C16533fo.class) {
                    C16533fo.f46316a.clear();
                }
                synchronized (C16522fd.class) {
                    C16522fd.f46300a = null;
                }
                f46307g.incrementAndGet();
                f46305c = context;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract T mo42716a(Object obj);

    /* renamed from: a */
    static void m53854a() {
        f46307g.incrementAndGet();
    }

    private C16526fh(C16532fn fnVar, String str, T t) {
        this.f46311h = -1;
        if (fnVar.f46313a != null) {
            this.f46309e = fnVar;
            this.f46310f = str;
            this.f46308a = t;
            return;
        }
        throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
    }

    /* renamed from: a */
    private final String m53853a(String str) {
        if (str != null && str.isEmpty()) {
            return this.f46310f;
        }
        String valueOf = String.valueOf(str);
        String valueOf2 = String.valueOf(this.f46310f);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }

    /* renamed from: c */
    private String m53861c() {
        return m53853a(this.f46309e.f46315c);
    }

    /* renamed from: b */
    public final T mo42717b() {
        int i = f46307g.get();
        if (this.f46311h < i) {
            synchronized (this) {
                if (this.f46311h < i) {
                    if (f46305c != null) {
                        T d = m53862d();
                        if (d == null) {
                            d = m53863e();
                            if (d == null) {
                                d = this.f46308a;
                            }
                        }
                        this.f46312i = d;
                        this.f46311h = i;
                    } else {
                        throw new IllegalStateException("Must call PhenotypeFlag.init() first");
                    }
                }
            }
        }
        return this.f46312i;
    }

    /* renamed from: d */
    private final T m53862d() {
        C16519fa faVar;
        String str = (String) C16522fd.m53842a(f46305c).mo42707a("gms:phenotype:phenotype_flag:debug_bypass_phenotype");
        if (!(str != null && C16511et.f46274b.matcher(str).matches())) {
            if (this.f46309e.f46313a != null) {
                faVar = C16514ew.m53825a(f46305c.getContentResolver(), this.f46309e.f46313a);
            } else {
                faVar = C16533fo.m53882a(f46305c, (String) null);
            }
            if (faVar != null) {
                Object a = faVar.mo42707a(m53861c());
                if (a != null) {
                    return mo42716a(a);
                }
            }
        } else {
            String str2 = "Bypass reading Phenotype values for flag: ";
            String valueOf = String.valueOf(m53861c());
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        return null;
    }

    /* renamed from: e */
    private final T m53863e() {
        Object a = C16522fd.m53842a(f46305c).mo42707a(m53853a(this.f46309e.f46314b));
        if (a != null) {
            return mo42716a(a);
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C16526fh<Long> m53858b(C16532fn fnVar, String str, long j) {
        return new C16527fi(fnVar, str, Long.valueOf(j));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C16526fh<Integer> m53857b(C16532fn fnVar, String str, int i) {
        return new C16528fj(fnVar, str, Integer.valueOf(i));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C16526fh<Boolean> m53860b(C16532fn fnVar, String str, boolean z) {
        return new C16529fk(fnVar, str, Boolean.valueOf(z));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C16526fh<Double> m53856b(C16532fn fnVar, String str, double d) {
        return new C16530fl(fnVar, str, Double.valueOf(d));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static C16526fh<String> m53859b(C16532fn fnVar, String str, String str2) {
        return new C16531fm(fnVar, str, str2);
    }

    /* synthetic */ C16526fh(C16532fn fnVar, String str, Object obj, C16527fi fiVar) {
        this(fnVar, str, obj);
    }
}
