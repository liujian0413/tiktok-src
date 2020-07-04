package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6592b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.utils.StringJsonAdapterFactory;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.p */
public final class C25007p {
    @C6592b(mo15947a = StringJsonAdapterFactory.class)
    @C6593c(mo15949a = "ad_data")

    /* renamed from: a */
    public final C24993d f65962a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f65962a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.commercialize.model.C25007p) r2).f65962a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.commercialize.model.C25007p
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.commercialize.model.p r2 = (com.p280ss.android.ugc.aweme.commercialize.model.C25007p) r2
            com.ss.android.ugc.aweme.commercialize.model.d r0 = r1.f65962a
            com.ss.android.ugc.aweme.commercialize.model.d r2 = r2.f65962a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.model.C25007p.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        C24993d dVar = this.f65962a;
        if (dVar != null) {
            return dVar.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchAdModule(adItem=");
        sb.append(this.f65962a);
        sb.append(")");
        return sb.toString();
    }
}
