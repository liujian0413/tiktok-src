package com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import java.io.Serializable;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAweme */
public final class TiktokRelieveAweme extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "aweme_id")
    private final String awemeId;

    public static /* synthetic */ TiktokRelieveAweme copy$default(TiktokRelieveAweme tiktokRelieveAweme, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tiktokRelieveAweme.awemeId;
        }
        return tiktokRelieveAweme.copy(str);
    }

    public final String component1() {
        return this.awemeId;
    }

    public final TiktokRelieveAweme copy(String str) {
        C7573i.m23587b(str, "awemeId");
        return new TiktokRelieveAweme(str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.awemeId, (java.lang.Object) ((com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAweme) r2).awemeId) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAweme
            if (r0 == 0) goto L_0x0013
            com.ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAweme r2 = (com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAweme) r2
            java.lang.String r0 = r1.awemeId
            java.lang.String r2 = r2.awemeId
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
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.antiaddic.relieveaweme.api.TiktokRelieveAweme.equals(java.lang.Object):boolean");
    }

    public final String getAwemeId() {
        return this.awemeId;
    }

    public final int hashCode() {
        String str = this.awemeId;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TiktokRelieveAweme(awemeId=");
        sb.append(this.awemeId);
        sb.append(")");
        return sb.toString();
    }

    public TiktokRelieveAweme(String str) {
        C7573i.m23587b(str, "awemeId");
        this.awemeId = str;
    }
}
