package kotlin.text;

import kotlin.jvm.internal.C7573i;
import kotlin.p356e.C7549c;

/* renamed from: kotlin.text.g */
public final class C48039g {

    /* renamed from: a */
    public final String f122887a;

    /* renamed from: b */
    public final C7549c f122888b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f122888b, (java.lang.Object) r3.f122888b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof kotlin.text.C48039g
            if (r0 == 0) goto L_0x001d
            kotlin.text.g r3 = (kotlin.text.C48039g) r3
            java.lang.String r0 = r2.f122887a
            java.lang.String r1 = r3.f122887a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            kotlin.e.c r0 = r2.f122888b
            kotlin.e.c r3 = r3.f122888b
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.C48039g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f122887a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        C7549c cVar = this.f122888b;
        if (cVar != null) {
            i = cVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchGroup(value=");
        sb.append(this.f122887a);
        sb.append(", range=");
        sb.append(this.f122888b);
        sb.append(")");
        return sb.toString();
    }

    public C48039g(String str, C7549c cVar) {
        C7573i.m23587b(str, "value");
        C7573i.m23587b(cVar, "range");
        this.f122887a = str;
        this.f122888b = cVar;
    }
}
