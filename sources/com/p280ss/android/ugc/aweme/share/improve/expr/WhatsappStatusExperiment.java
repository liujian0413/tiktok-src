package com.p280ss.android.ugc.aweme.share.improve.expr;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "whatsapp_status_share_policy")
/* renamed from: com.ss.android.ugc.aweme.share.improve.expr.WhatsappStatusExperiment */
public final class WhatsappStatusExperiment {
    public static final WhatsappStatusExperiment INSTANCE = new WhatsappStatusExperiment();
    @C6382b
    public static final int NEW_STYLE1 = 1;
    @C6382b
    public static final int NEW_STYLE2 = 2;
    @C6382b(mo15285a = true)
    public static final int OLD = 0;

    private WhatsappStatusExperiment() {
    }

    public final boolean hasWhatsppStatus() {
        if (C6384b.m19835a().mo15287a(WhatsappStatusExperiment.class, true, "whatsapp_status_share_policy", C6384b.m19835a().mo15295d().whatsapp_status_share_policy, 0) > 0) {
            return true;
        }
        return false;
    }

    public final boolean isStyle2() {
        if (C6384b.m19835a().mo15287a(WhatsappStatusExperiment.class, true, "whatsapp_status_share_policy", C6384b.m19835a().mo15295d().whatsapp_status_share_policy, 0) == 2) {
            return true;
        }
        return false;
    }
}
