package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.familiar.experiment.FamiliarFeedTextExperiment;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.utils.bn */
public final class C42982bn {

    /* renamed from: a */
    public static final C42982bn f111539a = new C42982bn();

    private C42982bn() {
    }

    /* renamed from: a */
    public static final String m136452a(int i, int i2) {
        if (C6399b.m19944t() || C6384b.m19835a().mo15287a(FamiliarFeedTextExperiment.class, true, "familiar_feed_text_adjustment", C6384b.m19835a().mo15295d().familiar_feed_text_adjustment, 0) == 0) {
            String string = C6399b.m19921a().getString(i);
            C7573i.m23582a((Object) string, "AppContextManager.getApp…ext().getString(friendId)");
            return string;
        }
        String string2 = C6399b.m19921a().getString(i2);
        C7573i.m23582a((Object) string2, "AppContextManager.getApp…t().getString(familiarId)");
        return string2;
    }
}
