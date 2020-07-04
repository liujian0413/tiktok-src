package com.google.common.base;

import java.util.concurrent.TimeUnit;

/* renamed from: com.google.common.base.q */
public final class C17454q {

    /* renamed from: a */
    public boolean f48412a;

    /* renamed from: b */
    private final C17463v f48413b;

    /* renamed from: c */
    private long f48414c;

    /* renamed from: d */
    private long f48415d;

    /* renamed from: com.google.common.base.q$1 */
    static /* synthetic */ class C174551 {

        /* renamed from: a */
        static final /* synthetic */ int[] f48416a = new int[TimeUnit.values().length];

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0035 */
        static {
            /*
                java.util.concurrent.TimeUnit[] r0 = java.util.concurrent.TimeUnit.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f48416a = r0
                int[] r0 = f48416a     // Catch:{ NoSuchFieldError -> 0x0014 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ NoSuchFieldError -> 0x0014 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0014 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0014 }
            L_0x0014:
                int[] r0 = f48416a     // Catch:{ NoSuchFieldError -> 0x001f }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ NoSuchFieldError -> 0x001f }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001f }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001f }
            L_0x001f:
                int[] r0 = f48416a     // Catch:{ NoSuchFieldError -> 0x002a }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ NoSuchFieldError -> 0x002a }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002a }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002a }
            L_0x002a:
                int[] r0 = f48416a     // Catch:{ NoSuchFieldError -> 0x0035 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ NoSuchFieldError -> 0x0035 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0035 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0035 }
            L_0x0035:
                int[] r0 = f48416a     // Catch:{ NoSuchFieldError -> 0x0040 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MINUTES     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r0 = f48416a     // Catch:{ NoSuchFieldError -> 0x004b }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.HOURS     // Catch:{ NoSuchFieldError -> 0x004b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004b }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004b }
            L_0x004b:
                int[] r0 = f48416a     // Catch:{ NoSuchFieldError -> 0x0056 }
                java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.DAYS     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.C17454q.C174551.<clinit>():void");
        }
    }

    /* renamed from: a */
    public static C17454q m58001a() {
        return new C17454q();
    }

    /* renamed from: e */
    public final C17454q mo44944e() {
        this.f48414c = 0;
        this.f48412a = false;
        return this;
    }

    C17454q() {
        this.f48413b = C17463v.m58030b();
    }

    /* renamed from: b */
    public static C17454q m58004b() {
        return new C17454q().mo44942c();
    }

    /* renamed from: f */
    private long m58007f() {
        if (this.f48412a) {
            return (this.f48413b.mo44952a() - this.f48415d) + this.f48414c;
        }
        return this.f48414c;
    }

    /* renamed from: c */
    public final C17454q mo44942c() {
        C17439m.m57982b(!this.f48412a, (Object) "This stopwatch is already running.");
        this.f48412a = true;
        this.f48415d = this.f48413b.mo44952a();
        return this;
    }

    /* renamed from: d */
    public final C17454q mo44943d() {
        long a = this.f48413b.mo44952a();
        C17439m.m57982b(this.f48412a, (Object) "This stopwatch is already stopped.");
        this.f48412a = false;
        this.f48414c += a - this.f48415d;
        return this;
    }

    public final String toString() {
        long f = m58007f();
        TimeUnit a = m58003a(f);
        double d = (double) f;
        double convert = (double) TimeUnit.NANOSECONDS.convert(1, a);
        Double.isNaN(d);
        Double.isNaN(convert);
        double d2 = d / convert;
        StringBuilder sb = new StringBuilder();
        sb.append(C17436l.m57957a(d2));
        sb.append(" ");
        sb.append(m58006b(a));
        return sb.toString();
    }

    /* renamed from: a */
    public static C17454q m58002a(C17463v vVar) {
        return new C17454q(vVar);
    }

    private C17454q(C17463v vVar) {
        this.f48413b = (C17463v) C17439m.m57963a(vVar, (Object) "ticker");
    }

    /* renamed from: b */
    public static C17454q m58005b(C17463v vVar) {
        return new C17454q(vVar).mo44942c();
    }

    /* renamed from: a */
    public final long mo44941a(TimeUnit timeUnit) {
        return timeUnit.convert(m58007f(), TimeUnit.NANOSECONDS);
    }

    /* renamed from: b */
    private static String m58006b(TimeUnit timeUnit) {
        switch (C174551.f48416a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    /* renamed from: a */
    private static TimeUnit m58003a(long j) {
        if (TimeUnit.DAYS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.DAYS;
        }
        if (TimeUnit.HOURS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.HOURS;
        }
        if (TimeUnit.MINUTES.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MINUTES;
        }
        if (TimeUnit.SECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.SECONDS;
        }
        if (TimeUnit.MILLISECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MILLISECONDS;
        }
        if (TimeUnit.MICROSECONDS.convert(j, TimeUnit.NANOSECONDS) > 0) {
            return TimeUnit.MICROSECONDS;
        }
        return TimeUnit.NANOSECONDS;
    }
}
