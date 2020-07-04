package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C10292j;
import com.bytedance.ies.abmock.C6384b;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.b */
public final class C28345b {

    /* renamed from: a */
    private static final int f74680a = m93126c();

    /* renamed from: b */
    public static boolean m93125b() {
        if (f74680a > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m93124a() {
        if (f74680a >= 3) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private static int m93126c() {
        return C10292j.m30480a().mo25012a(FeedFindBugSetting.class, "feed_find_bug_setting", C6384b.m19835a().mo15294c().getFeedFindBugSetting());
    }
}
