package com.p280ss.android.ugc.aweme.main.experiment;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.b */
public final class C33003b {

    /* renamed from: a */
    public static final C33003b f85981a = new C33003b();

    private C33003b() {
    }

    /* renamed from: a */
    public static boolean m106651a() {
        if (!C6399b.m19947w() && TextUtils.equals(C6399b.m19929e(), "trill") && C6384b.m19835a().mo15287a(I18nNewFollowFeedStyleExperiment.class, true, "i18n_new_follow_feed_style", C6384b.m19835a().mo15295d().i18n_new_follow_feed_style, 1) == I18nNewFollowFeedStyleExperiment.DISABLE) {
            return true;
        }
        return false;
    }
}
