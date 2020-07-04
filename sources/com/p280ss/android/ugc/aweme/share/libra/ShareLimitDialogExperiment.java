package com.p280ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "show_duoshan_share")
/* renamed from: com.ss.android.ugc.aweme.share.libra.ShareLimitDialogExperiment */
public final class ShareLimitDialogExperiment {
    public static final ShareLimitDialogExperiment INSTANCE = new ShareLimitDialogExperiment();
    @C6382b(mo15285a = true)
    public static final int WITHOUT_DUOSHAO = 0;
    @C6382b
    public static final int WITH_DUOSHAO = 1;

    private ShareLimitDialogExperiment() {
    }

    public final boolean withDoushan() {
        if (C6384b.m19835a().mo15287a(ShareLimitDialogExperiment.class, true, "show_duoshan_share", C6384b.m19835a().mo15295d().show_duoshan_share, 0) == 1) {
            return true;
        }
        return false;
    }
}
