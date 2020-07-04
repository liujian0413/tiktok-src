package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse */
public final class UsedPhoneNoticeMsgResponse extends BaseResponse {
    @C6593c(mo15949a = "data")
    public final UsedPhoneNoticeMsg data;

    public static /* synthetic */ UsedPhoneNoticeMsgResponse copy$default(UsedPhoneNoticeMsgResponse usedPhoneNoticeMsgResponse, UsedPhoneNoticeMsg usedPhoneNoticeMsg, int i, Object obj) {
        if ((i & 1) != 0) {
            usedPhoneNoticeMsg = usedPhoneNoticeMsgResponse.data;
        }
        return usedPhoneNoticeMsgResponse.copy(usedPhoneNoticeMsg);
    }

    public final UsedPhoneNoticeMsgResponse copy(UsedPhoneNoticeMsg usedPhoneNoticeMsg) {
        return new UsedPhoneNoticeMsgResponse(usedPhoneNoticeMsg);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.data, (java.lang.Object) ((com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse) r2).data) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse r2 = (com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse) r2
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg r0 = r1.data
            com.ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsg r2 = r2.data
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.profile.model.UsedPhoneNoticeMsgResponse.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        UsedPhoneNoticeMsg usedPhoneNoticeMsg = this.data;
        if (usedPhoneNoticeMsg != null) {
            return usedPhoneNoticeMsg.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UsedPhoneNoticeMsgResponse(data=");
        sb.append(this.data);
        sb.append(")");
        return sb.toString();
    }

    public UsedPhoneNoticeMsgResponse(UsedPhoneNoticeMsg usedPhoneNoticeMsg) {
        this.data = usedPhoneNoticeMsg;
    }
}
