package com.p280ss.android.ugc.aweme.discover.p1176b;

import com.p280ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.b.b */
public final class C26575b {

    /* renamed from: a */
    public SearchResultParam f70099a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.f70099a, (java.lang.Object) ((com.p280ss.android.ugc.aweme.discover.p1176b.C26575b) r2).f70099a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.discover.p1176b.C26575b
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.discover.b.b r2 = (com.p280ss.android.ugc.aweme.discover.p1176b.C26575b) r2
            com.ss.android.ugc.aweme.search.model.SearchResultParam r0 = r1.f70099a
            com.ss.android.ugc.aweme.search.model.SearchResultParam r2 = r2.f70099a
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.p1176b.C26575b.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        SearchResultParam searchResultParam = this.f70099a;
        if (searchResultParam != null) {
            return searchResultParam.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InnerSearchEvent(param=");
        sb.append(this.f70099a);
        sb.append(")");
        return sb.toString();
    }

    public C26575b(SearchResultParam searchResultParam) {
        C7573i.m23587b(searchResultParam, "param");
        this.f70099a = searchResultParam;
    }
}
