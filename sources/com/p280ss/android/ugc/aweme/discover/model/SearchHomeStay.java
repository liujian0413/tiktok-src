package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchHomeStay */
public final class SearchHomeStay implements Serializable {
    @C6593c(mo15949a = "hotel")
    private final HomeStay homeStay;

    public static /* synthetic */ SearchHomeStay copy$default(SearchHomeStay searchHomeStay, HomeStay homeStay2, int i, Object obj) {
        if ((i & 1) != 0) {
            homeStay2 = searchHomeStay.homeStay;
        }
        return searchHomeStay.copy(homeStay2);
    }

    public final HomeStay component1() {
        return this.homeStay;
    }

    public final SearchHomeStay copy(HomeStay homeStay2) {
        return new SearchHomeStay(homeStay2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.homeStay, (java.lang.Object) ((com.p280ss.android.ugc.aweme.discover.model.SearchHomeStay) r2).homeStay) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.discover.model.SearchHomeStay
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.model.SearchHomeStay r2 = (com.p280ss.android.ugc.aweme.discover.model.SearchHomeStay) r2
            com.ss.android.ugc.aweme.discover.model.HomeStay r0 = r1.homeStay
            com.ss.android.ugc.aweme.discover.model.HomeStay r2 = r2.homeStay
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.model.SearchHomeStay.equals(java.lang.Object):boolean");
    }

    public final HomeStay getHomeStay() {
        return this.homeStay;
    }

    public final int hashCode() {
        HomeStay homeStay2 = this.homeStay;
        if (homeStay2 != null) {
            return homeStay2.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchHomeStay(homeStay=");
        sb.append(this.homeStay);
        sb.append(")");
        return sb.toString();
    }

    public SearchHomeStay(HomeStay homeStay2) {
        this.homeStay = homeStay2;
    }
}
