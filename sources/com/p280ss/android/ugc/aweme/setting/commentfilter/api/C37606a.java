package com.p280ss.android.ugc.aweme.setting.commentfilter.api;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.api.a */
public final class C37606a {
    @C6593c(mo15949a = "words")

    /* renamed from: a */
    public final List<String> f98066a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f98066a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.setting.commentfilter.api.C37606a) r2).f98066a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.setting.commentfilter.api.C37606a
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.setting.commentfilter.api.a r2 = (com.p280ss.android.ugc.aweme.setting.commentfilter.api.C37606a) r2
            java.util.List<java.lang.String> r0 = r1.f98066a
            java.util.List<java.lang.String> r2 = r2.f98066a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.commentfilter.api.C37606a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<String> list = this.f98066a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Words(words=");
        sb.append(this.f98066a);
        sb.append(")");
        return sb.toString();
    }
}
