package com.p280ss.android.ugc.aweme.feed.helper;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.experiment.RecommendFilterFollowExperiment;
import java.util.HashSet;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.feed.helper.m */
public final class C28425m {

    /* renamed from: a */
    public static final C28425m f74955a = new C28425m();

    /* renamed from: b */
    private static boolean f74956b;

    /* renamed from: c */
    private static final HashSet<String> f74957c = new HashSet<>();

    private C28425m() {
    }

    /* renamed from: a */
    public static boolean m93430a() {
        return C6384b.m19835a().mo15292a(RecommendFilterFollowExperiment.class, true, "enable_recommend_filter_follow", C6384b.m19835a().mo15295d().enable_recommend_filter_follow, false);
    }

    /* renamed from: a */
    public static void m93429a(String str) {
        C7573i.m23587b(str, "aid");
        if (!f74957c.contains(str)) {
            f74957c.add(str);
            f74956b = true;
        }
    }
}
