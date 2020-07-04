package kotlinx.coroutines;

import kotlin.coroutines.C47918a;
import kotlin.coroutines.C47924e;
import kotlin.coroutines.C47924e.C47927b;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7563m;
import kotlinx.coroutines.C48126cb.C48127a;

/* renamed from: kotlinx.coroutines.ab */
public final class C48052ab extends C47918a implements C48126cb<String> {

    /* renamed from: b */
    public static final C48053a f122900b = new C48053a(null);

    /* renamed from: a */
    public final long f122901a;

    /* renamed from: kotlinx.coroutines.ab$a */
    public static final class C48053a implements C47929c<C48052ab> {
        private C48053a() {
        }

        public /* synthetic */ C48053a(C7571f fVar) {
            this();
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C48052ab) {
                if (this.f122901a == ((C48052ab) obj).f122901a) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.f122901a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineId(");
        sb.append(this.f122901a);
        sb.append(')');
        return sb.toString();
    }

    public C48052ab(long j) {
        super(f122900b);
        this.f122901a = j;
    }

    public final <E extends C47927b> E get(C47929c<E> cVar) {
        C7573i.m23587b(cVar, "key");
        return C48127a.m149244a((C48126cb<S>) this, cVar);
    }

    public final C47924e minusKey(C47929c<?> cVar) {
        C7573i.m23587b(cVar, "key");
        return C48127a.m149246b(this, cVar);
    }

    public final C47924e plus(C47924e eVar) {
        C7573i.m23587b(eVar, "context");
        return C48127a.m149245a((C48126cb<S>) this, eVar);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (r10 == null) goto L_0x0015;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String mo120257a(kotlin.coroutines.C47924e r10) {
        /*
            r9 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            kotlinx.coroutines.ac$a r0 = kotlinx.coroutines.C48054ac.f122902b
            kotlin.coroutines.e$c r0 = (kotlin.coroutines.C47924e.C47929c) r0
            kotlin.coroutines.e$b r10 = r10.get(r0)
            kotlinx.coroutines.ac r10 = (kotlinx.coroutines.C48054ac) r10
            if (r10 == 0) goto L_0x0015
            java.lang.String r10 = r10.f122903a
            if (r10 != 0) goto L_0x0017
        L_0x0015:
            java.lang.String r10 = "coroutine"
        L_0x0017:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.String r1 = "currentThread"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "oldName"
            kotlin.jvm.internal.C7573i.m23582a(r1, r2)
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r4 = " @"
            r5 = 0
            r6 = 0
            r7 = 6
            r8 = 0
            int r2 = kotlin.text.C7634n.m23760b(r3, r4, r5, r6, r7, r8)
            if (r2 >= 0) goto L_0x003c
            int r2 = r1.length()
        L_0x003c:
            int r3 = r10.length()
            int r3 = r3 + r2
            int r3 = r3 + 10
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            r3 = 0
            java.lang.String r2 = r1.substring(r3, r2)
            java.lang.String r3 = "(this as java.lang.Strin…ing(startIndex, endIndex)"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            r4.append(r2)
            java.lang.String r2 = " @"
            r4.append(r2)
            r4.append(r10)
            r10 = 35
            r4.append(r10)
            long r2 = r9.f122901a
            r4.append(r2)
            java.lang.String r10 = r4.toString()
            java.lang.String r2 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.C7573i.m23582a(r10, r2)
            r0.setName(r10)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48052ab.mo120257a(kotlin.coroutines.e):java.lang.String");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo120258a(C47924e eVar, Object obj) {
        m149015a(eVar, (String) obj);
    }

    public final <R> R fold(R r, C7563m<? super R, ? super C47927b, ? extends R> mVar) {
        C7573i.m23587b(mVar, "operation");
        return C48127a.m149243a(this, r, mVar);
    }

    /* renamed from: a */
    private static void m149015a(C47924e eVar, String str) {
        C7573i.m23587b(eVar, "context");
        C7573i.m23587b(str, "oldState");
        Thread currentThread = Thread.currentThread();
        C7573i.m23582a((Object) currentThread, "Thread.currentThread()");
        currentThread.setName(str);
    }
}
