package com.p280ss.android.ugc.aweme.homepage.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.homepage.experiment.a */
public final class C30261a {

    /* renamed from: a */
    public static final C30261a f79615a = new C30261a();

    /* renamed from: b */
    private static Integer f79616b;

    private C30261a() {
    }

    /* renamed from: a */
    public static boolean m98995a() {
        if (!C6399b.m19944t()) {
            if (f79616b != null) {
                Integer num = f79616b;
                if (num != null && num.intValue() == 1) {
                    return true;
                }
                return false;
            }
            Integer valueOf = Integer.valueOf(C6384b.m19835a().mo15287a(NewFollowFeedStyleExperiment.class, true, "new_follow_feed_style", C6384b.m19835a().mo15295d().new_follow_feed_style, 1));
            f79616b = valueOf;
            if (valueOf != null && valueOf.intValue() == 1) {
                return true;
            }
        }
        return false;
    }
}
