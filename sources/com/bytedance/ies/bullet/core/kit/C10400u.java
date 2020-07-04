package com.bytedance.ies.bullet.core.kit;

import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.core.kit.u */
public final class C10400u {

    /* renamed from: a */
    public final String f28131a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f28131a, (java.lang.Object) ((com.bytedance.ies.bullet.core.kit.C10400u) r2).f28131a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.ies.bullet.core.kit.C10400u
            if (r0 == 0) goto L_0x0013
            com.bytedance.ies.bullet.core.kit.u r2 = (com.bytedance.ies.bullet.core.kit.C10400u) r2
            java.lang.String r0 = r1.f28131a
            java.lang.String r2 = r2.f28131a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.bullet.core.kit.C10400u.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f28131a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionInfo(id=");
        sb.append(this.f28131a);
        sb.append(")");
        return sb.toString();
    }

    public C10400u(String str) {
        C7573i.m23587b(str, "id");
        this.f28131a = str;
    }
}
