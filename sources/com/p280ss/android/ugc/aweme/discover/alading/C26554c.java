package com.p280ss.android.ugc.aweme.discover.alading;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.alading.c */
public final class C26554c {
    @C6593c(mo15949a = "hotspot_items")

    /* renamed from: a */
    public List<? extends Aweme> f70044a;
    @C6593c(mo15949a = "hotspot")

    /* renamed from: b */
    public final C26555d f70045b;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f70045b, (java.lang.Object) r3.f70045b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.discover.alading.C26554c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.alading.c r3 = (com.p280ss.android.ugc.aweme.discover.alading.C26554c) r3
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r0 = r2.f70044a
            java.util.List<? extends com.ss.android.ugc.aweme.feed.model.Aweme> r1 = r3.f70044a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.discover.alading.d r0 = r2.f70045b
            com.ss.android.ugc.aweme.discover.alading.d r3 = r3.f70045b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.discover.alading.C26554c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        List<? extends Aweme> list = this.f70044a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        C26555d dVar = this.f70045b;
        if (dVar != null) {
            i = dVar.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSpot(awemeCards=");
        sb.append(this.f70044a);
        sb.append(", searchSpotInfo=");
        sb.append(this.f70045b);
        sb.append(")");
        return sb.toString();
    }
}
