package com.p280ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.g */
public final class C24997g implements C6866d {
    @C6593c(mo15949a = "status_code")

    /* renamed from: a */
    public final int f65908a;
    @C6593c(mo15949a = "status_msg")

    /* renamed from: b */
    public final String f65909b;
    @C6593c(mo15949a = "aweme_list")

    /* renamed from: c */
    public final List<AwemeAdRank> f65910c;
    @C6593c(mo15949a = "log_pb")

    /* renamed from: d */
    public final LogPbBean f65911d;
    @C6593c(mo15949a = "extra")

    /* renamed from: e */
    public final C24998a f65912e;

    /* renamed from: f */
    private String f65913f;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.model.g$a */
    public static final class C24998a {
        @C6593c(mo15949a = "now")

        /* renamed from: a */
        public final long f65914a;
        @C6593c(mo15949a = "fatal_item_ids")

        /* renamed from: b */
        public final List<String> f65915b;
        @C6593c(mo15949a = "logid")

        /* renamed from: c */
        public final String f65916c;
    }

    public final String getRequestId() {
        boolean z;
        String str = this.f65913f;
        boolean z2 = false;
        if (str != null) {
            if (str.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return this.f65913f;
            }
        }
        LogPbBean logPbBean = this.f65911d;
        if (logPbBean != null) {
            String imprId = logPbBean.getImprId();
            if (imprId != null) {
                if (imprId.length() > 0) {
                    z2 = true;
                }
                if (z2) {
                    return this.f65911d.getImprId();
                }
            }
        }
        return null;
    }

    public final void setRequestId(String str) {
        this.f65913f = str;
    }
}
