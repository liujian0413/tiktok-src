package com.p280ss.android.ugc.aweme.feed.p1234j;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedRecommendLiveDisplayTypeExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.FullScreenLiveDisplayTypeExperiment;

/* renamed from: com.ss.android.ugc.aweme.feed.j.m */
public final class C28494m {
    /* renamed from: a */
    public static boolean m93639a() {
        if (C6384b.m19835a().mo15287a(FullScreenLiveDisplayTypeExperiment.class, true, "full_screen_live_display_type", C6384b.m19835a().mo15295d().full_screen_live_display_type, 1) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m93641b() {
        if (C6384b.m19835a().mo15287a(FullScreenLiveDisplayTypeExperiment.class, true, "full_screen_live_display_type", C6384b.m19835a().mo15295d().full_screen_live_display_type, 1) == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m93640a(String str) {
        if ((C6903bc.m21482a().mo84630a() || !"homepage_follow".equalsIgnoreCase(str)) && (!C6903bc.m21496o().mo88907a().mo88879b() || !"homepage_fresh".equalsIgnoreCase(str))) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m93642b(String str) {
        if (!"homepage_hot".equalsIgnoreCase(str) || C6384b.m19835a().mo15287a(FeedRecommendLiveDisplayTypeExperiment.class, true, "full_recommend_live_display_type", C6384b.m19835a().mo15295d().full_recommend_live_display_type, 0) == 2) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m93643c(String str) {
        if (!"homepage_hot".equalsIgnoreCase(str) || C6384b.m19835a().mo15287a(FeedRecommendLiveDisplayTypeExperiment.class, true, "full_recommend_live_display_type", C6384b.m19835a().mo15295d().full_recommend_live_display_type, 0) != 2) {
            return false;
        }
        return true;
    }
}
