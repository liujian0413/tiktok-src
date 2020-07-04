package com.p280ss.android.ugc.aweme.interest;

import com.p280ss.android.ugc.aweme.journey.C32246j;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.interest.a */
public final class C32181a {

    /* renamed from: a */
    public final List<C32246j> f84043a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f84043a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.interest.C32181a) r2).f84043a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.interest.C32181a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.interest.a r2 = (com.p280ss.android.ugc.aweme.interest.C32181a) r2
            java.util.List<com.ss.android.ugc.aweme.journey.j> r0 = r1.f84043a
            java.util.List<com.ss.android.ugc.aweme.journey.j> r2 = r2.f84043a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.interest.C32181a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C32246j> list = this.f84043a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitInterestSelectEvent(interestList=");
        sb.append(this.f84043a);
        sb.append(")");
        return sb.toString();
    }

    public C32181a(List<C32246j> list) {
        C7573i.m23587b(list, "interestList");
        this.f84043a = list;
    }
}
