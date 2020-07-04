package com.bytedance.android.livesdk.blockword.p190a;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.blockword.a.c */
public final class C3946c {
    @C6593c(mo15949a = "word")

    /* renamed from: a */
    public final List<C3944a> f11787a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f11787a, (java.lang.Object) ((com.bytedance.android.livesdk.blockword.p190a.C3946c) r2).f11787a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.bytedance.android.livesdk.blockword.p190a.C3946c
            if (r0 == 0) goto L_0x0013
            com.bytedance.android.livesdk.blockword.a.c r2 = (com.bytedance.android.livesdk.blockword.p190a.C3946c) r2
            java.util.List<com.bytedance.android.livesdk.blockword.a.a> r0 = r1.f11787a
            java.util.List<com.bytedance.android.livesdk.blockword.a.a> r2 = r2.f11787a
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
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.blockword.p190a.C3946c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<C3944a> list = this.f11787a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockWordGetResponse(words=");
        sb.append(this.f11787a);
        sb.append(")");
        return sb.toString();
    }
}
