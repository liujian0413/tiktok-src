package com.p280ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.a */
public final class C33002a {

    /* renamed from: a */
    public static final C33002a f85980a = new C33002a();

    private C33002a() {
    }

    /* renamed from: a */
    public static int m106650a() {
        if (!C6399b.m19944t()) {
            return 2;
        }
        int a = C6384b.m19835a().mo15287a(FollowFeedStyleExperiment.class, true, "follow_feed_type", C6384b.m19835a().mo15295d().follow_feed_type, 0);
        if (a != 0 && (a < 0 || a > 2)) {
            a = 0;
        }
        return a;
    }
}
