package com.p280ss.android.ugc.aweme.poi.model.feed;

import com.google.gson.p276a.C6593c;
import java.util.List;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.poi.model.feed.c */
public final class C35113c {
    @C6593c(mo15949a = "code")

    /* renamed from: a */
    public final String f91845a;
    @C6593c(mo15949a = "name")

    /* renamed from: b */
    public final String f91846b;
    @C6593c(mo15949a = "second_backend_types")

    /* renamed from: c */
    public final List<Object> f91847c;

    public C35113c() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f91847c, (java.lang.Object) r3.f91847c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.poi.model.feed.C35113c
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.poi.model.feed.c r3 = (com.p280ss.android.ugc.aweme.poi.model.feed.C35113c) r3
            java.lang.String r0 = r2.f91845a
            java.lang.String r1 = r3.f91845a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f91846b
            java.lang.String r1 = r3.f91846b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.util.List<java.lang.Object> r0 = r2.f91847c
            java.util.List<java.lang.Object> r3 = r3.f91847c
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.poi.model.feed.C35113c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f91845a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f91846b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Object> list = this.f91847c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PoiRankBackendTypeFirstOptionStruct(code=");
        sb.append(this.f91845a);
        sb.append(", name=");
        sb.append(this.f91846b);
        sb.append(", poiRankSecondList=");
        sb.append(this.f91847c);
        sb.append(")");
        return sb.toString();
    }

    private C35113c(String str, String str2, List<Object> list) {
        C7573i.m23587b(str, "code");
        C7573i.m23587b(str2, "name");
        this.f91845a = str;
        this.f91846b = str2;
        this.f91847c = list;
    }

    private /* synthetic */ C35113c(String str, String str2, List list, int i, C7571f fVar) {
        this("", "", null);
    }
}
