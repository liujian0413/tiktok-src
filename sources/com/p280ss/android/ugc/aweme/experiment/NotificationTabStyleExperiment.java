package com.p280ss.android.ugc.aweme.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;
import com.bytedance.ies.ugc.appcontext.C6399b;

@C6381a(mo15284a = "i18n_message_page_style")
/* renamed from: com.ss.android.ugc.aweme.experiment.NotificationTabStyleExperiment */
public final class NotificationTabStyleExperiment {
    public static final NotificationTabStyleExperiment INSTANCE = new NotificationTabStyleExperiment();
    @C6382b(mo15285a = true)

    /* renamed from: M */
    public static final int f72983M = 2;
    @C6382b
    public static final int NEW_T = 3;
    @C6382b(mo15285a = false)

    /* renamed from: T */
    public static final int f72984T = 1;

    private NotificationTabStyleExperiment() {
    }

    public static final boolean isNewStyleTabBadge() {
        if (!C6399b.m19944t() || C6384b.m19835a().mo15287a(NotificationTabStyleExperiment.class, true, "i18n_message_page_style", C6384b.m19835a().mo15295d().i18n_message_page_style, 2) == 1) {
            return false;
        }
        return true;
    }
}
