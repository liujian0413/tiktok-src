package shark.internal;

import kotlin.jvm.internal.C7571f;
import shark.C48862x.C48871i;

/* renamed from: shark.internal.f */
public final class C48784f {

    /* renamed from: h */
    public static final C48785a f124009h = new C48785a(null);

    /* renamed from: a */
    public final boolean f124010a;

    /* renamed from: b */
    public final boolean f124011b;

    /* renamed from: c */
    public final C48871i f124012c;

    /* renamed from: d */
    public final String f124013d;

    /* renamed from: e */
    public final String f124014e;

    /* renamed from: f */
    public final Long f124015f;

    /* renamed from: g */
    public final Long f124016g;

    /* renamed from: shark.internal.f$a */
    public static final class C48785a {
        private C48785a() {
        }

        public /* synthetic */ C48785a(C7571f fVar) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0085, code lost:
            if (r10 == null) goto L_0x0087;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static shark.internal.C48784f m150662a(shark.C48747i.C48752c r9, java.lang.Long r10) {
            /*
                java.lang.String r0 = "weakRef"
                kotlin.jvm.internal.C7573i.m23587b(r9, r0)
                java.lang.String r0 = r9.mo123495f()
                r1 = 0
                if (r10 == 0) goto L_0x0031
                long r2 = r10.longValue()
                java.lang.String r4 = "watchUptimeMillis"
                shark.g r4 = r9.mo123491a(r0, r4)
                if (r4 != 0) goto L_0x001b
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x001b:
                shark.k r4 = r4.f123887c
                java.lang.Long r4 = r4.mo123578c()
                if (r4 != 0) goto L_0x0026
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0026:
                long r4 = r4.longValue()
                long r2 = r2 - r4
                java.lang.Long r2 = java.lang.Long.valueOf(r2)
                r7 = r2
                goto L_0x0032
            L_0x0031:
                r7 = r1
            L_0x0032:
                if (r10 == 0) goto L_0x005e
                java.lang.String r1 = "retainedUptimeMillis"
                shark.g r1 = r9.mo123491a(r0, r1)
                if (r1 != 0) goto L_0x003f
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x003f:
                shark.k r1 = r1.f123887c
                java.lang.Long r1 = r1.mo123578c()
                if (r1 != 0) goto L_0x004a
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x004a:
                long r1 = r1.longValue()
                r3 = -1
                int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
                if (r5 != 0) goto L_0x0055
                goto L_0x005a
            L_0x0055:
                long r3 = r10.longValue()
                long r3 = r3 - r1
            L_0x005a:
                java.lang.Long r1 = java.lang.Long.valueOf(r3)
            L_0x005e:
                r8 = r1
                java.lang.String r10 = "key"
                shark.g r10 = r9.mo123491a(r0, r10)
                if (r10 != 0) goto L_0x006a
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x006a:
                shark.k r10 = r10.f123887c
                java.lang.String r5 = r10.mo123584i()
                if (r5 != 0) goto L_0x0075
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0075:
                java.lang.String r10 = "name"
                shark.g r10 = r9.mo123491a(r0, r10)
                if (r10 == 0) goto L_0x0087
                shark.k r10 = r10.f123887c
                if (r10 == 0) goto L_0x0087
                java.lang.String r10 = r10.mo123584i()
                if (r10 != 0) goto L_0x0089
            L_0x0087:
                java.lang.String r10 = "Unknown (legacy)"
            L_0x0089:
                r6 = r10
                shark.internal.f r10 = new shark.internal.f
                java.lang.String r0 = "java.lang.ref.Reference"
                java.lang.String r1 = "referent"
                shark.g r9 = r9.mo123491a(r0, r1)
                if (r9 != 0) goto L_0x0099
                kotlin.jvm.internal.C7573i.m23580a()
            L_0x0099:
                shark.k r9 = r9.f123887c
                shark.x r9 = r9.f124083b
                if (r9 == 0) goto L_0x00a7
                r4 = r9
                shark.x$i r4 = (shark.C48862x.C48871i) r4
                r3 = r10
                r3.<init>(r4, r5, r6, r7, r8)
                return r10
            L_0x00a7:
                kotlin.TypeCastException r9 = new kotlin.TypeCastException
                java.lang.String r10 = "null cannot be cast to non-null type shark.ValueHolder.ReferenceHolder"
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48784f.C48785a.m150662a(shark.i$c, java.lang.Long):shark.internal.f");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003e, code lost:
        if (r3.longValue() != -1) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C48784f(shark.C48862x.C48871i r3, java.lang.String r4, java.lang.String r5, java.lang.Long r6, java.lang.Long r7) {
        /*
            r2 = this;
            java.lang.String r0 = "referent"
            kotlin.jvm.internal.C7573i.m23587b(r3, r0)
            java.lang.String r0 = "key"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.C7573i.m23587b(r5, r0)
            r2.<init>()
            r2.f124012c = r3
            r2.f124013d = r4
            r2.f124014e = r5
            r2.f124015f = r6
            r2.f124016g = r7
            shark.x$i r3 = r2.f124012c
            long r3 = r3.f124227b
            r5 = 0
            r6 = 1
            r0 = 0
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            r2.f124010a = r3
            java.lang.Long r3 = r2.f124016g
            if (r3 == 0) goto L_0x0040
            java.lang.Long r3 = r2.f124016g
            if (r3 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            long r3 = r3.longValue()
            r0 = -1
            int r7 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0041
        L_0x0040:
            r5 = 1
        L_0x0041:
            r2.f124011b = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.internal.C48784f.<init>(shark.x$i, java.lang.String, java.lang.String, java.lang.Long, java.lang.Long):void");
    }
}
