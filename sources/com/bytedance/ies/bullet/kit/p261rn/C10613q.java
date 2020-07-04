package com.bytedance.ies.bullet.kit.p261rn;

import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.q */
public final class C10613q {

    /* renamed from: a */
    public final List<String> f28453a;

    /* renamed from: b */
    public final String f28454b = null;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f28454b, (java.lang.Object) r3.f28454b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.bytedance.ies.bullet.kit.p261rn.C10613q
            if (r0 == 0) goto L_0x001d
            com.bytedance.ies.bullet.kit.rn.q r3 = (com.bytedance.ies.bullet.kit.p261rn.C10613q) r3
            java.util.List<java.lang.String> r0 = r2.f28453a
            java.util.List<java.lang.String> r1 = r3.f28453a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.f28454b
            java.lang.String r3 = r3.f28454b
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.kit.p261rn.C10613q.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<String> list = this.f28453a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f28454b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SourceUrlSettings(whiteListHosts=");
        sb.append(this.f28453a);
        sb.append(", debugSafeHost=");
        sb.append(this.f28454b);
        sb.append(")");
        return sb.toString();
    }

    public C10613q(List<String> list, String str) {
        C7573i.m23587b(list, "whiteListHosts");
        this.f28453a = list;
    }
}
