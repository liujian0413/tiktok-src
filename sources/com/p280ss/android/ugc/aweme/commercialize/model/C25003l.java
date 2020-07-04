package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.l */
public final class C25003l {
    @C6593c(mo15949a = "name")

    /* renamed from: a */
    public final String f65930a;
    @C6593c(mo15949a = "children")

    /* renamed from: b */
    public final List<C25003l> f65931b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f65931b, (java.lang.Object) r3.f65931b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.commercialize.model.C25003l
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.commercialize.model.l r3 = (com.p280ss.android.ugc.aweme.commercialize.model.C25003l) r3
            java.lang.String r0 = r2.f65930a
            java.lang.String r1 = r3.f65930a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.util.List<com.ss.android.ugc.aweme.commercialize.model.l> r0 = r2.f65931b
            java.util.List<com.ss.android.ugc.aweme.commercialize.model.l> r3 = r3.f65931b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.model.C25003l.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f65930a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<C25003l> list = this.f65931b;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OptionListItemParams(name=");
        sb.append(this.f65930a);
        sb.append(", children=");
        sb.append(this.f65931b);
        sb.append(")");
        return sb.toString();
    }
}
