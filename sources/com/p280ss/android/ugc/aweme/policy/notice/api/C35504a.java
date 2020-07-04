package com.p280ss.android.ugc.aweme.policy.notice.api;

import com.google.gson.p276a.C6593c;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.policy.notice.api.a */
public final class C35504a {
    @C6593c(mo15949a = "business")

    /* renamed from: a */
    public final String f93155a;
    @C6593c(mo15949a = "policy_version")

    /* renamed from: b */
    public final String f93156b;
    @C6593c(mo15949a = "style")

    /* renamed from: c */
    public final String f93157c;
    @C6593c(mo15949a = "title")

    /* renamed from: d */
    public final String f93158d;
    @C6593c(mo15949a = "body")

    /* renamed from: e */
    public final String f93159e;
    @C6593c(mo15949a = "actions")

    /* renamed from: f */
    public final List<C35505b> f93160f;
    @C6593c(mo15949a = "icon_url")

    /* renamed from: g */
    public final String f93161g;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004c, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.f93161g, (java.lang.Object) r3.f93161g) != false) goto L_0x0051;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0051
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.policy.notice.api.C35504a
            if (r0 == 0) goto L_0x004f
            com.ss.android.ugc.aweme.policy.notice.api.a r3 = (com.p280ss.android.ugc.aweme.policy.notice.api.C35504a) r3
            java.lang.String r0 = r2.f93155a
            java.lang.String r1 = r3.f93155a
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f93156b
            java.lang.String r1 = r3.f93156b
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f93157c
            java.lang.String r1 = r3.f93157c
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f93158d
            java.lang.String r1 = r3.f93158d
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f93159e
            java.lang.String r1 = r3.f93159e
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.b> r0 = r2.f93160f
            java.util.List<com.ss.android.ugc.aweme.policy.notice.api.b> r1 = r3.f93160f
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x004f
            java.lang.String r0 = r2.f93161g
            java.lang.String r3 = r3.f93161g
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r3 = 0
            return r3
        L_0x0051:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.policy.notice.api.C35504a.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f93155a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f93156b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f93157c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f93158d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f93159e;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<C35505b> list = this.f93160f;
        int hashCode6 = (hashCode5 + (list != null ? list.hashCode() : 0)) * 31;
        String str6 = this.f93161g;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode6 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PolicyNotice(business=");
        sb.append(this.f93155a);
        sb.append(", policyVersion=");
        sb.append(this.f93156b);
        sb.append(", style=");
        sb.append(this.f93157c);
        sb.append(", title=");
        sb.append(this.f93158d);
        sb.append(", body=");
        sb.append(this.f93159e);
        sb.append(", actions=");
        sb.append(this.f93160f);
        sb.append(", icon_url=");
        sb.append(this.f93161g);
        sb.append(")");
        return sb.toString();
    }
}
