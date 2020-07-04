package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs */
public final class UsedPhoneNoticeMsgArgs {
    @C6593c(mo15949a = "mobile")
    public final String mobile;

    public static /* synthetic */ UsedPhoneNoticeMsgArgs copy$default(UsedPhoneNoticeMsgArgs usedPhoneNoticeMsgArgs, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = usedPhoneNoticeMsgArgs.mobile;
        }
        return usedPhoneNoticeMsgArgs.copy(str);
    }

    public final UsedPhoneNoticeMsgArgs copy(String str) {
        return new UsedPhoneNoticeMsgArgs(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.mobile, (java.lang.Object) ((com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs) r2).mobile) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs r2 = (com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs) r2
            java.lang.String r0 = r1.mobile
            java.lang.String r2 = r2.mobile
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgArgs.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.mobile;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsedPhoneNoticeMsgArgs(mobile=");
        sb.append(this.mobile);
        sb.append(")");
        return sb.toString();
    }

    public UsedPhoneNoticeMsgArgs(String str) {
        this.mobile = str;
    }
}
