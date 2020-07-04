package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight */
public final class UsedPhoneNoticeMsgHighlight {
    @C6593c(mo15949a = "content")
    public final String content;
    @C6593c(mo15949a = "scheme")
    public final String scheme;

    public static /* synthetic */ UsedPhoneNoticeMsgHighlight copy$default(UsedPhoneNoticeMsgHighlight usedPhoneNoticeMsgHighlight, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usedPhoneNoticeMsgHighlight.content;
        }
        if ((i & 2) != 0) {
            str2 = usedPhoneNoticeMsgHighlight.scheme;
        }
        return usedPhoneNoticeMsgHighlight.copy(str, str2);
    }

    public final UsedPhoneNoticeMsgHighlight copy(String str, String str2) {
        return new UsedPhoneNoticeMsgHighlight(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.scheme, (java.lang.Object) r3.scheme) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight r3 = (com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight) r3
            java.lang.String r0 = r2.content
            java.lang.String r1 = r3.content
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.scheme
            java.lang.String r3 = r3.scheme
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgHighlight.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.content;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.scheme;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsedPhoneNoticeMsgHighlight(content=");
        sb.append(this.content);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(")");
        return sb.toString();
    }

    public UsedPhoneNoticeMsgHighlight(String str, String str2) {
        this.content = str;
        this.scheme = str2;
    }
}
