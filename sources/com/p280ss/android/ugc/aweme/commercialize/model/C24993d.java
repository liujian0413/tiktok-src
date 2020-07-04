package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.AwemeRawAd;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.d */
public final class C24993d {
    @C6593c(mo15949a = "raw_ad_data")

    /* renamed from: a */
    public final AwemeRawAd f65900a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f65900a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.commercialize.model.C24993d) r2).f65900a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.commercialize.model.C24993d
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.commercialize.model.d r2 = (com.p280ss.android.ugc.aweme.commercialize.model.C24993d) r2
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r1.f65900a
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r2 = r2.f65900a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.commercialize.model.C24993d.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        AwemeRawAd awemeRawAd = this.f65900a;
        if (awemeRawAd != null) {
            return awemeRawAd.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdItem(rawAd=");
        sb.append(this.f65900a);
        sb.append(")");
        return sb.toString();
    }
}
