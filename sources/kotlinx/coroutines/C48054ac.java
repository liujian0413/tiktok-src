package kotlinx.coroutines;

import kotlin.coroutines.C47918a;
import kotlin.coroutines.C47924e.C47929c;
import kotlin.jvm.internal.C7571f;

/* renamed from: kotlinx.coroutines.ac */
public final class C48054ac extends C47918a {

    /* renamed from: b */
    public static final C48055a f122902b = new C48055a(null);

    /* renamed from: a */
    public final String f122903a;

    /* renamed from: kotlinx.coroutines.ac$a */
    public static final class C48055a implements C47929c<C48054ac> {
        private C48055a() {
        }

        public /* synthetic */ C48055a(C7571f fVar) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f122903a, (java.lang.Object) ((kotlinx.coroutines.C48054ac) r2).f122903a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof kotlinx.coroutines.C48054ac
            if (r0 == 0) goto L_0x0013
            kotlinx.coroutines.ac r2 = (kotlinx.coroutines.C48054ac) r2
            java.lang.String r0 = r1.f122903a
            java.lang.String r2 = r2.f122903a
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C48054ac.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f122903a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoroutineName(");
        sb.append(this.f122903a);
        sb.append(')');
        return sb.toString();
    }
}
