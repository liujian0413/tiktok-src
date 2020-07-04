package com.p280ss.android.ugc.aweme.tutorial.p1683a;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.a */
public final class C42665a {
    @C6593c(mo15949a = "tutorial_id")

    /* renamed from: a */
    public final String f110913a;
    @C6593c(mo15949a = "cover")

    /* renamed from: b */
    public final UrlModel f110914b;
    @C6593c(mo15949a = "title")

    /* renamed from: c */
    public final String f110915c;

    public C42665a() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f110915c, (java.lang.Object) r3.f110915c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.tutorial.p1683a.C42665a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.tutorial.a.a r3 = (com.p280ss.android.ugc.aweme.tutorial.p1683a.C42665a) r3
            java.lang.String r0 = r2.f110913a
            java.lang.String r1 = r3.f110913a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f110914b
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.f110914b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f110915c
            java.lang.String r3 = r3.f110915c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tutorial.p1683a.C42665a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f110913a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f110914b;
        int hashCode2 = (hashCode + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str2 = this.f110915c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tutorial(tutorialId=");
        sb.append(this.f110913a);
        sb.append(", coverUri=");
        sb.append(this.f110914b);
        sb.append(", title=");
        sb.append(this.f110915c);
        sb.append(")");
        return sb.toString();
    }

    private C42665a(String str, UrlModel urlModel, String str2) {
        C7573i.m23587b(str, "tutorialId");
        C7573i.m23587b(str2, "title");
        this.f110913a = str;
        this.f110914b = urlModel;
        this.f110915c = str2;
    }

    private /* synthetic */ C42665a(String str, UrlModel urlModel, String str2, int i, C7571f fVar) {
        this("", null, "");
    }
}
