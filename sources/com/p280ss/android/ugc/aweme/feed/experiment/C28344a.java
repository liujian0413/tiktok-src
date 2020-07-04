package com.p280ss.android.ugc.aweme.feed.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedCompoundConfig;
import com.p280ss.android.ugc.aweme.feed.service.C28677a;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadStrategyConfig;

/* renamed from: com.ss.android.ugc.aweme.feed.experiment.a */
public final class C28344a {

    /* renamed from: a */
    private static Boolean f74679a;

    /* renamed from: j */
    public static boolean m93119j() {
        if (m93120k() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m93109a() {
        return C6384b.m19835a().mo15287a(VideoPostTimeExperiment.class, true, "video_post_time_style", C6384b.m19835a().mo15295d().video_post_time_style, 0);
    }

    /* renamed from: b */
    public static int m93111b() {
        return C6384b.m19835a().mo15287a(MusicDetailGuidExperiment.class, true, "enable_music_detail_guid", C6384b.m19835a().mo15295d().enable_music_detail_guid, 1);
    }

    /* renamed from: d */
    public static int m93113d() {
        int a = C6384b.m19835a().mo15287a(FeedOverTimeHoursExperiment.class, true, "feed_overtime_hours", C6384b.m19835a().mo15295d().feed_overtime_hours, 48);
        if (a <= 0) {
            return 1;
        }
        return a;
    }

    /* renamed from: f */
    public static long m93115f() {
        if (C6399b.m19944t() && m93114e()) {
            return (long) (m93121l() * 1000.0d);
        }
        return 0;
    }

    /* renamed from: g */
    public static int m93116g() {
        int h = m93117h();
        if (h == 1) {
            return 2;
        }
        if (h == 2) {
            return 3;
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: h */
    public static int m93117h() {
        int a = C6384b.m19835a().mo15287a(ShareGuideExperiment.class, true, "share_guide", C6384b.m19835a().mo15295d().share_guide, 0);
        if (a < 0 || a > 2) {
            return 0;
        }
        return a;
    }

    /* renamed from: l */
    private static double m93121l() {
        return C6384b.m19835a().mo15286a(FeedRefreshAnimDurationExperiment.class, true, "animation_duration_when_refresh_by_reusing_unreached_data", C6384b.m19835a().mo15295d().animation_duration_when_refresh_by_reusing_unreached_data, 0.4d);
    }

    /* renamed from: m */
    private static int m93122m() {
        return C6384b.m19835a().mo15287a(VideoPreloadSizeExperiment.class, true, "video_preload_size", C6384b.m19835a().mo15295d().video_preload_size, (int) VideoPreloadSizeExperiment.DEFAULT);
    }

    /* renamed from: n */
    private static int m93123n() {
        return C6384b.m19835a().mo15287a(VideoPreloadNumberExperiment.class, true, "video_preload_number", C6384b.m19835a().mo15295d().video_preload_number, 1);
    }

    /* renamed from: c */
    public static int m93112c() {
        if (!C6399b.m19944t()) {
            return 0;
        }
        return C6384b.m19835a().mo15287a(UnLoginDiggExperiment.class, true, "unlogin_digg_limit", C6384b.m19835a().mo15295d().unlogin_digg_limit, 0);
    }

    /* renamed from: e */
    public static boolean m93114e() {
        if (f74679a != null) {
            return f74679a.booleanValue();
        }
        if (!C6399b.m19944t()) {
            f74679a = Boolean.valueOf(false);
        } else {
            f74679a = Boolean.valueOf(C6384b.m19835a().mo15292a(FeedRefreshFromCacheExperiment.class, true, "enable_reuse_unreached_data_for_feed_refresh", C6384b.m19835a().mo15295d().enable_reuse_unreached_data_for_feed_refresh, false));
        }
        return f74679a.booleanValue();
    }

    /* renamed from: i */
    public static PreloadStrategyConfig m93118i() {
        PreloadStrategyConfig preloadStrategyConfig;
        try {
            preloadStrategyConfig = (PreloadStrategyConfig) C6384b.m19835a().mo15290a(PreloadStrategyConfigExperiment.class, true, "preload_strategy", (Object) C6384b.m19835a().mo15295d().preload_strategy, PreloadStrategyConfig.class);
        } catch (Throwable unused) {
            preloadStrategyConfig = null;
        }
        if (preloadStrategyConfig == null) {
            return PreloadStrategyConfig.convertOldConfig(m93123n(), m93122m());
        }
        return preloadStrategyConfig;
    }

    /* renamed from: k */
    public static FeedCompoundConfig m93120k() {
        FeedCompoundConfig[] feedCompoundConfigArr;
        FeedCompoundConfig feedCompoundConfig;
        try {
            feedCompoundConfigArr = (FeedCompoundConfig[]) C6384b.m19835a().mo15290a(FeedCompoundExperiment.class, true, "compound_request_setting", (Object) C6384b.m19835a().mo15295d().compound_request_setting, FeedCompoundConfig[].class);
        } catch (Throwable unused) {
            feedCompoundConfigArr = null;
        }
        if (feedCompoundConfigArr == null || feedCompoundConfigArr.length == 0) {
            return null;
        }
        try {
            feedCompoundConfig = feedCompoundConfigArr[0];
        } catch (Throwable unused2) {
            feedCompoundConfig = null;
        }
        if (feedCompoundConfig == null || feedCompoundConfig.isFeedCompoundClose()) {
            return null;
        }
        return feedCompoundConfig;
    }

    /* renamed from: a */
    public static boolean m93110a(Aweme aweme) {
        if (C6399b.m19944t()) {
            return false;
        }
        return C28677a.m94348b().mo71734a(aweme);
    }
}
