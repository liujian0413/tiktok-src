package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.e */
public final class C34356e {
    @C6593c(mo15949a = "title")

    /* renamed from: a */
    public String f89534a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f89535b;
    @C6593c(mo15949a = "schema_url")

    /* renamed from: c */
    public String f89536c;

    public C34356e() {
        this(null, null, null, 7, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f89536c, (java.lang.Object) r3.f89536c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34356e
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.notice.repo.list.bean.e r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34356e) r3
            java.lang.String r0 = r2.f89534a
            java.lang.String r1 = r3.f89534a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f89535b
            java.lang.String r1 = r3.f89535b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f89536c
            java.lang.String r3 = r3.f89536c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34356e.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f89534a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f89535b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f89536c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LinkProfitNotice(title=");
        sb.append(this.f89534a);
        sb.append(", content=");
        sb.append(this.f89535b);
        sb.append(", schemaUrl=");
        sb.append(this.f89536c);
        sb.append(")");
        return sb.toString();
    }

    private C34356e(String str, String str2, String str3) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, C38347c.f99553h);
        C7573i.m23587b(str3, "schemaUrl");
        this.f89534a = str;
        this.f89535b = str2;
        this.f89536c = str3;
    }

    private /* synthetic */ C34356e(String str, String str2, String str3, int i, C7571f fVar) {
        this("", "", "");
    }
}
