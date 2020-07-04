package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.C47920c;
import kotlin.coroutines.C47924e;
import kotlin.jvm.internal.C7573i;
import kotlinx.coroutines.scheduling.C48202b;

/* renamed from: kotlinx.coroutines.x */
public final class C48221x {

    /* renamed from: a */
    private static final AtomicLong f123126a = new AtomicLong();

    /* renamed from: b */
    private static final boolean f123127b;

    /* renamed from: a */
    public static final C48222y m149608a() {
        C48222y yVar;
        if (f123127b) {
            yVar = C48202b.f123086b;
        } else {
            yVar = C48195r.f123055b;
        }
        return yVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r0.equals("on") != false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (r0.equals("") != false) goto L_0x003a;
     */
    static {
        /*
            java.util.concurrent.atomic.AtomicLong r0 = new java.util.concurrent.atomic.AtomicLong
            r0.<init>()
            f123126a = r0
            java.lang.String r0 = "kotlinx.coroutines.scheduler"
            java.lang.String r0 = kotlinx.coroutines.internal.C48179w.m149479a(r0)
            if (r0 != 0) goto L_0x0010
            goto L_0x003a
        L_0x0010:
            int r1 = r0.hashCode()
            if (r1 == 0) goto L_0x0032
            r2 = 3551(0xddf, float:4.976E-42)
            if (r1 == r2) goto L_0x0029
            r2 = 109935(0x1ad6f, float:1.54052E-40)
            if (r1 != r2) goto L_0x003e
            java.lang.String r1 = "off"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003e
            r0 = 0
            goto L_0x003b
        L_0x0029:
            java.lang.String r1 = "on"
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003e
            goto L_0x003a
        L_0x0032:
            java.lang.String r1 = ""
            boolean r1 = r0.equals(r1)
            if (r1 == 0) goto L_0x003e
        L_0x003a:
            r0 = 1
        L_0x003b:
            f123127b = r0
            return
        L_0x003e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "System property 'kotlinx.coroutines.scheduler' has unrecognized value '"
            r1.<init>(r2)
            r1.append(r0)
            r0 = 39
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48221x.<clinit>():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0026, code lost:
        if (r4 == null) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String m149606a(kotlin.coroutines.C47924e r4) {
        /*
            java.lang.String r0 = "receiver$0"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            boolean r0 = kotlinx.coroutines.C48059ag.f122906a
            r1 = 0
            if (r0 != 0) goto L_0x000b
            return r1
        L_0x000b:
            kotlinx.coroutines.ab$a r0 = kotlinx.coroutines.C48052ab.f122900b
            kotlin.coroutines.e$c r0 = (kotlin.coroutines.C47924e.C47929c) r0
            kotlin.coroutines.e$b r0 = r4.get(r0)
            kotlinx.coroutines.ab r0 = (kotlinx.coroutines.C48052ab) r0
            if (r0 != 0) goto L_0x0018
            return r1
        L_0x0018:
            kotlinx.coroutines.ac$a r1 = kotlinx.coroutines.C48054ac.f122902b
            kotlin.coroutines.e$c r1 = (kotlin.coroutines.C47924e.C47929c) r1
            kotlin.coroutines.e$b r4 = r4.get(r1)
            kotlinx.coroutines.ac r4 = (kotlinx.coroutines.C48054ac) r4
            if (r4 == 0) goto L_0x0028
            java.lang.String r4 = r4.f122903a
            if (r4 != 0) goto L_0x002a
        L_0x0028:
            java.lang.String r4 = "coroutine"
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            r4 = 35
            r1.append(r4)
            long r2 = r0.f122901a
            r1.append(r2)
            java.lang.String r4 = r1.toString()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48221x.m149606a(kotlin.coroutines.e):java.lang.String");
    }

    /* renamed from: a */
    public static final C47924e m149607a(C48056ad adVar, C47924e eVar) {
        C47924e eVar2;
        C7573i.m23587b(adVar, "receiver$0");
        C7573i.m23587b(eVar, "context");
        C47924e plus = adVar.mo76163a().plus(eVar);
        if (C48059ag.f122906a) {
            eVar2 = plus.plus(new C48052ab(f123126a.incrementAndGet()));
        } else {
            eVar2 = plus;
        }
        if (plus == C48080as.m149071a() || plus.get(C47920c.f122777a) != null) {
            return eVar2;
        }
        return eVar2.plus(C48080as.m149071a());
    }
}
