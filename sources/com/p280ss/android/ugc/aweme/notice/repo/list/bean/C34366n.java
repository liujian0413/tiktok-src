package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.n */
public final class C34366n {
    @C6593c(mo15949a = "title")

    /* renamed from: a */
    public String f89564a;
    @C6593c(mo15949a = "content")

    /* renamed from: b */
    public String f89565b;
    @C6593c(mo15949a = "schema_url")

    /* renamed from: c */
    public String f89566c;
    @C6593c(mo15949a = "log_extra")

    /* renamed from: d */
    public String f89567d;

    public C34366n() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f89567d, (java.lang.Object) r3.f89567d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34366n
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.notice.repo.list.bean.n r3 = (com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34366n) r3
            java.lang.String r0 = r2.f89564a
            java.lang.String r1 = r3.f89564a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f89565b
            java.lang.String r1 = r3.f89565b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f89566c
            java.lang.String r1 = r3.f89566c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f89567d
            java.lang.String r3 = r3.f89567d
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34366n.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f89564a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f89565b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f89566c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f89567d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TcmNotice(title=");
        sb.append(this.f89564a);
        sb.append(", content=");
        sb.append(this.f89565b);
        sb.append(", schemaUrl=");
        sb.append(this.f89566c);
        sb.append(", logExtra=");
        sb.append(this.f89567d);
        sb.append(")");
        return sb.toString();
    }

    private C34366n(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "title");
        C7573i.m23587b(str2, C38347c.f99553h);
        C7573i.m23587b(str3, "schemaUrl");
        C7573i.m23587b(str4, "logExtra");
        this.f89564a = str;
        this.f89565b = str2;
        this.f89566c = str3;
        this.f89567d = str4;
    }

    private /* synthetic */ C34366n(String str, String str2, String str3, String str4, int i, C7571f fVar) {
        this("", "", "", "");
    }
}
