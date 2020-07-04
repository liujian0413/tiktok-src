package com.p280ss.android.ugc.aweme.main.experiment;

import com.bytedance.ies.abmock.C6384b;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.main.experiment.c */
public final class C33004c {

    /* renamed from: a */
    public static final C33004c f85982a = new C33004c();

    /* renamed from: b */
    private static C33005d f85983b;

    private C33004c() {
    }

    /* renamed from: a */
    public static int m106652a() {
        C33005d dVar = f85983b;
        if (dVar == null) {
            C7573i.m23580a();
        }
        return dVar.f85984a;
    }

    /* renamed from: b */
    public static int m106653b() {
        C33005d dVar = f85983b;
        if (dVar == null) {
            C7573i.m23580a();
        }
        return dVar.f85985b;
    }

    /* renamed from: c */
    public static int m106654c() {
        C33005d dVar = f85983b;
        if (dVar == null) {
            C7573i.m23580a();
        }
        return dVar.f85986c;
    }

    /* renamed from: d */
    public static int m106655d() {
        C33005d dVar = f85983b;
        if (dVar == null) {
            C7573i.m23580a();
        }
        return dVar.f85987d;
    }

    static {
        C33005d dVar;
        int a = C6384b.m19835a().mo15287a(FollowFeedLayoutStrategyExperiment.class, true, "follow_feed_layout_strategy", C6384b.m19835a().mo15295d().follow_feed_layout_strategy, 1);
        int a2 = C6384b.m19835a().mo15287a(FollowFeedFilterStrategyExperiment.class, true, "follow_feed_filter_strategy", C6384b.m19835a().mo15295d().follow_feed_filter_strategy, 2);
        int a3 = C6384b.m19835a().mo15287a(FeedSwipeLeftExperiment.class, true, "feed_swipe_left", C6384b.m19835a().mo15295d().feed_swipe_left, 0);
        int a4 = C6384b.m19835a().mo15287a(FullScreenUnfollowExperiment.class, true, "full_screen_unfollow", C6384b.m19835a().mo15295d().full_screen_unfollow, 0);
        int a5 = C6384b.m19835a().mo15287a(FollowUnreadStyleExperiment.class, true, "follow_unread_style", C6384b.m19835a().mo15295d().follow_unread_style, 0);
        int a6 = C6384b.m19835a().mo15287a(FollowNoticeLiveIconTypeExperiment.class, true, "top_follow_notice_live_unread_style", C6384b.m19835a().mo15295d().top_follow_notice_live_unread_style, 0);
        boolean a7 = C6384b.m19835a().mo15292a(OptimizeTopUiFullScreenFollowExperiment.class, true, "optimize_top_ui_full_screen_follow", C6384b.m19835a().mo15295d().optimize_top_ui_full_screen_follow, false);
        int a8 = C6384b.m19835a().mo15287a(MainTabTopTextDistanceExperiment.class, true, "main_tab_top_text_distance", C6384b.m19835a().mo15295d().main_tab_top_text_distance, 0);
        if (a == FollowFeedLayoutStrategyExperiment.f85969A && a2 == FollowFeedFilterStrategyExperiment.FILTER_LIVE_FORWARD_RECOMMEND && a3 == FeedSwipeLeftExperiment.ENABLE && a4 == FullScreenUnfollowExperiment.DONT_SHOW && a5 == FollowUnreadStyleExperiment.OLD && a6 == FollowNoticeLiveIconTypeExperiment.EN_LIVE && !a7 && a8 == 0) {
            dVar = new C33005d(FollowFeedLayoutStrategyExperiment.f85969A, FollowFeedFilterStrategyExperiment.FILTER_LIVE_FORWARD_RECOMMEND, FeedSwipeLeftExperiment.ENABLE, FullScreenUnfollowExperiment.DONT_SHOW, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, false, 0);
        } else if (a == FollowFeedLayoutStrategyExperiment.f85969A) {
            dVar = new C33005d(FollowFeedLayoutStrategyExperiment.f85969A, a2, a3, a4, a5, a6, a7, a8);
        } else if (a == FollowFeedLayoutStrategyExperiment.f85970B) {
            dVar = new C33005d(FollowFeedLayoutStrategyExperiment.f85970B, a2, a3, FullScreenUnfollowExperiment.DONT_SHOW, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, false, 0);
        } else if (a == FollowFeedLayoutStrategyExperiment.f85971C) {
            dVar = new C33005d(FollowFeedLayoutStrategyExperiment.f85971C, a2, a3, FullScreenUnfollowExperiment.DONT_SHOW, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, false, 0);
        } else {
            int i = FullScreenUnfollowExperiment.DONT_SHOW;
            dVar = new C33005d(a, a2, a3, i, FollowUnreadStyleExperiment.OLD, FollowNoticeLiveIconTypeExperiment.EN_LIVE, a7, 0);
        }
        f85983b = dVar;
    }
}
